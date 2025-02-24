  /*In this I have to search the element where position is in and if it not found than
  return -1*/
  public int InsertPosition(int [] nums, int number) {
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == number) {
        return nums[i];
      }
      else {
        i++;
      }
      
    }
  }   
