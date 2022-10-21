package com.kraj.password;

public class PasswordValidation {

    /**
     * Returns true if password matches the validation rules
     *
     * @param password
     * @return
     */
    public static boolean isValid(String password) {
        // to check null and empty
        if (null==password) {
            return false;
        }
        if (password.isEmpty()) {
            return false;
        }


        return true;
    }
}
