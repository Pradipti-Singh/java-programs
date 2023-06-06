public class ProblemSet_Strings {
    public static void main(String[] args) {
        //Problem1
        String name = "Pradipti Singh";
        System.out.println(name.toLowerCase());

        //Problem2-replace space with "_"
        String text = "Pradipti Singh";
        System.out.println(text.replace(" ","_"));

        //Problem3- letter = "Dear <|name|>, Thanks a lot"
        String letter =  "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Radha"));
    }
}
