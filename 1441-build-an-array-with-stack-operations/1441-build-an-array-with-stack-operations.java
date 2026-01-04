class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for(int i = 0, j = 1; j <= n && i < target.length; j++){
            if(flag) list.add("Pop");
            if(target[i] == j){
                flag = false;
                i++;
            }else{
                flag = true;
            }
            list.add("Push");
        }
        return list;
    }
}