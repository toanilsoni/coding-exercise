package list;

class Array {
	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public void insert(int value) {
		if (items.length == count) {
			int[] items1 = new int[count * 2];
			for (int i = 0; i < count; i++) {
				items1[i] = items[i];
			}
			items = items1;
		}
		items[count] = value;
		count++;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}

		for (int i = index; i <= count; i++)
			items[i] = items[i + 1];

		count--;
	}

	public int indexOf(int index) {
		return items[index];
	}
}
