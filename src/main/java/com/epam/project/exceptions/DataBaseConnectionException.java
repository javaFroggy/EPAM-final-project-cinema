package com.epam.project.exceptions;

public class DataBaseConnectionException extends Exception {
    public DataBaseConnectionException(){
        super("Something wrong with connection to DB");
    }
}
