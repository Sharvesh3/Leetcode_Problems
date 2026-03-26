class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int left=0,right=s.length()-1;

        while(left<=right && s.charAt(left)==' ') left++;
        while(left<=right && s.charAt(right)==' ') right--;

        while(left<=right){
            char c=s.charAt(left);
            if(c!=' '){
                sb.append(c);
            } else if (sb.charAt(sb.length()-1)!=' ') {
                sb.append(c);
            }
            left++;
        }
        sb.reverse();

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

    private static void reverseWord(StringBuilder s,int i, int j){
        while(i<j){
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}