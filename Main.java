import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static int number;
    private static char[] Processes;
    private static double[] Arrival_Time;
    private static double[] Running_Time;
    private static double[] External_Time;
    private static Process myProcess;
    private static HeapSort heapSort; // Declare the heapSort variable

    public static void main(String[] args) {
        input = new Scanner(System.in);
        heapSort = new HeapSort(); // Initialize heapSort here
        myProcess = new Process(); // Initialize the Process object
        Get_Number_Of_Processes();
        Create_Processes_Array();
        Create_Arrival_Time();
        Create_Running_Time();
        Create_External_Time(Arrival_Time, Running_Time);
        EXIT();
    }
    private static void Get_Number_Of_Processes(){
        input = new Scanner(System.in);
        System.out.print("\n\n Please enter your number of your processes: ");
        number = input.nextInt();
    }
    private static void Create_Processes_Array(){
        Processes = new char[number];
        char ch='A';
        for (int i=0 ; i<Processes.length ; i++){
            Processes[i]=ch;
            ch++;
        }
        System.out.print("\n\n The Processes is : ");
        for(int i=0 ; i<Processes.length ; i++){
            System.out.print("["+Processes[i]+"]");
        }
    }
    private static void Create_Arrival_Time(){
        Arrival_Time = new double[number];
        char ch1='A';
        for(int i=0 ; i<Arrival_Time.length ; i++){
            System.out.print("\n Please enter your Arrival time of "+ch1+" is : ");
            Arrival_Time[i]=input.nextDouble();
            ch1++;
        }
        System.out.print("\n\n The Arrival time is : ");
        Print(Arrival_Time);
    }
    private static void Create_Running_Time(){
        Running_Time = new double[number];
        char ch2='A';
        for(int i=0 ; i<Running_Time.length ; i++){
            System.out.print("\n Please enter your Running time of "+ch2+" is : ");
            Running_Time[i]=input.nextDouble();
            ch2++;
        }
        System.out.print("\n\n The Running time is : ");
        Print(Running_Time);
    }
    private static void Create_External_Time(double[] Arrival_Time , double[] Running_Time){

        External_Time = new double[Running_Time.length];
        double template = Arrival_Time[0];
        int counter=0;

        for(int i=0 ; i<Arrival_Time.length ; i++){
            if(Arrival_Time[i] == template){
                counter++;//4
            }else{
                continue;
            }
        }

        if(counter == Arrival_Time.length){//true
            int java=0;
            for(int i=0 ; i<Running_Time.length ; i++){
                if(i<Running_Time.length-1){//i=0 , R.l-1 = 3
                    if(Running_Time[i]<Running_Time[i+1]){//R[0]=5 , R[1]=7 true
                                                          /*
                                                          R[1]=7 , R[2]=8 true
                                                          R[2]=8 , R[3]=9 true
                                                          R[3]=9 , R[4]=index out of bound exception
                                                          */
                        java++;//java=3
                    }
                }
            }
            if((java == Running_Time.length) || (java == Running_Time.length-1)){
                System.out.print("\n\n Your Sorted running time is : ");
                Print(Running_Time);
                myProcess.test(Running_Time,External_Time);
            }else{
                Heap_Sort(Running_Time);
                System.out.print("\n\n Running time sorted within heap algorithm is= ");
                Print(Running_Time);
                myProcess.test(Running_Time,External_Time);
            }
        }else if(counter!=Arrival_Time.length){
            System.err.print("\n\n Please enter the same arrival time for each processes...!!!");
        }

    }

    private static void Heap_Sort(double[] Running_Time){
        heapSort.sort(Running_Time);
    }

    private static void Print(double[] objects){
        for(int i=0 ; i<objects.length ; i++){
            System.out.print("["+objects[i]+"]");
        }
        System.out.println("\n\n");
    }

    private static void EXIT() {
        System.err.print("\n\n please ENTER to exit...!!!");
        Scanner sc = new Scanner(System.in); // Create a new Scanner
        try {
            sc.nextLine(); // Read the input
        } catch (Exception exception) {
            System.out.print("\n\n your error message is : " + exception.getMessage() + "\n");
            exception.printStackTrace();
        } finally {
            sc.close(); // Close this scanner
            System.out.println();
        }
    }

}