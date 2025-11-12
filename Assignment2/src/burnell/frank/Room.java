/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author administrator
 */

// Frank Burnell
// 09/24/2025

package burnell.frank;

public class Room
{
    private String  roomNum;
    private char    roomType;
    private double  stdRate;
    private boolean petFriendly;
    
    public double getStdRate() 
    {
        return stdRate;
    }
    
    public void setStdRate(double stdRate)
    {
        this.stdRate = stdRate;
    }        
    
    public Room(String roomNum, char roomType, double stdRate, boolean petFriendly)
    {
        this.roomNum     =  roomNum;
        this.roomType    =  roomType;
        this.stdRate     =  stdRate;
        this.petFriendly =  petFriendly;
    }
    
}
