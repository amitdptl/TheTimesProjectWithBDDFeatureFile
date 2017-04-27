package com.thetimes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 26/04/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features=".",format="html:target/Cucumber.Reports",tags="@smokeTest")
public class CukeTest {
}
