import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataAnalysis datass = new DataAnalysis();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        int[][] answer = {};
        answer = datass.solution(data,
        "date", 20300501, "remain");
        System.out.println("answer = " + answer.toString());
    }
}