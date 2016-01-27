package edu.gatech.oad.antlab.person;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.String;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Ritika Ravichandra
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
    private static String calc(String input) {
        List<String> shuffle = new ArrayList();
        for(int i = 0; i < input.length(); i++){
            String temp = Character.toString(input.charAt(i));
            shuffle.add(temp);
        }
        System.out.println(shuffle.size());

        Random rand = new Random();
        String newString = "";
        while(!shuffle.isEmpty()) {
            int index = rand.nextInt(shuffle.size());
            String letter = shuffle.get(index);
            newString = newString + letter;
            System.out.println(index);
            shuffle.remove(index);
        }
        return newString;

    }

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
