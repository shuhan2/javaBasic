package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        //统计出collection1中相同的元素的个数，形成collection3，collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，
        // 然后选出collection3跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        Map<String,Integer> result = new HashMap<String,Integer>();
        for (String st :collectionA){
            if (result.containsKey(st)){
                result.put(st,result.get(st)+1);
            }
            else {
                result.put(st,1);
            }
        }
        List<String> list2 = new ArrayList();
        int diff = 0;               //满3减1
        for (String string :object.get("value")){
            list2.add(string);
        }
        for (String str :list2){
            if (result.containsKey(str)){
                diff = result.get(str)/3;
                result.put(str,result.get(str)-diff);
            }
        }
        return result;
    }
}
