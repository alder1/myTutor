Feature: As a user of myTutor when I login to the website as a parent I want to be able to find a tutor and send the tutor a message

  Scenario:
    Given I am on the MyTutor landing page
    When I click on login
    And I select the parent button
    And I enter my valid email and password
    And I click on the second login button
    And I select on Find A tutor
    And I select the subject of choice
    And I select the Level
    And I select a gender
    And I select any of the displayed options
    And I select and write in their message body
    And I click on Send Message
    Then the Message sent icon should be displayed









