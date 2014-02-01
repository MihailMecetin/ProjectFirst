package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World!");
        fibonacci();
        KvadrUravn(2,7,3);
        ArraySort();
    }
    public static void fibonacci() {
        int f1=1,f2=1,fn=0;
        System.out.print(f1+" "+f2);
        while(fn<100){
            fn=f1+f2;
            f1=f2;
            f2=fn;
            System.out.print(" "+f2);
        }
        System.out.println();
    }
    public static void KvadrUravn(float a,float b,float c){
        float D,ans1,ans2;
        D=(b*b)-4*a*c;
        System.out.println("a="+a+" b="+b+" c="+c);
        if(D<0){
            System.out.println("Kornej Net");
        }
        else if(D==0){
            ans1=-b/(2*a);
            System.out.println("Answer ="+ans1);
        }
        else {
            ans1=(-b + (float)Math.sqrt(D)) / (2*a);
            ans2=(-b - (float)Math.sqrt(D)) / (2*a);
            System.out.println("Answer1 ="+ans1+" Answer2 ="+ans2);
        }
    }
    public static void ArraySort(){
        int[] a;
        int i,j;
        int max=0,maxn=0,temp=0;
        a = new int[20];
        for(i=0;i<20;++i){
            a[i]=(int)(Math.random()*50);
        }
        for(i=0;i<20;++i){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        for(i=19;i>0;--i){
            for(j=0;j<i+1;++j){
               if(a[j]>max){
                   max=a[j];
                   maxn=j;
               }
            }
            temp=a[i];
            a[i]=a[maxn];
            a[maxn]=temp;
            max=0;
        }


        for(i=0;i<20;++i){
            System.out.print(a[i]+" ");
        }


    }
}
