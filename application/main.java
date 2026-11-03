package application;
import  java.util.Scanner;
import java.util.Locale;
import entities.Bill;

public class main {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // tinha ficado na duvída se deixava tudo na classe static e instanciava aqui, mas como n precisso fazer comparação entre duas contas acabei deixando non static mesmo

        System.out.print("Sexo: ");
        Bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        Bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        Bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinos: ");
        Bill.barbecue = sc.nextInt();

        sc.close();

        //Imprimir Relatório final.
        System.out.println("");
        System.out.println("");
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo: R$ %.2f\n", Bill.feeding());
        if(Bill.feeding() > 30){
            System.out.printf("Isento de Couvert\n");
        }
        else{
            System.out.printf("Couvert: R$ %.2f\n", Bill.cover());
        }
        System.out.printf("Ingresso: R$ %.2f\n", Bill.ticket());
        System.out.println("");
        System.out.println("");
        System.out.printf("Valor a pagar: R$ %.2f\n", Bill.total());



    }
}

