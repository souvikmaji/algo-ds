class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int aliceTotal = 0;
        for(int i = 0; i < aliceSizes.length; i++){
            aliceTotal += aliceSizes[i];
        }
        
        Set<Integer> bobSet = new HashSet<>();
        int bobTotal = 0;
        for(int i = 0; i < bobSizes.length; i++){
            bobTotal += bobSizes[i];
            bobSet.add(bobSizes[i]);
        }
        
        int middle = (aliceTotal+bobTotal)/2; //3
        int[] ans = new int[2];
        int diff = middle - aliceTotal; //1
        
        for(int i = 0; i < aliceSizes.length; i++){        
            int newDiff =diff+ aliceSizes[i]; //2
            if(bobSet.contains(newDiff)){// true

                ans[0] = aliceSizes[i];
                ans[1] = newDiff;
                break;        
            }
        }
        
     return ans;   
    }
}

//1,2 ->3 ->4
//2,3 -> 5-> 4
