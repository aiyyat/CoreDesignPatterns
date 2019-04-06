
Structural Design Patterns
Posted by aiyyatti on December 16, 2015
Adapter
Until few years back, Indians considered it better to buy laptop from the US. Anyone who returned from US almost always had to carry a laptop for his friends. This was probably the laptops in US were cheaper and of better configurations than those one could buy in India. But it’s a different story now a days. One can easily own the best configuration laptop in the near by store. Stories apart; Even though the US Power configurations were 110v 60Hz a laptop, which used a rectifier could function reasonably well on 220v 50Hz Indian power with a few degrees of extra heat on ones lap top.
This was made possible with a power adapter which was cheaply available in electrical shops. The Adapter let the laptop connect which had a US Plug to the connect to an Indian Plug. A USIndianPowerSocketAdapter had an instance of IndianPowerSocket. The laptop thus is able to draws current from the IndianPowerSocket to switch on and function.
source: https://github.com/technicalyorker/patterns/tree/master/Patterns/src/org/technicalyorker/dp/structural/adapter

Bridge
The Entity DAO Pattern described in the following posting is a good example of Bridge Pattern. Here the abstraction and implementation are completed decoupled. The Generic DAO can be used to connect to any datasource which the application can use as it data base. Be it a File Database or an RDBMS. In the example Application connects to RDBMS via JpaDAO which is specific implementation of Java Persistence API with underlying hibernate implementation.
Yet the JPAEmployeeDao implements the specific behaviours of EmployeeDao and common CRUD operations which are common to any Data storage APIs.
refer posting: https://aiyyatti.wordpress.com/2015/04/22/ear-multi-maven-project-with-entitydao-pattern-unit-testing-using-embedded-ejb-container/
source: https://github.com/technicalyorker/source/tree/master/EJB3.1/MultimoduleEnterpriseMavenProject/Parent/Services/src/main/java/org/company/project/dao

Decorator
refer posting: https://aiyyatti.wordpress.com/2015/11/25/thoughtworks-problem-2-sales-tax/
The thoughtworks problem was solved using the Decorator Pattern. refer to section: <Solution to Problem 2> in the posting.
source: https://github.com/technicalyorker/misc/tree/master/ThoughtWorks/src/main/java/com/thoughtworks/problem2

Composite:
The example is that of a File Tree. The [Folders] contain more [Folders] or files. Yet when drawing a folder it knows how to draw its children, all which are of type Elements. Hence the group of Elements(files or [Folders]) are considered much the same way like a single instance.
source: https://github.com/technicalyorker/patterns/tree/master/Patterns/src/org/technicalyorker/dp/structural/composite
Output:
[technicalyorker]
.[dp]
..[behavioural]
…[iterator]
….MonthArrayList.java
….MonthIterator.java
….Client.java
…[memento]
….Stage.java
….Memento.java
….Policy.java
….Client.java
….SnapshotManager.java

Flyweight:

Proxy:
