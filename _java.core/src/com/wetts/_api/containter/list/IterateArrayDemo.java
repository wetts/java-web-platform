package com.wetts._api.containter.list;

import java.util.*;

/**
 * 数组遍历
 *
 * @author wetts
 * @version 1.0, 2016/08/26
 */
public class IterateArrayDemo {

    public static void main(String[] args) {
        List<Map<String, Integer>> list = new ArrayList<>();
        List<Map<String, Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String, Integer> m = new HashMap<>();
            m.put("k", i);
            list.add(m);
        }
        System.out.println(list);

        Iterator<Map<String, Integer>> i = list.iterator();
        while(i.hasNext()) {
            Map<String, Integer> m = i.next();
            if(m.get("k") % 2 == 0) {
                list2.add(m);
                i.remove();
            }
        }
        list2.addAll(list);

        System.out.println(list2);
    }

}
