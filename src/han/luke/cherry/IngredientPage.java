package han.luke.cherry;

import javax.swing.*;
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
        super.setTitle(title);
        setBounds(x, y, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkProgram();

        setVisible(true);
    }
    // 프로그램 설치 유무 확인
    // GUI 생성
    // loading

    /**
     * Author: LukeHan <LukeHan1128@gmail.com>
     * Date:   SUN Apr 11 22:00:00 2021 +0900
     */
    public boolean checkProgram(){
        boolean check = false;
        String line;
        String os = System.getProperty("os.name").toLowerCase();

        if(!os.contains("win")){
            System.out.println("[SYSTEM] This Program Support only Windows");
            return check;
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
        return check;
    }
}