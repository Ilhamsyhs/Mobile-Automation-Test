package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;


public class CalculatorStep extends BaseTest {


    //addition
    @When("user input first number {int}")
    public void userInputFirstNumber(int first) {
        calPage.inputFirstNumber(first);
    }

    @And("user input second number {int}")
    public void userInputSecondNumber(int second) {
        calPage.inputSecondNumber(second);
    }

    @And("user choose multiply")
    public void userChooseMultiply() {
    }

    @And("user click button equal")
    public void userClickButtonEqual() {
        calPage.clickEqualBTN();
    }

    @Then("hasil should be addition {int}")
    public void hasilShouldBe(int hasil) {
        String hasilText = calPage.getHasil();
        Assertions.assertEquals("Hasil : "+hasil, hasilText);
        boolean isDisplayed = calPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    // substraction
    @And("user choose spinner")
    public void userChooseMinus() {
        calPage.clickSpinnerBTN();
    }

    @And("user click substraction option")
    public void userClickSubstractionOption() {
        calPage.clickSubstractionOption();
    }

    @Then("hasil should be substraction {int}")
    public void hasilShouldBee(int hasil) {
        String hasilText = calPage.getHasil();
        Assertions.assertEquals("Hasil : "+ hasil, hasilText);
        boolean isDisplayed = calPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    //multiplication
    @And("user click multiplication option")
    public void userClickMultiplicationOption() {
        calPage.clickMultiplicationOption();
    }

    @Then("hasil should be multiplication {int}")
    public void hasilShouldBeMultiplication(int hasil) {
        String hasilText = calPage.getHasil();
        Assertions.assertEquals("Hasil : "+hasil, hasilText);
        boolean isDisplayed = calPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    //division
    @And("user click division option")
    public void userClickDivisionOption() {
        calPage.clickDivisionOption();
    }

    @Then("hasil should be division {int}")
    public void hasilShouldBeDivision(int hasil) {
        String hasilText = calPage.getHasil();
        Assertions.assertEquals("Hasil : "+hasil, hasilText);
        boolean isDisplayed = calPage.checkHasilAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

}
