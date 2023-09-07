package com.problem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyValueHashMap {
	
	public static void main(String[] args) {
		
		// Creating a HashMap to store names as keys and Student objects as values
		
        Map<String, Student> np = new HashMap<>();

        // here Storing dummy values in the HashMap
        
        np.put("Rishu", new Student("Rishu", 36));
        np.put("Manshi", new Student("Manshi", 60));

        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // here method of user have to  enter a name to search
        
        System.out.print("Enter name : ");
        String Searchname = sc.nextLine();

        // here in the HashMap search the name
        if (np.containsKey(Searchname)) {
        	
            //retrieve the student object and print the age,if name is found
        	
            Student std = np.get(Searchname);
            System.out.println(std.getName() + " is " + std.getAge() + " years old.");
        } else {
        	
        	
        	//  print a message,if name is not found
            System.out.println("Name not found .");
        }

        // Closing the scanner
        sc.close();
    }

        
	}


