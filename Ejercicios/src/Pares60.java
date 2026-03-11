public class Pares60 {
    public static void main(String[] args) {
        calculo();
    }

    public static void calculo(){
        for(int i=0; i<=60; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
