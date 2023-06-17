package com.koreait.commons.validators;

public interface PasswordValidator {

    default  boolean alphaCheck(String password, boolean caseIncentive){

        String pattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\d)";

        return password.matches(pattern);

    }
}
