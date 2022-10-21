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
}