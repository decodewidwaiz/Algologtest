arrays

Cost of Groceries

Chef visited a grocery store for fresh supplies. There are 
𝑁
N items in the store where the 
𝑖
𝑡
ℎ
i
th
 item has a freshness value 
𝐴
𝑖
A
i
	​

 and cost 
𝐵
𝑖
B
i
	​

.

Chef has decided to purchase all the items having a freshness value greater than equal to 
𝑋
X. Find the total cost of the groceries Chef buys.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers 
𝑁
N and 
𝑋
X — the number of items and the minimum freshness value an item should have.
The second line contains 
𝑁
N space-separated integers, the array 
𝐴
A, denoting the freshness value of each item.
The third line contains 
𝑁
N space-separated integers, the array 
𝐵
B, denoting the cost of each item.
Output Format

For each test case, output on a new line, the total cost of the groceries Chef buys.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝑁
,
𝑋
≤
100
1≤N,X≤100
1
≤
𝐴
𝑖
,
𝐵
𝑖
≤
100
1≤A
i
	​

,B
i
	​

≤100
Sample 1:
Input
Output
4
2 20
15 67
10 90
3 1
1 2 3
1 2 3
3 100
10 90 50
30 7 93
4 50
12 78 50 40
40 30 20 10

90
6
0
50

Explanation:

Test case 
1
1: Item 
2
2 has freshness value greater than equal to 
𝑋
=
20
X=20. Thus, Chef buys item 
2
2. The total cost is 
90
90.

Test case 
2
2: Items 
1
,
2
,
1,2, and 
3
3 have freshness value greater than equal to 
𝑋
=
1
X=1. Thus, Chef buys all 
3
3 items. The total cost is 
1
+
2
+
3
=
6
1+2+3=6.

Test case 
3
3: No item has freshness value greater than equal to 
𝑋
=
100
X=100. Thus, Chef buys no items.

Test case 
4
4: Items 
2
2 and 
3
3 have freshness value greater than equal to 
𝑋
=
50
X=50. Thus, Chef buys items 
2
2 and 
3
3. The total cost is 
30
+
20
=
50
30+20=50.