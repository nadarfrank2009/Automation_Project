Feature: User will login to their hotwire account

@Smoke
Scenario: User will enter their email and password into hotwire

Given User is able to open browser
And User is able to enter "https://hotwire.com" url

When User clicks on homepage Sign in button

And User enters their email "nadarfrank2009@gmail.com" and password "sdifubdv"

And User clicks on Sign In button

Then User is taken to their hotwire account

