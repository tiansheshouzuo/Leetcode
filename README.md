# Leetcode
2019.1.15
�˴����ڼ�¼���Լ���leetcodeˢ��֮�ã�������ϰ��¼����⾭���ܽᡣ

## ����HOT 100
### ע�⣺��Ŵ������
<br>
1������֮��
<br>
2���������
<br>
3�����ظ��ַ�����Ӵ�   
<br>
4��Ѱ�����������������λ��   
<br>
5��������Ӵ�  
<br>
10��������ʽƥ��
<br>
11��ʢ���ˮ������   
<br>
15������֮��
<br>
17���绰�������ĸ���
<br>
19��ɾ������ĵ�����N���ڵ�
<br>
20����Ч������
<br>
21���ϲ�������������
<br>
22����������
<br>
23���ϲ�K����������
<br>
31����һ������
<br>
32�����Ч����
<br>
�����Ŀ�õ���ջ���ж����ŵ���Ч�ԣ����ܲ��ñ�����⣬�������Ϊ����ѭ����ʱ�临�Ӷ�ΪO��n3�������㳬ʱ
<br>
33��������ת����
�����������ʽa��b��c�жϣ����߽�Ϊ���������һΪ�涼��������ʱ������ͨ���������ʾ����a^b^c��    
<br>
34�������������в���Ԫ�صĵ�һ�������һ��λ��    
<br>
���������㷨֮Ѱ�����߽�Ķ���������
<br>
1��ѭ������while(left<right)
<br>
int left_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0;
    int right = nums.length; // ע��
    
    while (left < right) { // ע��
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            right = mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid; // ע��
        }
    }
    return left;}
<br>
���������㷨֮Ѱ���Ҳ�߽�Ķ���������
<br>
int right_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0, right = nums.length;
    
    while (left < right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            left = mid + 1; // ע��
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid;
        }
    }
    return left - 1; // ע�� }
<br>









