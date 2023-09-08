package com.problem7;

import java.util.Scanner;

public class ProgramOfInput {

	public static void main(String[] args) {
		
		    
		        Scanner sc = new Scanner(System.in);
		        System.out.println("please enter command-line arg (click on Enter after each arg, and write 'exit' to end):");

		        String ipt;
		        while (true) {
		            ipt = sc.nextLine();
		            if (ipt.equals("exit")) {
		                break;
		            }
		            System.out.println("Received input: " + ipt);
		        }

		        System.out.println("end the program here.");
		    }
		


	}


