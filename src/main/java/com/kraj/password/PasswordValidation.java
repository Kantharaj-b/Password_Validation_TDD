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

        // for checking if password length
        // is > 8
        if (!(password.length() > 8)) {
            return false;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 97; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}
