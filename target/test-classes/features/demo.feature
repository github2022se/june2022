@tag
Feature: In this feature calculating numbers

Background:
 Given I am background
 
  @tag1 @Regression @Smoke
  Scenario: Add two integer number and verify result
    Given I have two integer values 4 and 5
    When I add both values
    Then I verify result is 9
    
  @tag1 @Regression
  Scenario Outline: Add two integer number and verify result using data driven
    Given I have two integer values <FirstValue> and <secondValue>
    When I add both values
    Then I verify result is <result>

    Examples: 
      | FirstValue | secondValue | result |
      |          3 |           5 |      8 |
      |         10 |          21 |     31 |
      |          4 |          10 |     15 |
      |         20 |          30 |     50 |

    Examples: 
      | FirstValue | secondValue | result |
      |         10 |          15 |     25 |
      |         15 |           5 |     20 |
