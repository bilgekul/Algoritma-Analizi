public class insertion_sort{
  public static void main(String[] args) {
    int dizi[] = new int[4];
    dizi[0] = 30;
    dizi[1] = 10;
    dizi[2] = 40;
    dizi[3] = 20;
    insertionSort(dizi);
    for (int i : dizi) {
        System.out.print(" "+i);
    }
   }

private static int[] insertionSort(int dizi[]) {
    // Küçük n değerleri için uygun büyük n değerli uygulamalar için pek uygun bir algoritma değildir çalışma zamanı en kötü ve ortalama durumda O(n^2) en iyi O(n).
    int i;
    int j;
    for(i = 1; i<dizi.length; i++){
        int key = dizi[i];
        j = i - 1;
        while(j>=0 && dizi[j] > key){ 
            dizi[j+1] = dizi[j]; // swap işlemi
            j = j - 1;
        }
        dizi[j+1] = key;  
    }
    return dizi;
    
} 
}
