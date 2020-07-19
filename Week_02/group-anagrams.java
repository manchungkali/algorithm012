import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
        if ( strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String keyStr = String.valueOf(tmp);
            if ( ! map.containsKey(keyStr)) map.put(keyStr,new ArrayList<String>());
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());

    }


}