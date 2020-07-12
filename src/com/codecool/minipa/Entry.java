package com.codecool.minipa;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Entry {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

    private String creationDate;
    private String message;


    public Entry(String message) {
        this.creationDate = formatter.format(new Date(System.currentTimeMillis()));
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }


    public String getCreationDate() {
        return this.creationDate;
    }


}
