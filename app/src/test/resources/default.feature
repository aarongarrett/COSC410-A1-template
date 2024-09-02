Feature: Default behavior as a box volume

  Scenario: Cube
    Given the length is 5
      And the width is 5
      And the height is 5
    When the calculation is made
    Then the output should be 125

  Scenario: Box
    Given the length is 2
      And the width is 3
      And the height is 4
    When the calculation is made
    Then the output should be 24
