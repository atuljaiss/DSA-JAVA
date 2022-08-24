class Result {
  static int findMaxProfit(int[] arr) {
	// Write your code here
    int curmin = arr[0];
    int profit = 0;
    for(int i = 1 ; i< arr.length ; i++){
      if( arr[i] < curmin){
        	curmin  = arr[i];
      }
      profit = Math.max(profit, arr[i]-curmin);
    }
    return profit;
  }
}