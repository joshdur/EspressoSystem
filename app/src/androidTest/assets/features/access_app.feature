# Automatically generated by Honest Code
# Do not edit this file as it will be overwritten

@android
Feature: Access to rss reader
  as an user
  I want to see a list of news

  Scenario: Show a list of news
    Given User is on news list and data is ok
    Then A list of news is showed

  Scenario: Show a connectivity error message
    Given User is on news list and data is ko
    Then A connectivity error showed

#  Scenario: Show a list of news beta
#    Given user is on news list
#    When data is available
#    And return a list of news
#    Then A list of news is showed

#  Scenario: Show a list of news beta
#    Given user is on news list
#    When data is available
#    And return an error of news
#    Then A list of news is showed