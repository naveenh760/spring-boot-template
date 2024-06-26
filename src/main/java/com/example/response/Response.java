package com.example.response;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Setter
@Getter
public abstract class Response {
    private boolean success;
    private ZonedDateTime timestamp = ZonedDateTime.now();

    public Response(boolean success) {
        this.success = success;
    }
}
