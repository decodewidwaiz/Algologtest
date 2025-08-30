
          Conditional Summation

          - Summary: The Java code utilizes two integer arrays, 'a' and 'b', of size 'n'. It reads 't' test cases, each consisting of 'n', 'x', array 'a', and array 'b' as input.  The code iterates through array 'a', and if an element is greater than or equal to 'x', the corresponding element from array 'b' is added to a running sum 'ans'. Finally, 'ans' is printed for each test case.  The Scanner class is used for input.

          - Time Complexity: O(n*t), where 't' is the number of test cases and 'n' is the size of the arrays. This is because the code iterates through the arrays once for each test case.
          - Space Complexity: O(n), dominated by the space used to store the arrays 'a' and 'b'. The space used for other variables is constant.
          