http://www.nowcoder.com/practice/69f4e5b7ad284a478777cb2a17fb5e6a
思路：当前区间的起点比前一个区间的终点小，满足合并条件；把全部的区间按起点进行排序，然后把符合条件的区间进行合并

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() { // 定义排序规则
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        ArrayList<Interval> ans = new ArrayList<>(); // 新建集合存储合并后的区间
        int len = intervals.size();
        if (len == 0) {
            return ans;
        }
        for (int i = 1; i < len; i++) { 
            // 当前的区间起点在前一个区间的范围内，满足合并条件
            if (intervals.get(i).start <= intervals.get(i-1).end) {
                // 合并区间
                intervals.get(i).start = Math.min(intervals.get(i).start, intervals.get(i-1).start);
                intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i-1).end);
            } else {
                // 存储不满足（已合并）合并条件的区间
                ans.add(intervals.get(i-1));
            }
        }
        // 存储最后一个区间
        ans.add(intervals.get(len-1));
        return ans;
    }
}