import java.util.HashMap;
import java.util.Map;


//方法三：一遍哈希表
//事实证明，我们可以一次完成。在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。

public class Solution3 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if (map.containsKey(num) && map.get(num) != i+1) {
                return new int[] {i+1,map.get(num)+1};
            }
            map.put(num,i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
