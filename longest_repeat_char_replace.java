class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;
        int maxCount = 0;
        int[] freqCount = new int[26]; //storing the frequency of each alphabet occuring.

        int head = 0;
        for(int tail = 0; tail < n; tail++){
            freqCount[s.charAt(tail)-'A']++;  //incrementing the frequency of each alphabet occuring
            int currentFreq = freqCount[s.charAt(tail)-'A'];  //geting current freq. stored.
            maxCount = Math.max(maxCount, currentFreq);

            while( (tail - head - maxCount + 1) > k){  // sliding the window forward by poping the initial element.
                freqCount[s.charAt(head) - 'A']--;
                head++;
            }

            maxLength = Math.max(maxLength, tail - head +1);
        }
        return maxLength;
    }
}

//https://leetcode.com/problems/longest-repeating-character-replacement/description/
