class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        int count = 0;
        for(String word: words){
            
          String reversed = reverseString(word.toCharArray());
            words[count] = reversed;
            count++;
        }
        
        return String.join(" ", words);
    }
    
     private String reverseString(char[] s) {
        int i = 0, j = s.length -1;
        while(i < j){
            swap(s, i, j);
            i++;
            j--;
        }
         System.out.println(new String(s));
         return new String(s);
    }
    
    private void swap(char[] s, int x, int y){
        char temp = s[x];
        s[x] = s[y];
        s[y] = temp;
    }
}