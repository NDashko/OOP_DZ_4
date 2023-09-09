package Task2;

public class Main {
    public static void main(String[] args) {
        PrintArray printArr = new PrintArray();

        String[] arrString = {"Привет", "мир"};
        Integer[] arrInt = {1, 2, 3, 4, 5};

        printArr.printArray(arrString);
        printArr.printArray(arrInt);
    }
}