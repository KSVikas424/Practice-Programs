package collections;

import java.util.Stack;

public class UsingStack {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, 5, 4 ,1,2,3,1,1,1,1};
		Stack s = new Stack();
		s.push(arr[0]);
		System.out.print("[");
		//System.out.println(s.capacity());
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= (int) s.peek()) {
				System.out.print(arr[i]+"h  ");
				s.push(arr[i]);
				System.out.print(arr[i]+ " ");
				s.pop();
			} else {
				System.out.print(arr[i]+" ");
			}
			if(i == arr.length-1) {
				System.out.print("-1");
			}
		}
		System.out.print("]");
	}

}
