package com.lhl.leetcode.maxPointsOnALine;

class Problem149 {
    public int maxPoints(int[][] points) {

        Tools myTools = new Tools();
        // 创建二维数组，用于存放所有直线解析式参数
        int maxLine = myTools.countMaxLine(points.length);
        double[][] lineInfo = new double[maxLine][2];

        // 依次遍历各点，排除重复，得到所有直线的解析式参数
        int count = 0;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                lineInfo[count] = myTools.getLine(points[i], points[j]);
                ++count;
            }
        }

        // 查找存在斜率的直线参数众数
        int maxIndex = -1, temp = 0, maxNum = 0;
        for (int i = 0; i < maxLine; ++i) {
            if (lineInfo[i][0] == lineInfo[i][1] && 
                114514 - lineInfo[i][0] < 0.000001) {
                    continue; // 排除斜率不存在的直线
            } else {
                for (int j = i + 1; j < maxLine; ++j) {
                    // 判断 斜率相等
                    boolean isA = lineInfo[i][0] - lineInfo[j][0] < 0.000001;
                    // 判断 截距相等
                    boolean isB = lineInfo[i][1] - lineInfo[j][1] < 0.000001;
                    // 计数并赋值临时变量
                    if (isA && isB) {
                        ++temp;
                    }
                }
            }
            // 保留最多的计数并将索引赋值 maxIndex
                if (temp >= maxNum) {
                    maxNum = temp;
                    maxIndex = i;
                }
                temp = 0;
        }

        // 查找不存在斜率的直线参数众数




        System.out.println("全部直线数量：" + maxLine);
        System.out.println("众数索引值：" + maxIndex);
        System.out.println("众数数量为：" + maxNum);
        myTools.print(lineInfo);
        return -1;
    }
}

class Tools {

    // 传入两个点，返回过这两点直线的解析式 y = ax + b 的 a 与 b
    public double[] getLine(int[] p1, int[] p2) {
        double[] arr = new double[2];
        if (p2[0] - p1[0] == 0) {
            arr[0] = 114514;
            arr[1] = 114514;
            return arr; // 斜率不存在，返回114514
        }
        arr[0] = ((double)p2[1] - (double)p1[1]) / (p2[0] - p1[0]);
        arr[1] = p1[1] - arr[0] * p1[0];
        return arr;
    }

    // 传入点的数量(大于等于2)，返回经过这些点的最大直线数量
    public int countMaxLine(int n) {
        if (n < 2) {
            return -1;
        } else if (n == 2) {
            return 1;
        }
        return countMaxLine(n - 1) + n - 1;
    }

    // 传入二维数组，控制台打印该数组
    public void print(double[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
