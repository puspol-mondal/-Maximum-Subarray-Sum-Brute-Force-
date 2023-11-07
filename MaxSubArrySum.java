/**
 * MaxSubArrySum
 */
public class MaxSubArrySum {
public static void maxSubArrySum(int number[]){
    int ts=0;
    int MaxmumSum=0;
    for(int i = 0; i< number.length; i++){
        int sum = 0;
        for(int j=i; j<number.length; j++){
            sum +=number[j];
            if (MaxmumSum<sum) {
                MaxmumSum=sum;
            }
            for(int k=i; k<j; k++){
                System.out.print(" "+ number[k]);
            }
            ts++;
            System.out.println();
        }
    }
    System.out.println("Total sub Array sum = "+MaxmumSum);
    System.out.println("Total sub Array = "+ts);
}
    public static void main(String[] args) {
        int number[] = {-1,3,4,-2};
        maxSubArrySum(number);
    }

}