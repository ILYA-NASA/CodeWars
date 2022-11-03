
public class RangeExtraction {
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append((arr[i]));
            int count = 0;
            if (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) {
                while (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) {
                    count++;
                    i += 1;
                }
                if (count >= 2) result.append(("-")).append(arr[i]);
                else result.append(",").append(arr[i]);
            }
            result.append(",");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}
