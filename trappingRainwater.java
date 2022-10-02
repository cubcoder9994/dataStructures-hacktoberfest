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
    int left[] = new int[height.length];
    int right[] = new int[height.length];
    int leftMax = height[0];
    for(int i=0;i<height.length;i++)
    {
        leftMax = Math.max(leftMax,height[i]);
        left[i] = leftMax;
    }
    int rightMax = height[height.length-1];
    for(int i=height.length-1;i>=0;i--)
    {
        rightMax = Math.max(rightMax,height[i]);
        right[i] = rightMax;
    }
    int c=0;
    for(int i=0;i<height.length;i++)
    {
        c += Math.min(left[i],right[i])-height[i];
    }
    System.out.println(c);
  }
}
