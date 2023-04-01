import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Tela extends JFrame {
    public Tela(String idgif, Color botaoSimCor, Color botaoNaoCor) {
        ImageIcon imageIcon = new ImageIcon(idgif);
        Image image = imageIcon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(image);
        setContentPane(new JLabel(resizedImageIcon));
    
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
    
        JButton botaoSim = new JButton("Sim");
        botaoSim.setBackground(botaoSimCor);
        JButton botaoNao = new JButton("Não");
        botaoNao.setBackground(botaoNaoCor);
    
        getContentPane().setLayout(null);
        getContentPane().add(botaoSim);
        getContentPane().add(botaoNao);
    
        botaoSim.setBounds(200, 400, 100, 40);
        botaoNao.setBounds(500, 400, 100, 40);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setUndecorated(false);
        setVisible(true);

        botaoSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int x = rand.nextInt(getWidth() - botaoSim.getWidth());
                int y = rand.nextInt(getHeight() - botaoSim.getHeight());
                botaoSim.setBounds(x, y, 100, 40);
    
                SwingUtilities.updateComponentTreeUI(botaoSim.getParent());
            }
        });
     
        botaoNao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(botaoSim);
                getContentPane().remove(botaoNao);
                getContentPane().revalidate();
                getContentPane().repaint();

                ImageIcon newImageIcon = new ImageIcon("rsc/Imeng24.jpg");
                Image newImage = newImageIcon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
                ImageIcon newResizedImageIcon = new ImageIcon(newImage);
                ((JLabel) getContentPane()).setIcon(newResizedImageIcon);
                
            }
        });
        
      
    
    
    }
    
}
