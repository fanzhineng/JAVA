package com.fzn2022.day01;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-12 20:06
 **/
public class TestVersion {
    public static void main(String[] args) {
        String v1 = "0.1.2.aa";
        String v2 = "0.1.1";
        System.out.println(compareVersion(v1, v2));
    }
    public static int compareVersion(String version1, String version2) {
        // write code here
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        boolean sNum1 = isNUmber(split1[split1.length - 1]);
        boolean sNum2 = isNUmber(split2[split2.length - 1]);
        // 都是数字 或者 都是字符
        if ((sNum1&&sNum2) || (!sNum1&&!sNum2)){
            // 长度大于s2
            for (int i = 0; i < split1.length; i++) {
                if(Integer.parseInt(split1[i]) > Integer.parseInt(split2[i])){
                    return 1;
                }else if(Integer.parseInt(split1[i]) < Integer.parseInt(split2[i])){
                    return -1;
                }
            }
        }else {
            // 一个含有字符
            int s1 = split1.length;
            int s2 = split1.length;
            if (s1>s2){
                for (int i = 0; i < split1.length-1; i++) {
                    if(Integer.parseInt(split1[i]) > Integer.parseInt(split2[i])){
                        return 1;
                    }else if(Integer.parseInt(split1[i]) < Integer.parseInt(split2[i])){
                        return -1;
                    }
                }
            }else {
                for (int i = 0; i < split2.length-1; i++) {
                    if(Integer.parseInt(split1[i]) > Integer.parseInt(split2[i])){
                        return 1;
                    }else if(Integer.parseInt(split1[i]) < Integer.parseInt(split2[i])){
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
    public static boolean isNUmber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()){
            return false;
        }
        return true;
    }
}