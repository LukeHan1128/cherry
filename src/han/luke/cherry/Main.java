package han.luke.cherry;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Author: LukeHan <LukeHan1128@gmail.com>
 * Date:   SAT Apr 10 22:00:00 2021 +0900
 */
public class Main {
    private JFrame ingredientPage = null;
    private JFrame commitPage = null;
    private JFrame checkPage = null;
    private JFrame selectPage = null;

    private final String MSG_ONLY_FOR_WINDOWS = "윈도우에서만 사용 가능합니다.";

    private final int DEFAULT_W = 640;
    private final int DEFAULT_H = 480;
    private final int DEFAULT_X = (Integer.parseInt(String.valueOf(Math.round(Toolkit.getDefaultToolkit().getScreenSize().getWidth()))) - DEFAULT_W) / 2;
    private final int DEFAULT_Y = (Integer.parseInt(String.valueOf(Math.round(Toolkit.getDefaultToolkit().getScreenSize().getHeight()))) - DEFAULT_H) / 2;

    private void init(){
        //checkProgram();

        ingredientPage = new IngredientPage("Cherry", DEFAULT_X, DEFAULT_Y, DEFAULT_W, DEFAULT_H);
    }

    /**
     * Author: LukeHan <LukeHan1128@gmail.com>
     * Date:   SUN Apr 11 22:00:00 2021 +0900
     */
    public void checkProgram(){
        String line;
        String os = System.getProperty("os.name").toLowerCase();

        if(!os.contains("win")){
            System.out.println("[SYSTEM] This Program Support only Windows");
            JOptionPane.showMessageDialog(null, MSG_ONLY_FOR_WINDOWS);
            System.exit(0);
        }

        try {
            // git --version
            BufferedReader br = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("cmd git --version").getInputStream(), "EUC-KR"));

            System.out.println("----------");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------");

            // tortoisegit

        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void run(){
        init();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}