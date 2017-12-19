package dane;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Lamana implements Mierzalny{

    protected ArrayList<Odcinek> lista;

    public Lamana() {
        lista = new ArrayList<>();
    }

    public void addElement(Odcinek o) {
        if (!lista.isEmpty() && !getKoniec().equals(o.getA())) {
            throw new IllegalArgumentException("Odcinek nie łączy się z łamaną!!!");
        }
        lista.add(o);
    }

    public void addElement(Punkt p) {
//        Odcinek o = new Odcinek(lista.get(lista.size() - 1).getB(), p);
//        addElement(o);
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("Łamaną trzeba rozpocząć odcinkiem");
        }
        addElement(new Odcinek(getKoniec(), p));
    }

    public Punkt getPoczatek() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0).getA();
    }

    public Punkt getKoniec() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(lista.size() - 1).getB();
    }

    public void setLista(ArrayList<Odcinek> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("Pusta lista!!!");
        }
        // TODO: sprawdź czy lista to łamana.
        this.lista = lista;
    }

    public Odcinek[] getLamana() {
        return lista.toArray(new Odcinek[lista.size()]);
    }

    @Override
    public double length() {
        double w = 0.0;
        for (Odcinek odcinek : lista) {
            w += odcinek.length();
        }
        return w;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Łamana:\n");
        for (Odcinek odcinek : lista) {
            sb.append(odcinek).append("\n");
        }
        return sb.toString();
    }

}
