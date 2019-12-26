package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

//        TODO implements result
        String temp;
        for (int i = 0; i < list.size()/2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
        return list;
    }

    public String getLongestString(List<String> list) {

//        TODO implements result
        String result = "";

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(temp).length() < list.get(i).length()) {
                temp = i;
            }
        }
        result = list.get(temp);
        return result;
    }

    public List<String> changeIndex(List<String> list) {

//        TODO implements result
        String temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

//        TODO implements result
        List<String> result = new ArrayList<>();
        result.add(list.get(0));
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < result.size(); j++) {
                if (list.get(i).equals(result.get(j))) {count++;}
                }
            if (count == 0){result.add(list.get(i));}
        }
        return result;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result
        String temp;
        for (int i = 0; i < list.size(); i++) {
        for (int j = 0; j < list.size()-1; j++) {
        if (list.get(j).length()>list.get(j+1).length()){
            temp = list.get(j);
            list.set(j, list.get(j+1));
            list.set(j+1, temp);
        }
        }
        }
        return list;
    }
}
