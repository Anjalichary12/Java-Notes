class SimpleClass
{
    int num;
    String name="sai";// Instance Variable
    
   public SimpleClass(String name)
  {
    System.out.println("Hey!! I'm constructor..."+name); 
    System.out.println(this.name);
    //it will take the name is Anjali directly.
    //If we want to take instance variable then we can use the this keyword.
  }
  public void sample()
  {
    System.out.println("This is simple class");
  }
    
}


class Main {
  public static void main(String[] args)
  {
      SimpleClass sc=new SimpleClass("Anjali");
      sc.sample();
      
  }
}
