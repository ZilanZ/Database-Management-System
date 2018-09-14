package edu.northeastern.cs5200.cs5200fall2018zhang.controllers.hello;

public class HelloObject {
    private String message;

    public HelloObject() {

    }
    public HelloObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
