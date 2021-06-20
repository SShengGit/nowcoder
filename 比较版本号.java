http://www.nowcoder.com/practice/2b317e02f14247a49ffdbdba315459e7

思路：把版本号字符串拆分成数组，并且把字符串数字转换成数字类型，逐个比较，如果长度不一致则补充0直到两个版本号比较完毕

public int compare (String version1, String version2) {
        // write code here
        // 转义.时要加两个转义字符\\
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.max(v1.length, v2.length);
        for (int i = 0; i < len; i++) { // 长度不够则补0
            int t1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int t2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (t1 > t2) {
                return 1;
            } else if (t1 < t2){ 
                return -1;
            } 
        }
        return 0;
    }