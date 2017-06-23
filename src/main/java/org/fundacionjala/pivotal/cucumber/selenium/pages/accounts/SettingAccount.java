package org.fundacionjala.pivotal.cucumber.selenium.pages.accounts;

import org.fundacionjala.pivotal.cucumber.selenium.pages.AbstractBasePage;
import org.fundacionjala.pivotal.cucumber.selenium.pages.common.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class doing the manage the setting the account.
 */
public class SettingAccount extends AbstractBasePage {
    @FindBy(css = "a.button.current")
    private WebElement settingButton;
    @FindBy(css = "div.description > a")
    private WebElement deleteAccountLink;

    /**
     * This method is clicking on the "Ok alert Message" button.
     */
    private void clickOKAlertMessage() {
        driver.switchTo().alert().accept();
    }

    /**
     * This method is clicking on the "Delete Account" link.
     */
    void clickDeleteAccountLink() {
        CommonActions.clickElement(deleteAccountLink);
        clickOKAlertMessage();
    }
}
