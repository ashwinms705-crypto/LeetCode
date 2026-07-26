class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        for(int arr[]:series1){
            hm1.put(arr[0],arr[1]);
            a1.add(arr[0]);
        }
        for(int arr[]:series2){
            hm2.put(arr[0],arr[1]);
            a2.add(arr[0]);
        }
        Set<Integer> set=new TreeSet<>();
        set.addAll(a1);
        set.addAll(a2);
        List<Integer> r=new ArrayList<>(set);
        int q=0;
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<r.size();i++){
            while(q < a1.size() && a1.get(q) < r.get(i)){
                q++;
            }
            if(q == a1.size()){
                l1.add(0);
            }
            else{
                l1.add(hm1.get(a1.get(q)));
            }
        }
        q=0;
        for(int i=0;i<r.size();i++){
            while(q < a2.size() && a2.get(q) < r.get(i)){
                q++;
            }

            if(q == a2.size()){
                l2.add(0);
            }
            else{
                l2.add(hm2.get(a2.get(q)));
            }
        }
        for(int i=0;i<r.size();i++){
            List<Integer> g=new ArrayList<>();
            g.add(r.get(i));
            g.add(l1.get(i)+l2.get(i));
            res.add(g);
        }
        return res;
    }
}