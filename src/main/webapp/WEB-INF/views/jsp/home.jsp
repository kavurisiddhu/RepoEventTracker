<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<title>Repository Event Viewer</title>
 
<link href="/resources/home.css" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<c:url var="home" value="/" scope="request" />
<c:url var="coreJS" value="/resources/home.js" />
<script src="${coreJS}"></script>
 
</head>
  
<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	<p>
		<form id="getEventList" name="getEventList">
  		<input type="text" id="userName" name="user" placeholder="User/Owner name">
  		<input type="text" id="repoName" name="repo" placeholder="Repository name">
  		<select id="eventType">
  			<option value="">Select an Event</option>
  			<option value="WatchEvent">Watch Event</option>
  			<option value="ForkEvent">Fork Event</option>
  			<option value="CreateEvent">Create Event</option>
  			<option value="PushEvent">Push Event</option>
		</select>
  		<button type="submit" id="getListBtn">Search</button>
	</form> 
		
    </p>
    
    <table class="eventsTable" id="eventsTable" >
  <tr>
    <th>Created Date</th>
    <th>User Type</th>
     <th>Reference Type</th>
    <th>Description</th>
  </tr>
  
  </table>
  
	</div>
</div>
 <script>


 </script>
 
</body>
</html>