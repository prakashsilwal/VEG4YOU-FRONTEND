package com.example.merokisanbazar.response;

public class RegisterResponse {
    private String message;

    public RegisterResponse(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
