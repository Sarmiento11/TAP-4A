import java.awt.*;
public class Paint extends Canvas {
    private static final long serialVersionUID = 1L;
    private int x, y;
    private int w, h;
    private String isFigura;
    boolean isClicked;
    Color color;
    Image imagen;
    public Paint() {
        x = y = 50;
        w = h = 100;
        color = Color.RED;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());;
        try {
            switch (isFigura) {
            case "Circulo":
                g2d.setColor(color);
                g2d.fillOval(x, y, w, h);
                break;
            case "Cuadrado":
                g2d.setColor(color);
                g2d.fillRect(x, y, w, h);
                break;
            case "Arco":
                g2d.setColor(color);
                g2d.fillArc(x, y, w, h, 60, 90);
                break;
            }
        } catch (Exception e) {
        }
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public String getIsFigura() {
        return isFigura;
    }
    public void setIsFigura(String isFigura) {
        this.isFigura = isFigura;
    }
    public boolean isClicked() {
        return isClicked;
    }
    public void setClicked() {
        this.isClicked = !this.isClicked;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}