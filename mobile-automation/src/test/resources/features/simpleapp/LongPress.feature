@android @tugas
  Feature: Long press

    Scenario: Verify long press
      Given user already logged in
      When user go to list menu
      And user do long press
      Then user successfully do long press
