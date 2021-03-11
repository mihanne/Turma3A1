/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estoque;

/**
 *
 * @author Hanne
 */
import java.util.Scanner;
public class Estoque {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int estoque;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a Quantidade em Estoque: ");
        estoque=entrada.nextInt();
        if (estoque >= 100) {
            System.out.println("Produto com quantidade suficiente.");
        } else if (estoque < 100 && estoque > 50) {
            System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
        } else {
            System.out.println("ATENÇÃO! Faça um novo pedido.");
        }
    }
    
}
