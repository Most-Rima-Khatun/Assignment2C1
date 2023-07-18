package ShowMyName.java;

public class ShowMyName {
    private String name;
    public void name(){
        name = "Rima";

        int length =name.length();
        String horigentalLine = "+" + "-".repeat(length) + "+";

        System.out.println(horigentalLine);
        System.out.println("|" + name + "|");
        System.out.println(horigentalLine);
    }

}
