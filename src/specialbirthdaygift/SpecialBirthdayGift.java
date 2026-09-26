package specialbirthdaygift;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SpecialBirthdayGift extends JFrame {

    // =========================================================
    // 💌 YOUR SPECIAL MESSAGE
    // EDIT ONLY THE TEXT BETWEEN THE QUOTATION MARKS
    // =========================================================

    private final String SPECIAL_MESSAGE =
            "Happy Birthday, my special someone! 💗\n\n"
            + "I hope this little surprise makes you smile. "
            + "I may be your secret manliligaw for now, im sorry if i wasn't the best "
            + "but I just want you to know that you are someone very important and "
            + "very special to me. 🥺💕\n\n"
            + "I hope you enjoy your day and all the happiness even if it means with or without me and ofcourseo "
            + "that comes with it. You deserve the best and i always want the best! 🎂✨\n\n"
            + "From your secret manliligaw 💌";

    // =========================================================
    // DON'T CHANGE ANYTHING BELOW
    // =========================================================

    private JPanel mainPanel;
    private JLabel questionLabel;
    private JButton yesButton;
    private JButton noButton;

    private final Color PINK = new Color(255, 192, 203);
    private final Color LIGHT_PINK = new Color(255, 235, 242);
    private final Color DARK_PINK = new Color(220, 100, 140);

    private final Random random = new Random();

    public SpecialBirthdayGift() {

        setTitle("A Special Birthday Gift 💗");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        createOpeningScreen();

        setVisible(true);
    }

    private void createOpeningScreen() {

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(LIGHT_PINK);

        JLabel topDecoration = new JLabel(
                "🐱  ♡  🐾  ♡  🐱  ♡  🐾  ♡  🐱"
        );

        topDecoration.setFont(
                new Font("SansSerif", Font.PLAIN, 25)
        );

        topDecoration.setForeground(DARK_PINK);
        topDecoration.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        topDecoration.setBounds(0, 20, 700, 40);

        mainPanel.add(topDecoration);

        JLabel snoopy = new JLabel("🐶");

        snoopy.setFont(
                new Font("Segoe UI Emoji", Font.PLAIN, 55)
        );

        snoopy.setBounds(70, 90, 80, 70);

        mainPanel.add(snoopy);

        JLabel heart = new JLabel("♡");

        heart.setFont(
                new Font("Serif", Font.BOLD, 70)
        );

        heart.setForeground(PINK);
        heart.setBounds(570, 80, 80, 80);

        mainPanel.add(heart);

        questionLabel = new JLabel(
                "<html><div style='text-align:center;'>"
                + "Are you ready to see your<br>"
                + "<font color='#DC648C'>VERY SPECIAL GIFT</font><br>"
                + "from your secret manliligaw? 💌"
                + "</div></html>"
        );

        questionLabel.setFont(
                new Font("SansSerif", Font.BOLD, 25)
        );

        questionLabel.setForeground(
                new Color(120, 70, 90)
        );

        questionLabel.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        questionLabel.setBounds(100, 150, 500, 130);

        mainPanel.add(questionLabel);

        yesButton = new JButton("YES 💕");

        yesButton.setFont(
                new Font("SansSerif", Font.BOLD, 18)
        );

        yesButton.setBackground(DARK_PINK);
        yesButton.setForeground(Color.WHITE);
        yesButton.setFocusPainted(false);
        yesButton.setBorderPainted(false);

        yesButton.setBounds(210, 310, 130, 55);

        yesButton.addActionListener(e -> showGift());

        mainPanel.add(yesButton);

        noButton = new JButton("NO 🙈");

        noButton.setFont(
                new Font("SansSerif", Font.BOLD, 16)
        );

        noButton.setBackground(Color.WHITE);
        noButton.setForeground(DARK_PINK);
        noButton.setFocusPainted(false);

        noButton.setBounds(360, 310, 130, 55);

        noButton.addActionListener(e -> moveNoButton());

        mainPanel.add(noButton);

        JLabel bottomText = new JLabel(
                "♡ made with a little bit of love ♡"
        );

        bottomText.setFont(
                new Font("Serif", Font.ITALIC, 16)
        );

        bottomText.setForeground(DARK_PINK);

        bottomText.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        bottomText.setBounds(0, 420, 700, 30);

        mainPanel.add(bottomText);

        add(mainPanel);
    }

    private void moveNoButton() {

        int maxX = 520;
        int minX = 100;

        int maxY = 360;
        int minY = 280;

        int x = minX + random.nextInt(maxX - minX);
        int y = minY + random.nextInt(maxY - minY);

        noButton.setLocation(x, y);

        questionLabel.setText(
                "<html><div style='text-align:center;'>"
                + "Hmmm... are you sure? 🥺💕<br>"
                + "Try clicking YES! 😭"
                + "</div></html>"
        );
    }

    private void showGift() {

        mainPanel.removeAll();

        mainPanel.setBackground(LIGHT_PINK);

        JLabel decorations = new JLabel(
                "🐱  ♡  🐾  ♡  🎀  ♡  🐾  ♡  🐱"
        );

        decorations.setFont(
                new Font("SansSerif", Font.PLAIN, 25)
        );

        decorations.setForeground(DARK_PINK);

        decorations.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        decorations.setBounds(0, 15, 700, 40);

        mainPanel.add(decorations);

        JLabel birthdayTitle = new JLabel(
                "🎂 HAPPY BIRTHDAY! 🎂"
        );

        birthdayTitle.setFont(
                new Font("SansSerif", Font.BOLD, 30)
        );

        birthdayTitle.setForeground(DARK_PINK);

        birthdayTitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        birthdayTitle.setBounds(50, 65, 600, 50);

        mainPanel.add(birthdayTitle);

        JLabel character = new JLabel("🐶 🐱");

        character.setFont(
                new Font("Segoe UI Emoji", Font.PLAIN, 45)
        );

        character.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        character.setBounds(0, 105, 700, 60);

        mainPanel.add(character);

        JTextArea letter = new JTextArea();

        letter.setText(SPECIAL_MESSAGE);

        letter.setFont(
                new Font("SansSerif", Font.PLAIN, 16)
        );

        letter.setForeground(
                new Color(100, 70, 80)
        );

        letter.setBackground(Color.WHITE);

        letter.setLineWrap(true);
        letter.setWrapStyleWord(true);
        letter.setEditable(false);

        letter.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                PINK, 3
                        ),
                        BorderFactory.createEmptyBorder(
                                20, 20, 20, 20 
                        ) 
                ) 
        ); 
        JScrollPane scrollPane = new JScrollPane(letter);
        scrollPane.setBounds(100, 175, 500, 220);
        mainPanel.add(scrollPane);
        JLabel ending = new JLabel(
                "♡ From your secret manliligaw, with love ♡" 
        );
        ending.setFont
        ( new Font
        ( "Serif",
                Font.BOLD| Font.ITALIC,
                16 ) ); ending.setForeground(DARK_PINK);
                ending.setHorizontalAlignment(
                        SwingConstants.CENTER
                );
                ending.setBounds(0, 415, 700, 30);
                mainPanel.add(ending);
                mainPanel.revalidate();
                mainPanel.repaint(); }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SpecialBirthdayGift();
        });
    }
}
 