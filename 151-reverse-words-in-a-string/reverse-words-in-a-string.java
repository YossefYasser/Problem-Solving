class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList();
         String result ="";
         int temp;
         boolean notFirst = false;
        for( int i =s.length()-1;i>=0;i--)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                temp=i;
               
                while(i>=0 &&Character.isLetterOrDigit(s.charAt(i)) )
                {
                i--;
                }
                if(notFirst)
                { 
                 result+= " ";
                 result +=(s.substring(i+1,temp+1));
                }
                else
                {
                    result +=(s.substring(i+1,temp+1));
                    notFirst = true;
                }

            }
        }
       
        return result;
    }


}