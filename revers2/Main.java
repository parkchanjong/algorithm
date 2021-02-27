package revers2;

public class Main {

    static void swap(int[] array, int first, int second) {
        int target = array[first];
        array[first] = array[second];
        array[second] = target;
    }

    static void revers(int[] array) {
        for (int i = 0; i < array.length / 2; i++)
            swap(array, i, array.length - i - 1);
    }

    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < target.length; i++)
            System.out.println(target[i]);

        revers(target);

        System.out.println("-----역정렬----");
        for (int i = 0; i < target.length; i++)
            System.out.println(target[i]);
    }
}
