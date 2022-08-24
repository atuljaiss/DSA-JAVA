https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

Leaders in an array
Given an array, you have to print the LEADER elements of it. An element is called LEADER if it is greater than all the elements to its right side, note that the rightmost element is always a leader.

For example in the array {12, 27, 14, 11, 25, 6, 7}, leaders are 27, 25 and 7.

Complete the function findTheLeaders() that accepts the array and returns the array that contains the leaders

Input Format

First Line will contain an integer N denoting the size of array.
Second line contains N integers separated by space as elements of array.
Output Format

Print the leader elements separated by space.
Constraints

1 <= N <= 10^5
-(10^9) <= arr[i] <= 10^9
Sample Input

7
12 27 14 11 25 6 7
Sample Output

27 25 7
