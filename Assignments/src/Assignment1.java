

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
     * HAPPY CODING!!
     *
     * GOOD LUCK!!
     */



    public static void main(String[] args) {
        int age1 = 50;
        int age2 = 50;
        ageGroup(age1,age2);
        //int greaterThan20[] = {40,4,6,7,56,34,23};
        greaterThan20();

    }

    public static void ageGroup(int age1, int age2) {
        if (age1 > 50);
        System.out.println("you are old");

        if (age1 > 50 && age2 > 50);
        System.out.println("you are both old");
        if (age1 < 40)
            System.out.println("one of you is young");
        if (age1 < 40 && age2 < 40);
        System.out.println("you are both young");

    }
    public static void greaterThan20(){

        int[] numbers = {40,4,6,7,56,34,2,30,10,27,39};
        for(int i =0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
            if(numbers[i]>20){
                System.out.println(numbers[i]);
            }
        }
    }
}
