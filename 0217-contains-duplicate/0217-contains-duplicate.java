class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> values = new HashSet<>();
    for(int num : nums){
        if(!values.add(num)){
            return true;
        }
        
        }
        return false;
    }
}
  //  }                                            //cleaner solution






        
       // HashSet <Integer> values = new HashSet <>(); //no duplicates
       // boolean isAppear = true; 
        
       // for(int num: nums){
         //   if(values.contains(num)){
        //        isAppear= false;
       //         break;
       //     }
      //  else{
       //     values.add(num); //starts empty so add to it
  //      }
  //      }     
  //  return !isAppear;                                     //iterate
 //   }
//}
                                             //we want opposite so do ! 
        
    
