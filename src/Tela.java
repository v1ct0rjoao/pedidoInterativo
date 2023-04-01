import javax.swing.*;
import java.awt.*;
//bibliotecas necessárias para trabalhar com imagens


public class Tela extends JFrame{
//construtor de janela
    public Tela(){
        JLabel gif = new JLabel(new ImageIcon("rsc/66286c21e00a4ef6707abb4bfe19dcb3.gif")); //objeto que armazena gif
        add(gif); //add gif na janela
        setSize(800,600); //tamanho datela
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setUndecorated(false);
        setVisible(true);
    }
    
}
