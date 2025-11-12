/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Frank Burnell
// 9/24/2025

package burnell.frank;

/**
 *
 * @author administrator
 */
public class Customer
{
       private String custId;
       private String name;
       private boolean clubMember;        //Club member status 
    
    public Customer(String custId, String name, boolean clubMember)
    {
       this.custId   = custId;
       this.name    = name;
       this.clubMember = clubMember;
    }
   public String getName()
    {
       return name;
    }
   public void setName(String name)
    {    
        this.name = name;
    }
    public boolean isClubMember()
    {
        return clubMember; 
    }
    public void setClubMember(boolean clubMem)
    {
        this.clubMember = clubMem;
    }
    
}
