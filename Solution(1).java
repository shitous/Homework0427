import java.util.*;


public class Solution {
	 public int lengthOfLIS(int[] nums) {
		 List<Integer> oldList = new ArrayList<>();
		 
		 
		 int curPosition=0;
		 while(curPosition!=nums.length){
			 
			 List<Integer> newList = new ArrayList<>();
			 int cur=nums[curPosition];
			  
			 newList.add(cur);
			 for(int i=curPosition;i<nums.length;i++){
				 if(cur<nums[i]){
					 newList.add(nums[i]);
					 cur=nums[i];
				 }
			 }	 	
		 	if(newList.size()>=oldList.size()&&newList.size()!=0&&oldList.size()!=0){
		 		if(newList.size()>=oldList.size()){
		 			if(newList.get(0)>=oldList.get(0)){
		 			
			 			
			 			int oldsize=oldList.size();
	
			 			for(int i=1;i<oldsize;i++){
			 				oldList.remove(1);
			 				
			 			}
			 			for(int i=0;i<newList.size();i++){
			 				oldList.add(newList.get(i));
			 				
			 			}
			 			
		 			}
		 			else{
		 				int oldsize=oldList.size();
		 				for(int i=0;i<oldsize;i++){
			 				oldList.remove(0);
			 				
			 			}
			 			for(int i=0;i<newList.size();i++){
			 				oldList.add(newList.get(i));
			 			
			 			}
		 				
		 			}
		 		}

		 	}
		 	if(curPosition==0){
		 		for(int i=0;i<newList.size();i++){
	 				oldList.add(newList.get(i));
	 			}

		 	
		 	}
		 	
		 	curPosition++;
		}
		return oldList.size();
	 }



public static void main(String[]args){
	Solution test=new Solution();
	int[] nums={10, 9, 2, 5, 3, 4, 7, 101, 18};
	System.out.println(test.lengthOfLIS(nums)) ;


}}










