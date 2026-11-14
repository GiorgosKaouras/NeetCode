class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();        
        for(int number: nums){
            map.put( number, (map.getOrDefault(number,0)+1) );
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));

        int[] freq = new int[k];
        for(int i=0; i<k; ++i){
            freq[i] = list.get(i);
        }

        return freq;
    }
}
