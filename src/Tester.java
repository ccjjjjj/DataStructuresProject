import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    static void generateDataSet() {
        Data.generateBestCase(1000000, "res/1MBestCase.csv");
        Data.generateWorstCase(1000000, "res/1MWorstCase.csv");
        Data.generateAverageCase(1000000, "res/1MAverageCase.csv");
        // Do the same for the 200K, 500K and 1M datasets
    }

    static void benchmark10K() {
        List<Integer> temp;
        int[] bestCase10k;
        int[] worstCase10k;
        int[] averageCase10k;
        int[] sortedBestCase10k;
        int[] sortedWorstCase10k;
        int[] sortedAverageCase10k;

        // Convert List<Integer> to int[]
        temp = Data.parse("res/10KBestCase.csv");
        bestCase10k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/10KWorstCase.csv");
        worstCase10k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/10KAverageCase.csv");
        averageCase10k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();

        // Bubble Sort
        System.out.println("Bubble Sort");
        System.out.println("Best Case 10K");
        Timer timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 10K");
        timer = new Timer();
        Sort.bubble(sortedWorstCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 10K");
        timer = new Timer();
        Sort.bubble(sortedAverageCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();

        // Selection Sort

        System.out.println("Selection Sort");
        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.selection(sortedBestCase10k);
        System.out.println("Best Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 10K");
        timer = new Timer();
        Sort.selection(sortedWorstCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 10K");
        timer = new Timer();
        Sort.selection(sortedAverageCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();

        // Insertion Sort
        System.out.println("Insertion Sort");
        timer = new Timer();
        Sort.insertion(sortedBestCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 10K");
        timer = new Timer();
        Sort.insertion(sortedWorstCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 10K");
        timer = new Timer();
        Sort.insertion(sortedAverageCase10k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

    }

    static void benchmark200K() {
        List<Integer> temp;
        int[] bestCase200k;
        int[] worstCase200k;
        int[] averageCase200k;
        int[] sortedBestCase200k;
        int[] sortedWorstCase200k;
        int[] sortedAverageCase200k;

        temp = Data.parse("res/200KBestCase.csv");
        bestCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
        temp = Data.parse("res/200KWorstCase.csv");
        worstCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
        temp = Data.parse("res/200KAverageCase.csv");
        averageCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();

        // Bubble Sort
        System.out.println("Bubble Sort");
        System.out.println("Best Case 200K");
        Timer timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 200K");
        timer = new Timer();
        Sort.bubble(sortedWorstCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 200K");
        timer = new Timer();
        Sort.bubble(sortedAverageCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        // Clone the Array
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();

        // Selection Sort
        System.out.println("Selection Sort");
        System.out.println("Best Case 200K");
        timer = new Timer();  // START THE TIMER
        Sort.selection(sortedBestCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 200K");
        timer = new Timer();
        Sort.selection(sortedWorstCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 200K");
        timer = new Timer();
        Sort.selection(sortedAverageCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        // Clone the array
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = worstCase200k.clone();


        // Insertion Sort
        System.out.println("Insertion Sort");
        System.out.println("Best Case 200K");
        timer = new Timer();  // START THE TIMER
        Sort.insertion(sortedBestCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Worst Case 200K");
        timer = new Timer();
        Sort.insertion(sortedWorstCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        System.out.println("Average Case 200K");
        timer = new Timer();
        Sort.insertion(sortedAverageCase200k);
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

    }
    public static void main(String[] args) {
        //generateDataSet();


    }
}
