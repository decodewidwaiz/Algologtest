
          First Repeating Element

          - Summary: The code uses a HashMap to store each integer from the input array `arr` as a key and its index (plus 1) as the value. It iterates through the array; if an integer is already in the HashMap, it means it's a repeated element. The algorithm updates `first` to the minimum index of the repeated element encountered so far. Finally, it returns the index of the first repeated element or -1 if no such element exists.

          - Time Complexity: O(n) because the code iterates through the array once. HashMap operations (containsKey, get, put) take constant time on average.
          - Space Complexity: O(n) in the worst case because the HashMap could store all unique elements from the array if there are no repeated elements.
          