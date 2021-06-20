http://www.nowcoder.com/practice/b56799ebfd684fb394bd315e89324fb4

思路：使用i j 两个指针，最开始都指向第一个元素，i指针往后扫描，把扫描过的元素和下标存储到map集合中，使用max记录无重复最大长度，i指针扫描到重复元素时j指针改变位置，直到扫描完数组

public class Solution {
    public int maxLength (int[] arr) {
        // write code here
        if (arr.length == 0) {
            return 0;
        }
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
		// j指针指向重复元素的前一个元素
                j = Math.max(j, map.get(arr[i])+1);
            }
            map.put(arr[i], i); 
	    // 记录最大长度
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}