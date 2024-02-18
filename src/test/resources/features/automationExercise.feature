Feature: Using AutomationPractice

  @regression
  @TestCase-1
  Scenario: Login
    Given I access to AutomationExercise
    And I check HomePage is visible
    And I click on SignUp option
    And I check SignUp section is visible
    When I fill the initial sign up fields and click on sign up button
    And I set the password
    And I check that Name and Email fields are not null
    And I fill all the rest fields and I press create account button
    Then I check that a successfully created account message is displayed
    And I click on Continue button
    And I check that I'm log in as user

  @regression
  @TestCase-4
  Scenario: User can Log out
    Given I access to the AutomationExercise
    And I check that HomePage is visible
    And I click on SignUp option2
    And I check that Login section is visible
    When I fill the Login fields
    And I check that Login as label is visible
    And I click on Log out option
    Then I check that HomePage is visible after loggin out

    @regression
    @TestCase-6
    Scenario: Users can Contact Us
      Given I can access to the AutomationExercise
      And I check that HomePage is visible
      And I click on Contact Us option
      And I validate that Get In Touch label is visible
      When I fill the Contact Us form
      And I click on Submit button
      And I click on Aceptar button
      Then I validate that success message is displayed
      And I click on Home button
      And I check that HomePage is visible after contact us

      @regression
      @TestCase-8
    Scenario: User can verify all products and product detail page
      Given I navigate to AutomateExercise
      And I verify that home page is visible successfully
      And I click on Products button
      And I verify user is navigated to ALL PRODUCTS page successfully
      And The products list is visible
      When I click on View Product of first product
      Then The user is landed to product detail page
      And I verify that detail detail is visible

      @regression
      @TestCase-9
    Scenario: User can Search products
      Given I navigate to AutomateExercise
      And I verify that home page is visible successfully
      When I click on Products button
      And I verify user is navigated to ALL PRODUCTS page successfully
      When I enter product name in search input and click search button
      And I verify SEARCHED PRODUCTS is visible
      Then I verify all the products related to search are visible

     @regression
     @TestCase-10
    Scenario: Verify Subscription
     Given I navigate to AutomateExercise
     And I verify that home page is visible successfully
     When I scroll down to footer
     And I verify text 'SUBSCRIPTION'
     When I enter email in input and click arrow button
     Then I verify success message 'You have been successfully subscribed!' is visible

    @regression
    @TestCase-11
  Scenario: Verify Subscription in Cart page
    Given I navigate to AutomateExercise
    And I verify that home page is visible successfully
    When I click Cart button
    And I scroll down to footer
    And I verify text 'SUBSCRIPTION'
    When I enter email in input and click arrow button
    Then I verify success message 'You have been successfully subscribed!' is visible

    @regression
    @TestCase-12
    @DeleteUserWhenItHasBeenCreated
  Scenario: Add Products in Cart
    Given I navigate to AutomateExercise
    And I verify that home page is visible successfully
    And I click on Products button
    When I hover over first product and click Add to cart
    And I click on Continue Shopping button
    When I hover over second product and click Add to cart
    And I click on Continue Shopping button
    And I click Cart button
    Then I verify both products are added to Cart
    And I verify their prices, quantity and total price
