class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        int n=low;
        int len=0;
        while(n>0){
            n=n/10;
            len++;
        }
        
        List<Integer> res=new ArrayList<>();
        int lowlen = String.valueOf(low).length();
        int highlen = String.valueOf(high).length();
        for(int i=lowlen;i<=highlen;i++){
            int a=0;
            int b=i;
            while(b<=s.length()){
                String str=s.substring(a,b);
                if(Integer.parseInt(str)>=low && Integer.parseInt(str)<=high){
                    res.add(Integer.parseInt(str));
                }
                a++;b++;
            }
        }
        return res;
    }
}