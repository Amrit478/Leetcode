/*Given an array of both positive and negative integers, the task is to compute sum of minimum and maximum elements of all sub-array of size k.

Examples:  Input : arr[] = {2, 5, -1, 7, -3, -1, -2}  and the winow is K = 4
Output : 18
*/
/*I have given a window of 4 so I have to take the first four characters and add them up and than store in new varaible, and remove the first index and add the next index so we can have next four index and than add all of them in newly created stored variable, and after every 
stored variable I will return the whole value when the while loop will be finished.
Steps - 
1.The idea is to use Dequeue data structure and sliding window concept. We create two empty double-ended queues of size k (‘S’ , ‘G’) that only store indices of elements of current window that are not useless. An element is useless if it can not be maximum or minimum 
of next subarrays. 
*/
public class Geeks {
  public static int SumofKsubArray(int arr[], int k) {
    int sum = 0; //Intialize result 
  }
}
