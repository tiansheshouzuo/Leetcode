# Leetcode
2019.1.15
此处用于记录我自己的leetcode刷题之旅，用于练习记录与解题经验总结。

## 热题HOT 100
### 注意：序号代表题号
<br>
1、两数之和
<br>
2、两数相加
<br>
3、无重复字符的最长子串   
<br>
4、寻找两个有序数组的中位数   
<br>
5、最长回文子串  
<br>
10、正则表达式匹配
<br>
11、盛最多水的容器   
<br>
15、三数之和
<br>
17、电话号码的字母组合
<br>
19、删除链表的倒数第N个节点
<br>
20、有效的括号
<br>
21、合并两个有序链表
<br>
22、括号生成
<br>
23、合并K个排序链表
<br>
31、下一个排列
<br>
32、最长有效括号
<br>
这道题目用到了栈来判断括号的有效性，不能采用暴力求解，暴力求解为三重循环，时间复杂度为O（n3），计算超时
<br>
33、搜索旋转数组
当对三个表达式a、b、c判断：三者皆为真或者任意一为真都满足条件时，可以通过异或来表示，即a^b^c。    
<br>
34、在排序数组中查找元素的第一个和最后一个位置    
<br>
二分搜索算法之寻找左侧边界的二分搜索：
<br>
1、循环条件while(left<right)
<br>
int left_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0;
    int right = nums.length; // 注意
    
    while (left < right) { // 注意
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            right = mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid; // 注意
        }
    }
    return left;}
<br>
二分搜索算法之寻找右侧边界的二分搜索：
<br>
int right_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0, right = nums.length;
    
    while (left < right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            left = mid + 1; // 注意
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid;
        }
    }
    return left - 1; // 注意 }
<br>









