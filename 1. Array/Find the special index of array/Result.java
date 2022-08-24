class Result {
 
  static int specialIndex(int arr[], int n) {
    // Write your code here
   	int lsum = 0,rsum=0;
    for(int i = 0;i<n ;i++){
    	rsum+=arr[i];  
    }
    for(int i = 0;i<n;i++){ 
      rsum-=arr[i];
      //System.out.println(lsum +" "+ rsum);
      if(lsum == rsum){
        return i;
      }
      lsum+=arr[i];
    }
   	return -1; 
  }
}