public class test {
    public static void main(String[] args) {
        for(int i = 18, j = 1; j <= 40; i+=3, j++){
            System.out.print(i);
            System.out.print(" ");
            if(i == 21){
                i = -3;
                System.out.println();
            }
        }
    }
}
