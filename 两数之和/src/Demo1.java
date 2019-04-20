
//方法一：暴力法
//暴力法很简单。遍历每个元素 xx，并查找是否存在一个值与 target - xtarget−x 相等的目标元素。



public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints =twoSum(nums, 9);

        System.out.println(ints.length);

    }
    public static int[] twoSum(int[] nums, int target) {
   for (int i = 0; i<nums.length; i++){
       for (int j = i+1; j<nums.length; j++){
           if (nums[i] + nums[j] ==target) {
                return new int[] {i,j};
           }
       }
   }
        return null;
    }
}
