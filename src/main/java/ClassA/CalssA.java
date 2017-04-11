package ClassA;

/**
 * Created by mrlee on 2017/4/11.
 */
public class CalssA {
    private String str;
    public CalssA(){
        System.out.println("创建Calssa");
    }
    public String getStr(){
        str = "我是一个私有修饰符的变量";
        return  str;
    }
}
