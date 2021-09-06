import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    static void generateDataSet() {
        Data.generateBestCase(10000, "res/10KBestCase.csv");
        Data.generateWorstCase(10000, "res/10KWorstCase.csv");
        Data.generateAverageCase(10000, "res/10KAverageCase.csv");
        Data.generateBestCase(200000, "res/200KBestCase.csv");
        Data.generateWorstCase(200000, "res/200KWorstCase.csv");
        Data.generateAverageCase(200000, "res/200KAverageCase.csv");
        Data.generateBestCase(500000, "res/500KBestCase.csv");
        Data.generateWorstCase(500000, "res/500KWorstCase.csv");
        Data.generateAverageCase(500000, "res/500KAverageCase.csv");
        Data.generateBestCase(1000000, "res/1MBestCase.csv");
        Data.generateWorstCase(1000000, "res/1MWorstCase.csv");
        Data.generateAverageCase(1000000, "res/1MAverageCase.csv");
        // Do the same for the 200K, 500K and 1M datasets
    }

    public static void main(String[] args) {
         generateDataSet();

        /*
            Sample Code for testing n = 10, 000
         */

        List<Integer> temp;
        int[] bestCase10k;
        int[] worstCase10k;
        int[] averageCase10k;
        int[] sortedBestCase10k;
        int[] sortedWorstCase10k;
        int[] sortedAverageCase10k;
        int[] bestCase200k;
        int[] worstCase200k;
        int[] averageCase200k;
        int[] sortedBestCase200k;
        int[] sortedWorstCase200k;
        int[] sortedAverageCase200k;
	    int[] worstCase500k;
        int[] averageCase500k;
        int[] sortedBestCase500k;
        int[] sortedWorstCase500k;
        int[] sortedAverageCase500k;
	    int[] worstCase1Mil;
        int[] averageCase1Mil;
        int[] sortedBestCase1Mil;
        int[] sortedWorstCase1Mil;
        int[] sortedAverageCase1Mil;

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
	    temp = Data.parse("res/500KBestCase.csv");
        bestCase500k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/500KWorstCase.csv");
        worstCase500k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/500KAverageCase.csv");
        averageCase500k = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

	    temp = Data.parse("res/1MilBestCase.csv");
        bestCase1Mil = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/1MilWorstCase.csv");
        worstCase1Mil = temp
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        temp = Data.parse("res/1MilAverageCase.csv");
        averageCase1Mil = temp
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
	    sortedBestCase500k = bestCase500k.clone();
        sortedWorstCase500k = worstCase500k.clone();
        sortedAverageCase500k = averageCase500k.clone();
	    sortedBestCase1Mil = bestCase1Mil.clone();
        sortedWorstCase1Mil = worstCase1Mil.clone();
        sortedAverageCase1Mil = averageCase1Mil.clone();

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

        timer = new Timer();
        Sort.bubble(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedAverageCase10k);
        System.out.println("Average Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase200k);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase500k);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedWorstCase500k);
        System.out.println("Worst Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedAverageCase500k);
        System.out.println("Average Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.bubble(sortedBestCase1Mil);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedWorstCase1Mil);
        System.out.println("Worst Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.bubble(sortedAverageCase1Mil);
        System.out.println("Average Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();
	    sortedBestCase500k = bestCase500k.clone();
        sortedWorstCase500k = worstCase500k.clone();
        sortedAverageCase500k = averageCase500k.clone();
	    sortedBestCase1Mil = bestCase1Mil.clone();
        sortedWorstCase1Mil = worstCase1Mil.clone();
        sortedAverageCase1Mil = averageCase1Mil.clone();

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

        timer = new Timer();
        Sort.selection(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedAverageCase10k);
        System.out.println("Average Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
        System.out.println();

        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.selection(sortedBestCase200k);
        System.out.println("Selection Sort");
        System.out.println();
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.selection(sortedBestCase500k);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedWorstCase500k);
        System.out.println("Worst Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedAverageCase500k);
        System.out.println("Average Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.selection(sortedBestCase1Mil);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedWorstCase1Mil);
        System.out.println("Worst Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.selection(sortedAverageCase1Mil);
        System.out.println("Average Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();


        // Clone the original unsorted array
        // work with the clone
        sortedBestCase10k = bestCase10k.clone();
        sortedWorstCase10k = worstCase10k.clone();
        sortedAverageCase10k = averageCase10k.clone();
        sortedBestCase200k = bestCase200k.clone();
        sortedWorstCase200k = worstCase200k.clone();
        sortedAverageCase200k = averageCase200k.clone();
	    sortedBestCase500k = bestCase500k.clone();
        sortedWorstCase500k = worstCase500k.clone();
        sortedAverageCase500k = averageCase500k.clone();
	    sortedBestCase1Mil = bestCase1Mil.clone();
        sortedWorstCase1Mil = worstCase1Mil.clone();
        sortedAverageCase1Mil = averageCase1Mil.clone();


        // Insertion Sort
        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.insertion(sortedBestCase10k);
        System.out.println("Insertion Sort");
        System.out.println();
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedWorstCase10k);
        System.out.println("Worst Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedAverageCase10k);
        System.out.println("Average Case 10K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();    // CREATE A NEW TIMER TO RESET THE TIME
        Sort.insertion(sortedBestCase200k);
        System.out.println("Insertion Sort");
        System.out.println();
        System.out.println("Best Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedWorstCase200k);
        System.out.println("Worst Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();  

        timer = new Timer();
        Sort.insertion(sortedAverageCase200k);
        System.out.println("Average Case 200K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.insertion(sortedBestCase500k);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedWorstCase500k);
        System.out.println("Worst Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedAverageCase500k);
        System.out.println("Average Case 500K");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

	    timer = new Timer();  // START THE TIMER
        Sort.insertion(sortedBestCase1Mil);
        System.out.println("Bubble Sort");
        System.out.println();
        System.out.println("Best Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedWorstCase1Mil);
        System.out.println("Worst Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();

        timer = new Timer();
        Sort.insertion(sortedAverageCase1Mil);
        System.out.println("Average Case 1Mil");
        System.out.println("Time:" + timer.timeElapsed());
        System.out.print("Instructions: ");
        System.out.println(new BigDecimal(Sort.counter).toPlainString());
        System.out.println();
    }
}
