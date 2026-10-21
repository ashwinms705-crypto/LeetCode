class Solution {
    static int factor(int m){
        int f=0;
        if(m>=1000) f=1000;
        else if(m>=500) f=500;
        else if(m>=100) f=100;
        else if(m>=50) f=50;
        else if(m>=10) f=10;
        else if(m>=5) f=5;
        else f=1;
        return f;
    }
    public String intToRoman(int num) {
        int n=num;
        int i=0;
        HashMap<Integer,Character> hm=new HashMap<>();
        hm.put(1,'I');hm.put(5,'V');hm.put(10,'X');hm.put(50,'L');hm.put(100,'C');
        hm.put(500,'D');hm.put(1000,'M');
        ArrayList<Integer> l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=(n%10);
            int r=rem*(int)Math.pow(10,i);
            if(r==0){
                i++;
                n=n/10;
                continue;
            }
            if(hm.containsKey(r)){
                sb.append(hm.get(r));
            }
            else{
                if(rem!=4 && rem!=9){
                    int m=r;
                    StringBuilder temp=new StringBuilder();
                    while(m>0){
                        if(hm.containsKey(m)){
                            temp.append(hm.get(m));
                            break;
                        }
                        int f=factor(m);
                        temp.append(hm.get(f));
                        m=m-f;
                    }
                    sb.append(temp.reverse());
                }
                else{
                    int b=(int)Math.pow(10,i);
                    if(rem==4){
                        sb.append(hm.get(5*b));
                        sb.append(hm.get(b));
                    }
                    else{
                        sb.append(hm.get(10*b));
                        sb.append(hm.get(b));
                    }
                }
            }
            n=n/10;
            i++;
        }
        sb.reverse();
        return sb.toString();
    }
}