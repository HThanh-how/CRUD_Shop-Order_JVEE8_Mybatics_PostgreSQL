package com.crud;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "helloWorld")
@RequestScoped
public class HelloWorld {
    public HelloWorld() {
    }
    public String getMessage() {
        return "Hello, World!";
    }
}