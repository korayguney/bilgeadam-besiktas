package com.bilgeadam;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StringResponse {

    private String response;

    public StringResponse(String s) {
        this.response = s;
    }

    public StringResponse() {}

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}