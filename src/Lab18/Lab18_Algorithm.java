package Lab18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lab18_Algorithm {

	public static void main(String[] args) {
		
	ArrayList<Integer> num = new ArrayList<>();
	ArrayList<Integer> dumbnum = new ArrayList<>();
	int[] otherDumbnum = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
	dumbnum.addAll(Arrays.asList(otherDumbnum, 1,2,3,2,2,4,5,5,7,8,4,4,1,0,10));
	num.add(0);
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	num.add(7);
	num.add(8);
	num.add(9);
	 //Big 0 estimation 0(n^2)
	for (int i = 0 ; i < num.size() ; i++) {
		int sum = 0;
			for (int f = 0 ; f < dumbnum.size() ; ++f)
				if (num.indexOf(i) == dumbnum.indexOf(f)) {
					sum += 1;
					System.out.println(num.indexOf(i) + "- " + sum);
					
				}
		}
		System.out.println();
		
	}
}
	
//	Map<Integer, Integer> freq = new HashMap<>();

//		freq.put(1, 0);
//		freq.put(2, 0);	
//		freq.put(3, 0);
//		freq.put(4, 0);
//		freq.put(5, 0);
//		freq.put(6, 0);
//		freq.put(7, 0);
//		freq.put(8, 0);
//		freq.put(9, 0);
//		freq.put(10, 0);
		
		// Big 0 estimation 0(n^2)
//		for (int entry : dumbnum) {
//	          if(freq.containsKey(entry)) {
//	                freq.put(entry, freq.get(entry)+1);
//	            }
//	            else {
//	                freq.put(entry, 1);
//	            }
//	        }
//		System.out.println(freq);
//		}
//	}

