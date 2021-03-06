
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
  public int solution(int N) {
    String bin = Integer.toBinaryString(N);
    System.out.println(bin);

    int result = 0;
    int tmp = 0;
    for (int i = 1; i < bin.length(); i++) {
      if ('0' == bin.charAt(i)) {
        tmp++;
      } else {
        result = tmp > result ? tmp : result;
        tmp = 0;
      }
    }

    return result;
  }
}
