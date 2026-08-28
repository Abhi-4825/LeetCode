class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>> m=new HashMap<>();
    for(int i=0;i<strs.length;i++){
        char[] arr=strs[i].toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        if(!m.containsKey(str))m.put(str,new ArrayList());
        m.get(str).add(strs[i]);
    }
    return new ArrayList<> (m. values());


    }
}