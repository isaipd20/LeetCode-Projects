class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    temp.add(i);
                }
            }
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < temp.size(); i++){
            set.add(temp.get(i));
        }

        result[0] = set.size();
        temp.clear();
        set.clear();

        for(int i = 0; i<nums2.length; i++){
            for(int j = 0; j<nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    temp.add(i);
                }
            }
        }

        for (int i = 0; i < temp.size(); i++){
            set.add(temp.get(i));
        }

        result[1] = set.size();

        return result;
    }
}