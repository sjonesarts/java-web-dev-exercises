package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class Count {
    public static void main(String [] args){
        String myStr = "Somebody once told me the world is gonna roll me. I ain't the sharpest tool in the shed. She was looking kind of dumb with her finger and her thumb in the shape of an L on her forehead";

        char[] charactersInString = myStr.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : charactersInString){
            if (charCount.containsKey(c) == true){
                Integer value = charCount.get(c);
                value = value + 1;
                charCount.put(c, value);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Character key : charCount.keySet()) {
            System.out.println(key + " " + charCount.get(key));
        }
    }
}
