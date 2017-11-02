package com.fnba;

public class PreparedStatementUtils {
    public static String getParameterString(int numberOfParameters){
        if(numberOfParameters == 1) {
            return " ?";
        } else {
            return " ?," + getParameterString(numberOfParameters - 1);
        }
    }
}
