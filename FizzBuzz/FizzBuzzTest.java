//Since the test is in the same directory as the FizzBuzz.java, you don't have to import.
public class FizzBuzzTest{
    public static void main(String[] args) {
        FizzBuzz iD = new FizzBuzz();   //need to put new before you can use the object class, FizzBuzz. Object=Class
        String word = iD.fizzBuzz(2);   //we can use this method on the iD object
        System.out.println(word);
    }
}