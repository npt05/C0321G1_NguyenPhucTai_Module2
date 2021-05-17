package bai11_stack_queue.optional.bai_tap.check_bracket;

public class CheckBracketTest {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)   ";
        CheckBracket checkBracket = new CheckBracket(string);
        System.out.println(checkBracket.isOK());
    }
}
