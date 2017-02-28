# AdCampaignService
JAX-RS
1) In order to test the application, install "advanced REST client"/"postman", plugin in google chrome.
2) Import the project as maven project.
3) Updatemaven project, add dependencies, check for the pugins according to the pom.xml file.
4) Enter the following URL for POST method: http://localhost:8080/campaign/services/adcampaign/users
5) Select Post and enter the data as follows: 

<User>
<partner_id>1</partner_id>
<duration>100</duration>
<ad_content>Content of the adcampaign</ad_content>
</User>

Or

{ "partner_id":"1", "duration":100,"ad_content":"Content of the adcampaign" }

6) hit send
7) Enter the following URL for GET method: http://localhost:8080/campaign/services/adcampaign/users/1
8) GET method displays the data according to the partner_id in the URL
9) Check for the JAXB annotation i.e @PRODUCES and set the application to XML/JSON as required.
10) In case, CLASSNOTFOUNDEXCEPTION make sure the class path is correct in the cxf-servlet.xml
