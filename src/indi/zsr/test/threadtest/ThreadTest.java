package indi.zsr.test.threadtest;

import static java.lang.Thread.sleep;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        //获取当前线程
        //Thread thread =Thread.currentThread();
        //获取线程名字
        //System.out.println(thread.getName());
        //设置线程名字
        //thread.setName("hello");

        //线程1
        Thread t1 = new MyThread1();

        //线程2
        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);

        t1.start();

        //main线程
//        for(int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+":"+i);
//            if(i==3){
//                t1.join(); //main线程正在执行时（执行到i=3时），th1强制抢夺执行
//                Thread.yield();//主动礼让给其他线程，并不一定百分百执行
//            }
//        }

        t2.start();
        //Thread.sleep(2000);
        //t2.run();

    }
}
//继承自Thread类创建线程类

class MyThread1 extends Thread {

    private int i = 0;

    //无参构造方法，调用父类构造方法设置线程名称

    public MyThread1() {

        super("T1");

    }

    //通过循环判断，输出10次，每次间隔0.5秒

    public void run() {

        try {

            while (i < 10) {

                System.out.println(this.getName() + ": " + (i + 1));

                i++;

                //在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）

                //sleep(500);

                if (i == 3) {
                    //this.join(); //main线程正在执行时（执行到i=3时），th1强制抢夺执行
                    Thread.yield();//主动礼让给其他线程，并不一定百分百执行
                    System.out.println("礼让");
                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

//实现Runnable接口创建线程类

class MyThread2 implements Runnable {

    String name = "T2";

    private int i = 0;

    public void run() {

        try {
            while (i < 10) {

                System.out.println(name + ":" + (i + 1));

                i++;

                //在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）


                sleep(500);


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}