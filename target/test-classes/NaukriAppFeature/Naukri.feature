@smoke
Feature: Naukri website functionality

  Background: 
    Given Browser is open
    When Enter the url of naukri
    Then Login page of naukri website is opened

  Scenario Outline: 
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page
    
    Examples: 
      | username                   | password |
      | arpithahegde.25@gmail.com  | saf0451* |
      | poojithahegde.25@gmail.com | pdf1160* |

      
      