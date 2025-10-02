import java.util.*;
public class Max
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Three Numbers ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("Max No is "+a);
}
else if(b>a && b>c)
{
System.out.println("Max no is "+b);
}
else{

System.out.println("Max no is "+c);
}



}

}
