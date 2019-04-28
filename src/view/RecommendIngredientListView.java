package view;

import javax.swing.*;
import java.awt.*;

public class RecommendIngredientListView extends View{
    public RecommendIngredientListView(){
        this.setTitle("Recommend Recipe List"); // set frame title
        this.setSize(800, 600); // set frame size
        this.setLayout(new BorderLayout());

        JPanel jp_header = new JPanel();
        jp_header.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn_back = new JButton("back");
        jp_header.add(btn_back);

        JLabel msg_header = new JLabel("Missing Ingredient List For Recipe" + "A");
        jp_header.add(msg_header);

        JLabel msg_header2 = new JLabel("Ingredient Not Enough");
        jp_header.add(msg_header2);

        this.add(jp_header, BorderLayout.NORTH);

        JPanel jp_main = new JPanel();
        jp_main.setLayout(new BoxLayout(jp_main,BoxLayout.Y_AXIS));
        ButtonGroup bg = new ButtonGroup();
        for(int i =0;i<5;i++) {
            JRadioButton msg_ingreNamei = new JRadioButton("Recipe E" + "11" + "Ingredient in use");
            bg.add(msg_ingreNamei);
            jp_main.add(msg_ingreNamei);
        }
        this.add(jp_main, BorderLayout.CENTER);

        JPanel jp_foot = new JPanel();
        jp_foot.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton btn_generate = new JButton("Generate Shopping List");
        jp_foot.add(btn_generate);

        this.add(jp_foot, BorderLayout.SOUTH);
    }
    @Override
    public void update() {
        //repaint();
    }
}
