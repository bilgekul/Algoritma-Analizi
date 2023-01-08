public class radix_sort {
    public static void main(String[] args) {

        int dizi[] = {234,105,100,232,453,787};
        RadixSort(dizi);
    }
    public static void RadixSort(int[]dizi){
        int r = 4; //int 4 byte yani 32-bit
        int b = 32;
        int count[] = new int[1 << r];
        int pref[] = new int[1 << r];

        int groups = (int)Math.ceil((double)b/(double)r);
        int mask = (1 << r) - 1;

        for(int c = 0, shift=0; c<groups; c++, shift +=r){
            for(int j = 0; j<count.length; j++)
                count[j]=0;
            for(int i=0; i<dizi.length; i++)
                count[(dizi[i] >> shift) & mask]++;
            pref[0]=0;
            for(int i = 1; i<count.length; i++)
                pref[i] = pref[i-1] + count[i-1];
            int[]t ={};
            for(int i=0; i<dizi.length; i++)
                t[pref[(dizi[i] >> shift) & mask]++]= dizi[i];
            for(int k = dizi.length; k>=0; k--){
                t[k] = dizi[k];
            }
            for (int l : t) {
                System.out.println(" "+l);
            }
        }
    }
}
