public class Quest1 {
    public static boolean pertenceALinguagem(String cadeia) {
        if (cadeia.isEmpty()) {
            return false;
        }
        if (cadeia.charAt(0)=='a'){
            return verificaA(cadeia,1);
        }else if (cadeia.charAt(0)=='b') {
            return verificaB(cadeia,1);
        }else{
            return false;
        }
    }
    private static boolean verificaA(String cadeia,int pos){
        if (pos >= cadeia.length()){
            return true;
        }
        if(cadeia.charAt(pos)=='a') {
            return verificaA(cadeia,pos+1);
        }
        return false;
    }
    private static boolean verificaB(String cadeia,int pos){
        if (pos >= cadeia.length()){
            return true;
        }
        if (cadeia.charAt(pos)=='b') {
            return verificaB(cadeia,pos+1);
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(pertenceALinguagem("aaa"));
        System.out.println(pertenceALinguagem("bbb"));
        System.out.println(pertenceALinguagem("aab"));
        System.out.println(pertenceALinguagem("bba"));
        System.out.println(pertenceALinguagem("a"));
        System.out.println(pertenceALinguagem("b"));
    }
}
