import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int height[] = new int[n];
    for(int i=0;i<n;i++)
    {
      height[i] = sc.nextInt();
    }
	int left=0,right=height.length-1;
        int leftMax = height[0],rightMax = height[height.length-1];
        int sum=0;
        while(left<=right)
        {
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(leftMax<=rightMax)
            {
                sum += leftMax-height[left];
                left++;
            }
            else
            {
                sum += rightMax-height[right];
                right--;
            }
        }
	System.out.println(sum);
  }
}
