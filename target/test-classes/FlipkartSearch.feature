@tag
Feature: Flipkart

  @tag1
  Scenario: to validate search option
    Given open chrome browser
    When launch flipkart url
    And pass and enter value in search text box
    And select the particular search
    And to click the add to cart button
    Then close the browser

    
  Scenario: to validate dropdown option in fashion field
  	Given open chrome browser
    When launch flipkart url
    And tuch the Fashion field
    And again tuch the Men footwear field
    And to click men's casual shoes
		Then close the browser