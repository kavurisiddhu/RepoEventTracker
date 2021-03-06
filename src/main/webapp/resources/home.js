

jQuery(document).ready(function($) {

	$("#getEventList").submit(function(event) {

		// Disble the search button
		enableSearchButton(false);
		//Delete rows in the table if any
		deleteRows();
		
		// Prevent the form from submitting via the browser.
		event.preventDefault();

		searchViaAjax();

	});

});

function searchViaAjax() {

	var search = {}
	search["user"] = $("#userName").val();
	search["repo"] = $("#repoName").val();
	var e = document.getElementById("eventType");
	search["eventName"] = e.options[e.selectedIndex].value;
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "ajax/getEventsList",
		data : JSON.stringify(search),
		dataType : 'json',
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data, 'success');
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e, 'error');
		},
		done : function(e) {
			console.log("DONE");
			enableSearchButton(true);
		}
	});

}

function enableSearchButton(flag) {
	$("#getListBtn").prop("disabled", flag);
}

function display(data, status) {
	if(data.errorCode){
		window.alert('No records found for user and repository combination. Please try again')
	}else{
		var eventsList=data.eventDetails;
		var tablearea = document.getElementById('eventsTable');
		for (var i = 0; i < eventsList.length; i++) {
			var row = document.createElement('tr');
			row.appendChild(document.createElement('td'));
			row.appendChild(document.createElement('td'));
			row.appendChild(document.createElement('td'));
			row.appendChild(document.createElement('td'));
			
			row.cells[0].appendChild(document
					.createTextNode(eventsList[i].created_at));
			if(eventsList[i].type === 'PushEvent'){
				row.cells[1].appendChild(document
						.createTextNode(eventsList[i].committedBy));
				row.cells[2].appendChild(document
						.createTextNode(eventsList[i].committedTo));
				row.cells[3].appendChild(document
						.createTextNode(eventsList[i].commitMessage));
			}else{
				row.cells[1].appendChild(document
						.createTextNode(eventsList[i].pusher_type));
				row.cells[2].appendChild(document
						.createTextNode(eventsList[i].ref_type));
				row.cells[3].appendChild(document
						.createTextNode(eventsList[i].description));
			}
			

			tablearea.appendChild(row);
		}
	}
}

function deleteRows(){
	var table = document.getElementById('eventsTable');
	for(var i=table.rows.length-1;i>0;i--){
		table.deleteRow(i);
	}
}