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
        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};

        System.out.println(weightMapping(words, weights));
    }
}
