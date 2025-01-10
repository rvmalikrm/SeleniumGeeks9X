package com.thetestinggeeks.ex15_DataDriven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataDrivenTesting {

    @DataProvider(name="LoginData",parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                new Object[] {"admin@gamil.com", "pass123"},
                new Object[] {"admin123@gamil.com", "pass123"},
                new Object[] {"admin1221@gmail.com", "password1221"}
        };
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password){
        System.out.println(email + " | "+ password);

    }

}
