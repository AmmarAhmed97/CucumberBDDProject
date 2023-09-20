Feature: Login 

@Sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://stage.360factors.com/predict360/login.do"
	And User enters Email as "cmsautomationuser001" and Password as "Test12345" and key as "BCUS"
	And Click on Login
	And close browser1

@Sanity
Scenario Outline:Successful Login with Valid Credentials DDT
	Given User Launch Chrome browser 
	When User opens URL "http://stage.360factors.com/"
	And User enters Email as "<username>" and Password as "<password>" and key as "<key>"
	And Click on Login
	And close browser1

#@Sanity1
#Scenario: Read data from Excel sheet
#	Given I open the Excel file "C:/Users/aamar.ahmed/OneDrive - 360Factors/Desktop/Automation.xlsx"
#	When I read data from the sheet "Sheet1" at row 2 and column 3
#	Then The data should be "arif.riskuser"
#	And I close the Excel file

Examples:
|username|password|key|
|cmsautomationuser001|Test12345|BCUS|
|automation@none|Test@123456|NONE|
	
