package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void longPressList() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement longList = find(MobileBy.xpath("//android.widget.TextView[@text='List ke-7']"));
    action.longPress(PointOption.point(longList.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.of(5, ChronoUnit.SECONDS)))
            .release()
            .perform();
  }

  public void multipleTouchList(){
    TouchAction action = new TouchAction(getDriver());
    AndroidElement tapList = find(MobileBy.xpath("//android.widget.TextView[@text='List ke-7']"));
    action.tap(TapOptions.tapOptions().withTapsCount(3)
            .withElement(ElementOption.element(tapList)))
            .perform();
  }

  public String getTitle(){
    return getText(MobileBy.xpath("//android.widget.TextView[@text='List']"));
  }

  public boolean checkHasilTapAndHold(){
    By locator = MobileBy.xpath("//*[contains(@text, 'List ke-7')]");
    AndroidElement hasilTapHold = driver.findElement(locator);
    return hasilTapHold.isDisplayed();
  }

}
