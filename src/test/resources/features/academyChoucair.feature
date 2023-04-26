# Author: Luis Morales
@stories
Feature: Utest Page
  As a developer, I want to register on the utest page to work on software tests.
  @Scenario 1
  Scenario: register on the utest page
    Given than luis wants to register on the utest page


    When you access the utest page
      | strFirstName | strLastName| strEmailAddress        | strMonthBirth | intDayBirth | intYearBirth | strCity    | strPostalCode | strPassword   | strConfirmPassword |
      | Frederick    | Starck     | doctorstarck@gmail.com  | April         |      6      |      1992    |  Las Lomas |      507      | Choucair2023* | Choucair2023* |

    Then create a new user on the utest page
      |  strMessage                           |
      |  First, please check your email inbox |