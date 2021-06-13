import java.util.Iterator;
import java.util.Random;

public class Matrix<T> implements Iterable<T> {

	private T[][] mat;
	private char iteratorMode;

	// Konstruktor
	public Matrix(T[][] m) {
		this.mat = m;
		this.iteratorMode = 'f';
	}

	public Iterator<T> iterator() {
		if (iteratorMode == 'f') return new MatrixForwardIterator();
		else return new MatrixRandomIterator();
	}

	public void setIteratorMode(char val){
		if (val == 'f' || val == 'r') iteratorMode = val;
	}

	public class MatrixForwardIterator implements Iterator<T> {
		private int vert;
		private int hori;

		public MatrixForwardIterator(){
			vert = 0;
			hori = 0;
		}



		@Override
		public boolean hasNext() {
			return mat.length > vert;
		}

		@Override
		public T next() {
			T ergebniss = mat[vert][hori];
			if (hori + 1 == mat[vert].length) {
				vert++;
				hori=0;
			}else hori++;
			return ergebniss;
		}

		@Override
		public void remove(){}
	}
	public class MatrixRandomIterator implements  Iterator<T>{
		private int vert;
		private int hori;
		private int wieoft=0;

		public MatrixRandomIterator(){
			vert = 0;
			hori = 0;
		}
		@Override
		public boolean hasNext() {
			return mat.length > vert && wieoft<=50 && mat==null;
		}

		@Override
		public T next() {
			T ergebnis;
			wieoft++;
			Random random = null;
			ergebnis = mat[random.nextInt(mat.length)][random.nextInt(mat[vert].length-1)];
			return ergebnis;
		}

		@Override
		public void remove(){}
	}
}
