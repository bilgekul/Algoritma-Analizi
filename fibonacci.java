
public class fibonacci {
    public static void main(String[] args) {
       fibo_nacci(4);
        
    }

public static void fibo_nacci(int n){
 int result;
 if(n <= 1){
    result = 1;
    System.out.println(result);
  }
 else{
    int last = 1;
    int last2 = 1;
    int answer = 1;
    for(int i = 2; i<n; i++){
        answer = last+last2;
        last2 = last;
        last = answer;
    }
    result = answer;
    System.out.println(result);
  }
}
}

/*burda dinamik programlama kullanılarak
işlem yapılmıştır.*/  
