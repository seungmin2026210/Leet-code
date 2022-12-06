class Solution {
    public int numberOfSteps(int num) {
       
        int count =0;
        for(; 0<num; count++){
            if(num%2==0){
                num=num/2;

            } else {
                num-=1;
                
            }
        }

      return count;
    }
}