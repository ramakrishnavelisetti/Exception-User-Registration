package com.bdlz.exceptionuserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest {
        ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();
        MoodAnalyser moodAnalyser = new MoodAnalyser();

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
    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Velisetti");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("veliseTTi");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.emailId("ramakrishna96.velisetti@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.emailId("ramakrishna96.velisettigmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("91 9989774456");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("919989774456");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("qwgthjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("qwgthRLjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("qw98hRLkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("qw98hRL@&dl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("jsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = moodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    @Test
    public void givenEmail2_WhenNotProper_ReturnEntryFailed() {
        String actualResult = moodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }
}
