Solve Queries on Rotated Array
Given an array of N integers, and a positive number R. The goal is to rotate the array to the left (counter-clockwise direction) by R steps. Then, based on the rotated array, you need to answer Q queries. Each query will contain a number i, and you have to print the element present at ith index, in the final array.

Note It is possible that R is greater than N.

Example

N = 7, R = 3, arr[ ] = {1, 2, 3, 4, 5, 6, 7}

Q = 4, queries[ ] = {3, 0, 1, 5}

After rotating the array 3 times, it will become {4, 5, 6, 7, 1, 2, 3}

The result of each query is as follows {7, 4, 5, 2} i.e. {arr[3], arr[0], arr[1], arr[5]}

Input Format

First line of input will contain two space separated integers, denoting N and R respectively.
Second line will contain N space separated integers.
Third line will contain a positive integer Q = number of queries.
Fourth line will contain Q space separated integers, denoting each query.
Output Format

Print the answer of each query, separated by space.
Constraints

1 = N = 10^5
1 = R = 10^6
0 = arr[i] = 10^5
1 = Q = 10^5
0 = queries[i]  N
Sample Input

7 3               N R
1 2 3 4 5 6 7     arr[]
4                 Q
3 0 1 5           queries[]
Sample Output

7 4 5 2