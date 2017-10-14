package chapter3;

/**
 * This class helps us write a letter by providing a simple template
 */
public class LetterWriter {
    private String letter = "";
    private String from;
    private String to;

    /**
     * @param from who the letter is from
     * @param to the recipient of the letter
     */
    public LetterWriter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Adds a line to the body of the letter
     * @param line The line you want to add to the letter
     */
    public void addLine(String line) {
        letter = letter + line + "\n";
    }

    /**
     * @return the whole letter
     */
    public String getText() {
        String intro = "Dear " + to + ": \n\n";
        String salutation = "\nSincerely, \n\n" + from;
        return intro + letter + salutation;
    }
}
