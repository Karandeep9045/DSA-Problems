class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.toLowerCase();
        String str2 = str.replaceAll("[^a-zA-Z ]", " ");
        String[] words = str2.trim().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }
        return result;
    }
}