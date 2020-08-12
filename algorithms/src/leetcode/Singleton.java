package leetcode;

/**
 * @description: 单例模式的实现
 * @author: liuzhi
 * @Date: 2020-08-12 13:20
 **/
public class Singleton {
    private static class SingletonHolder{
        private static Singleton Instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.Instance;
    }
    private Singleton() {

    }
}
