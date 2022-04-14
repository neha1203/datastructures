class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int j = 0;
        int i =0;
        int res[] = new int[m+n];
        int k = 0;
        
        
        while( i<m && j <n){
            
            if(nums1[i]> nums2[j]){
                
                
                res[k++] = nums2[j];
                j++;                
                
            }
            
           else{
               
               res[k++] = nums1[i];
               i++;
               
               
           } 
            
            
            
            
        }
        
        
        while(i<m){
            
            
            res[k++] = nums1[i];
            i++;
            
        }
        
        
        while(j<n){
            res[k++] = nums2[j];
            j++;
            
            
        }
        
        i= 0 ;
        
        for( int a = 0 ; a<res.length;a++){
            
            
            
            
            nums1[i] = res[a];
            i++;
        }
        
     // return nums1;  
        
    }
}