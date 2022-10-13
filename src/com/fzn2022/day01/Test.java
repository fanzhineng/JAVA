package com.fzn2022.day01;

import java.util.Scanner;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-13 17:17
 **/
public class Test {
    public static void main(String[] args) {
        int n;
        int d = 0,i,j,c,k;
        int[] a = new int[100];
        int[] b = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.printf("a[0]-a[%d]\n",n-1);
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        for (j=n-1;j>0;j--) {
            if (a[j]>a[j-1]) {
                d=a[j-1];
                break;
            }
        }
        for (i=n-1;i>=j;i--) {
            if (a[i] > d) {
                c=a[i];a[j-1]=c;a[i]=d;
                break;
            }
        }
        for(k=j;k<n;k++)
            b[n-k+j-1]=a[k];
        for(k=j;k<n;k++)
            a[k]=b[k];
        for(i=0;i<n;i++)
            System.out.printf("%d ",a[i]);
    }
}