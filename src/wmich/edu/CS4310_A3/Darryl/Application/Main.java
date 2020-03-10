package wmich.edu.CS4310_A3.Darryl.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import wmich.edu.CS4310_A3.Darryl.Implementation.DisjointSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		//prompt for user file input
		System.out.println("Enter the file name:");
		String userInput=sc.nextLine();
		sc.close();//close scanner for "sc"
		
		//try catch block if user text file is not found
		try {
			Scanner readfile = new Scanner(new File (userInput));
			
			//reads the first line of the text file which is formatted by 
			//totalNumber     numberOfRelationships
			//and splitting them with " " as the delimiter
			String token[] = readfile.nextLine().split(" ");
			int totalNumberOfPeople=Integer.parseInt(token[0]);
			int numRelation=Integer.parseInt(token[1]);
			
			//calling the disjointset class and use the totalNumberOfPeople for the constructor
			//to declare the initial size of the array
			DisjointSet ds= new DisjointSet(totalNumberOfPeople);
			ds.makeSet();
			
			//continuous reading of the file till it reach the end of the file
			while(readfile.hasNext()) {
				//splitting each relation into individual integers and union them to a pair
				String input[] = readfile.nextLine().split(" ");
				ds.union(Integer.parseInt(input[0])-1, Integer.parseInt(input[1])-1);
			}
			readfile.close();
			
			//output
			System.out.println("The number of tables needed to take "+totalNumberOfPeople+" of people with "
								+ numRelation +" of relation is "+ ds.calcNumOfTables());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error, File not found");
		}
		
	}

}
