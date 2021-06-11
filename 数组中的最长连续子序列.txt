http://www.nowcoder.com/practice/eac1c953170243338f941959146ac4bf

思路：采用排序+统计的方法
排序并统计连续序列长度：遇到重复元素跳过；遇到不连续元素重置；遇到连续元素加一并更新最大值

public int MLS (int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int len = arr.length;
        Arrays.sort(arr);
        int count = 1; 
        int result = 1;
        for (int i = 0; i < len-1; i++) {
            if (arr[i+1] - arr[i] == 1) { // 连续
                count++;
            } else if (arr[i+1] - arr[i] == 0) { // 相同元素，跳到下次循环
                continue;
            } else { // 遇到不连续元素则重置
                count = 1;
            }
            result = Math.max(count, result);
        }
        return result;
    }
}