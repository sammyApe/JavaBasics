public class Assignment1 {

    /**
     * Assignment Instructions
     * 1. create two integer variables in main method age1 and age2
     * 2. Create a method ageGroup that takes the two ages from 1. above and do the following
     * i. Print "one of you is old" if either age1 or age2 is greater than 50
     * ii. Print "You are both old" if both age1 and age2 are greater than 50
     * iii. Print "one of you is young" if either age1 or age2 is less than 40
     * iv. Print "you are both young"  if both age1 and age2 are less than 40
     * <p>
     * <p>
     * <p>
     * 3. Create an array with the following values "1,4,6,7,56,34,23"
     * 4. Create a method greaterThan20 which prints all numbers in the array that are greater than 20.
     * *  5. Let ageGroup2(age1,age2) return a string
     *      *  6. get the value returned from ageGroup and add your name to it;
     *      *
     *      *  7. Create a method greaterThan20 which returns all numbers in the array that are greater than 20.
     * <p>
     * HAPPY CODING!!
     * <p>
     * GOOD LUCK!!
     */

    public static void main(String[] args) {
        String age1 = "50";
        String age2 = "50";
        // ageGroup(age1,age2);
        //    age1= 70;
        //  age2= 80;
       // ageGroup(age1, age2);
       // greaterThan20();
     //   String ageGroupResult= ageGroup2(age1,age2);
        String ageGroupResult1 = ageGroup2("Ben", "Ade");
     //   System.out.println(ageGroupResult);
        System.out.println(ageGroupResult1);
         int[] originalArray = {1,4,6,7,56,34,23};
         String name = new String("Osho");
         String name2 = "Osho";

        int[] greaterThan20 = numbersGreaterThan20(originalArray);
    }

    private static int[] numbersGreaterThan20(int[] originalArray) {
        int [] greaterThan20 = new int[7];
        for (int i = 0; i < originalArray.length; i++){
          if (originalArray[i] >20) {
              greaterThan20[i] = originalArray[i];
          }
        }
        return greaterThan20;
    }

    private static String ageGroup2(String ben, String ade) {
        return "Ben" + "Ade";

    }
    //  private static String ageGroup2(String a, String b) {
   //     return a + b;

  //  }

    static void ageGroup(int age1, int age2) {
        if (age1 < 50) ;
        System.out.println("one of you is old");

        if (age1 > 50 && age2 > 50) ;
        System.out.println("You are both old");

        if (age1 < 40) ;
        System.out.println("one of you is young");

        if (age1 < 50 && age2 < 50) ;
        System.out.println("You are both young");

    }

    public static int greaterThan20() {

        int[] numbers = {1, 4, 6, 7, 56, 34, 23};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20) {
                System.out.println(numbers[i]);

            }
        }
        return 0;
    }
}







