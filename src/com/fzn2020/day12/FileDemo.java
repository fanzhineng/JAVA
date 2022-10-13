package com.fzn2020.day12;

import java.io.File;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 15:46
 **/
public class FileDemo {
    //IOException io异常
    public static void main(String[] args) throws IOException {
        //创建一个文件
        String fileName = "F:"+ File.separator+"sun20.txt";
        File f = new File(fileName);
        /*
        if (f.createNewFile()){//如果存在
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }

        if (f.exists()){//判断f 对应的文件名的文件在不在
            f.delete();//删除
        }
         */

        String fa = "F:"+File.separator+"sunf";
        File f1 = new File(fa);//放到File实例中来
        /*
        if (!f1.exists()){//如果不存在就创建
            f1.mkdir();//创建文件夹
        }
         */
        if (f1.exists()){//判断f 对应的文件名的文件在不在
            f1.delete();//删除
        }
    }
}
