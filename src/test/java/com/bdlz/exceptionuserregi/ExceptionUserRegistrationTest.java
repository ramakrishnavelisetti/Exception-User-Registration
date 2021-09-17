package com.bdlz.exceptionuserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest {
        ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

        @Test
        public void givenFirstName_IsProper_ReturnTrue() {
            boolean actualResult = exceptionUserRegistration.firstName("Ramakrishna");
            Assert.assertEquals(true, actualResult);
        }

        @Test
        public void givenFirstName_IsProper_ReturnFalse() {
            boolean actualResult = exceptionUserRegistration.firstName("RamaKrishna");
            Assert.assertEquals(false, actualResult);
        }

}