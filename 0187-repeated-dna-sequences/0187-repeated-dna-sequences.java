class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Map<String,Integer> store=new HashMap<String,Integer>();
         List<String> ans=new ArrayList();
        if(s.length()<=10){
            return ans;
        }


    
        for(int i=0;i<=s.length()-10;i++){
            String str=s.substring(i,i+10);
            if(store.containsKey(str)){
                Integer count=store.get(str);
                if(count==1){
                    ans.add(str);
                }
                    store.put(str,count+1);
                
            }else{
                store.put(str,1);
            }

        }

        return ans;
    }
}                       