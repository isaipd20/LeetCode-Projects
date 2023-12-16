package max_num_of_words_in_sentence;

public class max_num_of_words_in_sentence{
    public int mostWordsFound(String[] sentences) {
        int[] nums = new int[sentences.length];
        //System.out.println("test: "+sentences.length);
        Arrays.fill(nums, 1);
        int result = 0;

        for(int i = 0; i<sentences.length; i++){
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    nums[i] = nums[i] + 1;
                    System.out.println("test["+ i + "]: " +nums[i]);
                }

                if(nums[i] >= result){
                    result = nums[i];
                }
            }
        }

        return result;
    }
}