Feature: Search functionality

  Background: I am on homepage

  @Smoke
  Scenario Outline: Search the buy car with model
    When I mouse hover on buy+sell tab
    And I click Search Cars link
    Then I navigate to 'new and used car search' page
    And I select make "<make>"
    And I Select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make in results


    Examples:
      | make    | model    | location            | price |
      | Audi    | A1       | ACT - All           | 10000 |
      | BMW     | X5       | VIC - All           | 50000 |
      | Ford    | Explorer | NSW - All           | 50000 |
      | Honda   | Accord   | NSW - Central Coast | 45000 |
      | Hyundai | Elantra  | NT - North          | 35000 |
      | Jeep    | Cherokee | NT - All            | 60000 |


  @Smoke
  Scenario Outline: Search the used car with model
    When I mouse hover on buy+sell tab
    And I click on 'used' car link
    And I select make "<make>"
    And I Select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make in results
    Examples:
      | make | model | location | price |
      | Audi    | A1       | ACT - All           | 10000 |
      | BMW     | X5       | VIC - All           | 50000 |
      | Ford    | Explorer | NSW - All           | 50000 |
      | Honda   | Accord   | NSW - Central Coast | 45000 |
      | Hyundai | Elantra  | NT - North          | 35000 |
      | Jeep    | Cherokee | NT - All            | 60000 |

