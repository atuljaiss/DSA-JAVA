import java.util.Collections;
class Result {
  static ArrayList<Integer> reduceArray(ArrayList<Integer> arr) {
    // Write your code here
    ArrayList<Integer> al = new ArrayList<>();
    Collections.sort(arr);
    int rf = 0;
  
    for(int i  = 0 ;i< arr.size(); i++)
    {
    	if(arr.get(i)-rf>0){
        rf = rf + (arr.get(i)-rf);
        al.add(arr.size()-i);
      // System.out.println(rf + " "+ al);
    	}
  	}
    return al;
  }
}