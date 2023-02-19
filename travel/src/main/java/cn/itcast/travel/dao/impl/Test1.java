package cn.itcast.travel.dao.impl;

public class Test1 {
    public static void main(String[] args) {
        byte b = 99;
        System.out.println("b = " + b);
        String s2 = "金三胖好厉害";
        System.out.println(s2.substring(2));
        String s = s2.replace("金三胖", "***");
        System.out.println("s = " + s);
        System.out.println(s2.contains("金三胖"));
        System.out.println(s2.startsWith("金三胖1"));

        String s3 = "王宝强，谢霆锋，贾乃亮";
        String[] names = s3.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了 ："+names[i]);
            System.out.println("\n");
            System.out.println("\t");
        }

    }
}
