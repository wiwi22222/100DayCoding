
package wiwiLestiani;

public class day76 {
     public static void main(String[] args) {
        byte[] umur = {32,45,14,76,17,53,19,33};
        byte maks = 0;
        byte min = 0;
        for (int i = 0; i < umur.length; i++) {
         if(maks<=umur[i]){
            maks = umur[i];}
         if(min>=umur[i]){
             min = umur[i];}
        }System.out.println(maks);
         System.out.println(maks);
    }

    
}
