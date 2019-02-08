import java.util.Scanner;

// Elizabeth Gonzalez

// My theme for my integration project is Dungeons and Dragons. This will be a choose your own
// adventure story based around a transfer student who is taking his first adventuring test with
// their assigned group at SmigginHoles Academy, with the main goal being to deliver the goods to a
// remote town in the Australian desert and pass your exam!

// CTRL + SHIFT + F : to format code

// Rule: any time you go from numbers to string you have to clear out the input string

public class Main {
  // this is a header
  // public is an access mod
  // void is the return type, means this method doesn't return a value
  // method names should be in lowerCamelCase and be named with a verb
  // 
  public static void main(String[] args) {
     
    // List & description of Java built-in data types:
    // Byte: 8 bit, min of -127 to max 127 value, useful for saving memory into large arrays

    // Short: 16 bit, -32,768 min to 32,767 max value, good for saving memory in large arrays but
    // has more space than a byte

    // Int: 32 bits, min -2^31 to 2^32 -1 max value, uses class int, good for mathematical
    // operations

    // Long: 64 bit, -2^63 min and 2^63 -1 max value, good for large values that int can't handle

    // Float: really good for saving memory in big arrays of fractional numbers, it does round
    // the numbers out though so it is not 100% accurate for that type of arithmetic, needs an f at
    // the end of the number

    // Double: usually used for decimals but just like float is not 100% accurate

    // Boolean: true, false data, only gives these 2 values and it used to track true and false
    // conditions

    // Char: single 16bit unicode character, basically just 1 character
    
    
    // Variable: a location in memory
    
    // Scope: a variable is only accessible in the variable where it was declared

    // final variable: a variable who's value can never be changed
    
    System.out.println(
        "Welcome to Smiggin Holes Academy, the primier training academy for all soon to be adventurers!\n");

    // Your Character Stats

    System.out.println("Character Stats: \n "
        + "\tClass, Level, Race: Druid, Lvl 3, Forest Gnome  \n"
        + "\tStrength:10, modifier 0 \n\tDexterity:11, modifier 0 \n\tConstitution:14, "
        + "modifier 2 \n\tIntelligence:15, modifier 2 \n\tWisdom:14, modifier 2 \n\tCharisma:10, modifier 0 "
        + "\nProficiency Bonus: +2" + "\nProficiencies: Nature, Animal Handling" + "\nHP: 19" + "\nInitiative: +2");

    System.out.println("\nPlease input your name ");

    // Using this to get someone's name and input it to the next line
    Scanner name = new Scanner(System.in);
    String yourName = name.next();
    name.close();
    
    System.out.println("Welcome " + yourName + " to the first year class."
        + " In a 2 days we will be having placement tests to see what class you will be put in.");

    System.out.println(
        "Please take these few days to study, buy supplies, get to know your teammates, or get any other neccesities out of the way. \n");

    System.out.println("You have 32 hours, after taking out 8 hours each day for a full rest. "
        + "What would you like to do first: 1. Study, 2. buy supplies, or 3. get to know your teammates?" + "Please input a numbered choice.");
    
   // int sample1 = 4;
   // int sample2 = 6;
    
   // System.out.println(sample1 > sample2);
    
   // double itsADecimal = 150.23;
    
   //System.out.println(itsADecimal);
    
   // boolean myTimeManagementIsAwful = true;
   // boolean iFeelGreat = false;
    
   //  System.out.println(myTimeManagementIsAwful);
   //  System.out.println(iFeelGreat);

    
    // If Studying is chosen: will give 2 options
    
    
    // Option 1: Takes 12 hours, will give you advantage in ranged spell attacks 
    
    // Option 2: Takes 6 hours, will give you advantage in investigation checks
  
  }
}