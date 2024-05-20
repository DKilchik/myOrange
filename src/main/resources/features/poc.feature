
Feature: poc


  @debug
  Scenario: Store Locator - display store details
    Given Open My Orange Application
    And user tap 'Switch to English' button
    And user accept all cookies
    And user tap Navigate Up Btn
    And user tap GOT IT Btn
    And user tab Orange logo
    And user tap Allow Notification
    And user tap GOT IT Btn
    And user tap Allow Notification
    And user tab Pomoc option
    And user tap GOT IT Btn
    And user tap Orange shops option
    And user tap While using the app permission button
    And user tap Confirm to Allow Map display popup
    And user click to first shop from the list
    Then minimal address information is present
    And Contact information is present
    And opening hours information is present

  @debug
  Scenario: Activation of services - free package
    Given Open My Orange Application
    And user tap 'Switch to English' button
    And user accept all cookies
    And user select Prihlásenie cez email
    When user enter "0917150624@centrum.sk" email and "BzhPower" password
    And user tap Prihlásiť sa button
    And user tap GO TO HOME SCREEN button
    And user tap Allow Notification
    And user tap SKIP button
    And user tap Continue button
    And user tap GOT IT Btn
    And user tap Buy A Bundle button
    And user tap on Doplnkové služby
    And user select additional option
    And user tap CHECK OUT button
    And user tap PAY button
    When user tap SHOW DETAILS button
    Then Option name should be visible
    And price should be present
    And activation date should be present
    When user tap DONE button
    Then Dashboard screen is opened


  Scenario: Deactivation of services - free package
    Given Open My Orange Application
    And user tap 'Switch to English' button
    And user accept all cookies
    And user select Prihlásenie cez email
    When user enter "0917150624@centrum.sk" email and "BzhPower" password
    And user tap Prihlásiť sa button
    And user tap GO TO HOME SCREEN button
    And user tap Allow Notification
    And user tap SKIP button
    And user tap Continue button
    And user tap GOT IT Btn
    And user tap consumption card
    And user tap Balík starostlivosti základ
    And user tab UNSUBSCRIBE button
    And user tap Confirm

