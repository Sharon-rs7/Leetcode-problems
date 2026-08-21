class Solution {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        StringBuilder str = new StringBuilder("");
        char c[] = new char[length];
        for (int i = 0; i < length; i++) {
            c[indices[i]] = s.charAt(i);
        }
        str.append(c);
        return str.toString();
    }
}