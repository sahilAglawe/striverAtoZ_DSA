// Question : sort Characters By Frequency

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        int maxFreq = 0;
        for(char ch : s.toCharArray()) {
            int freq = map.getOrDefault(ch,0)+1;
            map.put(ch,freq);
            maxFreq = Math.max(freq, maxFreq);
        }

        List<List<Character>> bucket = new ArrayList<>();
        for(int i = 0; i<= maxFreq; i++){
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            bucket.get(freq).add(ch);
        }

        StringBuilder result = new StringBuilder();

        for(int i = maxFreq; i>0; i--){
            for(char ch: bucket.get(i)) {
                for(int j = 0; j<i; j++){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}

// T/C: O(n) , S/C: O(n)