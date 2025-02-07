class Owner
{
    String name="Maname";
    long phNo=8179164897l;
    String address="Hyd";
    
    public void show1(int num,String value)
    {
    System.out.println("this is Parent Class"+" "+num+" "+value);
    }
    
}
class ChaiShop extends Owner
{
    String branchName;
    int cupsSold;
    int pricePerCup;
    public ChaiShop(String branchName, int cupsSold,int pricePerCup)
    {
        this.branchName=branchName;
        this.cupsSold=cupsSold;
        this.pricePerCup=pricePerCup;
    }
    public void display()
    {
        System.out.println(branchName);
        System.out.println(cupsSold);
        System.out.println(pricePerCup);
    }
    
    public void revenue(int num)
    {
        System.out.println(num*num*num);
    }
    public void revenue(String  nam,int num)
    {
        System.out.println(nam+" "+num);
    }
    public void show1(int num,String value)
    {
    System.out.println("this is  child Class"+" "+num+" "+value);
    }
    
}
class XeroxShop extends Owner
{
    String branchName;
    int papersSold;
    int pricePerPaper;
    public XeroxShop(String branchName,int papersSold,int pricePerPaper)
    {
        this.branchName=branchName;
        this.papersSold=papersSold;
        this.pricePerPaper=pricePerPaper;
        
    }
    void display()
    {
        System.out.println(branchName);
        System.out.println(papersSold);
        System.out.println(pricePerPaper);
    }
}
class Main {
    public static void main(String[] args) {
        ChaiShop cs1=new ChaiShop("Narayana",3,8);
        XeroxShop xs1=new XeroxShop("Thiru",4,4);
        System.out.println(cs1.name);
        System.out.println(xs1.address);
        
        //Method OverLoading
        cs1.revenue(4);
        
        //Method OverRiding--on the object called constructor the execution is depended..
        cs1.show1(10,"Anjali");
        
        
        
        
        
    }
}

output:
Maname
Hyd
64
this is  child Class 10 Anjali
