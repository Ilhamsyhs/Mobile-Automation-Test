package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;
import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CalPage extends BasePageObject {

    public String getHasil(){
        return getText(MobileBy.id("tv_result"));
    }


    public void inputFirstNumber(int first){
        type(MobileBy.id("et_1"), first);
    }

    public void inputSecondNumber(int first){
        type(MobileBy.id("et_2"), first);
    }


    public void clickSpinnerBTN(){
        click(MobileBy.id("spinner_1"));
    }

    public void clickSubstractionOption(){
        click(MobileBy.xpath("//android.widget.TextView[@text='-']"));
    }

    public void clickMultiplicationOption(){
        click(MobileBy.xpath("//android.widget.TextView[@text='*']"));
    }

    public void clickDivisionOption(){
        click(MobileBy.xpath("//android.widget.TextView[@text='/']"));
    }

    public void clickEqualBTN(){
        click(MobileBy.id("acb_calculate"));
    }

    public boolean checkHasilAppear(){
        By locator = MobileBy.id("tv_result");
        AndroidElement hasilAppear = driver.findElement(locator);
        return hasilAppear.isDisplayed();
    }

}
