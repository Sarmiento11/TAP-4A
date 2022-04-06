import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Videojuego extends JFrame {
    private static final long serialVersionUID = 1L;
    public Videojuego() {
        initComponets();
    }
    public void initComponets() {
        this.setLayout(new BorderLayout());
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                paintContainerKeyPressed(e);
            }
        });
        btnCirculo = new JButton("Circulo (a)");
        btnCirculo.setFocusable(false);
        btnCirculo.setFont(new Font("Open Sans", 0, 14));
        btnCirculo.setPreferredSize(new Dimension(110, 30));
        btnCirculo.addActionListener(e -> btnCirculoActionPerformed(e));

        btnCuadrado = new JButton("Cuadrado (s)");
        btnCuadrado.setFocusable(false);
        btnCuadrado.setFont(new Font("Open Sans", 0, 14));
        btnCuadrado.setPreferredSize(new Dimension(120, 30));
        btnCuadrado.addActionListener(e -> btnCuadradoActionPerformed(e));

        btnArco = new JButton("Arco (d)");
        btnArco.setFocusable(false);
        btnArco.setFont(new Font("Open Sans", 0, 14));
        btnArco.setPreferredSize(new Dimension(110, 30));
        btnArco.addActionListener(e -> btnRomboActionPerformed(e));

        btnColor = new JButton("Color (c)");
        btnColor.setFocusable(false);
        btnColor.setFont(new Font("Open Sans", 0, 14));
        btnColor.setPreferredSize(new Dimension(120, 30));
        btnColor.addActionListener(e -> btnColorActionPerformed(e));

        btnTamanio = new JButton("Tamanio (t)");
        btnTamanio.setFocusable(false);
        btnTamanio.setFont(new Font("Open Sans", 0, 14));
        btnTamanio.setPreferredSize(new Dimension(120, 30));
        btnTamanio.addActionListener(e -> btnTamanioActionPerformed(e));

        iconCircle = new JLabel();
        iconCircle.setIcon(new ImageIcon(getClass().getResource("/img/imgCircle.png")));

        iconSquare = new JLabel();
        iconSquare.setIcon(new ImageIcon(getClass().getResource("/img/imgSquare.png")));

        iconRectangle = new JLabel();
        iconRectangle.setIcon(new ImageIcon(getClass().getResource("/img/imgRectangle.png")));

        iconTriangle = new JLabel();
        iconTriangle.setIcon(new ImageIcon(getClass().getResource("/img/imgTriangle.png")));

        barraBoton = new JPanel();
        barraBoton.setBackground(new Color(216, 241, 255));
        barraBoton.add(btnCirculo);
        barraBoton.add(btnCuadrado);
        barraBoton.add(btnArco);
        barraBoton.add(btnColor);
        barraBoton.add(btnTamanio);

        scrollPane = new JScrollPane();
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setFocusTraversalPolicyProvider(true);
        contOpciones = new JPanel();
        contOpciones.setPreferredSize(new Dimension(90, 400));
        contOpciones.setBackground(new Color(216, 241, 255));
        contOpciones.add(iconCircle);
        contOpciones.add(iconSquare);
        contOpciones.add(iconRectangle);
        contOpciones.add(iconTriangle);
        scrollPane.setViewportView(contOpciones);

        paintContainer = new Paint();
        paintContainer.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                paintContainerMouseClicked(e);
            }
        });
        paintContainer.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                paintContainerMouseDragged(e);
            }
        });
        paintContainer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                paintContainerKeyPressed(e);
            }
        });

        this.add(barraBoton, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.EAST);
        this.add(paintContainer, BorderLayout.CENTER);
        // Personalizacion de la ventana
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        // this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Videojuego videojuego = new Videojuego();
        videojuego.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    private void btnCirculoActionPerformed(ActionEvent e) {
        paintContainer.setIsFigura("Circulo");
        JOptionPane.showMessageDialog(null, "Circulo");
    }
    private void btnCuadradoActionPerformed(ActionEvent e) {
        paintContainer.setIsFigura("Cuadrado");
        JOptionPane.showMessageDialog(null, "Cuadrado");
    }
    private void btnRomboActionPerformed(ActionEvent e) {
        paintContainer.setIsFigura("Arco");
        JOptionPane.showMessageDialog(null, "Arco");
    }
    private void btnColorActionPerformed(ActionEvent e) {
        try {
            int c = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Elija su Color Segun El Numero\n" + "0 - Negro\n" + "1 - Azul\n"
                            + "2 - Blanco\n" + "3 - Cian\n" + "4 - Gris\n" + "5 - Verde\n" + "6 - Amarillo\n"));
            cambiarColor(c);
            paintContainer.repaint();
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    private void btnTamanioActionPerformed(ActionEvent e) {
        try {
            int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el Tamanio"));
            paintContainer.setH(t);
            paintContainer.setW(t);
            paintContainer.repaint();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void paintContainerMouseClicked(MouseEvent e) {
        paintContainer.setClicked();
        paintContainer.setX(e.getX());
        paintContainer.setY(e.getY());
        paintContainer.repaint();
    }
    private void paintContainerMouseDragged(MouseEvent e) {
        if (!paintContainer.isClicked()) {
            paintContainer.setX(e.getX());
            paintContainer.setY(e.getY());
            paintContainer.repaint();
        }
    }
    private void paintContainerKeyPressed(KeyEvent e) {
        if (!paintContainer.isClicked()) {
            switch (e.getKeyCode()) {
                case 'a':
                case 'A':
                    btnCirculo.doClick();
                    break;
                case 's':
                case 'S':
                    btnCuadrado.doClick();
                    break;
                case 'd':
                case 'D':
                    btnArco.doClick();
                    break;
                case 'c':
                case 'C':
                    btnColor.doClick();
                    break;
                case 't':
                case 'T':
                    btnTamanio.doClick();
                    break;
                default:
                    break;
            }
        }
    }
    public void cambiarColor(int c) {
        switch (c) {
            case 0:
                paintContainer.setColor(Color.BLACK);
                break;
            case 1:
                paintContainer.setColor(Color.BLUE);
                break;
            case 2:
                paintContainer.setColor(Color.WHITE);
                break;
            case 3:
                paintContainer.setColor(Color.CYAN);
                break;
            case 4:
                paintContainer.setColor(Color.GRAY);
                break;
            case 5:
                paintContainer.setColor(Color.GREEN);
                break;
            case 6:
                paintContainer.setColor(Color.YELLOW);
                break;
            default:
                paintContainer.setColor(new Color(0, 132, 246));
                break;
        }
    }
    // Variables declaration
    JButton btnCirculo;
    JButton btnCuadrado;
    JButton btnArco;
    JButton btnColor;
    JButton btnTamanio;
    JLabel iconCircle;
    JLabel iconSquare;
    JLabel iconRectangle;
    JLabel iconTriangle;
    JPanel barraBoton;
    Paint paintContainer;
    JPanel contOpciones;
    JScrollPane scrollPane;
}