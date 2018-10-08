Feature: Valtech Web test

  Scenario: Validate Valtech test

    Given user opens browser
    When user is on veltech home page
    Then validate homepage title
    When User is on the recent blogs page
    Then validate recent blogs page title
    And validate about page header h1
    And validate work page header h1
    And validate service page header h1
    And count the total number of office
