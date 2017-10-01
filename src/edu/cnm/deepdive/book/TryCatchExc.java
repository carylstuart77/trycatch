package edu.cnm.deepdive.book;
//Try Catch Exception Practice
public class TryCatchExc {
  public static void main(String args[]) {
    //type; ref-var; allocate memory; number of elements in arrray
    int nums[] = new int[4];
    //Create try block for exceptions
    try {
      System.out.println("Before exception is generated.");
      //Generate exception; there are only 4 elements; can't put 10 in slot 7
     // nums[7] = 10;
      nums[1] = 10;

      System.out.println("No out of bound condition");
    }
    catch (ArrayIndexOutOfBoundsException exc) {
      //catch the exception
      System.out.println("Index out-of-bounds!");

    }
    System.out.println("After catch statement.");
  }

}
