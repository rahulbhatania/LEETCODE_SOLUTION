class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int i=0;
        int j=i;
        for(i=0;i<s.length();i++){
            for(j=i;j<s.length();j++){
                if(ps(s,i,j)){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }
                
            }
        }
        return ans;
    }
    public boolean ps(String A , int s , int l){
       while(s<l){

        if(A.charAt(s)!=A.charAt(l)){ return false;}
        s++;
        l--;}
        return true;

    }
}