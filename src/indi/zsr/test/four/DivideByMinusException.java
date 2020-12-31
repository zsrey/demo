package indi.zsr.test.four;

//自定义异常类
public class DivideByMinusException extends  Exception
{
    public  DivideByMinusException(){
        super();
    }

    public  DivideByMinusException(String message){
        super(message);
    }
}
