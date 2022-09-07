package JavaTeorija;

public class SdlcAgile {

    /*
But what exactly is SDLC?
SDLC is a process in which a software product is either created, enhanced or maintained
What actually happens in all of these phases?

SDLC is an acronym for Software Development Life Cycle which consists of the
following phases:
● Planning Phase
● Requirements gathering/Analysis phase
● Design phase
● Coding/Development/Implementation phase
● Testing phase
● Production phase

Planning Phase
Feasibility Study is performed to understand whether the Project (service or product) is
in:
● Adequate Demand
● Marketable
● ROI (Return of investment?)
● Probability for achievement / success

Requirements gathering/Analysis Phase
This is the phase when business stakeholders/client side members, Project Managers,
and Business Analysts meet to discuss requirements for the project. Several meetings are
hosted where the client states the expectations of the project and will also discuss topics
regarding who will use the software product, how users will use the product, and
specific information related to the development of the software product. This phase is
arguably the most important phase of SDLC.

//WHICH PHASE YOU START TESTING AND HOW YOU DID IN REQ ANALYSIS? ????
//WHAT IS THE MOST IMPORTANT PHASEE

//In the requirement phase, the QA team analyzes the scope of automation for regression testing. //////
Design Phase
This is when the software product is actually designed. This includes drawing plans,
drawing an architectural style, and continuously hosting meetings with the client to get
approvals. This is usually done by UI Designers, Graphic Designers, or sometimes even
developers.

Coding/Development/Implementation Phase
This is when the created design is actually developed.

Testing Phase
This is when the testing is conducted of what was developed. This is where STLC comes
into play. STLC is an acronym for Software Testing Life Cycle which consists of the
following phases: Requirement analysis, Test Planning, Test case Development, Setup
testing environment, Test Execution, Test closure.

Production Phase/Deployment and Maintenance
This is when the code developed has been deployed into production

SDLC vs STLC
● STLC is part of SDLC. We can say that STLC is a fundamental part of the SDLC set.
Its a sequence of different activities preformed during the software testing process
● STLC is limited to the testing phase where quality of software or product ensures
whereas SDLC is a complete development of a software or product.
● STLC is a very important phase of SDLC and the final product or the software
cannot be released without passing through the STLC process

Why do Software Applications have bugs?
There are various reasons why a system might have bugs, such as bad design, coding
errors, miscommunication, continuous changes in requirements, rushing to meet
deadlines and also the complexity of the application.

Verification and Validation?

Verification is when you are analyzing requirements, design documents, test plans and
test cases to ensure we cover all scenarios and we are creating the right product and here
there is no code involved. Simply reviewing documents to ensure everything is covered
and NO coding is involved.

Validation is when we are executing our test cases and actually writing code to verify
the system.

What is the difference between static and dynamic testing?
Static Testing (Done In Verification Stage).
Static Testing is a White Box testing technique where the developers verify or test their
code with the help of a checklist to find errors in it, this type of testing is done without
running the developed application or program. Code Reviews, Inspections, Walkthroughs
are mostly done at this stage of testing.

Dynamic Testing (Done In Validation Stage).
Dynamic Testing is done by executing the actual application with valid inputs to check
the expected output. Examples of Dynamic Testing methodologies are Integration
Testing, System Testing, Regression and Acceptance Testing.

What Is the Difference between Black Box and White Box testing?
Black box testing is a testing approach which depends completely on the product
requirements and specifications and it is usually done to check the functionality of an
application. Basically, front-end testing. The knowledge of internal paths, structures, or
implementation of the software is not needed
//REQUIRES NO KNOWLEDGE OF INTERNLA PATHS, STRUCTURE OR INMPLEMENTIONS OF SOFTWARE BEEN TEST-EQUAL TO FUNCTIONAL TESTING
IT  ONLY CARES ABOUT INPUT-OUTPUT.

White box testing is when you know the internal structure of the application meaning
you know coding and can perform unit testing as well. Also known as Code Based
testing or Structural testing.
//DONE BY DEVS- ITS EQUAL TO UNIT TESTING - REQUIRE DETAIL PROGRAMING SKILLS

In which phase should testing begin?
Testing should start at the requirements phase. We have to make sure requirements are
correct in the first place. With the wrong requirement it is impossible to build bug free
applications.

What is Ad-Hoc Testing? Exploratory testing? Random Testing?
All are the same thing, it is informal testing where you are testing without a test case and
randomly testing a module conducting negative testing and positive testing but not in any
order etc.

 What is unit testing, and have you ever done unit testing?
Unit testing is a part of the white box testing and it is done by the developers before they
deploy their code from the Development environment to QA environment. Since it is
performed by devs, I haven’t done unit testing.

What is Integration testing?
Once every individual component is tested, we must make sure that when we integrate
these components together they must work as expected. Example amazon.com has fresh
and prime, but the entire website works together even though it has different components.

What is the difference between UAT and QA? What is Acceptance testing?
QA is one lower environment to UAT. QA can be a separate team that does testing and
after testng PASS QA environment code is moved to UAT environment where again
Testing is conducted to make sure no bugs have been missed. Also, UAT is mostly a
business side client side that conducts it. Acceptance testing is UAT testing another name
for it.

What is system testing?
It is testing the entire system which includes but is not limited to the Front-end,
Back-end, Database, Server, Hardware, and any related Software product/application.

What is Beta Testing?
Beta testing is conducted to gather feedback from the real-time usage of the product. It
happens after the installation at the client-end or another good example is in the
real-world gaming industry they release a game to a certain audience before a mass
release to get feedback.

What is 508 Compliance testing?
All government websites are supposed to be 508 compliant meaning disable personnel
should be able to use it. Features are specific fonts used on these types of website, text to
speech capability and magnify capability etc. Just know what it is but you don’t tell the
interviewer that you have done so.

What is Boundary Testing?
Boundary testing is to make sure software accepts valid data inside the valid Boundary
and rejects invalid data outside the valid Boundary. A simple example would be testing
the input field limitation from 0 to 100 where the lower boundary is 0 and the higher
boundary is 100. We make sure we can’t go lower than 0 and higher than 100. We only
test the edges and not the middle. Boundary value testing can be very beneficial since
errors are frequently made during programming of the different cases near the ‘edges’ of
the range of values.

What is Negative Testing and what is Positive Testing?
Negative testing is testing the application/system with a negative scenario using
incorrect/invalid data and verifies if the application responds as expected. Negative test
cases are created based on the idea of testing in a destructive manner.
Positive testing is testing the application/system with correct and valid data and verifies
if the application responds as expected. Also can be called a “Happy Path” Testing.

What is non-functional testing? Have you done any performance testing?
Performance testing (Can 5000 user’s login to the application at the same time?)
Security testing.

Simply say NO you have not done so and that performance testing was conducted by a
separate team.

What is Functional testing?
Simply, testing any functionality is functional testing. Manual testers do functional
testing and they can be called a functional testing team. As an Automation Tester, you
may be required to perform manual testing based on project needs.

What is a hotfix?
A hotfix is an emergency issue that needs to be fixed right away and does not need to go
through a whole sprint cycle. It’s an exception where it can be developed, tested and
deployed in a few hours or a day since it’s an extreme priority and clients want the
critical issue fixed ASAP and deployed.

When is a test considered to be successful?
Tests that cover more functionalities and discover more errors in your software product
are considered more successful. The whole purpose of a testing process is to discover as
many bugs as possible and as early as possible.

If we are short on time I would prioritize my test cases and tackle ones that cover most
functionalities and I will also check with my team members if they can help out since I
have been on agile projects we work together in such matters.
When we prioritize here is what we look for:
● Which functionality is most visible to the user?
● Which functionality has the largest safety impact?
● Which aspects of the application are most important to the customer?
● Which aspects of the application can be tested early in the development cycle?
● Which parts of the code are most complex and thus most subject to errors?
● Which parts of the application were developed in rush or panic mode?
● Which parts of the requirements and design are unclear or poorly thought out?
● What do the developers think are the highest-risk aspects of the application?
● What kinds of problems would cause the most customer service complaints?
● What kinds of tests could easily cover multiple functionalities?

What would you do if you end up with unclear requirements or requirements are
not available?
In this scenario, your knowledge of application plays a big role. I would start to do some
random testing to understand what is being asked and try to discover to get an idea, so I
can start writing scripts. Then I will also check out our meeting notes, emails, and
discussions. On top of that, look for wireframes which might give me an idea but overall
my common sense and experience plays a part here and also I would think from a
customer’s perspective. Also if BA is available to clarify with them as well.

When do you know if you have enough test cases for your project or a specific
module?
If all requirements(user story) have at least one test case, then we know we have covered everything
also in this case a Requirements Traceability Matrix (RTM-DONE IN EXCEL) is very useful since it maps
out Requirements to Test Cases.

Tell us some key challenges you face in the Testing industry?
● Requirements changing.
● Application not stable.
● Rush testing to meet deadline
● Unclear requirements
● Domain knowledge and business user perspective understanding.
● Lack of Regression testing or not enough.
● Lack of skilled testers.
● Lack of resources, tools and training

Can you do 100% manual testing and find all bugs?
No, it is impossible because there are a number of possibilities and scenarios. If we cover
all functionalities and test them then we can reduce the risk of bugs and have a satisfied
client.

What is a Test Plan?
The Test Plan document is usually prepared by the Test Lead or QA Manager and the
focus of the document is to describe what to test, how to test, when to test and who will
do what test.
Components of the Test Plan:
● Introduction
● Test items
● Features to be tested
● Features not to be tested
● Test techniques
● Testing tasks
● Features pass or fail criteria
● Test environment (Entry criteria, Exit criteria)
● Test deliverables
● Staff and training needs
● Responsibilities
● Schedule

What is a test case and what does it include?
A test case is a document which has a set of actions that needs to be executed to verify a
feature or functionality of your software application. It includes
● Test Scenario/Objective
● Pre-Condition
● Test Case ID
● Test Data
● Test Description
● Expected Result

● Actual Result
● Pass or Fail
● Comments

What is Test Coverage?
Test coverage measures the percentage covered area to test the feature/functionality. It
determines whether our test cases are actually covering the application code and what
functional area those test cases are covering.

Who is responsible for writing test cases and test plans?
We testers write test cases for various scenarios, while the test lead or even QA Manager
is responsible for making a test plan.

What is the difference between Test case and Test script?
Test case mostly used for manual testing whereas test script mostly used for automation
Testing.
Test case is a documentation which specifies input values, expected output and the
preconditions for executing the test.
Test script in software testing is a program intended to test the functionality of the
application.

What is the Requirement Traceability Matrix?
RTM is mapping requirements to test cases and test cases to defects. If there is a defect
found, we can trace back to tell which specific requirement failed. RTM also tells us if
we are missing test cases for any requirement. A lot of time is done in Excel.

What is test coverage?
What are we testing and How much are we testing!
Test coverage means how many test cases that we have and what functional area those
test cases are covering. Are our test cases covering the entire application or not?

How do you define the bug life cycle?
Bag life circle is defect life circle, its a proccess when bag goes to different stage. Bag life circle stats when bag is
reported by tester and ends when issue is fixed and will not occur again.

1) Reproduce- When I find a bag I will to the steps to reproduce the bag; take a screenshot, videos, check if is internet down, open,
close browser again, try to see if bag is still there, open the browser and go to private mode.

2) Report- If I am not sure that is a bag I will check requirements and tolk to BA I will link bag to him and log on
to Jira

3) What bag has include: steps to reproduce, environment where is discovered, tyoe of browsers, add as manu information
in JIRA

4) Bug get fixed

5) Retest - at least 5 times in different browsers.

6) Close the steps

How do you deal with a bug which is not consistently reproducible?
The best approach is to take a screenshot of it. If you are using Snagit you can even
capture video of it and note it down. Discuss the bug with the team so everyone can keep
an eye on it.

What would you do if a developer rejects your bug and refuses to fix it?
Go back and retest it several times that it is a bug. Then check it against the
requirements’, wireframes. If the developer still refuses to fix it then set up a meeting
between BA and developers. If in rare situations the developer still does not want to fix,
then QA manager or Project manager get them involved as a last resort.

What do you do when you find a bug?
First you will go back and retest it to make sure it is a bug, then you take a screenshot and
create/log a bug in Jira with as many details as possible such as short description,
environment found in, exact steps to reproduce, severity, priority etc. so the developer
can try to recreate it.

Bug priority vs Bug severity
Priority represents the importance of fixing a bug, and reflects a business decision as to
how soon that bug should be fixed: all priority 1 bugs should be fixed before priority 2
bugs, etc.
Severity represents “how bad a bug is.” For example, a bug that causes the program to
crash would be considered high severity, while a small spelling error might be low
severity.

What is the difference between bug release and bug leakage?

Bug release is when a version of the software is released with a set of known bugs. These
bugs are usually of low severity/priority. It is done when a software company can afford
the existence of a bug in the released software rather than the time/cost for fixing it in
that version.

Bug leakage is something when the bug is discovered by the end users or customers and
missed by the testing team to detect while testing the software.

Let's say you have a bug that comes in the day before the sprint is ending, do you let
it go into production or move it to the next sprint?
If the bug is of a very low priority and severity we will log it and fix it at a later time
since it doesn’t impact the system much and release it into production, but if it’s a show
stopper we will never release it into production since it can cause other issues.

How many bugs do you find a day?
We don’t test every day since we have meetings and time must be allocated to create and
automate test cases. When we do actual testing anywhere from 2 to 3 bugs a day at the
very beginning and as we continue testing the bug rate falls to 0 to 1.





What is agile? List some of Agile Frameworks?
Agile is a term used to describe a general approach to software development. All agile
methods, including Scrum, emphasize teamwork, frequent deliveries of working
software, close customer collaboration, and the ability to respond quickly to change.
Popular Agile frameworks:
● Scrum (70%)
● Kanban (5%)
● ScrumBan (8%)
● Extreme Programming (1%)
In agile methodology, features of the software are delivered frequently, so that the
testing activity is done simultaneously with the development activity. Testing time is
shortened as only small features need to be tested at once.
In agile methodology, changes are welcomed. For example, after the sprint demo if a
client does not like something, feedback is taken to improve the product.
While, in the waterfall model, to implement any change in the requirements is hard.
Clients can’t see what they are going to get until a very late stage in the development life
cycle. Testing activities take place at the end of the entire development process. Testing
time, in this case, is as long as the entire product is to be tested in one go.

Waterfall methodology
Waterfall methodology is sequental design process.
Once the step begin, developers cant go back unless they start from scratch the project.
There is no room for error, project outcome & plan must be determined before starting it.
USE:
When we have clear picture of product should be like that.
When the client will not change the scope or product once the project begin.

Advantages:
- easy to understand,
- easy to manage,
- suitable for simple or small projects,
- step by step process

Disadvantages:
- poor quality
- poor visibility
- too risky
- can't handle any changes

Scrum Team
-Normally scrum teams have 5-9 team members. They called a
development team which has a Developers and Tester. This is a group of self-organized,
value-driven and cross-functional team members.

Product Owner - He or she has the responsibility of delivering a whole concept of what
to build and then convey the idea to the team. Also they are the one who created a wish
list for the project which is called product backlog. Product owner usually prioritize the
product backlog item and comes up with sprint backlog as well.

Scrum Master - He or she is responsible to move the team to the right direction and
handle all needs of the team.  Also if there are any issues and blockers scrum master is the
point of contact to handle such matters

Scrum Ceremonies:
Sprint Planning - Here the Product Owner selects the Product Backlog Items (User
Stories) from the Product Backlog. Most important User Stories at the top of the list and
least important User Stories at the bottom. The Scrum Development Team decides and
provides the effort estimation. For example, 4 hours up to 20 hours etc.

Scrum Artifacts:
Product backlog - The entire application that we want to develop and sort in user stories.
Sprint Backlog - The items that we are going to develop in a specific sprint.
Burndown Chart - Chart to determine the progress on the sprint.A burndown chart is a graphical
representation of work left to do versus time.

What’s a user story?
User stories are short and simple descriptions of capabilities. They are written from the
perspective of a user or customer of the system. Another word for user story is
Requirement(//something that client wants to see in their product//).

What is an epic?
An epic is a large user story that cannot be delivered as defined within a single Sprint .It
is large enough that it can be split into smaller user stories.

What is spike?
Spike is the type of story where team need to do some research related to the design or
technical issues. Spikes will have 0 story points.

What is a parking lot?
This usually comes up in meetings, especially daily stand up meetings. It's basically a
problem not relevant to others in meetings and we should not discuss it to waste other
team members time. For that scrum master can arrange separate meetings at a later time.

Explain what Velocity is in Agile?
Velocity is the sum of story points that a scrum team completes (meets the definition of
done) over a sprint. It figures out how much work a team can complete in a sprint and
how much time will it need to finish a project.

What is DoD? How is this achieved?
DoD stands for Definition of done. It is achieved when:
● The story is development complete,
● QA complete,
● Regression around the story is complete
● The feature is eligible to be shipped / deployed in production.

What challenges have you had in an agile environment?
● Changing of Requirements.
● Not Enough Information on the Story
● Estimating Time For Completing Task
● Waiting on Development to be completed before testing

You are in the middle of a sprint and suddenly the product owner comes with a new
requirement, what will you do?
In an ideal case, the requirement becomes a story and moves to the backlog. Then based
on the priority, the team can take it up in the next sprint. But if the priority of the
requirement is really high, then the team will have to accommodate it in the sprint but it
has to be very well communicated to the stakeholders that incorporating a story in the
middle of the sprint may result in spilling over a few stories to the next sprint.




















     */
}



