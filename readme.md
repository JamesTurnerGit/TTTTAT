# TTTTAT
## Setup
### prequisites
* get the TTTTA repo running locally using it's readme(link deliberately missing)
* get maven
* get intellij (until the tests work on Maven)
* get Java SDK 

------
### TTTTAT
* clone down this repo
* run the TTTTA repo 
* ~~type "MVN test"~~
* open this project with IntelliJ
* press ctrl-shift-f10


## Fresh and revisited learnings
* Java - Did some at university over a decade ago
* IntelliJ - usually use VScode, but because java is such a unique beast used specialsed editor (it's very good)
* Junit - Never used before
* HTTP requests in Java - Done a lot in other languages, not in javascript
* Serializing in Javascript - So much boilerplate
* Maven - Never used before, NPMs lost cousin.
 
 
## comments about development
Enviroment setup took a very long time to get right from scratch, having never heard of a lot of the more modern technology used in java development today. I didn't count the time taken to set up the enviroment as part of my working time. 

I'm unsure with how i've done the Exception handling- need to look into conventions surrounding this, gut instinct says that you should add it to the signature if you can't recover the problem.

I didn't finish as much as i'd like due to the amount of boilerplate Java requires, Perhaps this is solved by using some extra technologies.

Tired and a little burntout from long and hard weekend at a hackathon. 

Happy to learn because I have a ongoing personal project where Java is going to be usefull.

all problems with speed were due to enviroment or typing out boilerplate, was never stuck apart from that.

Felt i had to type out all the models when inserting data or it was a false test. went back and added custom constructors to aid adding of test data

Test data should probably be extracted to some place other than directly in the test, but because the only place it was needed wasn't finished, it never came about.

seperate repo was made mostly to obscure target of this repo.

## next steps
1. need a method of restoring DB to known state after and before tests

2. need to wait for database entry to appear - retry until getFixtureByID(newID) != null

3. figure out why MVN test isn't working properly  - was running via intelliJ directly so didn't notice until was done.



