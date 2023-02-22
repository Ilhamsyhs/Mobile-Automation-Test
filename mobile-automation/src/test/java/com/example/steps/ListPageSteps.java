package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @And("user do long press")
  public void userDoLongPress() {
    listPage.longPressList();
  }

  @And("user do multiple taps")
  public void userDoMultipleTaps() {
    listPage.multipleTouchList();
  }

  @Then("user successfully do long press")
  public void userSuccessfullyDoLongPress() {
    String titleText = listPage.getTitle();
    Assertions.assertEquals("List", titleText);
    boolean isDisplayed = listPage.checkHasilTapAndHold();
    Assertions.assertTrue(isDisplayed);
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }

  @Then("user successfully doing multiple taps")
  public void userSuccessfullyDoingMultipleTaps() {
    String titleText = listPage.getTitle();
    Assertions.assertEquals("List", titleText);
    boolean isDisplayed = listPage.checkHasilTapAndHold();
    Assertions.assertTrue(isDisplayed);
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }
}
