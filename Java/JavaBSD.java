/*
Kevin Nguyen
Basic Java program to compute the sum of differences between sets of bits.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaBSD"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaBSD {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		List<Integers> listA = new ArrayList<Integers>();
		List<Integers> listB = new ArrayList<Integers>();
		int sizeLimitA = 15, sizeLimitB = 10; //set size limits for lists here

		//TODO: implement idea below//

		//intialize lists with values

		//print initial values

		//add up elements and obtain bits

		//get difference between bits (take abs if needed)

		//print final results
	}

	//initLists will initialize lists with random simple values (0-15)
	public static List<Integer> initList(List<Integer> myList, int sizeLimit) {
		//local declarations
		int i = 0;
		Random rand = new Random();

		//loop through arrayList
		while(i < sizeLimit) {
			myList.add(rand.nextInt(15));
			i++;
		}

		return myList; //return resulting list
	}

	//TODO:
}