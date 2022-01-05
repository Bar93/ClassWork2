public class Element {

    private char letter;
    private int amount;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Element(char letter, int amount) {
        this.letter = letter;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "(" + letter + "," + amount + ")";
    }
}
