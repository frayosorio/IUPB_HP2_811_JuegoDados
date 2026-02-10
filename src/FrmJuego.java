import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmJuego extends JFrame {

    Dado dado1, dado2;
    Random r;
    JLabel lblDado1, lblDado2;


    // metodo constructor
    public FrmJuego() {
        setSize(500, 300);
        setTitle("Juego de Dados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblDado1 = new JLabel();
        String archivoImagen = "/imagenes/4.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lblDado1.setIcon(imgDado);

        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado1);

        lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        lblTituloLanzamientos.setHorizontalAlignment(JLabel.CENTER);
        add(lblTituloLanzamientos);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setFont(new Font("Tahoma", Font.BOLD, 72));
        lblLanzamientos.setHorizontalAlignment(JLabel.RIGHT);
        lblLanzamientos.setBackground(new Color(0, 0, 0));
        lblLanzamientos.setForeground(new Color(55, 255, 0));
        lblLanzamientos.setOpaque(true);
        add(lblLanzamientos);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        lblTituloCenas.setHorizontalAlignment(JLabel.CENTER);
        add(lblTituloCenas);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        lblCenas.setFont(new Font("Tahoma", Font.BOLD, 72));
        lblCenas.setHorizontalAlignment(JLabel.RIGHT);
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setForeground(new Color(55, 255, 0));
        lblCenas.setOpaque(true);
        add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 20 + imgDado.getIconHeight(), 100, 25);
        add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 55 + imgDado.getIconHeight(), 100, 25);
        add(btnLanzar);

        // eventos
        btnIniciar.addActionListener(e -> {
            iniciar();
        });

        btnLanzar.addActionListener(e -> {
            lanzar();
        });

        dado1 =new Dado();
        dado2 =new Dado();
        r = new Random();
        
    }

    private void iniciar() {
    }

    private void lanzar() {
        dado1.lanzar(r);
        dado2.lanzar(r);
        dado1.mostrar(lblDado1);
        dado2.mostrar(lblDado2);
    }

}
