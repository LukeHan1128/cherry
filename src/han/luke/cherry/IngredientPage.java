package han.luke.cherry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * Author: LukeHan <LukeHan1128@gmail.com>
 * Date:   SAT Apr 10 22:00:00 2021 +0900
 */
public class IngredientPage extends JFrame {

    private static final long serialVersionUID = -711163588504124217L;

    public IngredientPage(String title, int x, int y, int width, int height) {
        init(title, x, y, width, height);
    }

    private void init(String title, int x, int y, int width, int height){
        super.setTitle(title);
        gui(x, y, width, height);
    }

    // GUI 생성
    private void gui(int x, int y, int width, int height){
        setBounds(x, y, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        JPanel pane = new JPanel();
        JButton btn = new JButton("Button");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setExitBtn(getDefaultCloseOperation());
            }
        });

        pane.add(btn);
        contentPane.add(pane);

        setVisible(true);
    }

    private void setExitBtn(int check){
        if(check == JFrame.EXIT_ON_CLOSE) setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        else setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // loading
}