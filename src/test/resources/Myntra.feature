@Feature2

Feature: To validate login page of myntra
@sanity
Scenario Outline: 
Given To launch the browser and maximize window
When To launch the ajio url
When To Click new account field
And To enter mobile number"<emaildata>"or email
Then close the browser

Examples: 
|emaildata|
|nishaasif|
|878767889|
|897767988|



