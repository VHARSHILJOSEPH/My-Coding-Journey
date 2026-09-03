class Solution {
    public boolean uniformArray(int[] nums1) {
        int ans[]=new int [nums1.length];
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int n:nums1){
            if(n%2==0)  even.add(n);            
            else    odd.add(n);
        }
        if(even.size()==nums1.length)    return true;
        if(odd.size()==nums1.length)    return true;
        Collections.sort(even);
        Collections.sort(odd);
        int evens=even.get(0);
        int odds=odd.get(0);
        int i=1,j=1;
        for(int n :even){
            while(n-odds<=0){
                odds++;
                j++;
                if(odd.size()<=j){
                    return false;
                }

            }
        }
        if (even.size() != 0 || odd.size() != 0)
            return true;
        return false;    

        
    }
}