// Given an integer matrix of size n*n. n is the number of rows and columns. Traverse it in a spiral form.

// Input Format

// The first line contains N, which represents the number of rows and columns of a matrix.
// The next N lines contain N values, each representing the values of the matrix.
// Constraints

// NA

// Output Format

// A single line containing integers with space represents the desired traversal.

// Sample Input 0

// 3 
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 0

// 1 2 3 6 9 8 7 4 5
// Sample Input 1

// 4 
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Sample Output 1

// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
import java.util.*;
class integer{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    //getting the size
    int n =sc.nextInt();
    int[][]matrix=new int[n][n];
    for(int i=0;i<n;i++){
        for(j=0;j<n;j++){
            matrix[i][j] =sc.nextInt();
        }
        
    }
    int top=0;int bottom =n-1;
    int left=0;int right=n-1;
    while(top<=bottom && left<=right){
        //traversing from left to right
        for(int i=left;i<=right;i++){
            System.out.print(matrix[top][i]+" ");
        }
      
    
