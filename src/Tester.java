import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    static void generateDataSet() {
        Data.generateBestCase(10000, "res/10KBestCase.csv");
        // Data.generateWorstCase(10000, "res/10KWorstCase.csv");
        // Data.generateAverageCase(10000, "res/10KAverageCase.csv");
        
        Data.generateBestCase(200000, "res/200KBestCase.csv");
        Data.generateWorstCase(200000, "res/200KWorstCase.csv");
        Data.generateAverageCase(200000, "res/200KAverageCase.csv");
        // Do the same for the 200K, 500K and 1M datasets
    }

    public static void main(String[] args) {
        // generateDataSet();

        List<Integer> temp;
        int[] bestCase10k;
        int[] worstCase10k;
        int[] averageCase10k;
        int[] sortedBestCase10k;
        int[] sortedWorstCase10k;
        int[] sortedAverageCase10k;
        
        List<Integer> tempp;
        int[] bestCase200k;
        int[] worstCase200k;
        int[] averageCase200k;
        int[] sortedBestCase200k;
        int[] sortedWorstCase200k;
        int[] sortedAverageCase200k;

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
        
        tempp = Data.parse("res/200KBestCase.csv");
        bestCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        tempp = Data.parse("res/200KWorstCase.csv");
        worstCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        tempp = Data.parse("res/200KAverageCase.csv");
        averageCase200k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();
        
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();

        // Bubble Sort
        Timer timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase10k);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.bubble(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.bubble(sortedAverageCase10k);
        System.out.println("Average Case 10K");
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
        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.selection(sortedBestCase10k);
        System.out.println("Selection Sort");
        System.out.println();
        System.out.println("Best Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.selection(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.selection(sortedAverageCase10k);
        System.out.println("Average Case 10K");
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
        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.insertion(sortedBestCase10k);
        System.out.println("Insertion Sort");
        System.out.println();
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.insertion(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        Sort.insertion(sortedAverageCase10k);
        System.out.println("Average Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        
        //bubble sort 200k
        Timer timer = new Timer();  // 200K
        Sort.bubble(sortedBestCase200k);
        System.out.println("Bubble Sort");
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.bubble(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.bubble(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();

        //selection sort 200k
        timer = new Timer();
        Sort.selection(sortedBestCase200k);
        System.out.println("Selection Sort");
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.selection(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.selection(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();

        //insertion sort 200k
        timer = new Timer();
        Sort.insertion(sortedBestCase200k);
        System.out.println("Insertion Sort");
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.insertion(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());

        timer = new Timer();
        Sort.insertion(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
    }
}
