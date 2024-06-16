package demoparty;

public class Party 
{
    private int numGuests;
    
    public void setNumGuests(int num)
    {
        this.numGuests = num;
    }
    
    public int getNumGuests()
    {
        return numGuests;
    }
    
    public void showInvitation()
    {
        System.out.println("Please come to my party!");
    }
}