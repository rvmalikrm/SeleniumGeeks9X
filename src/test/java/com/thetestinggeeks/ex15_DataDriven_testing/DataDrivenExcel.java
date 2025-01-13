package com.thetestinggeeks.ex15_DataDriven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenExcel {



    @Test(dataProvider = "LoginData", dataProviderClass = "UtilExcel")
    public void test_VWOLogin(String email, String password){

    }

}
