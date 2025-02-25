abstract class A 
{
    abstract void show();
    void display()
    {
        System.out.println("Display..");
    }
}
class B extends A 
{
    void show()
    {
        System.out.println("Showw..");
    }
    
}


public class Main
{
	public static void main(String[] args) {
	   B obj= new B();
	   obj.show();//showw..
	   obj.display();//Display..
	}
		
}
