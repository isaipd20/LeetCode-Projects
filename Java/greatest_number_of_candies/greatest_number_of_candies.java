package greatest_number_of_candies;

class greatest_number_of_candies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int temp = 0;

        for(int i = 0; i<candies.length; i++){
            if(candies[i] >= temp){
                temp = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= temp){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}