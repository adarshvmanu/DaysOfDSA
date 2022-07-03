class Solution{
	public int compress(char[] chars) {
		int count=1;
		String str="";
		str+=chars[0];
		for(int i=1;i<chars.length;i++)
        {
			char curr = chars[i];
			char prev = chars[i-1];
			if(prev != curr)
            {
				if(count>1)
                {
					str+=Integer.toString(count);
					count = 1;
				}
				str+=curr;
			}
			else
				count++;
		}
		if(count>1)
			str+=Integer.toString(count);
		for(int i=0; i<str.length(); i++)
			chars[i] = str.charAt(i);
		return str.length();
	}
}