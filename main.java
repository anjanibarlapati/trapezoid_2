import java.util.Scanner;
class main
{
    public static int division(int add)
    {
        int x=add/2;
        return x;
    }

    
   public static int addition(int a,int b)
    {
        int x=a+b;
        return x;
    }
 
    public static int multiplication(int div,int h)
    {
        int x=div*h;
        return x;
    }

    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int add=addition(a,b);
        int div=division(add);
        int mul=multiplication(div,h);
        System.out.println("Area is: "+mul);
    }
}