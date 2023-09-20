package payroll;
import java.util.Scanner;
public class payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b;
		String c;
		int d;
		int e;
		String f;
		int g;
		int h;
		int i;
Scanner input= new Scanner(System.in);
System.out.println("NAME:");
b=input.nextLine();
System.out.println("Des");
c=input.nextLine();
System.out.println("Days worked");
d=input.nextInt();
System.out.println("Pay rate");
e=input.nextInt();
System.out.println("Date");
f=input.next();
System.out.println("ENTER THE EMPLOYEE NUMBER TO GENERATE PAYSLIP: ");
a=input.nextInt();
System.out.println("");
System.out.println("                       SHREE KRISHNA CHEMISTS AND DRUGGIST");
System.out.println("                               SALARY MONTH 9 2013");
System.out.println("");
System.out.print("EMP.NO.: "+a);
System.out.print("\t\t\tEMP.NAME:   "+b);
System.out.println("\t\t\tDESIGNATION:"+c);
System.out.print("DAYS WORKED:"+d);
System.out.print("\t\t\tPAY RATE:"+e);
System.out.println("\t\t\t\tGEN.DATE:"+f);
System.out.println("_______________________________________________________________________________________________");
System.out.println("EARNINGS             AMOUNT(RS.)          DEDUCTIONS       AMOUNT(RS.)");
System.out.println("______________________________________________________________________________________________");
System.out.print("BASIC PAY");
g=d*e;
System.out.print("\t\t"+g);
System.out.print("\t\tP.F");
h=g/10;
System.out.println("\t\t"+h);
i=(g*20)/100;
System.out.print("\t\t\t\t\tPROF.TAX");
System.out.println("\t"+i);
System.out.println("");
System.out.println("________________________________________________________________________________________________");
System.out.print("GROSS EARN.");
System.out.print("\t\t"+g);
System.out.print("\t\tTOTAL DEDUCT");
System.out.println("\t 1200");
System.out.print("\t\t\t\t\tNET PAY");
System.out.print("\t\t8800");







	}

}
