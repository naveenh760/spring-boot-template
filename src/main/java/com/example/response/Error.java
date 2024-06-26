package com.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Error extends Response {
    private String error;
    private String errorCode;

    public Error() {
        super(false);
    }

    public Error(String error) {
        this();
        this.error = error;
    }

    public Error(String error, String errorCode) {
        this(error);
        this.errorCode = errorCode;
    }

}
