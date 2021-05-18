class TestMatrix {
    public static void main (String[] args){
        String[][] array= new String[2][2];
        array[0][0]= "e";
        array[0][1]= "l";
        array[1][0]= "w";
        array[1][1]= "n";

        Matrix m = new Matrix(array);

        System.out.println("Anzahl der Matrix-Zeilen: "+ m.getNumRows()+" Anzahl der Matrix-Spalten: "+m.getNumCols());
        System.out.println();
        m.set("s",0,0);
        System.out.println("Matrix[1][1]: "+m.get(1,1));
        System.out.println();
        System.out.println("Die Matrix: ");
        for (int i =0;i<m.getNumRows()-1;i++){
            for (int j=0;j<m.getNumCols()-1;j++){
                System.out.print(m.get(i,j)+" ");
            }
            System.out.println();
        }
    }
}
