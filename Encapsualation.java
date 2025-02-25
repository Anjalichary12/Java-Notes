
class A 
{
    private String name="anjuuuu";
    
    public String getName()
    {
        return name;
    }
    public String   setName( String name)
    {
        return this.name=name;
        
    }
    
}

public class Main
{
	public static void main(String[] args)
	{
	   A obj= new A();
	   System.out.println(obj.getName( )); //anjuuu
	   System.out.println(obj.setName("Anjali"));// Anjali
	}
		
}
