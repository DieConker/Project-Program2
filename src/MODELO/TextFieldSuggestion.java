package MODELO;

import javax.swing.JTextField;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TextFieldSuggestion extends JTextField {

    private TextFieldSuggestionUI textUI;

    public TextFieldSuggestion() {
        textUI = new TextFieldSuggestionUI(this);
        setUI(textUI);
    }

    public void addItemSuggestion(String text) {
        textUI.getItems().add(text);
    }

    public void removeItemSuggestion(String text) {
        textUI.getItems().remove(text);
    }

    public void clearItemSuggestion() {
        textUI.getItems().clear();
    }

    public void setRound(int round) {
        textUI.setRound(round);
    }

    public int getRound() {
        return textUI.getRound();
    }

    public void formatText() {
        try {
            String text = getText();
            String formattedText = formatNumber(text);
            setText(formattedText);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private String formatNumber(String text) throws ParseException {
        try {
            double number = new DecimalFormat().parse(text).doubleValue();
            DecimalFormat df = new DecimalFormat("#,###.00");
            return df.format(number);
        } catch (NumberFormatException e) {
            return text;
        }
    }
}
