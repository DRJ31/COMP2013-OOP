import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HistoryPanel extends JPanel {
    private Bank m;

    public HistoryPanel(Bank m) {
        this.m = m;
    }

    private int historyMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (Integer num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    private int historyMin(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (Integer num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    private int historyRange(ArrayList<Integer> arr) {
        int range = historyMax(arr) - historyMin(arr);
        if (range < 100)
            range = 100;
        return range;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int min = historyMin(m.getHistory());
        int range = historyRange(m.getHistory());
        int maxX = getWidth() - 1;
        int maxY = getHeight() - 1;
        int zero = maxY + min * maxY / range;
        System.out.println("Zero: " + zero);
        g.setColor(Color.blue);
        g.drawLine(0, zero, maxX, zero);
        g.setColor(Color.RED);
        g.drawRect(0, zero - m.getHistory().get(0), 1, 1);
        for (int i = 1; i < m.getHistory().size(); i++) {
            g.drawRect(10 * i, zero - maxY * m.getHistory().get(i) / range, 1, 1);
            g.drawLine((i - 1) * 10, zero - m.getHistory().get(i - 1) * maxY / range, i * 10, zero - maxY * m.getHistory().get(i) / range);
        }
    }
}
