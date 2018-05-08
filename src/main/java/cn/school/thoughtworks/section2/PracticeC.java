package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
//把1集合中相同的元素统计出数量

        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String str :collection1){
            //一般情况
            if (str.length() == 1){
                if (result.containsKey(str)){
                    result.put(str,result.get(str)+1);
                }
                else{
                    result.put(str,1);
                }
            }
            //长度不为1的特殊情况，用正则表达式截取其中的数字
            else {
                String strvalue = new String();                 //字符
                String strcount = new String();                //出现次数
                int count = 0;
                Boolean flag = false;                          //用于记录出现次数，有可能次数是两位数
                for (int i = 0;i < str.length();i++){
                    if (str.charAt(i) >= 'a'&&str.charAt(i) <='z'||str.charAt(i) >= 'A'&&str.charAt(i) <='Z'){
                        strvalue += (str.charAt(i));
                        break;
                    }
                }
                for (int j = 1; j < str.length(); j++) {
                    if (str.charAt(j) >= '0'&&str.charAt(j) <='9'){
                        strcount +=str.charAt(j);
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
        return result;
    }
}
