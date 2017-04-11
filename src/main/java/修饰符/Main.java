package 修饰符;
import ClassA.CalssA;

/**
 * Created by mrlee on 2017/4/11.
 */
/*
 *Java语言提供了很多修饰符，主要分为以下两类：
 * 访问修饰符
 * 非访问修饰符
 */
/*
 *Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java支持4种不同的访问权限。
 * 默认的，也称为 default，在同一包内可见，不使用任何修饰符。
 * 私有的，以 private 修饰符指定，在同一类内可见。
 * 共有的，以 public 修饰符指定，对所有类可见。
 * 受保护的，以 protected 修饰符指定，对同一包内的类和所有子类可见。
 * 我们可以可以通过以下表来说明访问权限：
 * 访问控制符:private public protected default
* */
public class Main
{
    //修饰符用来定义类、方法或者变量，通常放在语句的最前端。我们通过下面的例子来说明：
    private boolean myFlag;
    static final double weeks = 10.5;
    protected final  static  int MAX = 10;
    private String str;

    public static void main(String []args){
        System.out.println("修饰符的学习");
        CalssA a = new CalssA();
        System.out.println("a is value:" + a.getStr());
        a.getStr();

    }
    /*
    *    私有访问修饰符-private
    *    私有访问修饰符是最严格的访问级别，所以被声明为 private 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 private。
    *    声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
    *    Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。
    *    下面的类使用了私有访问修饰符：
    *
    * */

}
//public class CalssA {
//
//}

