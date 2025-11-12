Assignment 2 – Object-Oriented Hotel Reservation System

Author: Frank Burnell
Course: BCIS 3680 – Enterprise Programming, University of North Texas

Overview

This project demonstrates object-oriented programming (OOP) concepts such as encapsulation, composition, and real-world modeling in Java.
The assignment simulates a hotel reservation system where Room, Customer, and Reservation objects interact to process guest bookings.
The Driver class tests the implementation by instantiating these objects and displaying reservation details.

Project Structure

All source files belong to the package
burnell.frank

src/
 └── burnell/
      └── frank/
           ├── Room.java
           ├── Customer.java
           ├── Reservation.java
           └── Driver.java

Class Descriptions
Room.java

Represents a hotel room.

Instance Variables

Variable	Type	Description
roomNum	String	Room number
roomType	char	Type of room (e.g., S = Standard, D = Deluxe)
stdRate	double	Standard nightly rate
petFriendly	boolean	Indicates if pets are allowed

Features

Uses encapsulation (private variables)

Getter and setter for stdRate

Full-initialization constructor with four parameters

Customer.java

Represents a hotel guest.

Instance Variables

Variable	Type	Description
custId	String	Unique customer ID
name	String	Customer’s name
clubMember	boolean	Rewards-club membership status

Features

Encapsulated variables with getters and setters for name and clubMember

Boolean getter for clubMember follows the naming convention isClubMember()

Full-initialization constructor with three parameters

Reservation.java

Represents a single booking.

Instance Variables

Variable	Type	Description
guestRoom	Room	The room being reserved
guest	Customer	The guest making the reservation
numOfNights	int	Number of nights
arrival	String	Check-in date
rate	float	Effective nightly rate (discounted if club member)

Features

Constructor with four parameters: a Room, a Customer, arrival, and numOfNights

Calculates discounted rate

10% off (0.9 × stdRate) for club members

Full stdRate otherwise

Implements a toString() method that returns:

Customer Name: <Customer Name>
Rewards Club Member: <Yes/No>
Rate: <$rate> per night for <numOfNights> nights
Check-in Date: <arrival>


Formats rate using DecimalFormat("$#,##0.00")

Demonstrates object composition (a Reservation has a Room and a Customer)

Driver.java

Provided by the instructor.
Creates Room and Customer objects, then builds Reservation objects to connect them.
Calls each Reservation’s toString() method to display information using JOptionPane.
Only modifications allowed:

Update package name to burnell.frank

Set dialog box title to "Frank Burnell"

Key OOP Concepts Demonstrated

Encapsulation of data

Composition of objects

Constructor design and initialization

Conditional logic and formatting

Dynamic output generation through object interaction

How to Run

Open the project in NetBeans

Ensure all .java files are in the burnell.frank package folder

Right-click Driver.java → Run File

Dialog boxes will display reservation information

Example Output
Customer Name: John Doe
Rewards Club Member: Yes
Rate: $180.00 per night for 3 nights
Check-in Date: 11/10/2025

Technologies Used

Java SE 17+

NetBeans IDE

Swing (JOptionPane)
