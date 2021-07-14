/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



class SelectionSort {

   SelectionSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
        JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                  Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                if(str.equals(""))
                                { nullpoint obj=new nullpoint();}
                                else
                                {
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            
            
            
            for (int j = 0; j < l; j++) {
                
                s.append(arr[j]+" ");
                
            }
            s.append(";");
                           String s1=s.toString();
                           
           jt.setText(s1);  
           bu.setText("O(n^2)");
                                    try {
                                        Thread.sleep(200);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(SelectionSort.class.getName()).log(Level.SEVERE, null, ex);
                                    }
    
        }
               //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				}
                        }
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }

    private static class nullpoint {

        public nullpoint() {
            JFrame f=new JFrame("Invalid Input");
            JOptionPane.showMessageDialog(f,"Please Enter Input in this format 3,6,7,0,1,4 ");
        }
    }
    
}
//---------------------------------------------------------------------------------------------------------------------------------------------

class BubbleSort {

   BubbleSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
         JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                     Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
   
        for (int i = 0; i < n-1; i++) 
        {  for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            
            
            for (int k = 0; k < l; k++) {
                
                s.append(arr[k]+" ");
                
            }
            s.append(";");
                           String s1=s.toString();
                           
           jt.setText(s1);  
           bu.setText("O(n^2)");
                                    try {
                                        Thread.sleep(200);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(BubbleSort.class.getName()).log(Level.SEVERE, null, ex);
                                    }
    
        }
                        }   //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
    
}


//---------------------------------------------------------------------------------------------------------------------------------------------
class InsertionSort {

   InsertionSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
     JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
         JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                          Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                            
  
         int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
         
            
            
            for (int z = 0; z < l; z++) {
                
                s.append(arr[z]+" ");
                
            }
            s.append(";");
                           String s1=s.toString();
                           
           jt.setText(s1);  
           
           bu.setText("O(n^2)");
           
                                    try {
                                        Thread.sleep(200);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(SelectionSort.class.getName()).log(Level.SEVERE, null, ex);
                                    }
    
        }
               //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				}
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
    
}
//-----------------------------------------------------------------------------------------------------------------------------------------------


class MergeSort {
public String s1;
StringBuilder s=new StringBuilder();
   MergeSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
       JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
          JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                          Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
  
  mergeSort(arr,0,n-1);  
  
   
               //   String hi=Integer.toString(papers);
				jt.setText(s1);                 
             bu.setText("O(n log(n))");
				}
			} );
                
               
             
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
  
   void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
    
    /* create temp arrays */
    int L[]=new int[n1];
    int R[]=new int[n2]; 
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1+ j]; 
    
    
       for (int p = 0; p < r+1; p++) {
                
                s.append(arr[p]+" ");
                
            }
            s.append(";");
                 
    
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
   
          for (int p = 0; p < r+1; p++) {
                
                s.append(arr[p]+" ");
                
            }
            s.append(";");
                 
        
    } 
  
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    
      for (int p = 0; p < r+1; p++) {
                
                s.append(arr[p]+" ");
                
            }
            s.append(";");
                 
    } 

    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
   
      for (int p = 0; p < r+1; p++) {
                
                s.append(arr[p]+" ");
                
            }
            s.append(";");
                 
    } 
   
} 

void mergeSort(int arr[], int l, int r) 
{ 
    
    if (l < r) 
    { 

        int m = l+(r-l)/2; 
        
 
        
        // Sort first and second halves 
        mergeSort(arr, l, m); 
        mergeSort(arr, m+1, r); 
  
        
        
        merge(arr, l, m, r); 
    } 
    
    s1=s.toString();
} 
  
   
    
}

//-----------------------------------------------------------------------------------------------------------------------------------------------

class QuickSort  {
public String s1;
 StringBuilder s=new StringBuilder();
   QuickSort ()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
        JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                          Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
  
      
           sort(arr,0,n-1);
           jt.setText(s1);
           bu.setText("O(n^2)");
               //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				}
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
   int partition(int arr[], int low, int high) 
    { 
       
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        
        
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
             for (int p = 0; p < (int)arr.length; p++) {
                
                s.append(arr[p]+" ");
                
            }
            s.append(";");
            
         
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        
          
        
  
            
        return i+1; 
    } 
  
    void sort(int arr[], int low, int high) 
    { 
        
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
           
            sort(arr, pi+1, high); 
            
           
        } 
         s1=s.toString();
    } 
    
}

//-------------------------------------------------------------------------------------------------------------------------------------------------

class HeapSort  {
public String s1;
 StringBuilder s=new StringBuilder();
   HeapSort ()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
     JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                          Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
  
      sort(arr);
     
           jt.setText(s1);
           bu.setText("O(nLogn)");
               //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				}  
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
  public void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i);
        
 
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
            for ( int z = 0; z < n; z++) {
            s.append(arr[z]+" ");
            
        }
       s.append(";");
             
        }
        
         
      
         s1=s.toString();
    } 
  
   void heapify(int arr[], int n, int i) 
    { 
        int largest = i;  // Initialize largest as root 
        int l = 2*i + 1;  // left = 2*i + 1 
        int r = 2*i + 2;  // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
            
        } 
    }
  
    
}
//---------------------------------------------------------------------------------------------------------------------------------------------------


class ShellSort {
    public String s1;
StringBuilder s=new StringBuilder();
   ShellSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
         JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                     Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
   
      sort(arr);
      
    jt.setText(s1);
           bu.setText("O(n3/2)");
        
                        }   //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
          
            for (int i = gap; i < n; i += 1) 
            { 
              
                int temp = arr[i]; 
  
             
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                arr[j] = temp; 
                
                
                 for ( int z = 0; z < n; z++) {
            s.append(arr[z]+" ");
            
        }
       s.append(";");
            }
            
        }
        s1=s.toString();
        return 0; 
    } 
    
}


//-------------------------------------------------------------------------------------------------------------------------------------------------


class BucketSort {
    public String s1;
StringBuilder s=new StringBuilder();
   BucketSort()
            {
        
        JFrame f=new JFrame("Hello Hemanth");
        JLabel l1=new JLabel("Time Complex");
        
        JLabel b1=new JLabel("  Enter No's:    ");
        JLabel b=new JLabel("    OutPut:       ");
         JTextField jtf = new JTextField(25);
        JTextField jt = new JTextField(25);
        JTextField bu = new JTextField(25);
        
        b.setBounds(130,100,100,40);
        b1.setBounds(130,100,100,40);
        
         f.add(b1);
         f.add(jtf);
         
        f.add(b);
        f.add(jt);
      
       f.add(l1);
       f.add(bu);
        f.setSize(400,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        
        JButton l3 = new JButton("                                     Sort                                           ");
		l3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
				String str = jtf.getText();
                                StringBuilder s=new StringBuilder();
                                String[] list = str.split(" "); 
                                int l=list.length;
                                int arr[]=new int[l];
                                for (int i = 0; i < l; i++) {
                                    { int n = Integer.parseInt(list[i]);
                                 arr[i]=n;}
                            }
                             int n = arr.length; 
   
     int max= max_value(arr); 
  sort(arr, max);
 
    jt.setText(s1);
           bu.setText("O(n)");
        
                        }   //   String hi=Integer.toString(papers);
			//	f2.setText(hi);                 
             
				
			} );
         l3.setBounds(130,100,100,40);
          f.add(l3);
        
    }
    int sort(int[] nums, int max_value) 
    {
        // Bucket Sort
        int[] Bucket = new int[max_value + 1];
        int[] sorted_nums = new int[nums.length];
         for (int i = 0; i < nums.length; i++)
          Bucket[nums[i]]++;
          int outPos = 0;
         for (int i = 0; i < Bucket.length; i++)
              for (int j = 0; j < Bucket[i]; j++)
              {     sorted_nums[outPos++] = i;
            for ( int z = 0; z < nums.length; z++) {
            s.append(sorted_nums[z]+" ");
            
        }
       s.append(";");
              }
         
       
         
         s1=s.toString();
          return 0;
      }
   
     static int max_value(int[] nums) 
    {
        int max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    } 
    
}

//--------------------------------------------------------------------------------------------------------------------------------------------------
public class OopsProject extends JFrame{


  public OopsProject()
  {
      
          
      
      this.setTitle("Sorting Algorithms");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 400);
      JLabel s=new JLabel("Sorting Algorithms");
     //  JLabel s1=new JLabel(" Pages    ");
      this.setLayout(new FlowLayout());
  
     // JTextField f1=new JTextField("Please Enter No.of Pages",28);
    //  JTextField f2=new JTextField("No of pages Left",28);
  
   JButton button = new JButton("                                     Selection Sort                                      ");
		button.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                           
                               SelectionSort obj=new SelectionSort();
                                
                               
				}
			} );
   JButton button1 = new JButton("                                        Bubble Sort                                        ");
		button1.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
			BubbleSort obj1=new BubbleSort();
				}
			} );
                
   JButton button2 = new JButton("                                       Insertion Sort                                      ");
		button2.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
			InsertionSort obj2=new InsertionSort();
				}
			} );
                
   JButton button3 = new JButton("                                        Merge Sort                                         ");
		button3.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
			MergeSort obj3=new MergeSort();
                        
				}
			} );
                
    JButton button4 = new JButton("                                       QuickSort                                           ");
		button4.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                            
			QuickSort obj4=new QuickSort();
                        
				}
			} );
                
                  
   JButton button5 = new JButton("                                       Heap  Sort                                         ");
		button5.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                           
                              HeapSort obj=new HeapSort();
                                
                               
				}
			} );
                
          JButton button6 = new JButton("                                       Shell  Sort                                         ");
		button6.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                           
                              ShellSort obj=new ShellSort();
                                
                               
				}
			} );
                   JButton button7 = new JButton("                                      Bucket  Sort                                       ");
		button7.addActionListener ( new ActionListener() {   
                   
			public void actionPerformed(ActionEvent ev) {
                           
                              BucketSort obj=new BucketSort();
                                
                               
				}
			} );
	this.add(s);
		//this.add(f1);
             //   this.add(s1);
              //  this.add(f2);
		
		this.add(button);
                this.add(button1);
                this.add(button2);
                this.add(button3);
                this.add(button4);
                this.add(button5);
                this.add(button6);
                this.add(button7);
		}
     
  
 
	public static void main(String args[]) {
		 OopsProject gui = new  OopsProject();
               
		gui.setVisible(true);
                
	}
       
  }
    


