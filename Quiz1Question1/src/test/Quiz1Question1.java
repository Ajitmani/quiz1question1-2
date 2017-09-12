package test;
import java.util.Scanner;  

public class Quiz1Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		     
		System.out.println("Enter Quaterbacks touchdowns");  
		double td=sc.nextDouble();  
		System.out.println("Enter Quaterbacks total yards");  
		double yds=sc.nextDouble();  
		System.out.println("Enter Quaterbacks interceptions");  
		double interceptions=sc.nextDouble();
		System.out.println("Enter Quaterbacks completions");  
		double comp=sc.nextDouble();
		System.out.println("Enter Quaterbacks passes attempted");  
		double att=sc.nextDouble(); 		 
		
		double a = (comp/att - 0.3)*5;
		double b = (yds/att - 3)*0.25;
		double c = (td/att)*20;
		double d = 2.375-((interceptions/att) * 25);
		double QBR = ((a+b+c+d)/6)*100;
		System.out.println("Quaterback rating is: "+QBR);
		sc.close();
		}
}
