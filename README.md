# SPN_SJF_Algorithm

---
---
---

# Process Scheduler with Heap Sort

This project implements a **Process Scheduler GUI Application** using Java Swing. The application enables users to input process details such as **Arrival Time** and **Running Time**, sorts the processes using the **Heap Sort algorithm**, and calculates scheduling details, including **Completion Time**, **Turnaround Time**, and **Waiting Time**.

The GUI is user-friendly, dynamic, and modern, making it easy for users to input data and view results efficiently.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
4. [How to Run the Project](#how-to-run-the-project)
5. [Program Flow](#program-flow)
6. [Sample Output](#sample-output)
7. [Future Improvements](#future-improvements)

---

## Features
1. **Dynamic Process Input**:
   - Input the number of processes dynamically using a pop-up dialog.
   - Input fields for **Arrival Time** and **Running Time** are generated dynamically.

2. **Heap Sort Algorithm**:
   - Sorts processes based on **Arrival Time** in ascending order.
   - Maintains synchronization between **Arrival Time** and **Running Time**.

3. **Scheduling Computations**:
   - Calculates:
      - **Completion Time**
      - **Turnaround Time** (Completion Time - Arrival Time)
      - **Waiting Time** (Turnaround Time - Running Time)
   - Displays average **Turnaround Time** and **Waiting Time**.

4. **Interactive GUI**:
   - A clean and organized user interface built with **Java Swing**.
   - Results are displayed in an easy-to-read format using a scrollable text area.

---

## Technologies Used
- **Java** (Java Swing for GUI components)
- **Heap Sort Algorithm** (custom implementation)
- **NetBeans IDE** (Version 8.2 or newer)

---

## Project Structure
The project includes the following classes:

### 1. **ProcessSchedulerGUI**
- The main GUI application.
- Handles:
  - Dynamic process input
  - Sorting via Heap Sort
  - Scheduling calculations
  - Result display in a formatted area.

### 2. **HeapSort**
- Contains the implementation of the **Heap Sort algorithm**.
- Allows sorting of two arrays (**Arrival Time** and **Running Time**) while preserving the mapping between them.

### 3. **ProcessScheduler**
- Performs the scheduling computations:
   - **Completion Time**
   - **Turnaround Time**
   - **Waiting Time**
- Calculates the averages for Turnaround Time and Waiting Time.
- Prepares results in a table-like format.

---

## How to Run the Project
Follow these steps to run the project in **NetBeans IDE 8.2**:

1. **Set up the Environment**:
   - Ensure you have **Java JDK 8 or later** installed.
   - Install and set up **NetBeans IDE 8.2**.

2. **Create a New Java Project**:
   - Open NetBeans and create a new **Java Application Project**.

3. **Add Source Files**:
   - Copy the following files into your project:
     - `ProcessSchedulerGUI.java`
     - `HeapSort.java`
     - `ProcessScheduler.java`

4. **Run the Application**:
   - Compile and execute the `ProcessSchedulerGUI` class.
   - Enter the requested inputs, including:
      - Number of processes
      - Arrival Time and Running Time for each process.

---

## Program Flow
1. **Input Process Details**:
   - A pop-up asks for the number of processes.
   - The GUI dynamically creates input fields for the processes.

2. **Sort Arrival and Running Times**:
   - Click on **"Sort Processes (Heap Sort)"** to sort processes using the Heap Sort algorithm.

3. **Calculate Scheduling**:
   - Click on **"Calculate Scheduling"** to compute:
      - Completion Time
      - Turnaround Time
      - Waiting Time
   - Display results in a formatted table with averages.

4. **Result Display**:
   - Results are shown in a **scrollable text area** for clarity.

---

## Sample Output
### **Input**
- Number of processes: `3`
- Arrival Times: `4, 0, 2`
- Running Times: `6, 5, 3`

### **Sorted Processes (Heap Sort)**
```
Processes Sorted by Arrival Time using Heap Sort:
P1 - Arrival Time: 0, Running Time: 5
P2 - Arrival Time: 2, Running Time: 3
P3 - Arrival Time: 4, Running Time: 6
```

### **Scheduling Results**
```
Process    Arrival    Running    Completion    Turnaround    Waiting
P1         0          5          5             5             0
P2         2          3          8             6             3
P3         4          6          14            10            4

Average Turnaround Time: 7.0
Average Waiting Time: 2.3333333
```

---

## Future Improvements
1. **Additional Scheduling Algorithms**:
   - Implement other algorithms like FCFS, SJF, Priority Scheduling, and Round-Robin.
2. **Real-Time Charts**:
   - Integrate graphical charts (e.g., Gantt charts) to display scheduling timelines visually.
3. **Error Handling**:
   - Add advanced error handling for invalid or missing inputs.
4. **Input File Support**:
   - Allow importing processes from files (e.g., CSV).

---

## Acknowledgements
- **Heap Sort** Algorithm: Implemented as a custom sorting technique.
- Special thanks to the NetBeans community for providing a robust IDE for Java development.

---

## Author
[babak yousefian]  
[Your Email/babakyousefian2000@gmail.com]  
"Dedicated to making process scheduling intuitive and efficient."

---
---
---

# @Author : babak yousefian
