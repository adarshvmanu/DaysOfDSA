class Solution {
    public String reorderSpaces(String text) {
        int rem,count=0;
        String[] words = text.split("\\s+");
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==' ')
                count++;
            char[i]=' ';
        }
        rem=count%words.length;
        count=count/(words.length-1);
        for(int i=0;i<text.length;i++)
        {
            
        }
    }
}