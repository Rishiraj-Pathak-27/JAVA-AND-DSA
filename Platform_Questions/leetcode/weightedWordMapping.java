// 3838. Weighted Word Mapping

public class weightedWordMapping {

    public static String weightMapping(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            if (word == null || word.isEmpty()) {
                continue;
            }

            for (char arr : word.toCharArray()) {

                if (arr >= 'a' && arr <= 'z') {
                    sum += weights[arr - 'a'];
                }
            }

            int rem = sum % 26;
            ans.append((char) ('z' - rem));
        }

        return ans.toString();

    }

    public static void main(String[] args) {
        String[] words = {"a", "b", "c"};
        int[] weights = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(weightMapping(words, weights));
    }
}
