package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {

  public  boolean either24(int[] nums){
    boolean pair2 = false;
    boolean pair4 = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2 && i < nums.length -1 && nums[i + 1] == 2) {
        pair2 = true;
      } else if (nums[i] == 4 && i < nums.length -1 && nums[i + 1] == 4) {
        pair4 = true;
    }
  }
    if (pair2 && pair4) {
      return false;
    } else if (!pair2 && !pair4) {
      return false;
    } else {
      return true;
    }
  }





  public int[] pre4(int [] nums) {

    int[] pre = {};
    for (int i = 0; i<nums.length; i++) {
      if (nums[i] == 4) {
        pre = Arrays.copyOfRange(nums,0,i);
        break;
      }
    }
    return pre;


  }

}
