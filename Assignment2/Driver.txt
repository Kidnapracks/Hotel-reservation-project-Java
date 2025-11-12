/* 
    Fall 2025 BCIS 3680
    Assignment 2 Driver Class
    DO NOT CHANGE ANY OF THE CODE EXCEPT THE PACKAGE NAME
    AND THE DIALOG BOX TITLES!
    Your code in other classes should work with the Driver
    code and generate the correct output. If the program
    doesn't run, review and modify code in other classes.
 */

// Frank Burnell
// 09/24/2025

// Change the package name to fit yours
package burnell.frank;  

import javax.swing.JOptionPane;

public class Driver
{
    public static void main(String[] args)
    {
        Room r1 = new Room("405", 'K', 150.0f, true);
        Room r2 = new Room("201", 'D', 135.0f, false);

        Customer c1 = new Customer("17799", "Jeff McKinney", true);
        Customer c2 = new Customer("27002", "Frank Haefely", false);

        Reservation rs1 = new Reservation(r1, c1, "10/7/25", 2);
        Reservation rs2 = new Reservation(r2, c2, "10/30/25", 5);

        // Change the titles of the dialog boxes from "Andy Wu" to your name
        JOptionPane.showMessageDialog(null, "Reservation 1" + rs1.toString() + "\n",
                "Frank Burnell", 1);
        JOptionPane.showMessageDialog(null, "Reservation 2" + rs2.toString() + "\n",
                "Frank Burnell", 1);
    }
}
