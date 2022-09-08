class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] w = str.split(" ");
        if (w.length != pattern.length()){
            return false;
            }
        Map h = new HashMap();
        for (Integer i= 0; i < w.length; ++i){
            if (h.put(pattern.charAt(i), i) != h.put(w[i], i)){
                return false;
                }
            }
        return true;
        }   
    }
