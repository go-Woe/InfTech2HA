public class TestMySort {

    public static void main(String[] args) {

		// Einlesen der Lieder
		String file1 = "lieder1.dat";
		String file2 = "lieder2.dat";
		String file3 = "lieder3.dat";
		Lied[] f1 = Parser.readLied(file1);
		Lied[] f2 = Parser.readLied(file2);
		Lied[] f3 = Parser.readLied(file3);

		// MySort
		System.out.println("MySort, lieder1.dat");
		System.out.println("--------------");
		MySort.mySort(f1);
		for (int i=0; i<f1.length;i++){
			System.out.println(f1[i].toString());
		}
		System.out.println();
		
		System.out.println("MySort, lieder2.dat");
		System.out.println("--------------");
		MySort.mySort(f2);
		for (int i=0; i<f2.length;i++){
			System.out.println(f2[i].toString());
		}
		System.out.println();
		
		System.out.println("MySort, lieder3.dat");
		System.out.println("--------------");
		MySort.mySort(f3);
		for (int i=0; i<f3.length;i++){
			System.out.println(f3[i].toString());
		}
		System.out.println();
		
	}
}
