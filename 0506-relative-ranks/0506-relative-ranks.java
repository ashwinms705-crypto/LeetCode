class Solution {
    public String[] findRelativeRanks(int[] score) {
        int maxi=Integer.MIN_VALUE;
        String[] res=new String[score.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] temp=score.clone();
        Arrays.sort(temp);
        for(int i=0;i<score.length;i++){
            hm.put(score[i],i);
        }
        int n=temp.length;
        for(int i=0;i<temp.length;i++){
            int v=hm.get(temp[i]);
            if(i==n-1)
                res[v]="Gold Medal";
            else if(i==n-2)
                res[v]="Silver Medal";
            else if(i==n-3)
                res[v]="Bronze Medal";
            else
                res[v]=Integer.toString(n-i);
        }
        return res;
    }
}