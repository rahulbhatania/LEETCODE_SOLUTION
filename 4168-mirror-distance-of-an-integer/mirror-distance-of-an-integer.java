class Solution {
    public int mirrorDistance(int n) {
        String st=String.valueOf(n);
        String s="";
        for(int i=st.length()-1;i>=0;i--){
            s=s+st.charAt(i);
        }
        int b=Integer.parseInt(s);
        b=Math.abs(n-b);
        return b;
    }
}