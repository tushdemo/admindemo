Feature: Login

Scenario: Succesful Login with Valid Credentials

   Given User Launch Chrome Browser
   When User Opens URL "https://admin-demo.nopcommerce.com/login"
   And User enter Email as "admin@yourstore.com" and Password as "admin"
   And Click on Login Button
   Then Page Title  Should be "Dashboard / nopCommerce administration"
   When User Click on Logout button
   And close browser
   
   Scenario Outline: Login data driven

   Given User Launch Chrome Browser
   When User Opens URL "https://admin-demo.nopcommerce.com/login"
   And User enter Email as "<email>" and Password as "<password>"
   And Click on Login Button
   Then Page Title  Should be "Dashboard / nopCommerce administration"
   When User Click on Logout button
   And close browser
   
   Examples:
   | email | password |
   | admin@yourstore.com | admin |
   | a1dmin@yourstore.com| Admin |