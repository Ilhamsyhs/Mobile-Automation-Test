@android @tugas
Feature: Multiple taps

  Scenario: Verify multiple taps
    Given user already logged in
    When user go to list menu
    And user do multiple taps
    Then user successfully doing multiple taps
