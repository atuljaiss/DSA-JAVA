class Result {
  
  // Print the answer of each query, separated by space
static void reverse(int arr[],int start, int end){
	for(int i = start, j = end-1; i<j;i++,j--){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
}
static void solveQueries(int N, int R, int arr[], int Q, int queries[]) {
  
  reverse(arr,0,R%N);
  reverse(arr,R%N,N);
  reverse(arr,0,N);

  for(int i = 0; i < Q;i++){
    System.out.print(arr[queries[i]]+" ");
  }
}
}