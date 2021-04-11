package han.luke.cherry;

import javax.swing.*;

/**
 * Author: LukeHan <LukeHan1128@gmail.com>
 * Date:   SAT Apr 10 22:00:00 2021 +0900
 */
public class Main {
    private JFrame ingredientPage = null;
    private JFrame commitPage = null;
    private JFrame checkPage = null;
    private JFrame selectPage = null;

    private void init(){
        ingredientPage = new IngredientPage("Cherry", 100, 100, 300, 200);
    }

    private void run(){
        init();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}