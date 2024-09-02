Feature: Specified behavior as an ellipsoid volume

  Scenario: Ellipsoid 1
    Given the length is 7
      And the width is 6
      And the height is 5
      And the type is "ellipsoid"
    When the calculation is made
    Then the output should be 879.646

  Scenario: Ellipsoid 2
    Given the length is 8
      And the width is 2
      And the height is 3
      And the type is "ellipsoid"
    When the calculation is made
    Then the output should be 201.06194
