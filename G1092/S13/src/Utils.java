import java.util.List;

public class Utils {
    public static int maxPar(List<Integer> lista) throws ExceptieListaGoala, ExceptieValoarePara {
        if(lista==null || lista.isEmpty()){
            throw new ExceptieListaGoala();
        }
        int maxPar= -1;
        for (int elem : lista){
            if(elem %2 == 0 && elem > maxPar){
                maxPar = elem;
            }
        }
        if(maxPar == -1){
            throw new ExceptieValoarePara();
        }
        return maxPar;

    }
}
