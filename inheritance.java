interface A 
{
    public void  show();
}
interface  B 
{
    public void display();
    
}

interface C 
{
     public void shown();
}
class D implements A,B 
{
    public void show()
    {
        System.out.println("SHOW");
    }
     public void display()
    {
        System.out.println("DISPLAY");
    }
    public void shown()
    {
        System.out.println("SHOWN");
    }
    public void sum()
    {
        System.out.println("SUM");
    }
}
 

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		D obj=new D();
        obj.show();
	}
}
