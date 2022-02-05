To realize the project “Online School” 6 patterns were 
used: State, Observer, Template, Decorator, Adapter and Strategy. 
Each of these patterns have its own functionality:

* Decorator pattern is used to make a choice of courses and their 
level. For example, languages have different levels like 
intermediate, upper-intermediate, etc.
* Adapter pattern is used to override methods that are used only 
in language courses. We have a math course, and its methods are 
almost the same with languages like English or Spanish. 
This pattern adapts the methods for courses that are not languages. 
For example, in languages we can only learn and practice the skills, 
while in math we can also solve different problems and the levels are differ.
* Template pattern is used for schedule. We have lessons on Monday, Wednesday, 
Friday and on Tuesday, Thursday, Saturday, however they differ 
on time: morning/evening.
* State pattern is used for managing the order of procedure. 
For instance, firstly, we should choose the course, then level, 
after that convenient schedule and then pay for course.
* Strategy pattern is used for payment. For each bank card we 
have its own procedure. In our project we have the opportunity to pay with kaspi and with other credit cards. For payment with a kaspi card we should know only owner's phone number, while for other credit cards we should ask for data like the name on the card, number of card, cvv, etc
* Observer pattern are used to notify teachers about their new 
lessons, information about the level of course and schedule.

Connection between patterns:

* Adapter pattern connects with Decorator pattern by implementation of Decorator interface in abstract MathLanguageAdapter class.
* Strategy pattern connects with Decorator and other patterns by using Language interface in PayStrategy interface.
* Observer pattern connects with others pattern by extending of Observer interface with language interface.
* Template pattern connects with Observer pattern and others by using ScheduleTemplate class as an object in notification of Observer pattern.
