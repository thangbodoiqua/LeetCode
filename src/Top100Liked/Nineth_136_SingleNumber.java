package Top100Liked;

public class Nineth_136_SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,1,2,2}));
    }
    public static int singleNumber(int[] nums){
        int singleNum = 0;
        boolean isSingle = true;
        for(int i = 0; i < nums.length; i++){
            singleNum = nums[i];
            isSingle = true;
            for(int j = 0; j < nums.length; j++ ){
                if(i == j){
                    continue;
                }
                if(singleNum == nums[j]){
                    isSingle = false;
                    break;
                }
            }
            if(isSingle){
                break;
            }
        }
        return singleNum;
    }
}
