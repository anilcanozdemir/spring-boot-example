package com.amigoscode.Core.Result;

public class ErrorResult extends Result {
    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(false, message);
    }
}
