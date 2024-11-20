/*
Code source by HARTTMAN ©️
 */

package inc.master.harttman;

import javax.swing.*;
import java.awt.*;

public class App {
    private static int currentScene = 0; // current scene index
    private static final String[] SCENARIO = {
            "2018 рік.. Італія.",
            "У Мілані сталась деяки випадки захворювань, не просто захворювань, а щось більше, с початку люди хворіли на грипп, а потім на свиний грипп, пізніше все закінчувалось погіршенням.",
            "Але йшов час і ща декілька днів все перетворились в кошмар, люди стало масово хворити, і це все переростало в пандемію.",
            "З Мілану хвороба яка не мала ніякої назви перебралась у Швейцарію та Німеччину.",
            "То що це таке? Хороше запитання на яке відповіді дати ми не можем.",
            "Гипп мотує і перетворюється з вірус класу (А-А) тобто смертельно небезпечний.",
            "Ознаки які були помічені: Спочатку грипп, потім грипп посилюється і утворюється пневонія, вонр викликає подразненя бронх і кровообігу, тому с часом вени, артерії та сухожилля швидко теж \"захворівають\", потім вірус побирається до нервової системи але не вбиває носія, робить з нього овоча. Хоча нервова система дуже хорошому стані, ми наблюдаєм втрату памяті, не спроможність рахути читати писати, навіть ходити.",
            "Забується все, потерпілі ходять у туалет під себе. Не вміють жувати. Тільки пити та ковтати. Вірус підтримує лише мініальні ділянки мозку.",
            "(Запис-2)",
            "Що ми казали про нервову систему? Вона шахлива, мозок у стані на губку, але наші дані підтвердились.",
            "Вірус підтримує тільки важливі частині мозку і ті які допомагають йому існувати. Чим це зікінчиться не зрозуміло. Піндемію вдалось зупинити.",
            "Але чи надовго."
    };

    public static void main(String[] args) {
        JFrame window = new JFrame("Shiza text novel");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.BLACK);

        JLabel textLabel = new JLabel("<html>" + SCENARIO[currentScene] + "</html>");
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(new Font("Arial", Font.BOLD, 18));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.CENTER);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);

        JButton nextButton = new JButton("Далі");
        nextButton.setFont(new Font("Arial", Font.PLAIN, 14));
        nextButton.addActionListener(e -> {
            if (currentScene < SCENARIO.length - 1) {
                currentScene++;
                textLabel.setText("<html>" + SCENARIO[currentScene] + "</html>");
            } else {
                textLabel.setText("<html><center>Кінець історії!<br>Дякуємо за гру!</center></html>");
                nextButton.setEnabled(false);
            }
        });

        buttonPanel.add(nextButton);


        window.add(textPanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.SOUTH);

        window.setVisible(true);
    }
}

/*
Code source by HARTTMAN ©️
 */
