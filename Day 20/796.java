class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
             return false;
        String e=s.concat(s);
        if(e.indexOf(goal)>0)
            return true;
        else 
            return false;
    }
}