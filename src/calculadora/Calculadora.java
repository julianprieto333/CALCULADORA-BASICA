
package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        //CREACION DE VARIABLES
        
        int opcion;
        double cantidad1,suma,acumulador=0,cantidad2,resta,acumulador2=0;
        double cantidad3,mult,acumulador3=1,numerador,denominador;
        double resultado;
        double numero,numero2,numero3;
        double indice,radicando,base,exponente;
        double iva;
        
        //INICIANDO EL BUCLE
        
        do{
        Scanner cin = new Scanner(System.in);
        System.out.println("\t\tCALCULADORA");
        System.out.println("1.SUMA\n2.RESTA\n3.MULTIPLICACION\n4.DIVISION\n5.SENO\n6.COSENO\n7.TANGENTE\n8.RAIZ ENESIMA\n9.POTENSIA ENESIMA\n10.CALCULAR IVA\n11.TERMINAR");
        System.out.print("\n\t-->OPCION:");
        opcion=cin.nextInt();
        
        //CREACION DEL MENU 
        
        switch(opcion){
            
            case 1:
        System.out.println("Ingrese la cantidad de numeros a sumar:");
        cantidad1=cin.nextDouble();
        for(int i=0;i<cantidad1;i++){
            System.out.print("Numero"+(i+1)+":");
            suma=cin.nextDouble();
            acumulador+=suma;
        }
            System.out.println("El resultado es:"+acumulador);
        break;
        
        case 2:
            System.out.println("Ingrese la cantidad de numeros a restar:");
        cantidad2=cin.nextDouble();
        System.out.print("Numero1:");
        acumulador2=cin.nextDouble();
        for(int i=0;i<(cantidad2-1);i++){
            System.out.print("Numero"+(i+2)+":");
            resta=cin.nextDouble();
            acumulador2-=resta;
        }
        System.out.println("El resultado es:"+acumulador2);
         break;
         
        case 3:
            System.out.println("Ingrese la cantidad de numeros a multiplicar:");
            cantidad3=cin.nextDouble();
            for(int i=0;i<cantidad3;i++){
                System.out.print("Numero"+(i+1)+":");
                mult=cin.nextDouble();
                acumulador3*=mult;
            }
            System.out.println("El resultado es:"+acumulador3);
            break;
            
        case 4:
            System.out.print("Ingrese el numerador:");
            numerador=cin.nextDouble();
            System.out.print("Ingrese el denominador:");
            denominador=cin.nextDouble();
            if(denominador==0){
                System.out.println("NO SE PUEDE DIVIR ENTRE 0");
            }else{
                resultado=numerador/denominador;
                System.out.println("El resultado es:"+resultado);
            }
            break;
            
        case 5:
            System.out.print("Ingrese el numero:");
            numero=cin.nextDouble();
            System.out.println("El seno de "+numero+" es:"+(Math.sin(Math.toRadians(numero))));
            break;
            
        case 6:
            System.out.print("Ingrese el numero:");
            numero2=cin.nextDouble();
            System.out.println("El coseno de "+numero2+" es:"+(Math.cos(Math.toRadians(numero2))));
            break;
            
        case 7:
            System.out.print("Ingrese el numero:");
            numero3=cin.nextDouble();
            if(numero3!=90){
            System.out.println("La tangente de "+numero3+" es:"+(Math.tan(Math.toRadians(numero3))));
            }
            else{
                System.out.println("LA TANGENTE DE 90 NO EXISTE");
            }
            break;
            
        case 8:
            System.out.print("Ingrese el indice:");
            indice=cin.nextDouble();
            System.out.print("Ingrese el radicando:");
            radicando=cin.nextDouble();
            System.out.println("El resultado es:"+(Math.pow(radicando,(1/indice))));
            break;
            
        case 9:
            System.out.print("Ingrese la base:");
            base=cin.nextDouble();
            System.out.print("Ingrese el exponente:");
            exponente=cin.nextDouble();
            System.out.println("El resultado es:"+Math.pow(base,(exponente)));
            break;
            
        case 10:
            System.out.print("Ingrese el valor el cual quiere conocer el iva:");
            iva=cin.nextDouble();
           System.out.println("El iva del 19% es:"+(iva*0.19));
           break;
        }
        }while(opcion!=11);
}
}

