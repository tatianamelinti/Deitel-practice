import javax.swing.JFrame;
public class SmileyTest {
    public static void main(String[] args) {
        Smile panel = new Smile();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
