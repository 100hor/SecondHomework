package org.example;

import java.util.ArrayList;

public class LongestSubString {
    public int lengthOfLongestSubstring(String mainString) {

        char [] charmainString = mainString.toCharArray();
        ArrayList<Character> tempSubString = new ArrayList<>();
        ArrayList<Character> subString = new ArrayList<>();

        subString.add(charmainString[0]);

        for (int i = 0; i < charmainString.length; i++) {
            tempSubString.add(charmainString[i]);
            for (int j = i + 1; j < charmainString.length; j++) {
                boolean ifCharExistInSubString = false;
                for (int k = 0; k < tempSubString.size(); k++) {
                    if (tempSubString.get(k) == charmainString[j]) {
                        ifCharExistInSubString = true;
                        break;
                    }
                }
                if(ifCharExistInSubString){
                    tempSubString.clear();
                    break;
                }
                tempSubString.add(charmainString[j]);
                if (tempSubString.size() > subString.size()){
                    subString.clear();
                    subString.addAll(tempSubString);
                }


            }


        }

        System.out.println(subString.toString());

        return subString.size();

    }
}
