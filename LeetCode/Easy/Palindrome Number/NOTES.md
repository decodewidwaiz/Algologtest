
          Palindrome Number

          - Summary: The code uses integer variables to check if a given integer is a palindrome. It first handles the base cases of 0 and negative numbers.  Then, it iteratively reverses the input integer by extracting the last digit and prepending it to a new integer. Finally, it compares the original and reversed integers to determine if it's a palindrome.

          - Time Complexity: O(log10(x)) because the while loop iterates roughly log10(x) times, where x is the input integer.  The number of digits in x determines the number of iterations.
          - Space Complexity: O(1) because the algorithm uses a constant amount of extra space regardless of the input size. Only a few integer variables are used.
          