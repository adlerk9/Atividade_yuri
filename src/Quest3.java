import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Quest3 {
    public static boolean pertenceALinguagem(Map<String, List<String>> gramatica, String simboloInicial, String cadeia) {
        return verificaC(gramatica, simboloInicial, cadeia, 0);
    }
    private static boolean verificaC(Map<String, List<String>> gramatica, String simbolo, String cadeia, int pos) {
        if (pos == cadeia.length() && simbolo.equals("")) {
            return true;
        }
        if (pos == cadeia.length() || simbolo.equals("")) {
            return false;
        }
        if (gramatica.containsKey(simbolo)) {
            for (String producao : gramatica.get(simbolo)) {
                String novoSimbolo = producao + simbolo.substring(1);

                if (verificaC(gramatica, novoSimbolo, cadeia, pos)) {
                    return true;
                }
            }
        } else {
            if (cadeia.charAt(pos) == simbolo.charAt(0)) {
                return verificaC(gramatica, simbolo.substring(1),cadeia,pos+1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Map<String,List<String>> gramatica = new HashMap<>();
        gramatica.put("S",List.of("aA","bB","c"));
        gramatica.put("A",List.of("aA",""));
        gramatica.put("B",List.of("bB",""));
        System.out.println(pertenceALinguagem(gramatica,"S","aaa"));
        System.out.println(pertenceALinguagem(gramatica,"S","bbb"));
        System.out.println(pertenceALinguagem(gramatica,"S","aac"));
        System.out.println(pertenceALinguagem(gramatica,"S","c"));
    }
}

