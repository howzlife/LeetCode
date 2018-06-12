package reverseNumber;

class Solution {
  public int reverse(int x) {
    if (x > Integer.MIN_VALUE && x < Integer.MAX_VALUE) {
      return (x > 0)
        ? doReverse(x)
        : (-1) * doReverse(-x);
    }

    return 0;
  }

  private int doReverse(int a){
    double reversedNumber = 0;

    while (a != 0) {
      System.out.println("A: " + a);
      reversedNumber = reversedNumber * 10 + (a % 10);
      a /= 10;
      System.out.println("Reversed: " + reversedNumber);
      //     Check that reversedNumber won't overflow
      if (reversedNumber > Integer.MAX_VALUE || (reversedNumber * (-1) < Integer.MIN_VALUE)) return 0;
    }
    return (int)reversedNumber;
  }
}