package com.lhl.leetcode.maxPointsOnALine;

public class Solution {

    public static void main(String[] args) {
        // int[][] points = {{1,1},{2,2},{3,3}};
        // int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[][] points = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {2, 0}, {3, 1}};
        // int[][] points = {{7, 3}, {19, 19}, {-16, 3}, {13, 17}, {-18, 1}, {-18, -17}, {13, -3}, {3, 7}, {-11, 12}, {7, 19}, {19, -12}, {20, -18}, {-16, -15}, {-10, -15}, {-16, -18}, {-14, -1}, {18, 10}, {-13, 8}, {7, -5}, {-4, -9}, {-11, 2}, {-9, -9}, {-5, -16}, {10, 14}, {-3, 4}, {1, -20}, {2, 16}, {0, 14}, {-14, 5}, {15, -11}, {3, 11}, {11, -10}, {-1, -7}, {16, 7}, {1, -11}, {-8, -3}, {1, -6}, {19, 7}, {3, 6}, {-1, -2}, {7, -3}, {-6, -8}, {7, 1}, {-15, 12}, {-17, 9}, {19, -9}, {1, 0}, {9, -10}, {6, 20}, {-12, -4}, {-16, -17}, {14, 3}, {0, -1}, {-18, 9}, {-15, 15}, {-3, -15}, {-5, 20}, {15, -14}, {9, -17}, {10, -14}, {-7, -11}, {14, 9}, {1, -1}, {15, 12}, {-5, -1}, {-17, -5}, {15, -2}, {-12, 11}, {19, -18}, {8, 7}, {-5, -3}, {-17, -1}, {-18, 13}, {15, -3}, {4, 18}, {-14, -15}, {15, 8}, {-18, -12}, {-15, 19}, {-9, 16}, {-9, 14}, {-12, -14}, {-2, -20}, {-3, -13}, {10, -7}, {-2, -10}, {9, 10}, {-1, 7}, {-17, -6}, {-15, 20}, {5, -17}, {6, -6}, {-11, -8}};

        System.out.println(new Solution().maxPoints(points));
    }

    public int maxPoints(int[][] points) {

        int n = points.length;
        int countLine = countMaxLine(n);

        if (n == 1 || n == 2) return n; // 排除特例

        double[][] lines = new double[countLine][2]; // [0]:deg [1]:dis (参数方程的角度和距离)

        // 将所有直线的参数存入上述数组
        int index = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                lines[index] = getLine(points[i][0], points[i][1], points[j][0], points[j][1]);
                ++index;
            }
        }
        print(lines);

        // 为直线们进行计数，counts的内容是 第 index 根直线出现的次数
        int[][] counts = new int[countLine][2];
        for (int i = 0; i < countLine; ++i) {
            counts[i][0] = -1;
            counts[i][1] = 0;
        }
        // 外层循环，遍历一遍 lines
        for (int i = 0; i < countLine; ++i) {
            // 内层循环，遍历 counts ，是放后面还是累加
            for (int j = 0; j < countLine; ++j) {
                if (counts[j][0] == -1) { // 直接放索引进去，计数定为1
                    counts[j][0] = i;
                    counts[j][1] = 1;
                    break;
                }
                if (lines[counts[j][0]][0] == lines[i][0] && lines[counts[j][0]][1] == lines[i][1]) {
                    // 相同直线，计数加一
                    ++counts[j][1];
                    break;
                }
            }
        }
        print(counts);

        // 找到最大直线数量
        int maxCount = 0; // 最大共线点的数量
        for (int i = 0; i < countLine; ++i) {
            maxCount = Math.max(maxCount, counts[i][1]);
        }

        // 根据数量反推几个点
        int num = 2;
        while (true) {
            if (maxCount == countMaxLine(num)) return num;
            ++num;
        }
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

    // 传入两点直角坐标，返回这两点所在直线的deg和dis
    public double[] getLine(int x1, int y1, int x2, int y2) {

        double[] line = new double[2]; // deg & dis

        // 如果斜率不存在（垂直x轴）
        if (x1 == x2) {
            line[0] = 0;
            line[1] = x1;
            return line;
        }

        // 斜率存在
        double k = ((double) y2 - y1) / (x2 - x1);
        double b = ((double) x1 * y2 - x2 * y1) / (x1 - x2);
        line[0] = Math.toDegrees(Math.atan(-1 / k));
        line[1] = Math.abs(b) / Math.sqrt(k * k + 1);
        return line;
    }

    // 打印机
    public void print(double[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(i + 1 + ":\t" + arr[i][j] + "\t\t\t\t\t\t");
            }
            System.out.println();
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(i + 1 + ":\t" + arr[i][j] + "\t\t\t\t\t\t");
            }
            System.out.println();
        }
    }
}
