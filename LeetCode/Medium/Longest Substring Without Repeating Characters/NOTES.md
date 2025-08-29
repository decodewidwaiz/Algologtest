
          Longest Substring Without Repeating Characters

          - Summary: This Java code employs a HashMap to store characters as keys and their indices as values.  It iterates through the input string, using a sliding window approach.  If a repeating character is found within the current window, the window's start index is updated.  The algorithm maintains the maximum length of the substring without repeating characters, returning this length as the result.

          - Time Complexity: O(n) because the code iterates through the string once. While the HashMap operations have average time complexity O(1), in the worst case they could be O(n), but this is very unlikely with a large dataset.  Hence, the overall time complexity remains linear.
          - Space Complexity: O(min(m, n)) where n is the length of the string and m is the size of the character set. In the worst-case scenario, the HashMap could store all unique characters from the string, resulting in a space complexity proportional to the number of unique characters.
          