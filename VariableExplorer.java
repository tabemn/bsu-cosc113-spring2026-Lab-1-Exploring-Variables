// Lab Exercise: Exploring Variables in Java

public class VariableExplorer {
  public static void main(String[] args) {

    // Exercise 1: Declaring and Initializing Variables

    // 1.1 Declare an integer variable named 'age' and initialize it to your age.
    // Stores my current age in years; an int is used because age is a whole number.

    int age = 20;

    // 1.2 Declare a double variable named 'height' and initialize it to your height in meters.
    // Stores my height in meters; a double allows for decimal precision.

    double height = 1.6256;
    
    // 1.3 Declare a boolean variable named 'isStudent' and initialize it to true if you are a student, false otherwise.
    // Represents whether I am currently a student (true = yes, false = no).

    boolean isStudent = true;
    
    // 1.4 Declare a String variable named 'name' and initialize it to your name.
    // Stores my full name as text, which is why a String is appropriate.

    String name = "Nia Silke Tabe";
    
    // Exercise 2: Printing Variable Values

    // 2.1 Print the values of all the variables you declared in Exercise 1, including descriptive labels in the output.

    System.out.println("My age is: " + age);
    System.out.println("My height in meters is: " + height);
    System.out.println("I am a student: " + isStudent);
    System.out.println("My name is: " + name);

    // Exercise 3: Modifying Variable Values

    // 3.1 Change the value of the 'age' variable to your age next year.
    // Updates the age variable to represent my age next year.

    age = 21;
    
    // 3.2 Change the value of the 'isStudent' variable to its opposite.
    // Changes the student status to the opposite of the original value.

    isStudent = false;
    
    // 3.3 Print the updated values of 'age' and 'isStudent'.

    System.out.println("My age next year would be: " + age);
    System.out.println("Student Status: " + isStudent);

    // Exercise 4: Exploring Different Data Types

    // 4.1 Declare a 'char' variable named 'initial' and initialize it to the first letter of your last name.
    // Stores the first letter of my last name using a single character.

    char initial = 'T';

    // 4.2 Declare a 'float' variable named 'weight' and initialize it to your weight in kilograms (use a float literal, e.g., 70.5f).
    // Stores my weight in kilograms; float is used to allow decimal values.

    float weight = 58.967f;
    
     // 4.3 Print the values of 'initial' and 'weight'.
    System.out.println("The first letter of my last name is: " + initial);
    System.out.println("My weight in kilograms is: " + weight);

    // Exercise 5: Type Conversion (Casting)

    // 5.1 Declare an integer variable 'totalHeight' and assign it the value of 'height' converted to an integer (using casting).
   // Converts my height from a double to an int by removing the decimal portion.

    int totalHeight = (int)height;
   
    // 5.2 Print the value of 'totalHeight'.

    System.out.println("The value of totalHeight is: " + totalHeight);

    // Exercise 6: Data Types and Variable Declarations

    // 6.1 Declare a long variable named 'population' and initialize it to the estimated population of your city.
    // Stores the estimated population of my city; long is used for large numbers.

    long population = 21052L;
    
    // 6.2 Declare a short variable named 'zipCode' and initialize it to your local zip code.
    // Stores my local zip code as a short integer.

    short zipCode = 20785;

    // 6.3 Print the values of 'population' and 'zipCode'.
    
    System.out.println("The estimated population of my city is: " + population);
    System.out.println("My local zip code is: " + zipCode);

    System.out.println("\n--- Lab Exercise Complete ---");
  }
}