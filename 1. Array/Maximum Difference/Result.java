class Result {
  static int maxDifference(int arr[], int n) {
    // complete this function
    int diff = arr[0];
    int res =arr[1] - arr[0];
    for(int i = 1;i<n;i++){
		
     	res = Math.max(res,(arr[i]-diff));
      diff = Math.min(diff, arr[i]);
    }
    return res<=0?-1:res;
  }
}