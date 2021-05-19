package bai11_stack_queue.bai_tap.map_count_words_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountInWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi: ");
        String string = "toi La Trinh Van HUy toi la huy";
        String [] ArrStr = string.split(" ");
        Map<String,Integer> map = new TreeMap<String,Integer>();

        for (String str : ArrStr){
            str = str.toLowerCase();
            if(str.equals("")){
                continue;
            }

            if (map.containsKey(str)){
                int value = map.get(str)+1;
                map.put(str,value);
            } else
                map.put(str,1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}