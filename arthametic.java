class arthametic
{

    int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    
    int multi(int a,int b)
    {
        int c=a*b;
        return c;
    }
    int sub(int a,int b)
    {
        int c=a-b;
        return c;
    }
    int mod(int a,int b)
    {
        int c=a%b;
        return c;
    }
    int divd(int a,int b)
    {
        int c=a/b;
        return c;
}

} 

class Main
{
    public static void main (String[] args) 
    {
        int x=43,y=65;
    arthametic p=new arthametic();
      int z=p.add(x,y);
      System.out.println("The Addition value is:"+z);
    
     z=p.sub(x,y);
      System.out.println("The sub value is:"+z);
     z=p.multi(x,y);
      System.out.println("The multi value is:"+z); 
       z=p.mod(x,y);
      System.out.println("The mod value is:"+z);
       z=p.divd(x,y);
      System.out.println("The divd value is:"+z);
