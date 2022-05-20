/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoJFrame;

/**
 *
 * @author Laboratorio
 */
public class Main {
    
    public static void main(String[] args) {
        Conexao.getConnection();
        System.out.println(Conexao.status);
    }
    
}
