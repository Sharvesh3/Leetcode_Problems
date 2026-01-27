class Solution {
    public String truncateSentence(String s, int k) {
        String result = "";
        int words = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words++;
                if (words == k) break;
            }
            result += s.charAt(i);
        }

        return result;
    }
}