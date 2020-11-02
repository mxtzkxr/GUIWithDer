import gui.MainWindow;
import math.polynoms.Polynom;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setVisible(true);
        Polynom p = new Polynom(new double[]{1});
        Polynom dp = p.deriv();
        Polynom dp2 = dp.deriv();
        System.out.println(p);
        System.out.println(dp);
        System.out.println(dp2);
    }
}
