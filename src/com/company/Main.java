package com.company;

import com.sun.javafx.geom.Crossings;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.security.x509.AVA;

import java.util.Arrays;
import java.util.Random;

//Task 1
public class Main {

    public static void main(String[] args) {
        final int size = 25;
        int[] a = new int [size];
        for (int i = 0; i < size; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        Arr(a);

        System.out.println(Arrays.toString(a));
    }
    public static void Arr(int[] a){
        int min=0,max=0;
        boolean t=true;
        for (int i = 0; i < a.length; i++) {
            if(t){
                min=a[i];
                max=a[i];
                t=false;
            }
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]==min){
                a[i]=max;
            }
            else {
                if(a[i]==max){
                    a[i]=min;
                }}
        }
    }
}
///////////////////////////
//Task 2
/*public class Main {

    public static void main(String[] args) {
        final int size = 10;
        int[] b= new int[size];
       Random r= new Random();
        for (int i = 0; i < size; i++) {
            b[i]=r.nextInt();
        }
        System.out.println(Arrays.toString(b));
        Queue(b);
        System.out.println(Arrays.toString(b));
    }
    public static void Queue(int[] b){
        int temp = 0;
        for (int j = 0; j <b.length-1 ; j++) {
        for (int i = 0; i <b.length-1 ; i++) {
            if(b[i]>b[i+1]){
                temp=b[i];
                b[i]=b[i+1];
                b[i+1]=temp;
            }
        }}
    }
    }*/
//////////////////////
//Task 3
/*public class Main {
    public static void main(String[] args) {
        System.out.println(Avarage());
    }
    public static int Avarage(){
        int e=0;
        final int size = 21;
        int[] c = new int [size];
        for (int i = 0; i < size; i++) {
            c[i]=i;
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < size; i++) {
            e+=c[i];
        }
        e=e/20;
        return e;
    }
    }*/
////////////////////////
//Task 4
/*public class Main {
    public static int a;
    public static int b;
    public static void main(String[] args) {
        EvenOdd();
        System.out.println("Сумма четных элементов массива: " + a + "\n" + "Сумма нечетных элементов массива: " + b);
    }
    public static void EvenOdd() {
        final int size = 31;
        int[] c = new int [size];
        for (int i = 0; i < size; i++) {
            c[i]=i;
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < size; i++) {
            if(c[i]!=0) {
                if (c[i] % 2 == 0) {
                    a++;
                } else {
                    b++;
                }
            }
        }
    }
}*/
//////////////////////////
//Task 5
/*public class Main {
    public static void main(String[] args) {
        int[][] c = new int [3][5];
        Random r= new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                c[i][j]=r.nextInt(10);
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
//////////////////////////
//Task 6
/*public class Main {
    public static int min=0;
    public static int max=0;

    public static void main(String[] args) {
        final int size = 25;
        int[] a = new int [size];
        for (int i = 0; i < size; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        Arr(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Максимальный элемент в массиве равен: " + MaxX());
    }
    public static void Arr(int[] a){
        boolean t=true;
        for (int i = 0; i < a.length; i++) {
            if(t){
                min=a[i];
                max=a[i];
                t=false;
            }
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]==min){
                a[i]=max;
            }
            else {
                if(a[i]==max){
                    a[i]=min;
                }}
        }
    }
    public static int MaxX(){
        return max;
    }
}*/
//////////////////////////
//Task 7
/*public class Main {
    public static void main(String[] args) {
        String s1="str", s2="strp", s3="stru", s4="strl", s5="strl";
        if(s4.equals(s5)){
            System.out.println(s1+s2);
        }else{
            System.out.println(s1+s3);
        }
        }
    }*/