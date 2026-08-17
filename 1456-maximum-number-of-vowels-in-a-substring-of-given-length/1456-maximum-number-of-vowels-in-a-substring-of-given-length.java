class Solution {
    public int maxVowels(String s, int k) {
        int maxvow=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(vowels(s.charAt(i))){
                count++;
            }
        }
        maxvow=count;
        for(int i=k;i<s.length();i++){
            if(vowels(s.charAt(i))){
                count++;
            }
            if(vowels(s.charAt(i-k))){
                count--;
            }
            maxvow=Math.max(maxvow,count);
        }
        return maxvow;
    }
    public boolean vowels(char ch){
        return ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ;
    }
}