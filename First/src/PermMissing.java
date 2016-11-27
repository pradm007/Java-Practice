import java.util.ArrayList;

public class PermMissing {

	public static void main(String[] args) {
		int[] a = {1,9,3,4};
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			list.add((Integer) (i+1));
		}
		
		for(int i=0;i<a.length;i++) {
			list.remove((Integer)a[i]);
		}

		System.out.println(list.get(0));
	}

}
