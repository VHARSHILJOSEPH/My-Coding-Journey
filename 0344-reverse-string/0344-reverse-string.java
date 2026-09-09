class Solution {
    public void reverseString(char[] s) {
       int i=0;
       int j=s.length-1;
       while(i<j){
        char te=s[i];
        s[i]=s[j];
        s[j]=te;
        i++;
        j--;
       }
        
    }
}