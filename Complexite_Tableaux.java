/**
 *  Complexite_Tableaux.java
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Complexite_Tableaux
{
  public static void main(String[] args) throws IOException {

    Writer file = new FileWriter("ascendingFilling.dat");
    SelectionSortedArrayWithCounting tab1 = new SelectionSortedArrayWithCounting();
    InsertionSortedArrayWithCounting tab2 = new InsertionSortedArrayWithCounting();
    MergeSortedArrayWithCounting tab3 = new MergeSortedArrayWithCounting();

    for (int length = 1; length < 1000; length++) {
      tab1.fillAscending(length);
      tab2.fillAscending(length);
      tab3.fillAscending(length);

      tab1.SelectionSorting();
      tab2.InsertionSorting();
      tab3.MergeSorting();
      file.write(length + " " + tab1.getreadCount() + " " + tab2.getreadCount() + " " + tab3.getreadCount() + "\n");
    }

    file.close();
    tab1.fillwithRandom(40,20);

    System.out.println(tab1.toString());

    tab1.SelectionSorting();

  /*  System.out.println(tab.toString());

    System.out.println("nombre de lectures : "
        +String.valueOf(tab.getreadCount()));

    System.out.println("nombre d'écritures : "
        +String.valueOf(tab.getwriteCount()));

    System.out.println("nombre de comparaisons : "
        +String.valueOf(tab.getlessCount()));    */

  }
}
