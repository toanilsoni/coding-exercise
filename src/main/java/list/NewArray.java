package list;

public class NewArray {

	private int[] items;
	private int count;

	public NewArray(int length) {
		items = new int[length];
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public void insert(int value) {
		if (items.length == count) {
			int[] newItems = new int[count * 2];
			for (int i = 0; i < count; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		items[count] = value;
		count++;
	}

	public void remove(int index) {
		for (int i = index; i < count; i++) {
			items[i] = items[i + 1];
		}
		count--;
	}

	public int indexOf(int value) {
		for (int i = 0; i < count; i++) {
			if (items[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
