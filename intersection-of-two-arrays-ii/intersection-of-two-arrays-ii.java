class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j ++;
            } else {
                res.add(nums1[i]);
                i++;
                j++;
            }
            
        }
       // System.out.println(res);
        int[] finalRes = new int[res.size()];
        
        for(int i = 0; i < finalRes.length; i++){
            finalRes[i] = res.get(i);
        }
        
        return finalRes;
    }
}