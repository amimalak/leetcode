class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false; 

        }

        int [] count = new int[26]; // using arrays gotta intialize like with hashmaps and to increment we start with int 0 or how much we have in list 
        for (int i =0; i < s.length(); i ++){
            int index = s.charAt(i)- 'a';
            count[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            count[index]--;
        }                              //-- to cancel cuz +- cancel , wanna do opposite 

        for (int num:count){
            if (num != 0){
                return false;        //if dont cancel 
            }
        }
return true;
    }
}



//frequency map bc need to count how many times character appears 
//only 26 letters in alphabet so 26 
//must be same size if not then automatically false
