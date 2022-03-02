package com.college.college.exception;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class studentNotFoundException extends RuntimeException {
    public studentNotFoundException(String message){
        super(message);
    }
}
