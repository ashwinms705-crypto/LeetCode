class Solution {
    public int countDaysTogether(String aa, String la, String ab, String lb) {
        int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int a1=days(aa,months);
        int a2=days(la,months);
        int b1=days(ab,months);
        int b2=days(lb,months);
        int end=Math.min(a2,b2);
        int start=Math.max(a1,b1);
        return Math.max(0,end-start+1);
    }
    public int days(String date,int[] months){
        int day=Integer.parseInt(date.substring(3,5));
        int month=Integer.parseInt(date.substring(0,2));
        int tot=day;
        for(int i=0;i<month-1;i++){
            tot+=months[i];
        }
        return tot;
    }
}