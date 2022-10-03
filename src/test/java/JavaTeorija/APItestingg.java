package JavaTeorija;

public class APItestingg {

    /*
    What is the API?

API is an acronym for Application Programing Interface and we need them so that applications build on different languages can communicate and bcz of security.

 Is a type of testing which determines if the developed APIs meet expectations regarding functionality, reliability, performance and security of the application. We really test to verify that we get what is expected. We will have to verify a few areas of the response body and also status codes.

To preform testing we need documentation, libraries, Rest Assured, Insomnia or Postman.



What is the Web Services?

API hosted over the internet is called Web Services.

All Web Services are API but all API are not Web Services.



There are 2 types of web services:

1. SOAP web services

SOAP (Simple Object Access Protocol) - is based on transferring only XML data as SOAP Messages.

SOAP is more secure, however it is slower than REST.

A SOAP web service is developed based of the rules and guidelines set by the W3C consortium

2. RESTful web services (REST API)

REST (Representational State Transfer) - that uses different representations to exchange and transfer data in JSON, XML or TEXT format.

REST is lightweight because developers have more flexibility to develop the web service the way they desire and don’t need to follow guidelines set by W3C consortium and it is less secure compare to SOAP, but it is faster.



Which Protocol is used by  Restful Web Service?

HTTP/HTTPS protocols for a medium communication between client and server.



HTTP request method is made up of four components?

● Request Method: Get, Post, Put, Delete

● Request URI: complete URL of the resource

● Request Header: Accept, Content-Type

● Request Body: data to be sent to the resource



What would you expect in a response?

HTTP response method is made up of three components:

● Response Status Code:200, 201, 400, 404, 500

● Response Header: Date, Server, Last-Modified, Content-Type

● Response Body:data that comes back to the client from the server



5. Most Commonly Used HTTP Methods supported By REST?



POST – to Create a new record from Database.

GET - Retrieve, to Request existing record from database.

PUT – to  ​Update existing record in database.

PATCH​– Updates only a selected key-paired value → ​Update

DELETE – Delete, remove record from database



Can a GET request be used instead of PUT to create a resource?

The POST or PUT method should be used to create a resource. PUT can be used to update a resource.

GET is only used to request data from a specified resource.



What are the differences between PUT and POST requests?

Using ​POST request, our intent is to create a new object on the server whereas with ​PUT request, our intent is to replace an object by another object (Update).





8. Which HTTP Status codes do you know?

1xx​→ Informational

2xx → Success (request was accepted successfully)

200→ Ok,

201→ Created,

202→ Accepted,

204→ No Content)



3xx​→ Redirection

301 - moved permanently meaning current links or records using the URL should be updated.





4xx → Client Error

400-Bad Request,

401-Unauthorized- meaning we need a token or key to hit the API successfully

403-Forbidden,

404-Not Found,

405-Method not Allowed)



5xx → Server Error

500-Internal server Error

501-Not implemented

502-Bad Gateway,

503-Service Unavailable


fbdgbdgtbhd


What are the advantages of API Testing:

Test for core functionality- Api testing provides access to the application without a user interface.



Time effective - Api testing is less time then GUI testing.



Language independent - data can be exchange by using XML or JASON.



Supporting business models - we need to test API for many business related reasons. For example Expedia as a third party provide data to Arlines, Hotels and that information has to be correct.

If they are not correct there is high chance of business losing money.



What tools can be used to test APIs? How do you test APIs in your project?

In my project we have REST APIs. For manual testing we use Postman. We have done our best to use Postmans features to organize our tests.
We set global and environment variables so we can easily change any values from one location so that the respective change can immediately be
updated wherever the variable is called.

We also use Postmans available JavaScript methods to validate status codes and verify data from our response body,
and Postman’s collection runner to execute multiple calls at once in the desired order. Additionally we are using RestAssured Java library.

RestAssured are the Java library which we use to automate Rest Api.

Principles of RestAssured:

Followed with BDD:

given - prepare req
When - make a call/ req
Then verification
We have manually to import some classes
*import static io.rest assured.rest assured
baseURI is the same as Bas URL
run collection
RestAssured + TestNg - yes but not good practice.

How do you send request by RestAssured?

Since I am using RestAssured, it has endpoints.

My developers create public url and request is sent to those url.

Our company decide to use Rest Assured in our framework to keep automation in one place.

As a tester I send an API request (whether it is a GET, POST, PUT or DELETE call) and then I verify the status code, response body and check headers.

I verify that each endpoint is working as expected. I do positive and negative testing of APIs:

Positive - I am sending valid requests, headers, parameters, and Json body and then verify that response is 200/201

Negative- I am sending invalid requests, headers, parameters, and body, expecting the status code not to be 200/201.



How did you generate your token or key without having to manually do so all the time?

With Postman - grabbed the token from the JSON object response and stored it as a global variable to be used with all calls that required a token

Rest assured with cucumber - created a separate class, made a call to generate a token and stored the token as a Static variable - we used this as a “Given” background step to be applied to all calls.



What is EndPoint?

An endpoint by itself is the location where a resource can be accessed Examples:

/createUsers

/getUsers

We must create a URI to successfully hit our endpoint.



What is a URI?
Uniform Resource Identifier

URI = Domain/Base URL + endpoint URL/service URL/resource

//this is basically:

Base URL(address of the server) +

Api locations(the address of Api on the on the internet)+

End point ( the method)



Base URL ( the address of the server + API location)



14. Do you have an API documentation website for your APIs? Any other API documentation that you know of?

Swagger is an open-source software framework  of tools that helps developers design, build, document, and consume RESTful Web services.

Some of the API documentation templates:

● Swagger

● FlatDoc

● RestDoc



However, I have only been exposed to working with Swagger.



15. Can you tell me what is required to send a POST, GET, PUT, PATCH, and DELETE calls?



  With ​POST​you will need:

● URI

● Headers

● BODY/Payload (your data in JSON, XML, String, etc)



With ​GET​you will need:

● URI

● Headers

● No BODY/Payload is required since GET you are only retrieving data from a

server and not creating

● If you need to send data with a GET call to narrow down your search then you

can send your data in form of JQuery Parameters or Path Parameters



With a ​PUT(​update) call you will need:

● URI

● Headers

● AND a body/payload

● Note: If you are attempting to update information that does not exist in given

server then PUT will behave as a POST call and create the information UNLESS developers have restricted that from happening



With a ​DELETE​call you will need:

● URI

● Headers

● AND you may/may not need a payload

● If a payload is not required then you will send data in form as JQuery parameter

or PATH parameter



17. What is JSON?

● It is JavaScript Object Notation (is a request format)

● It is used primarily to transmit data between a server and web application, as an alternative to XML (a lightweight version of XML)

● Represents Data in a Key : Value format

● JSON is NOT a programming language



What are two types of Parameters sent with a URI?

Parameters are options you can pass with the endpoint to influence the response. In REST we 2 types of Parameters:

● Path Parameters //to narrow down the search

As part of the URL-path (i.e. /api/resource/parametervalue )

● Query Parameters //unique/specific search, have a key and value pair and query is always after ? urL

As a query argument (i.e. /api/resource?parameter=value )



What is the JSON path?

JSON Path is a class that has defined methods which allow us to get a value from a JSON object as a String, an integer, and more.

When creating an object of JSON path remember you need to pass response body in form of String as an argument

JsonPath js = new JsonPath(Response as a String);

If using Java you would need the following dependency:

<dependency>

<groupId>com.jayway.jsonpath</groupId> <artifactId>json-path</artifactId> <version>2.0.0</version> - ​this changes with updates



    </dependency>

The latest version of Rest Assured already has the jar files of json-path



JasonPath vs JsonPath()?

class vs method



What are Headers?

Headers provide meta-information about a request.

In my project when I send POST or PUT requests, as headers, I specify the ContentType and an authorization JSON Web Token.

When I receive a response, I verify response headers such as the Content-Type.



20. What is a Payload?

Requests and response bodies of every HTTP message includes request data called Payload.

We send a payload with POST, PUT, and PATCH calls but not in GET and DELETE calls.

The



How do you verify a value in your Response body?

To validate value in Response we can use:

1. JUnit Assertions

RestAssured.baseURI="https://got-quotes.herokuapp.com"; Response rsp=

given().

queryParam("char", "varys").

when(). get("/quotes");

int code=rsp.getStatusCode(); Assert.assertEquals(200, code);

String responseBody=rsp.asString(); Assert.assertTrue(responseBody.contains("Varys"));



2. HamCrest Matchers

RestAssured.baseURI="https://got-quotes.herokuapp.com"; Response rsp=

given().

queryParam("char", "varys").



  when(). get("/quotes").​

then(). assertThat().statusCode(200).

and().

assertThat().body("character", equalTo("Varys"));



3. DeSerialization

Retrieve data from JSON and store inside Java DataStructure

Map<String, Object>responseMap=rsp.as(Map.class);

Once we have a Java Object we can compare it using JUnit Assertions.



What are the main challenges faced in API testing?

● Selecting proper parameters and its combinations (what if you do not have correct documentation and you need to work with parameters).

● Categorizing the parameters properly (path or query).

● Proper call sequencing is required as this may lead to inadequate coverage in

testing.

● Verifying and validating the output (Request & Response)

● Due to absence of GUI it is quite difficult to provide input values





24. What would you do if you do not have URI or anything else provided but you have to do API testing?

Well, I would do my best to request for API documentation so that I know what exactly needs to be tested and what responses I should be receiving. From experience, it is considered bad practice if I just “assume” when I am really not supposed to.



Which data do you compare your API responses with?

I would have to compare with API documentation.



How do you validate status codes in your project?

Using Postman we were able to use the JavaScript methods available to assert the status codes but using REST assured for automation, we used then().assertThat().statusCode(“status code”)



How do you write a feature file in cucumber for API testing?

Here you want to talk about how in your project you had to generate a token. Say that step was declared in your Background as a precondition to any execution.

Given-​preparing a request file

When​- calling the API/endpoint

Then​- performing assertions



What is a WSDL and a WADL file?

WSDL - ​We​b ​Se​rvice ​De​scription ​La​nguage is an XML document that describes SOAP-based web services. We can load a WSDL file into our API tool and know exactly which methods it can call, what arguments those methods expect, and which data types they return. It is usually provided in

WADL - ​We​b ​A​pplication ​De​scription ​La​nguage is an XML document that is used to describe RESTful web services. Just like a WSDL, we can load a WADL file into our API tool and be immediately equipped to access the full functionality of the corresponding web service.



What are some principles of an API test design?

Some very important principles of an API test design are:

Setting up - Setting up your test environment, think of how we set everything up with a postman. Global, environment variables, JWT generation, etc

Execution - How did we execute our test cases in postman? Did we have a flow? Verification - what and how did we verify?

Reporting - How did we generate our collection runner or cucumber report? Clean up - How did we unset variables in postman.
























     */






















}
