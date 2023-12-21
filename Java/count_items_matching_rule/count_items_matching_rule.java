package count_items_matching_rule;

public class count_items_matching_rule{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;

        for(int i = 0; i<items.size(); i++){
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue)){
                    result++;
                }
            }
            else if(ruleKey.equals("color")){
                if(items.get(i).get(1).equals(ruleValue)){
                    result++;
                }
            }
            else if(ruleKey.equals("name")){
                if(items.get(i).get(2).equals(ruleValue)){
                    result++;
                }
            }
        }

        return result;
    }
}