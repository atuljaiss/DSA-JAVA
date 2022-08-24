Reduce the array to zero
Given an array of N positive integers, you need to perform certain number of reduce operations on it, until all the elements become 0.

In each reduce operation, you need to find the non-zero minimum element of the array, then reduce the value of each array element by the value of that minimum element.

Note: An element can only be reduced if its value ≥ 1.

Complete the reduceArray() function in the editor. Your function must perform reduce operations on the array elements until each one of them is reduced to 0, and finally return an integer array, where i'th element of the returned array denotes the number of elements reduced during the i'th operation.

Input Format:

First line contains an integer N, denoting number of elements.
Next N lines, contains an integer each denoting the value of ith element.
Output Format:

Print the number of elements reduced during each operation in new lines.
Constraints:

1 <= N <= 10^5
1 <= arr[i] <= 10^9
Sample Input 1

6  // N
7
3
3
1
1
9
Sample Output 1

6
4
2
1
Explanation 1

N = 6, arr = {7, 3, 3, 1, 1, 9}
Reduce Operation 0: The smallest element in arr is 1,
                 After reducing each array element in arr by 1, arr1 = {6, 2, 2, 0, 0, 8} and we print 6 (the number of elements reduced during the reduce operation) on a new line.
Reduce Operation 1: The smallest element in arr1 = {6, 2, 2, 0, 0, 8} is 2,
                 After reducing each array element in arr1 by 2, arr2 = {4, 0, 0, 0, 0, 6} and we print 4(the number of elements reduced during the reduce operation) on a new line.
Reduce Operation 2: The smallest element in arr2 = {4, 0, 0, 0, 0, 6} is 4,
                 After reducing each array element in arr2 by 4, arr3 = {0, 0, 0, 0, 0, 2} and we print 2(the number of elements reduced during the reduce operation) on a new line.
Reduce Operation 3: The smallest element in arr3 = {0, 0, 0, 0, 0, 2} is 2,
                 After reducing each array element in arr3 by 2, arr4 = {0, 0, 0, 0, 0, 0} and we print 1(the number of elements reduced during the reduce operation) on a new line.
At this point, there are no more elements to be reduced and we cease performing reduce operations.
Sample Input 2

8  // N
1
2
3
4
3
3
2
1
Sample Output 2

8
6
4
1