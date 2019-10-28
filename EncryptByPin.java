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
	
	{	System.out.println("Enter your message");
	    String msg=y.nextLine();
	    String msg1=y.nextLine();
	    
		msg1=msg1.replaceAll(" ","");
		
		msg1=msg1.toLowerCase();
		
		int length=msg1.length();
		String newpin="";
		for(int i=0;i<((length/n)+1);i++)
		{
			newpin=newpin+pin;
		}
		
		int lengthnewpin=newpin.length();
		
		int reminder=0;
		if(lengthnewpin%length!=0)
		{
			reminder=lengthnewpin%length;
			newpin=newpin.substring(0,(length));
		}
		
		 String encrypted="";
        
        for(int i=0;i<length;i++)
        {
        	
    	    if(newpin.charAt(i)=='0')
    	    {   if((int)msg1.charAt(i)+0<=122)
    	            {
    		  encrypted=encrypted+((char)(msg1.charAt(i)+0));
    		  
    	              }
    	                else if((int)msg1.charAt(i)+0>122)
    	            {
    		  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+0)-122))));
    	              }
    	    }
    	    else if(newpin.charAt(i)=='1')
    	    {
    	    	if((int)msg1.charAt(i)+1<=122)
	            {
		  encrypted=encrypted+((char)(msg1.charAt(i)+1));
	              }
	                else if((int)msg1.charAt(i)+1>122)
	            {
		  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+1)-122))));
    	          }
    	    }
	         else if(newpin.charAt(i)=='2')
	        {
	        	 if((int)msg1.charAt(i)+2<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+2));
		              }
		                else if((int)msg1.charAt(i)+2>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+2)-122))));
	    	          }
	        }
	         else if(newpin.charAt(i)=='3')
	         {
	        	 if((int)msg1.charAt(i)+3<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+3));
		              }
		                else if((int)msg1.charAt(i)+3>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+3)-122))));
	    	          }
	         }
	         else if(newpin.charAt(i)=='4')
	         {
	        	 if((int)msg1.charAt(i)+4<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+4));
		              }
		                else if((int)msg1.charAt(i)+4>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+4)-122))));
	    	          } 
	         }
	         else if(newpin.charAt(i)=='5')
	         {
	        	 if((int)msg1.charAt(i)+5<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+5));
			  
		              }
		                else if((int)msg1.charAt(i)+5>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+5)-122))));
			  
	    	          }  
	         }
	         else if(newpin.charAt(i)=='6')
	         {
	        	 if((int)msg1.charAt(i)+6<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+6));
		              }
		                else if((int)msg1.charAt(i)+6>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+6)-122))));
	    	          }  
	         }
	         else if(newpin.charAt(i)=='7')
	         {
	        	 if((int)msg1.charAt(i)+7<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+7));
		              }
		                else if((int)msg1.charAt(i)+7>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+7)-122))));
	    	          }  
	         }
	         else  if(newpin.charAt(i)=='8')
	         {
	        	 if((int)msg1.charAt(i)+8<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+8));
		              }
		                else if((int)msg1.charAt(i)+8>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+8)-122))));
	    	          }  
	         }
	         else if(newpin.charAt(i)=='9')
	         {
	        	 if((int)msg1.charAt(i)+9<=122)
		            {
			  encrypted=encrypted+((char)(msg1.charAt(i)+9));
		              }
		                else if((int)msg1.charAt(i)+9>122)
		            {
			  encrypted=encrypted+((char)('z'-(26-((msg1.charAt(i)+9)-122))));
	    	          }  

	         }
    	
    }
    encrypted=encrypted.toUpperCase();
    System.out.println(encrypted);
	}
	
	
	


	
	}} 
		
