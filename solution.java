import java.util.*;
class solution{
    public static int trappedarray(int height[]){
        int n = height.length;

        //left max boundary 
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for(int i = n - 2; i >=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedwater = 0;
        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
       int height[] ={4,2,0,3,2,5}; //{0,1,0,2,1,0,1,3,2,1,2,1 };
        System.out.println(trappedarray(height));
    }
}