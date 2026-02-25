class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alph=new int[26];

        for(char c:s.toCharArray()){
            alph[c-'a']++;
        }
        for(char c:t.toCharArray()){
            alph[c-'a']--;
        }

        for(int i:alph){
            if(i!=0) return false;
        }
        return true;
    }
}