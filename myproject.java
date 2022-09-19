package ticketsNew;
import java.util.*;
public class myproject {
			static char arr[][] =                        {{'-','-','-','-','-','-','-','-','-','-',},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'},
					{'-','-','-','-','-','-','-','-','-','-'}};
			
			static void list() {
				System.out.println("   A B C D E F G H I J");
				for(int i=0; i<10; i++) {
					System.out.print((i+1)+"  ");
					for(int j=0; j<10; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			}
			static void book(String k) {
				k = k.toUpperCase();
				String str[] = k.split(",");
				for(int i=0; i<str.length; i++) { // for multiple seat booking at a time.
					String s = str[i];
					char key[] = s.toCharArray();
					int col = key[0];
					int row =0;
					
					if(key.length == 3) row = 58;
					else row = key[1];
					
			if((key[0]>=65&&key[0]<=75)) {
			        if(key.length==2) {
					          if(arr[row-49][col-65] == '#') {
						           System.out.println(s+" is already booked");}
					          else {
						             arr[row-49][col-65] = '#';  
					                  System.out.println(s+" is booked ");
					               }
					}
					else {
					           if(key.length<=3&&key[2]<49) { 
					                 if(arr[row-49][col-65] == '#') {
						                  System.out.println(s+" is already booked");
						                  }
					                 else {
						                  arr[row-49][col-65] = '#';  
					                      System.out.println(s+" is booked ");
					                      }
					
					           }
					          else {
						            System.out.println("                                  INVALID SEAT NUMBER PLEASE CHECK THE LIST");
					}
					}
				}
			else {
						System.out.println("                                    INVALID SEAT NUMBER PLEASE CHECK THE LIST");
					}
				}
				
			}

					static void cancel(String k) {
				k = k.toUpperCase();
				String str[] = k.split(",");
				for(int i=0; i<str.length; i++) { // for multiple seat booking
					String s = str[i];
					char key[] = s.toCharArray();
					int m=0;
					
					
					if((key[0]>=65&&key[0]<=75)) {
					int col = key[0];
					int row =0; 
					if(key.length == 3) row = 58; 
					else row = key[1];
					if(arr[row-49][col-65] == '#') {
					     arr[row-49][col-65] = '-';
					     System.out.println("Your seats " +str[i]+" is removed");
					}
					else
						 System.out.println("                 invalid key to remove");
				}
				
				else
					 System.out.println("                 invalid key to remove");
				}
					list();
				
			}
			
			public static void main(String[] args) {
				try (Scanner sc = new Scanner(System.in)) {
					int n = 0;
					do {
						System.out.println("1.check  2.book  3.cancel :");
						n = sc.nextInt();
						switch(n) {
						case 1: list(); break;
						case 2: System.out.print("Enter the seats to book : ");
						 		String str = sc.next();
						 		book(str); list(); break;
						case 3: System.out.print("Enter the seats to cancel : ");
						String st = sc.next();
						           cancel(st);
						}
					}while(n != 0);
				}	
				catch(Exception a) {
					System.out.println("your error is"+a);
				}
	}
}