public class calc
  {
    public int add(int a,int b)
    {
    int c=a+b;
    return c;
    }
    public int square(int x)
    {
	    int z=x*x;
	    return z;
    }
    public static void main(String[] args)
    {
    calc_prooject cal=new calc()
    System.out.println("The sum of two numbers is"+(cal.add(2,3)));
    System.out.println("The sqaure of the number is"+(cal.sqaure(4));
    }
  }
