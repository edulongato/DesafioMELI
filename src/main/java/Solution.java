import java.io.*;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int maxDigit = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.calculation(maxDigit);

        if (result != null) {
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(String.valueOf(result.get(i)));
            }
        } else {
            bufferedWriter.write("null");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
