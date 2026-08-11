class Solution {
    public int largestRectangleArea(int[] arr ) {
        int size=arr.length;
        int [] arr1=new int[size];
        int [] arr2=new int [size];
        
        // store the first smallest index on right 
        Stack<Integer> st1=new Stack<>();
        for(int i=size-1;i>=0;i--){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            
            if(st1.isEmpty())
              arr1[i] = size;
            else 
             arr1[i]=st1.peek();
            st1.push(i);
           
        }
        
    // store the first smallest index on left 
        Stack<Integer> st2=new Stack<>();

        for(int i=0;i<size;i++){
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            
            if(st2.isEmpty())
              arr2[i] =-1;
            else 
             arr2[i]=st2.peek();
            st2.push(i);
           
        }
        
        // calculate greatest area
        long maxArea=0;
        for(int i=0;i<size;i++){
            int height=arr[i];
            int width=arr1[i] -arr2[i] -1;
            maxArea=Math.max(maxArea,height*width);
            
        }
        
        
        return (int)maxArea;
        
        
    }
}