import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyweightTest extends JFrame {
    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 1000;

    Color[] shapeColor = {Color.orange, Color.yellow, Color.blue, Color.red, Color.pink, Color.green, Color.gray, Color.black, Color.cyan, Color.magenta};

    public static void main(String[] args) {
        new FlyweightTest();
    }

    public FlyweightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPanel.add(drawingPanel, BorderLayout.CENTER);
        contentPanel.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; i++) {

                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime) );
            }
        });

        this.add(contentPanel);
        this.setVisible(true);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandX() { return (int) (Math.random()*windowWidth); }

    private int getRandY() { return (int) (Math.random()*windowHeight); }

}
