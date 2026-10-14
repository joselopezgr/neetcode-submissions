class Solution {
    public boolean isAnagram(String s, String t) {
        // First transform the strings into an array of Chars
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        // sort these arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // check if they're equals
        return Arrays.equals(array1,array2);
    }
}
