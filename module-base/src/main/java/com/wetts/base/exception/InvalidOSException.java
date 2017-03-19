package com.wetts.base.exception;

/**
 * Created by wetts on 2017/1/17.
 */
public class InvalidOSException extends RuntimeException {

    public InvalidOSException(){
        super();
    }

    public InvalidOSException(String str) {
        super(str);
    }
}
