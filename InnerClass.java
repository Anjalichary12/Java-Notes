class A 
{
    class B 
    {
        public void show() 
        {
            System.out.println("Show method..");        
            
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    A obj=new A();
	    A.B obj1= obj.new B();
	    obj1.show();
	}
		
}
