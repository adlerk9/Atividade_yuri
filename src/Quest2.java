import java.util.ArrayList;
import java.util.List;

public class Quest2 {
    public static List<String> gerarCadeias(int N) {
        List<String> cadeias = new ArrayList<>();
        CadeiasRecursivo("S", N, "", cadeias);
        return cadeias;
    }
    private static void CadeiasRecursivo(String simbolo, int N, String cadeiaAtual, List<String> cadeias) {
        if (cadeiaAtual.length() == N) {
            cadeias.add(cadeiaAtual);
            return;
        }
        switch (simbolo) {
            case "S":
                CadeiasRecursivo("A",N,cadeiaAtual+"a",cadeias);
                CadeiasRecursivo("B", N,cadeiaAtual+"b",cadeias);
                if (cadeiaAtual.length()+1==N) {
                    cadeias.add(cadeiaAtual+"c");
                }
                break;
            case"A":
                CadeiasRecursivo("A",N,cadeiaAtual+"a",cadeias);
                break;
            case "B":
                CadeiasRecursivo("B",N,cadeiaAtual+"b",cadeias);
                break;
        }
    }
    public static void main(String[] args){
        int N=3;
        List<String>cadeias=gerarCadeias(N);
        System.out.println("Cadeias de comprimento"+N+": "+cadeias);
    }
}
