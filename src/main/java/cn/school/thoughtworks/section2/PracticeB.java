package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        //把1集合中相同的元素统计出数量
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String str : collection1){
//            字符长度为1，和上一题一样
            if(str.length() == 1){
                if (result.containsKey(str)){
                    result.put(str,result.get(str)+1);
                }
                else{
                    result.put(str,1);
                }
            }
            //字符长度不为1(eg:d-5),需要用到字符串截取
            else{
                String strvalue = str.substring(0,1);
                int strcount = Integer.parseInt(str.substring(str.length()-1,str.length()));
                if (result.containsKey(strvalue)){
                    result.put(strvalue,result.get(strvalue)+strcount);
                }
                else{
                    result.put(strvalue,strcount);
                }
            }
        }
        return result;
    }
}
