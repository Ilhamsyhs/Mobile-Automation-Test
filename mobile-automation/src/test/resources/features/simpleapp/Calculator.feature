@android @tugas
Feature: Calculator

  Scenario: Trying calculator addition
    Given user already logged in
    When user input first number 2
    And user input second number 3
    And user choose multiply
    And user click button equal
    Then hasil should be addition 5

  Scenario: Trying calculator substraction
    Given user already logged in
    When user input first number 5
    And user input second number 3
    And user choose spinner
    And user click substraction option
    And user click button equal
    Then hasil should be substraction 2

  Scenario: Trying calculator multiplication
    Given user already logged in
    When user input first number 5
    And user input second number 3
    And user choose spinner
    And user click multiplication option
    And user click button equal
    Then hasil should be multiplication 15

  Scenario: Trying calculator division
    Given user already logged in
    When user input first number 20
    And user input second number 2
    And user choose spinner
    And user click division option
    And user click button equal
    Then hasil should be division 10

