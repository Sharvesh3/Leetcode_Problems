class Solution {
    public int hIndex(int[] citations) {
        int h = 0;
        for (int i = 0; i <= citations.length; i++) {
            int count = 0;
            for (int c : citations) {
                if (c >= i) {
                    count++;
                }
            }
            if (count >= i) {
                h = i;
            }
        }
        return h;
    }
}