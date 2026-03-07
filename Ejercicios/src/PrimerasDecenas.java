public class PrimerasDecenas {
    public static void main(String[] args) {
      calculo();
    }

    public static void calculo(){
        for(int i=0; i<=50; i++){
            if(i%10 == 0){
                System.out.println(i);
            }
        }
    }
}
