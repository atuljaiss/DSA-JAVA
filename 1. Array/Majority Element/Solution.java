class Solution
{
    static int majorityElement(int nums[], int size)
    {
        // your code here
         int res=0,count=1;
    for(int  i = 1;i<size;i++){
      if(nums[res] == nums[i])count++;
      else count--;
      if(count==0){
        res=i;count = 1;
      }
    }
    count = 0;
    for(int i = 0;i<size;i++){
      if(nums[i]==nums[res]){
        count++;
      }
    }
    if(count>(size/2)){return nums[res];}
    return -1;
    }
}