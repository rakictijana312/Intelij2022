package JavaTeorija;

public class TellMeAboutYourSelf {


       /*

        hello.... good morning.... good afternoon ....
        first, i would like to thank you for your time today. my name is _____ . i am a qa
        engineer with ___ years of experience in the software testing field. i have beeny
        experienced in both automation and manual testing on web based applications.

        As a qa engineer, i was involved in all phases of software development life cycle,
        starting from requirement analysis till production deployment and worked in both
        waterfall and agile environments.

        I performed different types of testing such as regression, smoke, database, api, positive
        and negative testing on banking, retail and insurance  domains.

        Coming to my automation experience i worked with different sets of tools, languages and
        frameworks, such as selenium, testng, cucumber, restassured, maven, git and
        jenkins.

        On myy current project I do automation using selenium
        webdriver and java. also i am performing api and database testing.

        On top of my technical skills i am a team player and a quick learner.



        D2D activities:

        ● Check emails
        ● Check Jenkins reports to get smoke or regression status. If there are any failures I
        will need to rerun the smoke test and see if the actual environment is down or
        there is an issue with my script or if there is an actual bug.
        ● Check user stories status in Jira, bug status reports.
        ● Attend Daily Stand Up to discuss what I did yesterday, what I am going to do
        today and if there are any issues.
        ● Analyze user stories, create manual test cases and prepare test data if needed.
        ● Execute manual test cases, talk to developers, report any found bugs in JIRA
        ● Automate and execute test cases.
        ● Update Status in JIRA (Move stories from In Testing to Done)
        ● Framework enhancement
        ● Execute Regression before each project release (could every sprint or every other
         sprint)

        ● Meetings/ Scrum Ceremonies
        ➔ if it is the beginning of the sprint after Daily Stand Up (  you attending, scrum master, developers)

        Sprint Planning ( first day of the sprint  at 10:15am after the daily stand up). Can last 2-4 h depend on team size
        and how long is the sprint.
        lead by PRODUCT OWNER???

        ➔ in the middle of Sprint you will have a Sprint Grooming session for
        upcoming sprints or any future sprints. ( once a week at 1pm  - usually can be for 1-2 hours to discuss stories
        for upcoming sprints, analyze users tories, estimate time by using fibonacci points: story points like T Shirt size:
        x small 1 p, small 2p, med 6 point, large 8 points.

        ➔ if it the end of the sprint you will attend Sprint Demo and then Sprint
        Retro
        Sprint Demo (last day of the sprint at 11am, 45min-1h) lead my product owner, we all participate, he
        is showing functionality for product.

        Sprint Retrospective (last day of the sprint at 1pm , 1-2h to discuss stories for upcoming sprints).
        – Here the scrum team meet and document the lessons learned in
        the earlier sprint such as “What went well”, “What could be improved”. It helps the
        scrum Team to avoid the mistakes in the next Sprints.
        Lead by scrum master???


        ➔ we have weekly meetings (on Mondays or can be on Fridays) with the
        entire QA team (QA Manager Test Leads and all testers from different
        projects that work in the company)
        ➔ code review (once during the sprint)- meetings where you will review
        each other's code, learn and improve and make sure everyone follows
        framework structure and coding standards.




        My sprints are 3 weeks long, I am on sprint 36, have been with company 2 years.

        We are totally 6/9 or more members within the team including me:

        Scrum Team
        1 Product Owner
        1 Scrum Master
        5 Developers: 2 full stack and 3 frontend
        2 Automation Engineers

        The rest of the team
        2 Business Analyst
        2 UI UX

        1 Architect
        1 PM

        --- What type of tests have you automated? How many test cases have you automated
        per day? When do you do automation in your sprint?

        Mostly I have automated functional regression tests (including smoke and regression,
        database and API testing.
        When developers are done with development of the user story and code is deployed to a qa
        environment, I test the user story manually and then do automation.

        Also in my previous projects when I was only part of the automation team we were doing
        automation after the sprint was over.
        Ask them how they do automation in their
        company.

        There is no right or wrong answer on the automation of test cases per day:
        ● It all depends on the functionality and complexity of the scenario.
        ● I always follow coding standards and focus on the quality of my scripts not
        quantity.
        ● Since I work in an Agile environment some days will be spent attending sprint
        meetings.
        ● When developers fix any bugs I jump on retesting that bug based on its priority
        and severity. On top of that, when some of the team members have any challenges
        and need my help I always try to help them.


       --- What is smoke testing and how do you run it in your project? How many test cases
        are there and how often do you perform smoke testing?

        Smoke Test is a process where the software build is deployed to the QA environment and
        is verified to ensure the stability of the application. All the critical functionalities would
        be put to test here.

        A major benefit of running a smoke test is that it provides quick feedback within a matter
        of a few minutes and testers don’t have to wait hours to get results. In simple terms, we
        are verifying whether the important features are working and there are no showstoppers
        in the build that is under testing.

        In my smoke suite I have around 12-25 scenarios that are executed within 10-15 mins.
        Runner.exe also creates a nice result file with the test cases details execution.

        Jenkins sends the smoke test result to the entire team members and in case of issues, developers
        can look into that immediately.

        (SMOKE TESTING - CHECKING THAT THE KEY FUNCTIONALITY IS WORKING, WE ARE RUNNING/EX SMOKE TEST AT LEAST ONCE
        WHEN NEW FEATURES ARE ADDED, WHEN THE BAG IS FIXED OR MORE TIME IF NEEDED)


        --- What is regression testing and how do you run it in your project? How many test
        cases are there and how often do you perform regression testing? How long does
        your regression suite run?

        Regression testing is a type of software testing where testers verify whether the previous
        functionality of the application is working fine and the new changes have not introduced
        any new bugs.

        When we are going performed regression testing:
        ● Bug fix
        ● New feature added
        ● Changes in existing feature
        ● Performance issue fix

        From an automation perspective, automation of regression Test Cases is the highest
        priority in the projects. Regression testing is a very heavy process which requires a lot of
        effort, time and preparation. Currently in my project we have almost 180 features that
        consist of around 700 scenarios from which close to 75%-80% are automated.

        Every company release will be scheduled differently.
        Example: in 1 project there could be only quarterly releases while in the other every other
        sprint or every 4 sprints.


        How is the regression executed?
        Regression is triggered by Jenkins.
        For Cucumber: whenever we write test cases in our future files we add @Regression
        tags for each scenario and later through the Regression runner class we execute those
        tagged scenarios.

        Regresion 300 scenarios in 3h.







































     */
}
