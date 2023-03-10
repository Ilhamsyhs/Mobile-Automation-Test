package com.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/simpleapp/",
    glue = "com.example",
    stepNotifications = true,
    tags = "@tugas")
public class SerenityRunner {}
