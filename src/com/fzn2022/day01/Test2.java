package com.fzn2022.day01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-12 20:56
 **/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('S',0);
        map1.put('H',1);
        map1.put('C',2);
        map1.put('D',3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("J",10);
        map2.put("Q",11);
        map2.put("K",12);
        map2.put("A",0);
        int[][] hd_count = new int[4][13];
        int[] h_count = new int[4];
        int[] d_count = new int[13];

        for (int n = 0; n < N; ++n) {
            String s = sc.next();
            Integer i = map1.get(s.charAt(0));
            String dian = s.substring(1);
            Integer j = map2.get(dian);
            if (j == null){
                j = Integer.valueOf(dian) - 1;
            }
            hd_count[i][j]++;
            h_count[i]++;
            d_count[j]++;
        }
        for (int i = 0; i < 4; ++i) {
            int j = 9;
            for (; j < 13; ++j) {
                if (hd_count[i][j] == 0){
                    break;
                }
            }
            if (j == 13 && hd_count[i][j] >0){
                System.out.println("HuangJiaTongHuaShun");
                return;
            }
        }
        for (int i = 0; i < 4; ++i) {
            int count =0;
            for (int j = 0; j < 13; ++j) {
                if (hd_count[i][j] > 0){
                    count++;
                }else {
                    if (count>5){
                        System.out.println("TongHuaShun");
                        return;
                    }else {
                        count = 0;
                    }
                }
            }
        }
        Map<Integer, Integer> cmap = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            int count = cmap.getOrDefault(d_count[i],0);
            cmap.put(d_count[i],count+1);
        }
        if (cmap.containsKey(4)){
            System.out.println("SiTiao");
            return;
        }
        if (cmap.containsKey(3) && cmap.containsKey(2)){
            System.out.println("HuLu");
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (h_count[i] >= 5){
                System.out.println("TongHua");
                return;
            }
        }
        int count = 0;
        for (int i = 0; i < 13; i++) {
            if (d_count[i]>0) count++;
            else {
                if (count>=5){
                    System.out.println("ShunZi");
                    return;
                }else {
                    count=0;
                }
            }
        }
        if (!cmap.containsKey(3)){
            System.out.println("SanTiao");
            return;
        }
        if (cmap.get(2) >= 2){
            System.out.println("LiangDui");
            return;
        }
        if (cmap.get(2) == 1){
            System.out.println("YiDui");
            return;
        }
        System.out.println("GaoPai");
    }
}