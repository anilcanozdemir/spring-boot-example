package com.amigoscode.Core.Result;

public class SuccessResult extends Result {


    public SuccessResult() {
        super(true);
    }

    public SuccessResult(String message) {
        super(true, message);
    }


}
