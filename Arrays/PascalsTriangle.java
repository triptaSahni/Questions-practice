class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>(); 
 if(numRows==0)
     return result;
     
     for(int i=1;i<=numRows;i++)
     {
         List<Integer> lt=new ArrayList<Integer>();
         for(int j=0;j<i;j++)
         {
             if(j==0||j==i-1)
                 lt.add(1);
             else
             {
                 lt.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
             }
            
         }
        result.add(lt);
     }
      return result;  
    }
}
