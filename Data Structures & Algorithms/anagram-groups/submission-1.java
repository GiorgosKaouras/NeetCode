class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: strs){

            char[] p = s.toCharArray();
            Arrays.sort(p);
            String k = new String(p);

            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
