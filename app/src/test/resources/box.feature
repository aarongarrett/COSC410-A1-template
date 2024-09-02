Feature: Specified behavior as a box volume

  Scenario: Box 1
    Given the length is 7
      And the width is 6
      And the height is 5
      And the type is "box"
    When the calculation is made
    Then the output should be 210

  Scenario: Box 2
    Given the length is 8
      And the width is 2
      And the height is 3
      And the type is "box"
    When the calculation is made
    Then the output should be 48
