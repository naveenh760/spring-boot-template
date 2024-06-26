package com.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Success<T> extends Response {
    private T data;

    public Success(T data) {
        super(true);
        this.data = data;
    }

    public static <T> Success<T> ok(T data) {
        return new Success<>(data);
    }

}
