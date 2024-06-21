package demoparty;

public class Party {
    private int numgGuest;
    
    public int getNumguest() {
        return numgGuest;
    }
    
    public void setNumguest(int num) {
        this.numgGuest = num;
    }
    
    public void showInvitation() {
        System.out.println("Please come to my party!");
    }
}
