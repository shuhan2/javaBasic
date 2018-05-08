package cn.school.thoughtworks.section1;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        //选出1集合中与2集合中子数组的元素相同的元素
        return collection1.stream().filter(item -> collection2.contains(item)).collect(toList());
    }
}
