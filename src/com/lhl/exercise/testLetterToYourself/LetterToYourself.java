package com.lhl.exercise.testLetterToYourself;

public class LetterToYourself {

    public static void main(String[] args) {

        // 打印一封信
        int row = 11; // 设置信的高（行）
        int col = 70; // 设置信的宽（列）

        // 初始化内容（全为空）
        Text[] texts = new Text[row - 2];
        for (int i = 0; i < texts.length; ++i) {
            texts[i] = new Text();
        }

        // 自定义内容
        // texts[内容行数（0开始）] = new Text("内容", 左边距);
        texts[0] = new Text("#### ", (col - 2 - 5));
        texts[1] = new Text("#### ", (col - 2 - 5));
        texts[2] = new Text("#### ", (col - 2 - 5));
        texts[5] = new Text("ahdiua", 25);
        texts[6] = new Text("Chengdu University of Technology", 25);
        texts[7] = new Text("No. 1, East 3rd Road, Erxianqiao, Chengdu", 25);


        // 打印行
        for (int i = 0; i < row; ++i) {
            // 打印列
            if (i == 0 || i == (row - 1)) { //打印上下边界
                printBoundaries(col);
            } else { // 打印普通行
                print(col, texts[i - 1].str, texts[i - 1].left);
            }
            System.out.println();
        }
    }

    // 打印信的上下边界, 传入宽
    static void printBoundaries(int col) {
        for (int i = 0; i < col; ++i) {
            if (i == 0 || i == (col - 1)) { // 如果为左右顶点
                System.out.print("+");
            } else { // 否则为横线
                System.out.print("-");
            }
        }
    }

    // 打印普通行, 传入宽、要输入的字符(可以为空)、字符左边距
    static void print(int col, String str, int left) {
        System.out.print("|"); // 左边框
        for (int i = 0; i < left; ++i) { // 左边距
            System.out.print(" ");
        }
        System.out.print(str); // 文本
        int right = col - 2 - left - str.length(); // 计算右边距
        for (int i = 0; i < right; ++i) { // 右边距
            System.out.print(" ");
        }
        System.out.print("|"); // 右边框
    }
}

// 定义文本类
class Text {
    String str = ""; // 内容
    int left = 0; // 左边距

    public Text() {
    }

    public Text(String str, int left) {
        this.str = str;
        this.left = left;
    }
}