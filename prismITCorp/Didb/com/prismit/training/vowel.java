package com.prismit.training;
import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		
		char c;
		boolean lowercase, uppercase;
		
	       
		Scanner ch=new Scanner(System.in);
	System.out.println("Enter the variable: ");
	c=ch.next().charAt(0);
	
	lowercase= ( c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') ;
	uppercase= ( c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U') ;
	
	if(lowercase || uppercase){
		
	
	System.out.println("The variable is an Vowel");
	
	}
	else 
		System.out.println("The variable is a consonent");
		
	}
	

}
