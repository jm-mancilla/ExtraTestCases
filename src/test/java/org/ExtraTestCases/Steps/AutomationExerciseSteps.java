package org.ExtraTestCases.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import org.ExtraTestCases.Actions.*;
import org.ExtraTestCases.Data.Users;
import org.ExtraTestCases.Page.LoginPage;
import org.ExtraTestCases.Page.SignUpPage;
import org.ExtraTestCases.Page.CartPage;

import org.ExtraTestCases.Data.UserLogin;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class AutomationExerciseSteps {
    @Managed
    LoginAction loginAction;
    @Managed
    SignUpAction signUpAction;
    @Managed
    LoginPage loginPage;
    @Managed
    SignUpPage signUpPage;
    @Managed
    ContactUsAction contactUsAction;
    @Managed
    ProductsAction productsAction;
    @Managed
    FooterAction footerAction;
    @Managed
    CartAction cartAction;
    @Given("I access to AutomationExercise")
    public void iAccessToAutomationExercise() {
        loginAction.accessToThePage();
    }

    @And("I check HomePage is visible")
    public void iCheckHomePageIsVisible() {
        Serenity.reportThat("Then I validate that HomePage is visible", () ->
                assertThat(loginAction.checkHomePageIsVisible()));
    }

    @And("I click on SignUp option")
    public void iClickOnSignUpOption() {
        loginAction.clickSignUpButton();
    }

    @And("I check SignUp section is visible")
    public void iCheckSignUpSectionIsVisible() {
        Serenity.reportThat("Then I validate that Signup form is visible", () ->
                assertThat(loginAction.checkSignUpFormIsVisible()));
    }

    @And("I fill the initial sign up fields and click on sign up button")
    public void iFillTheInitialSignUpFieldsAndClickOnSignUpButton() {
        loginAction.firstsignUp(Users.userStartsSignUp);
    }

    @And("I set the password")
    public void iSetThePassword() {
        signUpAction.setPassword(Users.password);
    }

    @And("I check that Name and Email fields are not null")
    public void iCheckThatNameAndEmailFieldsAreNotNull() {
        Serenity.reportThat("Then I validate that Name is filled",
                () -> assertThat(signUpAction.checkFieldNameIsNotNull()).isNotNull());
        Serenity.reportThat("Then I validate that Email is filled",
                () -> assertThat(signUpAction.checkFieldEmailIsNotNull()).isNotNull());
    }

    @And("I fill all the rest fields and I press create account button")
    public void iFillAllTheRestFieldsAndIPressCreateAccountButton() {
        signUpAction.finalSignUpForm(Users.userEndsSignUp);
    }

    @And("I check that a successfully created account message is displayed")
    public void iCheckThatASuccessfulyCreatedAccountMessageIsDisplayed() {
        Serenity.reportThat("Then I validate the the account was successfully created",
                () -> assertThat(signUpAction.checkAccountHasBeenCreated()).isEqualToIgnoringCase("ACCOUNT CREATED!"));
    }

    @When("I click on Continue button")
    public void iClickOnContinueButton() {
        signUpAction.clickContinueButtonForm();
    }

    @Then("I check that I'm log in as user")
    public void iCheckThatIMLogInAsUser() {
        Serenity.reportThat("Then I validate that the user has been logged in",
                () -> assertThat(signUpAction.loginAsIsVisible()));
    }

    @Given("I access to the AutomationExercise")
    public void iAccessToTheAutomationExercise() {
        loginAction.accessToThePage();
    }

    @And("I check that HomePage is visible")
    public void iCheckThatHomePageIsVisible() {
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));
    }@And("I click on SignUp option2")
    public void IClickOnSignUpOption2() {
        loginAction.clickSignUpButton();
    }

    @And("I check that Login section is visible")
    public void iCheckThatLoginSectionIsVisible() {
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
    }

    @When("I fill the Login fields")
    public void iFillTheLoginFields() {
        loginAction.logIn(Users.userLogin);
    }

    @And("I check that Login as label is visible")
    public void iCheckThatLoginAsLabelIsVisible() {
        Serenity.reportThat("Then I validate that Logged oin as: user is visible",
                ()-> assertThat(signUpAction.loginAsIsVisible()));
    }

    @And("I click on Log out option")
    public void iClickOnLogOutOption() {
        signUpAction.clickOnLogOut();
    }

    @Then("I check that HomePage is visible after loggin out")
    public void iCheckThatHomePageIsVisibleAfterLogginOut() {
        Serenity.reportThat("Then I validate that HomePage is visible after loggin out",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
    }

    @Given("I can access to the AutomationExercise")
    public void iCanAccessToTheAutomationExercise() {
        loginAction.accessToThePage();
    }

    @And("I click on Contact Us option")
    public void iClickOnContactUsOption() {
        loginAction.clickOnContactUs();
    }

    @And("I validate that Get In Touch label is visible")
    public void iValidateThatGetInTouchLabelIsVisible() {
        Serenity.reportThat("Then I validate that GET IN TOUCH label is visble",
                ()-> assertThat(loginAction.checkGetInTouchLabelIsVisible()));
    }

    @When("I fill the Contact Us form")
    public void iFillTheContactUsForm() {
        contactUsAction.fillContactUsForm(Users.userStartsSignUp);
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
        contactUsAction.clickOnSubmit();
    }

    @And("I click on Aceptar button")
    public void iClickOnAceptarButton() {
        contactUsAction.clickOnAceptar();
    }

    @Then("I validate that success message is displayed")
    public void iValidateThatSuccessMessageIsDisplayed() {
        Serenity.reportThat("Then I validate that success message is visible",
                ()-> assertThat(contactUsAction.checkSuccessAfterAlert()));
    }

    @And("I click on Home button")
    public void iClickOnHomeButton() {
        loginAction.clickOnHomeButton();
    }
    @And("I check that HomePage is visible after contact us")
    public void iCheckThatHomePageIsVisibleAfterContactUs(){
        Serenity.reportThat("Then I validate HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));
    }

    @Given("I navigate to AutomateExercise")
    public void iNavigateToAutomateExercise() {
        loginAction.accessToThePage();
    }

    @And("I verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
        loginAction.checkHomePageIsVisible();
    }

    @And("I click on Products button")
    public void iClickOnProductsButton() throws InterruptedException {
        productsAction.clickOnProductsOption();
    }

    @And("I verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Serenity.reportThat("I validate that Products page is successfully opened",
                ()-> assertThat(productsAction.validateProductsPageIsOpened()));
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        productsAction.checkProductsListIsVisible();
    }

    @When("I click on View Product of first product")
    public void iClickOnViewProductOfFirstProduct() throws InterruptedException {
        productsAction.getAllProducts();
    }

    @Then("The user is landed to product detail page")
    public void theUserIsLandedToProductDetailPage() {
        productsAction.getProductDetails();
    }

    @And("I verify that detail detail is visible")
    public void iVerifyThatDetailDetailIsVisible() {
        Serenity.reportThat("I validate Product details is visible",
                ()-> assertThat(productsAction.getProductDetails()));
    }

    @When("I enter product name in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton() {
        productsAction.searchProducts();
        productsAction.clickOnSearchButton();
    }

    @And("I verify SEARCHED PRODUCTS is visible")
    public void iVerifySEARCHEDPRODUCTSIsVisible() {
       assertThat(productsAction.searchedProducts()).isEqualToIgnoringCase("Searched Products");
    }

    @Then("I verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        assertThat(productsAction.searchedItemsAreVisible()).isTrue();
    }

    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
        footerAction.focusOnFooter();
    }

    @And("I verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String text) {
        assertThat(footerAction.footerText()).isEqualToIgnoringCase(text);
    }

    @When("I enter email in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton() throws InterruptedException {
        footerAction.enterEmailAccount();
        footerAction.clickOnArrowButton();
    }

    @Then("I verify success message {string} is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String text) {
        assertThat(footerAction.getSubscribeTextMessage()).isEqualToIgnoringCase(text);
    }

    @When("I click Cart button")
    public void iClickCartButton() {
        loginAction.clickOnCartOption();
    }

    @When("I hover over first product and click Add to cart")
    public void iHoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        productsAction.clickOnAddCartHoverFirstProduct();
    }

    @And("I click on Continue Shopping button")
    public void iClickOnContinueShoppingButton() throws InterruptedException {
        productsAction.clickOnContinueShopping();
    }

    @When("I hover over second product and click Add to cart")
    public void iHoverOverSecondProductAndClickAddToCart() throws InterruptedException {
        productsAction.clickOnAddCartHoverSecondProduct();
    }
    @Then("I verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() throws InterruptedException {
        System.out.println(productsAction.numberOfProductsInCart());
        assertThat(productsAction.numberOfProductsInCart()).isTrue();
    }

    @And("I verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        System.out.println(cartAction.itemsInfoAreVisible());
        cartAction.itemsInfoAreVisible();
    }
}
