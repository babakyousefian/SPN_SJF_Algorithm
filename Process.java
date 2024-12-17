import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Process {
    int pid; // Process ID
    int arrivalTime; // Arrival time of the process
    int burstTime; // Burst time (CPU time required)
    int completionTime; // Time when the process completes execution
    int turnAroundTime; // Total time taken from arrival to completion
    int waitingTime; // Waiting time before execution

    // Constructor to initialize process
    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    public Process(){}

    public void test(double[] running_time, double[] external_time) {
        // Array to store processes
        Process[] processes = new Process[running_time.length];

        // Initialize the Process objects with PID, Arrival Time, and Burst Time
        for (int i = 0; i < running_time.length; i++) {
            processes[i] = new Process(i + 1, (int) external_time[i], (int) running_time[i]);
        }

        // Sort processes by arrival time using Arrays.sort with a custom comparator
        Arrays.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));

        // Calculate completion time, turn-around time, and waiting time
        calculateTimes(processes, running_time.length);

        // Display the process schedule and timings
        displayResults(processes, running_time.length);

        // Do not close the scanner
        // sc.close();  // Remove this line
    }



    private void calculateTimes(Process[] processes, int n) {
        int currentTime = 0;

        for (int i = 0; i < n; i++) {
            Process p = processes[i];

            if (currentTime < p.arrivalTime) {
                currentTime = p.arrivalTime; // If CPU is idle, move time to the process's arrival time
            }

            p.completionTime = currentTime + p.burstTime; // Completion time is current time + burst time
            p.turnAroundTime = p.completionTime - p.arrivalTime; // Turnaround time = completion time - arrival time
            p.waitingTime = p.turnAroundTime - p.burstTime; // Waiting time = turnaround time - burst time

            currentTime = p.completionTime; // Update the current time to process completion time
        }
    }

    // Method to display results
    private void displayResults(Process[] processes, int n) {
        System.out.println("\nProcess\tArrival Time\tBurst Time\tCompletion Time\tTurnaround Time\tWaiting Time");

        for (int i = 0; i < n; i++) {
            Process p = processes[i];
            System.out.println("P" + p.pid + "\t\t" + p.arrivalTime + "\t\t" + p.burstTime + "\t\t" + p.completionTime
                    + "\t\t" + p.turnAroundTime + "\t\t" + p.waitingTime);
        }

        // Calculate average waiting and turnaround time
        double totalWaitingTime = 0, totalTurnAroundTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += processes[i].waitingTime;
            totalTurnAroundTime += processes[i].turnAroundTime;
        }

        System.out.println("\nAverage Turnaround Time: " + (totalTurnAroundTime / n));
        System.out.println("Average Waiting Time: " + (totalWaitingTime / n));
    }

}
