import java.util.Scanner;
class main
{
    
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