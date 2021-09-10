Feature: Login Test for Twitter

  Scenario: Verify login to twitter is successfull
  
    Given Twitter login page is open in browser
    When User Enters username and pwd
    And User Click on Login button
    Then User can see home page of twitter
