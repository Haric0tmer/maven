package com.imt.mines.bank.bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.imt.mines.bank.bdd", plugin = { "pretty" })
public class RunBankAccountCucumberTest {
    // Cette classe reste vide, elle sert juste de point d'entrée pour JUnit
}