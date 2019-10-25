import java.util.Scanner;

public class  EncryptByPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y=new Scanner (System.in);
		System.out.println("input number of digits for  a number");
		int n=y.nextInt();
		System.out.println("input four numbers");
		String a=y.next();
		String b=y.next();
		String c=y.next();
		String d=y.next();
		String pin="";
		for(int i=0;i<n;i++)
		{
			pin=pin+(char)(Math.min(a.charAt(i), Math.min(b.charAt(i), Math.min(c.charAt(i), d.charAt(i)))));
		}
	System.out.println("Your pin is : "+pin);
	System.out.println("Enter your message");
		String msg=y.nextLine();
                msg=y.nextLine();
		msg=msg.replaceAll(" ","");
		System.out.println(msg);
		msg=msg.toLowerCase();
		System.out.println(msg);
    int length=msg.length();
    int m=length/n;
    String newpin="";
    String encrypted="";
    for(int i=1;i<=m;i++)
    {
        newpin=newpin+pin;
    }
    int reminder;
    if(length%n!=0)
    {

     reminder

     }
    
    
	
	
	
	}} 
		
