# Leetcode 力扣刷题

虽然是刚开始学，但是，轻车熟路基于练，动手不能停下啊！



## 力扣题库

### 1. 两数之和 [https://leetcode.cn/problems/two-sum/](https://leetcode.cn/problems/two-sum/)

给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

My code: [twoSum/](twoSum/)



### 4. 寻找两个正序数组的中位数 [https://leetcode.cn/problems/median-of-two-sorted-arrays/](https://leetcode.cn/problems/median-of-two-sorted-arrays/)

给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

算法的时间复杂度应该为 O(log (m+n)) 。

My code: [medianOfTwoSortedArrays/](medianOfTwoSortedArrays/)



### 27. 移除元素 [https://leetcode.cn/problems/remove-element/](https://leetcode.cn/problems/remove-element/)

给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

My code: [removeElement/](removeElement/)



### 50. Pow(x, n) [https://leetcode.cn/problems/powx-n/](https://leetcode.cn/problems/powx-n/)

实现 [pow(*x*, *n*)](https://www.cplusplus.com/reference/valarray/pow/) ，即计算 `x` 的整数 `n` 次幂函数（即，`xn` ）。

My code: [powxN/](powxN/)



### 149. 直线上最多的点数 [https://leetcode.cn/problems/max-points-on-a-line/](https://leetcode.cn/problems/max-points-on-a-line/)

给你一个数组 `points` ，其中 `points[i] = [xi, yi]` 表示 **X-Y** 平面上的一个点。求最多有多少个点在同一条直线上。

My code: [max-points-on-a-line/](max-points-on-a-line/)

备注：本题花了一定的时间，原设想通过求所有存在的直线的解析式然后找最多重复进行判断，受碍于垂直于x轴直线不存在斜率，暂时告了一段落（见代码 [max-points-on-a-line/Problem149.java](max-points-on-a-line/Problem149.java)）。在学习计算机视觉的 [哈夫变换（hough）](https://github.com/wifi504/Computer-Vision/tree/master/src/houghTransform) 时，实现点-线对偶性时使用了极坐标参数方程巧妙解决了这个问题，现使用新思路实现此题解。



### 459. 重复的子字符串 [https://leetcode.cn/problems/repeated-substring-pattern/](https://leetcode.cn/problems/repeated-substring-pattern/)

给定一个非空的字符串 `s` ，检查是否可以通过由它的一个子串重复多次构成。

My code: [repeatedSubstringPattern/](repeatedSubstringPattern/)

备注：本题想了很久，算法总是解答错误，看了这篇题解恍然大悟。[简单明了！！关于java两行代码实现的思路来源](https://leetcode.cn/problems/repeated-substring-pattern/solution/jian-dan-ming-liao-guan-yu-javaliang-xing-dai-ma-s/)



### 1590. 使数组和能被 P 整除 [https://leetcode.cn/problems/make-sum-divisible-by-p/](https://leetcode.cn/problems/make-sum-divisible-by-p/)

给你一个正整数数组 nums，请你移除 最短 子数组（可以为 空），使得剩余元素的 和 能被 p 整除。 不允许 将整个数组都移除。

请你返回你需要移除的最短子数组的长度，如果无法满足题目要求，返回 -1 。

子数组 定义为原数组中连续的一组元素。

My code: [makeSumDivisibleByP/](makeSumDivisibleByP/)



### 1894. 找到需要补充粉笔的学生编号 [https://leetcode.cn/problems/find-the-student-that-will-replace-the-chalk/](https://leetcode.cn/problems/find-the-student-that-will-replace-the-chalk/)

一个班级里有 n 个学生，编号为 0 到 n - 1 。每个学生会依次回答问题，编号为 0 的学生先回答，然后是编号为 1 的学生，以此类推，直到编号为 n - 1 的学生，然后老师会重复这个过程，重新从编号为 0 的学生开始回答问题。

给你一个长度为 n 且下标从 0 开始的整数数组 chalk 和一个整数 k 。一开始粉笔盒里总共有 k 支粉笔。当编号为 i 的学生回答问题时，他会消耗 chalk[i] 支粉笔。如果剩余粉笔数量 严格小于 chalk[i] ，那么学生 i 需要 补充 粉笔。

请你返回需要 补充 粉笔的学生 编号 。

My code: [findTheStudentThatWillReplaceTheChalk/](findTheStudentThatWillReplaceTheChalk/)



### 2363. 合并相似的物品 [https://leetcode.cn/problems/merge-similar-items/](https://leetcode.cn/problems/merge-similar-items/)

给你两个二维整数数组 items1 和 items2 ，表示两个物品集合。每个数组 items 有以下特质：

items[i] = [valuei, weighti] 其中 valuei 表示第 i 件物品的 价值 ，weighti 表示第 i 件物品的 重量 。
items 中每件物品的价值都是 唯一的 。
请你返回一个二维数组 ret，其中 ret[i] = [valuei, weighti]， weighti 是所有价值为 valuei 物品的 重量之和 。

注意：ret 应该按价值 升序 排序后返回。

My code: [mergeSimilarItems/](mergeSimilarItems/)



### 2379. 得到 K 个黑块的最少涂色次数 [https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/](https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/)

给你一个长度为 n 下标从 0 开始的字符串 blocks ，blocks[i] 要么是 'W' 要么是 'B' ，表示第 i 块的颜色。字符 'W' 和 'B' 分别表示白色和黑色。

给你一个整数 k ，表示想要 连续 黑色块的数目。

每一次操作中，你可以选择一个白色块将它 涂成 黑色块。

请你返回至少出现 一次 连续 k 个黑色块的 最少 操作次数。

My code: [minimumRecolorsToGetKConsecutiveBlackBlocks/](minimumRecolorsToGetKConsecutiveBlackBlocks/)



### 剑指 Offer 47. 礼物的最大价值 [https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/](https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/)

在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？

My code: [liWuDeZuiDaJieZhiIcof/](liWuDeZuiDaJieZhiIcof/)



### 面试题 17.05.  字母与数字 [https://leetcode.cn/problems/find-longest-subarray-lcci/](https://leetcode.cn/problems/find-longest-subarray-lcci/)

给定一个放有字母和数字的数组，找到最长的子数组，且包含的字母和数字的个数相同。

返回该子数组，若存在多个最长子数组，返回左端点下标值最小的子数组。若不存在这样的数组，返回一个空数组。

My code: [findLongestSubarrayLcci/](findLongestSubarrayLcci/)
