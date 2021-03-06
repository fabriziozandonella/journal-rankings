# JournalRankings application

###  Architecture
The implementation of this solution is based on a service interface that provides the feature requested to the user. The back-end is based on a data-manager interface accessible from the service implementation. The object modelled is a pojo (plain old java objects) of "Journal".

The framework used is Spring, configured using ApplicationConfig and annotations.

##### Service layer
The Service interface "JournalRankingsService" provides the method:
 - rankJournals(ArrayList<Journal> journalList)  

##### Data layer
 The interface "DataManager" provides the data management:
- rankJournals(ArrayList<Journal> journalList)


> **Note:** JournalRankingsService provides to check if data are valid (throwing exception in case of null, or undefined) then returns the list of journals filtered, ordered and ranked by DataManager.  

----------

##### Project Structure
![JournalRankings project structure](JournalRankings/doc/project-structure.jpg)

----------

##### Class diagram
![JournalRankings class diagram](JournalRankings/doc/class-diagram.jpg)

----------

###  Execution
JournalRankings  is a maven project, you can import into Eclipse as a maven project. 

Using the command
```
maven clean install
```
maven will compile and will execute the test provided for the scenarios requested.

> **Note:** The version of Java is 1.7 

----------

###  Documentation
[JavaDoc](https://github.com/fabriziozandonella/journal-rankings/tree/master/JournalRankings/doc) 

----------

