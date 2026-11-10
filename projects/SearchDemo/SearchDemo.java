public class SearchDemo {
    public static int linearSearch(int[] data, int target) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {8, 2, 5}, 2));
        System.out.println(linearSearch(new int[] {4, 9}, 7));
        System.out.println(linearSearch(new int[] {3, 3, 7}, 3));
    }
}