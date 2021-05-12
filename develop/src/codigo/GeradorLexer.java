/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JOptionPane;
import jflex.exceptions.SilentExit;

/**
 *
 * @author arigo01
 */
public class GeradorLexer {

    public static void main(String[] args) {
        String[] rotas = new String[1];
        rotas[0] = "C:/Users/richa/Documents/Projetos/analisador-compiladores/src/codigo/Lexer.flex";
        try {
             generateLexer(rotas);
             
} catch (SilentExit ex) {
            JOptionPane.showMessageDialog(null, "Erro leitura do arquivo: " + rotas[0]);
        }
    }
    
    public static void generateLexer(String[] rotas) throws SilentExit{
            jflex.Main.generate(rotas);
            
    }
}
