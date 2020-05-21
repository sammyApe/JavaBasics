

public class Assignment1 {

    /**
     * Assignment Instructions
     * 1. create two integer variables in main method age1 and age2
     * 2. Create a method ageGroup that takes the two ages from 1. above and do the following
     *  i. Print "one of you is old" if either age1 or age2 is greater than 50
     *  ii. Print "You are both old" if both age1 and age2 are greater than 50
     *  iii. Print "one of you is young" if either age1 or age2 is less than 40
     *  iv. Print "you are both young"  if both age1 and age2 are less than 40
     *
     *
     *
     *  3. Create an array with the following values "1,4,6,7,56,34,23"
     *  4. Create a method greaterThan20 which prints all numbers in the array that are greater than 20.
     *
     *  5. Let ageGroup2(age1,age2) return a string
     *  6. get the value returned from ageGroup and add your name to it;
     *
     *  7. Create a method greaterThan20 which returns all numbers in the array that are greater than 20.
     *
     * HAPPY CODING!!
     *
     * GOOD LUCK!!
     */

    public static void main(String[] args) {
        //1. create two integer variables in main method age1 and age2
        int age1 = 23 ;
        int age2 = 30;

        ageGroup(age1,age2);

    }



    private static void ageGroup(int age1, int age2) {

        if(age1 > 50 || age2 > 50) System.out.println("one of you is old");
        if(age1 > 50 && age2 > 50) System.out.println("You are both old");
        if(age1 < 40 || age2 < 40) System.out.println("one of you is young");

    }




}
