class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> arr=new LinkedList();
        if(digits.length()==0)
            return arr;
        arr.add("");
        String[] map=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            int index=Character.getNumericValue(digits.charAt(i));
            while(arr.peek().length()==i)
            {
                String permutation=arr.remove();
                for(char c : map[index].toCharArray())
                {
                    arr.add(permutation+c);
                }
            }
        }
        return arr;
    }
}