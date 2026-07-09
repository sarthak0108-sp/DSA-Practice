class Solution {
    public String sortVowels(String s) {
        List<Character> vowel=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
               vowel.add(ch);
            }
        }
        Collections.sort(vowel);
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                sb.append(vowel.get(idx++));
            }
            else{
                sb.append(ch);
            }
        }
     return sb.toString();
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}