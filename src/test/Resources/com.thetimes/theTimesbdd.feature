Feature: Digital pack subscription on the times

  As a user I should subscribe digital pack
  so that I can use the times digital services for 8 weeks


@smokeTest
  Scenario: user should subscribe The digital pack subscription
    Given   user is on home page
    When    user click on subscribe services
    And    user select digital service fro 8 week
    Then    user should get digital servies subscription for 8 weeks


