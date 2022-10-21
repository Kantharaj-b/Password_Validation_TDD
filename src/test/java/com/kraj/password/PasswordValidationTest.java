package com.kraj.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PasswordValidationTest {

        @Test
        public void validatePassword_Null() {

            Assertions.assertFalse(PasswordValidation.isValid(null));
        }

        @Test
        public void validatePassword_EmptyString() {

            Assertions.assertFalse(PasswordValidation.isValid(""));

        }
    @Test
    public void validatePassword_Length() {
        // setup
        String password = "Abcfg5#";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertFalse(actual);
    }
    @Test
    public void validatePassword_Missing_OneUpperCaseLetter() {
        // setup
        String password = "abcdefg5#";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertFalse(actual);
    }

    @Test
    public void validatePassword_Missing_OneLowerCaseLetter() {
        // setup
        String password = "ABCDEFG5#";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertFalse(actual);
    }

    @Test
    public void validatePassword_Missing_OneNumber() {
        // setup
        String password = "Abcffggg#";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertFalse(actual);
    }

    /**
     * an extra test other than the given requirement for missing special character/symbol
     */
    @Test
    public void validatePassword_Valid() {
        // setup
        String password = "Abcdefge@";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertFalse(actual);
    }

    /**
     * test case for valid password
     */
    @Test
    public void validatePassword_Missing_OneSymbol() {
        // setup
        String password = "I@md0ne99";

        // execute
        boolean actual = PasswordValidation.isValid(password);

        // assert
        Assertions.assertTrue(actual);
    }
}