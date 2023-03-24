package com.lhl.javaCode;

public class RandomTest {

    public static void main(String[] args) {

        //设置总循环次数
        int loopNum = 100;
        //设置试验初始次数
        int firstNum = 1;
        //试验次数指数
        int index = 5;


        for (int i0 = 0; i0 <= loopNum; i0++) {
            
            //计算试验次数
            int testNum = (int)Math.pow(firstNum, index);
            double x = 0;

            for (int i = 0; i <= testNum; i++ ) {
                //初始化加了0次
                int num = 0;

                //初始化和为0
                double addNum = 0.0;

                //当和小于等于1或加了100次仍小于等于一时退出循环
                while (addNum <= 1.0 && num < 100) {
                    //取0~1之间随机数加到addNum上
                    addNum += Math.random();
                    //计次
                    num++;
                }
                x += num;
                //输出运行结果
                //System.out.println("次数：" + num);
            }
            //输出平均数
            System.out.println("总共测试了" + testNum + "次，平均次数：" + (x / testNum));
            firstNum +=1;
        }
    }
}
