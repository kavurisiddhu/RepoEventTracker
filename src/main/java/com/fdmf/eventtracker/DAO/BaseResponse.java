package com.fdmf.eventtracker.DAO;

public class BaseResponse {
    private String errorCode;
    private String errorDesc;

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the errorDesc
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * @param errorDesc the errorDesc to set
     */
    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    @Override
    public String toString() {
        return "BaseResponse [errorCode=" + errorCode + ", errorDesc=" + errorDesc + "]";
    }


}
