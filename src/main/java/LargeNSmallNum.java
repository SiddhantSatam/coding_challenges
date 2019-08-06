public class LargeNSmallNum {
    public static int[] solution (int[] array) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i: array) {
            if (i > largest)
                largest = i;
            if (i < smallest)
                smallest = i;
        }
        int[] result = {smallest, largest};
        return result;
    }
}
