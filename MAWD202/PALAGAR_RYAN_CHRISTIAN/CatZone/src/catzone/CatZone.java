package catzone;

public class CatZone 
{
    public static void main(String[] args) 
    {
        Cat newCat1 = new Cat();
        //Object with preloaded value
        
        System.out.println(newCat1.getCatType());
        //Printed getCatType default value
        System.out.println(newCat1.getCuteness());
        //Printed getCuteness default value

        Cat newCat2 = new Cat("Tiger", 1);
        //Object with assigned value
       
        System.out.println(newCat2.getCatType());
        //Print getCatType new value        
        System.out.println(newCat2.getCuteness());
        //Print getCuteness new value 
        
        /*SAMPLE OUTPUT
        Unknown
        3
        Tiger
        1
        */
    }
    
}
