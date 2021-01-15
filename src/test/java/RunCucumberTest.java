/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author kohli
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"} ,
        features="C:/Users/kohli/OneDrive/Documents/NetBeansProjects/NewCucumber/src/main/java",
        dryRun = false
)
public class RunCucumberTest {
    
}

