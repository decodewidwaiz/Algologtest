
          Palindrome Number

          - Summary: The Java code uses integer variables to check if a given integer 'x' is a palindrome. It reverses the integer 'x' digit by digit using a while loop and modulo operator.  Then, it compares the reversed integer with the original integer.  If they are equal, it returns true; otherwise, it returns false. No additional data structures like arrays or hashmaps are used.

          - Time Complexity: O(log10(x)). The while loop iterates through the digits of the number. The number of digits is proportional to the logarithm base 10 of the number. Therefore, the time complexity is logarithmic with respect to the input number.
          - Space Complexity: O(1). The algorithm uses a fixed number of integer variables regardless of the input size.  Therefore, the space complexity is constant.
          