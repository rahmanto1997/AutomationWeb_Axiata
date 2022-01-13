Feature: Automation WEB UI Gits
  As a user, I want to login to gist.github.com
  As a user, I want to create a gist
  As a user, I want to see the list of gist’s
  As a user, I want to edit a gist
  As a user, I want to delete a gist
  As a user, I want to logout from gist.github.com

  Scenario: Create end to end UI automation test with user story
    Given I am logged as user
    When I am click button text Sign In
    And I am click button +
    And I am input Gist description "Plugin Maven"
    And I am input Filename "maven.xml"
    And I am input code "test hiring axiata digitallabs"
    And I am click button text Create secret gist
    And I am click menu dropdown icon profile
    And I am click button text your gists
    And I am click my gists
    And I am click button edit
    And I am update data in gist description "Maven"
    And I am update data in code " & test automation hiring axiata"
    And I am click button Update Data
    And I am click button delete
    And I am click menu dropdown icon profile
    And I am click button text Sign Out
    Then I am success logout