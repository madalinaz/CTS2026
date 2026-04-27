package cts.g1094.chain.implementare;

import java.util.List;

public class PaginaWeb {
    private List<IItem> itemi;
    private String url;

    public PaginaWeb(List<IItem> itemi, String url) {
        this.itemi = itemi;
        this.url = url;
    }

    public List<IItem> getItemi(){
        return itemi;
    }
    public void setItemi(List<IItem> itemi){
        this.itemi = itemi;
    }
    public void removeItem(IItem item){
        itemi.remove(item);
    }

    public IItem getItem(int index){
        return itemi.get(index);
    }


    @Override
    public String toString() {
        return "PaginaWeb{" +
                "itemi=" + itemi +
                ", url='" + url + '\'' +
                '}';
    }
}
