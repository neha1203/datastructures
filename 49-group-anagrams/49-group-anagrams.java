class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null|| strs.length == 0)
             return new ArrayList<>();
        
        
        
        HashMap<String,ArrayList<String>> fmap = new HashMap<>();
        
        for(String str: strs){
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            String strA = String.valueOf(charArray);
            
            if(fmap.containsKey(strA)){
                
                fmap.get(strA).add(str);
                
                
            }
            else {
                ArrayList<String> array = new ArrayList<>();
                array.add(str);
                fmap.put(strA,array);
                
                
            }
            
            
            
            
        }
       return new ArrayList<>(fmap.values()); 
        
        
    }
}