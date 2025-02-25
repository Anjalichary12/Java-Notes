//  Dynamic Method Dispatch..
class A 
{
    int a=10;
    String name="Anjali";
    public void show()
    {
        System.out.println("Its show method");
    }
    
    
}
class B extends A 
{
    int a=100;
    String name="Anjaliiii";
    public void show()
    {
        System.out.println("Its show method... in B");
    }
    
}


public class Main
{
	public static void main(String[] args) {
	   A obj = new B();
	   System.out.println(obj.a);// Use reference type (A) variables due to variable hiding.
	   System.out.println(obj.name);
	   obj.show();//Uses object type (B) method because of dynamic method dispatch (runtime polymorphism)

	}
		
}
