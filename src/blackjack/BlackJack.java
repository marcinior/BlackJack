package blackjack;

import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

public class BlackJack {

    public static void main(String[] args) {

        BlackJackFrame blackJackFrame = new BlackJackFrame();
        blackJackFrame.setVisible(true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        blackJackFrame.setLocation(screenSize.height / 2, screenSize.width / 14);
        blackJackFrame.setResizable(false);

    }

}
