public class RangoImpares {
    public static void main(String[] args) {
        calculo();
    }

    public static void calculo(){
        for(int i=1000; i <= 1100; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
