package com.lhl.javaCode;

public class RandomTest2 {

    public static void main(String[] args) {

        // 设置总循环次数
        int loopNum = 100;
        // 设置试验初始次数
        int firstNum = 1;
        // 试验次数指数
        int index = 5;

        // 计算试验次数
        int testNum = (int) Math.pow(firstNum, index);

        for (int i0 = 0; i0 <= loopNum; i0++) {

            double x = 0;
            int num = 0;
            double addNum = 0.0;

            while (num < testNum) {
                // 取0~1之间随机数加到addNum上
                addNum += Math.random();
                // 计次
                num++;

                if (addNum > 1.0) {
                    x += num;
                    num = 0;
                    addNum = 0.0;
                }
            }

            // 输出平均数
            System.out.println("总共测试了" + testNum + "次，平均次数：" + (x / testNum));

            firstNum += 1;
            testNum = (int) Math.pow(firstNum, index);
        }
    }
}
