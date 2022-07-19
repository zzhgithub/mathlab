package org.zzh.mathlab.exception;

public class MathLabException extends RuntimeException {
    private String code;

    public MathLabException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
