package MAWD202.NARANJO_RHENZ.Activity1_07;

public class Cat {
    String catType;
    int cutenessLVL;

    public Cat(){
        catType = "Unknown";
        cutenessLVL = 3;
    }
    public Cat(String type, int lvl){
        this.catType = type;
        this.cutenessLVL = lvl;
    }
    public int getCuteness(){
        return this.cutenessLVL;
    }
}