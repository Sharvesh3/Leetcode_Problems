class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ans = 0;
        int a1 = (ax2-ax1)*(ay2-ay1);
        int a2 = (bx2-bx1)*(by2-by1);
        ans = a1 + a2;
        int l = Math.min(ax2, bx2)-Math.max(bx1, ax1);
        int w = Math.min(ay2, by2)-Math.max(by1, ay1);
        int a3 = l*w;
        if(l <0 || w<0){
            a3 = 0;
        }
        
         ans -= a3;

        return ans;
    }
}