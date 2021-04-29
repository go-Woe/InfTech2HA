public class Suche {
  public  static int binareSuche(Musik suchObjekt, Musik[] array){
      int index;
      int anfang=0;
      int ende=array.length-1;

      while(anfang<=ende){
      index = (anfang+ende)/2;                          //neue mitte

      if (array[index].compareTo(suchObjekt)>0){        //links weitersuchen
          ende=index-1;

      }else if (array[index].compareTo(suchObjekt)<0){  //rechts weitersuchen
          anfang=index+1;

      }else {

          return index;

      }
      }return -1;
  }
}
