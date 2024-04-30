
Feature: SAAS Sanity and Regression testcases
   
  @sanity
  Scenario: Successful login with valid credentials
    Given Admin in on the login page
    When Admin will enter username and password
    And Admin will click the login button
    And Admin should be logged in to the account
    And delete subscriber
    Then Subscriber deleted successfully
    
  @sanity
  Scenario: Subscriber will sign up
    Given Subsriber is on home page
    When Subscriber will sign up
    Then Subscriber Signed up successfully
    
  @sanity
  Scenario: Subscriber will sign in for setup wizard
    Given Subscriber will enter user name and password
    When Subscriber will log in
    And Subscriber will create role
    And Subscriber will create user
    Then Subscriber done with the setup wizard
   
    
  
  
    
   @sanity 
   Scenario: Created user signup 
   Given User will go on gmail page
   When User will sign in gmail
   Then User signed up successfuly

    
    @sanity
    Scenario: collabpro process
    Given Assignee will login 
    When Assignee will click on collab pro
    And Assignee will assign task to created user
    Then Assignee has successfully assigned task to the user
    
    @sanity
     Scenario: User will send task for review
     Given User will go on home page
     When User will sign in
     And User will send task for review
     
     @sanity
      Scenario: Assignee will approve and reject the task
      Given  Assignee will login for task check
      When Assignee will approve the task 
      And Assignee will reject the task
      
     @sanity
     Scenario: Assignee will dowload reports 
     Given download reports

 