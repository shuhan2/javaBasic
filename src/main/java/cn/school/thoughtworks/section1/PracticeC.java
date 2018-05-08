package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        //选出1集合中与2集合中子数组的元素相同的元素s
        return collection1.stream().filter(item -> {for(List<String> value : collection2.values()){return value.contains(item);}return false;}).collect(toList());

    }
}
