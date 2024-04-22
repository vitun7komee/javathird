import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int NUM_OPERATIONS = 1000; // Измените это значение по своему усмотрению
        final int NUM_ELEMENTS = 1000; // Измените это значение по своему усмотрению

        // Измерение времени для ArrayList
        long arrayListAddTime = testArrayListAdd(NUM_OPERATIONS, NUM_ELEMENTS);
        long arrayListGetTime = testArrayListGet(NUM_OPERATIONS, NUM_ELEMENTS);
        long arrayListRemoveTime = testArrayListRemove(NUM_OPERATIONS, NUM_ELEMENTS);

        // Измерение времени для LinkedList
        long linkedListAddTime = testLinkedListAdd(NUM_OPERATIONS, NUM_ELEMENTS);
        long linkedListGetTime = testLinkedListGet(NUM_OPERATIONS, NUM_ELEMENTS);
        long linkedListRemoveTime = testLinkedListRemove(NUM_OPERATIONS, NUM_ELEMENTS);

        // Вывод результатов
        System.out.println("Метод\t\t\tКоличество вызовов\tВремя выполнения (нс)");
        System.out.println("----------------------------------------------------");
        System.out.println("ArrayList add\t\t" + NUM_OPERATIONS + "\t\t\t" + arrayListAddTime);
        System.out.println("ArrayList get\t\t" + NUM_OPERATIONS + "\t\t\t" + arrayListGetTime);
        System.out.println("ArrayList remove\t" + NUM_OPERATIONS + "\t\t\t" + arrayListRemoveTime);
        System.out.println("LinkedList add\t\t" + NUM_OPERATIONS + "\t\t\t" + linkedListAddTime);
        System.out.println("LinkedList get\t\t" + NUM_OPERATIONS + "\t\t\t" + linkedListGetTime);
        System.out.println("LinkedList remove\t" + NUM_OPERATIONS + "\t\t\t" + linkedListRemoveTime);
    }

    public static long testArrayListAdd(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                arrayList.add(j);
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long testArrayListGet(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                arrayList.add(j);
            }
            for (int j = 0; j < numElements; j++) {
                arrayList.get(j);
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long testArrayListRemove(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                arrayList.add(j);
            }
            for (int j = 0; j < numElements; j++) {
                arrayList.remove(0);
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long testLinkedListAdd(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                linkedList.add(j);
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long testLinkedListGet(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                linkedList.add(j);
            }
            for (int j = 0; j < numElements; j++) {
                linkedList.get(j);
            }
        }
        return System.nanoTime() - startTime;
    }

    public static long testLinkedListRemove(int numOperations, int numElements) {
        long startTime = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOperations; i++) {
            for (int j = 0; j < numElements; j++) {
                linkedList.add(j);
            }
            for (int j = 0; j < numElements; j++) {
                linkedList.remove(0);
            }
        }
        return System.nanoTime() - startTime;
    }
}
