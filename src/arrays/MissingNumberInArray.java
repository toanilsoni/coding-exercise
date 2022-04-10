
public class MissingNumberInArray {

  public static void main(String[] args) {

    int[] array = {1, 3};

    MissingNumberInArray(array);
  }

  public static void MissingNumberInArray(int[] array) {

    for (int k = 0 ; k < array.length; k++) {
      System.out.print(array[k] + " ");
    }

  }

}
