Feature: Customers

Scenario: Add new Customer

  Given User Launch Chrome Browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enter Email as "admin@yourstore.com" and Password as "admin"
  And Click on Login Button
  Then user can view Dashboard
  When user click on Customer Menu
  And click on customer menu Item
  And click on Add new button
  #Then user can view Add new customer page
  When user enter customer info
  And click on save button
  Then user can view conformation message 
  And close browser 
  