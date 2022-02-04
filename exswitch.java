import java.util.Scanner;


class exswitch
{

public static void main(String args[])
{


int s;
Scanner sc=new Scanner(System.in);                    
do
{
System.out.println("Enter 1 to 7");
int day = sc.nextInt();
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}

System.out.println("Do u want continue(y(1)/n(2)");
s=sc.nextInt();
}while(s==1);
}
}