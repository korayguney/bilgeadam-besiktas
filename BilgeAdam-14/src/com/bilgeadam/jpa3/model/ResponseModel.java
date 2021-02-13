package com.bilgeadam.jpa3.model;

import com.bilgeadam.loginexamplewithgui.exception.ExceptionCode;

public class ResponseModel {
    private boolean result;
    private ExceptionCode code;

    public ResponseModel(boolean result, ExceptionCode code) {
        this.result = result;
        this.code = code;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public ExceptionCode getCode() {
        return code;
    }

    public void setCode(ExceptionCode code) {
        this.code = code;
    }
}
