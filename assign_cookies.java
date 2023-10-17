class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gs = g.length;
        int ss = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int gp = 0, sp =0;
        int count = 0;
        while(gp<gs && sp<ss){
            if(s[sp] >= g[gp]){
                count++;
                gp++;
                sp++;
            }else if(s[sp] > g[gp]){
                gp++;
            }else if(s[sp] < g[gp]){
                sp++;
            }
        }

        return count;
    }
}

//https://leetcode.com/problems/assign-cookies/
