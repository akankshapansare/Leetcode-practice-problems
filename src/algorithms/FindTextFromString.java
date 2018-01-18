package algorithms;

/**
 * Created by akanksha on 12/14/2017.
 */
public class FindTextFromString {

    public boolean findText(String text, String find) {
        if (text.contains(find)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String text = "There are so many new Technologies present. But only some of them standout. One of them which standout is NodeJs";
        String find = "NodeJs";
        FindTextFromString fs = new FindTextFromString();
        System.out.print(fs.findText(text, find));
    }
}
