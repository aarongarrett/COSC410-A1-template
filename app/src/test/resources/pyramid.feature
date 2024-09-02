Feature: Specified behavior as a pyramid volume

  Scenario: Pyramid 1
    Given the length is 7
      And the width is 6
      And the height is 5
      And the type is "pyramid"
    When the calculation is made
    Then the output should be 70

  Scenario: Pyramid 2
    Given the length is 8
      And the width is 2
      And the height is 3
      And the type is "pyramid"
    When the calculation is made
    Then the output should be 16
