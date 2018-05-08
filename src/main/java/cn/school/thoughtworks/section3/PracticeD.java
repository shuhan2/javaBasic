package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        //统计出collection1中相同的元素的个数，有过有-就把-右边的数字也计算入个数，形成collection3，
        // collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，
        // 然后选出collection3中的元素的key属性跟collection2中value属性对应的list中的元素相同的元素,
        // 把他们的count，满3减1，输出减过之后的新集合
        Map<String,Integer> result = new HashMap<String,Integer>();
        //st:collectionA中的元素
        for (String st :collectionA){
            //一般情况，st.length() == 1
            if(st.length() == 1) {
                if (result.containsKey(st)) {
                    result.put(st, result.get(st) + 1);
                } else {
                    result.put(st, 1);
                }
            }
            //特殊情况 d-5,截取数字,不能用正则;
            else {
                String strvalue = new String();                 //字符
                String strcount = new String();                //出现次数
                int count = 0;
                Boolean flag = false;                          //用于记录出现次数，有可能次数是两位数
                for (int i = 0;i < st.length();i++){
                    if (st.charAt(i) >= 'a'&&st.charAt(i) <='z'||st.charAt(i) >= 'A'&&st.charAt(i) <='Z'){
                        strvalue += (st.charAt(i));
                        break;
                    }
                }
                for (int j = 1; j < st.length(); j++) {
                    if (st.charAt(j) >= '0'&&st.charAt(j) <='9'){
                        strcount +=st.charAt(j);
                        flag = true;
                    }
                    else{
                        if (flag){
                            count = Integer.parseInt(strcount);
                        }

                    }
                }
                count = Integer.parseInt(strcount);
                if (result.containsKey(strvalue)){
                    result.put(strvalue,result.get(strvalue)+count);
                }
                else{
                    result.put(strvalue,count);
                }
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
