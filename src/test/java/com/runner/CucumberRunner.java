package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ishuk\\Desktop\\Edureka - Selenium Certification Course_files\\practise\\features",
glue={"com.stepdefinitions"}



)

public class CucumberRunner
{

}
//tags= {"@test"}