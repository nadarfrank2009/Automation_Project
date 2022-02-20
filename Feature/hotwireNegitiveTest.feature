Feature: User will login to their hotwire account

Scenario Outline: User will enter their email and password into hotwire

Given User is able to open browser
And User is able to enter "https://hotwire.com" url

When User clicks on homepage Sign in button

And User enters their email "<email>" and password "<password>"

And User clicks on Sign In button

Then User is taken to their hotwire account

Examples:
|email           |password |
|test@gmail.com  |password1|
|test@yahoo.com  |password2|
|test@hotmail.com|password3|

