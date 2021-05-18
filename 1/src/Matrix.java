/** Klasse Matrix mit generischem Typparameter T fuer die Matrixelemente. 
  * T muss in der Vererbungshierarchie unter Comparable<T> stehen, also
  *     der eingesetzte Datentyp T muss das Interface Comparable implementieren
  *     und mit anderen T (was auch immer T ist) vergleichbar sein. Die einzelnen
  *     Matrixelemente sind also ueber compareTo() vergleichbar.
  * Weiterhin implementiert die Klasse Matrix selbst das Interface Comparable, um
  *     mit anderen Matritzen mit gleichem generischen Typparameter T vergleichbar
  *     zu sein.
  */
class Matrix<T extends Comparable<T>> implements Comparable<Matrix<T>> {

    private T [][] values;

    Matrix(T[][] values){
        this.values=values;
    }


    public int getNumRows(){
        return values.length+1;
    }


    public int getNumCols(){
        return values[0].length+1;
    }

    public T get(int row, int col){
        //if (row <= getNumRows() && col <= getNumCols() && 0<= row && 0<= col) {
            return values[row][col];

    }

    public void set(T val, int row, int col){
        values[row][col]=val;
    }

    // Vergleicht zwei Matrizen anhand des minimalen Elements
    public int compareTo(Matrix<T> other) {
        
        // Minimum in dieser Matrix
        T minThis  = values[0][0]; 
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (minThis.compareTo(values[row][col]) > 0) { // Kleineres Elem gefunden
                    minThis = values[row][col];
                }
            }
        }

        // Minimum in der Matrix other
        T minOther = other.get(0,0);
        for (int row = 0; row < other.getNumRows(); row++) {
            for (int col = 0; col < other.getNumCols(); col++) {
                if (minOther.compareTo(other.get(row, col)) > 0) { // Kleineres Elem gefunden
                    minOther = other.get(row, col);
                }
            }
        }

        // Minimalwerte vergleichen
        return minThis.compareTo(minOther);
        
    }

}
