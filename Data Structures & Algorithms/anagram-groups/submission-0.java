class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // to sort and catgorize-- suing hashamp, key- sorted string and value is the gropus

//sorted 0th string- checked in hashamp if not tehere then added it,
//add the correspinsidn string as value for which i got the key
// o nlogm
// if (!map.containsKey(key)) {
//     map.put(key, new ArrayList<>());
// }
// map.get(key).add(s);


Map<String,List<String>> map = new HashMap<>();
for(String s: strs){ // for every string in arraylist we do this step 
    char[] ch= s.toCharArray(); //strs[0] = eat = 'e' ,'a','t'
    Arrays.sort(ch);
    String key =  new String(ch);
    if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
