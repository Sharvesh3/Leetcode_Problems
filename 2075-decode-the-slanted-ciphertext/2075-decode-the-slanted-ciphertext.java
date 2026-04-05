class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int total_col=encodedText.length()/rows;

        StringBuilder sb=new StringBuilder();

        for(int start_c=0;start_c<total_col; start_c++){
            int r=0;
            int c=start_c;

            while(r<rows && c<total_col){
                int i=(r*total_col)+c;
                sb.append(encodedText.charAt(i));
                r++;
                c++;
            }
        }
        while (sb.length()>0 && sb.charAt(sb.length()-1)==' '){
            sb.setLength(sb.length()-1);
        }
        return sb.toString();
    }
}