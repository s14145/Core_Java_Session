package mapHighestFrequencyAssign;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to find the highest frequency of a character in a given string
 *
 */
public class MapHighestFrequency {

    /**
     *  This method is used to find the highest frequency of a character in a given string
     *
     * @param str input string
     * @return void
     */
    private static void findHighestFrequencyCharacterInString(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] charArray = str.trim().toLowerCase().toCharArray();
        for(char c: charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        int maxCount = 0;
        String maxCharacter = "";
        for(Map.Entry<Character,Integer> mapEntry: map.entrySet()){
            if(maxCount < mapEntry.getValue()){
                maxCount = mapEntry.getValue();
                maxCharacter = String.valueOf(mapEntry.getKey());
            }
        }
        System.out.println("Highest Frequency Character is: " + maxCharacter);
        System.out.println("Frequency of " + maxCharacter + " is: " + maxCount);
    }

    public static void main(String[] args) {

        findHighestFrequencyCharacterInString("test");
    }
}