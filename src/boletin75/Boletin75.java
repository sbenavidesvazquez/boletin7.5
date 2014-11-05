
package boletin75;


public class Boletin75 {


    public static void main(String[] args) {
        float num1,num2,num3;
        Numeros obx=new Numeros();
        num1=obx.pedirDato();
        num2=obx.pedirDato();
        num3=obx.pedirDato();
        obx.setNumero1(num1);
        obx.setNumero2(num2);
        obx.setNumero3(num3);
        obx.condicion();
    
    }
    
}
