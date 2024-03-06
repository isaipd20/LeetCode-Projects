class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        int count = 1;
        int total = 0;
        int index =0;

        for(int i =0; i<groupSizes.length; i++){
            if(groupSizes[i] >= total){
                total = groupSizes[i];
            }
        }

        for(int i=0; i < groupSizes.length; i++) {
            result.add(new ArrayList());
        }

        for(int i =0; i<groupSizes.length; i++){
            if(groupSizes[i] == count){
                if(result.get(index).size() == count){
                    index++;
                }
                result.get(index).add(i);
            }
            if(i+1 == groupSizes.length){
                if(result.get(index).size() > 0){
                    index++;
                }
                count++;
                i=-1;
            }
            if(count==total+1){
                break;
            }
        }

        result.removeIf(e -> e.isEmpty());

        return result;
    }
}
