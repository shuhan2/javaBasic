package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        //把1集合中相同的元素统计出数量
        // collection1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String,Long> map = collection1.stream().collect(Collectors.groupingBy(Function.identity(),(Collectors.counting())));
        Map<String,Integer> result = new HashMap<>();
        for (String s : map.keySet()){
            int n = map.get(s).intValue();
            result.put(s,n);
        };
        return result;
    }
}
