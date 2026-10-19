class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String, List<String> > h1 = new HashMap<>();

        for (int i=0; i<strs.length; i++){

            char[] p = strs[i].toCharArray();
            Arrays.sort(p);
            String c = new String(p);

            if (!h1.containsKey(c)){
                List <String> list = new ArrayList<>();
                list.add(strs[i]);
                h1.put(c, list);
            } else {
                h1.get(c).add(strs[i]);
            }
        }

        return new ArrayList<>(h1.values());
    }
}
