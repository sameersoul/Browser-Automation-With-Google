Feature: Google Search for Independence Days

  Scenario Outline: Search for Independence Days of <Country>
    Given I am on the Google home page
    When I search for "<Query>"
    Then I should see search results related to Independence Day <Country>

    Examples: 
      | Country   | Query                      |
      | USA       | Independence Day USA       |
      | India     | Independence Day India     |
      | Sri Lanka | Independence Day Sri Lanka |
      | Pakistan  | Independence Day Pakistan  |
