class Result{
  // Return the array that contains leaders
  static int[] findTheLeaders(int a[], int n){
    // Write your code here
    ArrayList<Integer> arr = new ArrayList<>();
     int curLeader = a[n-1];
    arr.add(curLeader);
  	for(int i=n-1;i>=0;i--){
      if(a[i]>curLeader){
        curLeader = a[i];
        arr.add(curLeader);
      }
    }
    int j =0;
    int res[] = new int[arr.size()];
    for(int i = arr.size()-1;i>=0;i--){
      res[j++] = arr.get(i); 
    }
    return res;
  }
}