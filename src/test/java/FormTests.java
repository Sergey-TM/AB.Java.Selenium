import PageActions.FormActions;
import PageActions.TabsActions;
import PageActions.TableActions;
import Settings.WebDriverSettings;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FormTests extends WebDriverSettings {
    @Test
    public void test1() {
        //pageFactory
        FormActions formActions = PageFactory.initElements(driver, FormActions.class);
        TabsActions tabsActions = PageFactory.initElements(driver, TabsActions.class);
        //TableActions tableActions = PageFactory.initElements(driver, TableActions.class);
        //open Page
        formActions.open();
        //fill form with valid data
        formActions.firstNameFieldSK();
        formActions.lastNameFieldSK();
        formActions.emailFieldSK();
        formActions.genderRadioBtnClick();
        formActions.mobileFieldSK();
        //scroll the page
        formActions.scrollPage();
        //submit form
        formActions.submitBtnClick();
        //switch to modal
        tabsActions.switchtolastTab();
        //verify modal title
        Assert.assertEquals(formActions.getModalTitle(), "Thanks for submitting the form");
    }
}
