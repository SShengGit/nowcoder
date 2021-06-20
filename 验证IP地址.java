http://www.nowcoder.com/practice/55fb3c68d08d46119f76ae2df7566880

思路：拆分字符串成字符数组，验证字符串长度，分别验证IPv4的和IPv6的字段组成是否合法

public static String validIPAddress(String IP) {
        return validIPv4(IP) ? "IPv4" : (validIPv6(IP) ? "IPv6" : "Neither");
    }

    private static boolean validIPv4(String IP) {
        String[] strs = IP.split("\\.", -1);
        if (strs.length != 4) { //4段十进制数
            return false;
        }

        for (String str : strs) {
            if (str.length() > 1 && str.startsWith("0")) { // 长度大于1且不能以0开头
                return false;
            }
            try {
                int val = Integer.parseInt(str);
                if (!(val >= 0 && val <= 255)) { // 0~255
                    return false;
                }
            } catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        return true;
    }

    private static boolean validIPv6(String IP) {
        String[] strs = IP.split(":", -1);
        if (strs.length != 8) {
            return false;
        }

        for (String str : strs) {
            if (str.length() > 4 || str.length() == 0) { // 非空或长度大于4为错误
                return false;
            }
            try {
                int val = Integer.parseInt(str, 16);
            } catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        return true;
    }