class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] broken = brokenLetters.toCharArray();
        int count = 0;
        for (String word : words) {
            for (char c : broken) {
                if (word.indexOf(c) >= 0) {
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}