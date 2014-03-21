import java.util.Arrays;

public class mergesort {
  public void mergesort(int [] arg) {
    int length = arg.length;
    if (length < 2) {
      return;
    }
    
    int [] left;
    int [] right;
    
    left = Arrays.copyOfRange(arg, 0, length / 2);
    right = Arrays.copyOfRange(arg, length/2, length);
    
    mergesort(left);
    mergesort(right);
    
    merge(arg, left, right);
    
  }
  
  public void merge(int [] ori, int [] left, int [] right) {
    int l_length = left.length;
    int r_length = right.length;
    int lpoint, rpoint;
    lpoint = rpoint = 0;
    for (int i = 0; i < ori.length; i++) {
      if (rpoint == r_length || lpoint < l_length && left[lpoint] <= right[rpoint]) {
        ori[i] = left[lpoint];
        lpoint++;
      }
      
      else {
        ori[i] = right[rpoint];
        rpoint++;
      }
    }
  }
  
  public static void main (String [] args) {
    mergesort run = new mergesort();
    int [] hello = {1};
    System.out.println(Arrays.toString(hello));
    run.mergesort(hello);
    System.out.println(Arrays.toString(hello));
  }
}