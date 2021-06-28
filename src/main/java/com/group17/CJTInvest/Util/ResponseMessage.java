package com.group17.CJTInvest.Util;

import java.util.ArrayList;
import java.util.List;


public class ResponseMessage {

    private Object responseObject;
    private String message;
    private List<String> errors = new ArrayList<>();

    public ResponseMessage() {
    }


    public ResponseMessage(Object responseObject, String message) {
        this.responseObject = responseObject;
        this.message = message;
    }

    public Object getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Object responseObject) {
        this.responseObject = responseObject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
