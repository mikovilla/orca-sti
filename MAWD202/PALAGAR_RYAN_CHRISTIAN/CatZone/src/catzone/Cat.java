package catzone;

public class Cat 
{
    String catType;
    int cutenessLvl;
    
    public Cat()
    {
        catType = "Unknown";
        cutenessLvl = 3;
    }
    
    public Cat (String type, int lvl)
    {
        this.catType = type;
        this.cutenessLvl = lvl;
    }
    
    public int getCuteness()
    {
        return cutenessLvl;
    }
    
    public String getCatType()
    {
        return catType;
    }
}
