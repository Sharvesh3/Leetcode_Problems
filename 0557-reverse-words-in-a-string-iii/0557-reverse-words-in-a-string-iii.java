class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        int start=0;
        int n=sb.length();

        for(int end=0;end<=n;end++){
            if(end==n || sb.charAt(end)==' '){
                reverseWord(sb,start,end-1);
                start=end+1;
            }
        }
        return sb.toString();
    }

    public static void reverseWord(StringBuilder sb, int i, int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}