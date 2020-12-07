/**
 * Java中的数据类型
 */
public class InitTest_02 {
    public static void main(String[] args){
        //整数类型(byte、short、int、long)
        byte b1=12;
        byte b2=-128;
        // 超出数据类型范围
        // byte b3=1279;
        System.out.println(b1);
        System.out.println(b2);
        // long类型变量,变量值后必须加'L'
        short s1=128;
        int i1=12345;
        long l1=12346679L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println("------------------");

        // 浮点类型(float、double)
        double d1=213.3;
        System.out.println(d1+1);
        // long类型变量,变量值后必须加'F'
        float f1=12.3F;
        System.out.println(f1);
        System.out.println("------------------");

        //  字符型(char)
        char c1='\n';
        char c2='a';
        char c3='1';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("------------------");

        // 布尔型(boolean)
        boolean bb1=true;
        System.out.println(bb1);
        System.out.println("------------------");

        // 数据类型间的相互转换
        byte bt=2;
        int it=128;
        int bi=bt+it;
        long lt=bt+it;
        System.out.println(bi);
        System.out.println(lt);
        // 强制类型转换
        double db=12.3;
        int it1=(int)db;
        System.out.println(it1);
        int it2=129;
        byte b=(byte) it2;
        System.out.println(b);
    }

}
