import java.util.ArrayList;
import java.util.HashMap;

public class AtOddPosition {

	public static void main(String[] args) {
		int[] array = { 9,3,9,3,9,7,9 };
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (!arrayList.contains(array[i])) {
				arrayList.add((Integer)array[i]);
			} else {
				arrayList.remove((Integer)array[i]);
			}
		}
		
		System.out.println(arrayList.get(arrayList.size() - 1));

	}

}
