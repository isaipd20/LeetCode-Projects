class Solution {
    public int findCenter(int[][] edges) {
        int result = 0;
        
        if(edges[0][0] == edges[1][1] || edges[0][0] == edges[1][0]){
            result = edges[0][0];
        } else {
            result = edges[0][1];
        }

        return result;
    }
}