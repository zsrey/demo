package indi.zsr.test.four;

//类名引用静态方法
@FunctionalInterface
interface  Cal{
    int calc(int num);
}
//定义一个类，并在类中定义静态方法
class Math{
    //定义一个求绝对值的方法
    public static int abs (int num){
        if(num<0){
            return -num;
        }else{
            return num;
        }
    }
}

public class Example24 {
    private static  void printAbs(int num,Cal cal){
        System.out.println(cal.calc(num));
    }

    public static void main(String[] args) {
        //使用lambda表达式
        printAbs(-10, n->Math.abs(n));
        //正常输出
        printAbs(-10, n->n);
        //正常实现
        printAbs(-10, new Cal() {
            @Override
            public int calc(int num) {
                return Math.abs(num);
            }
        });
        //使用方法引用的方式
        printAbs(-10,Math::abs);
    }


}
