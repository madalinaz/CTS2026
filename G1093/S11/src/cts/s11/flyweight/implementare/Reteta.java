package cts.s11.flyweight.implementare;

import java.util.List;

public class Reteta {
    private int id;
    private String diagnostic;
    private List<String> medicamente;

    public Reteta(int id, String diagnostic, List<String> medicamente) {
        this.id = id;
        this.diagnostic = diagnostic;
        this.medicamente = medicamente;
    }

    public int getId() {
        return id;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("id=").append(id);
        sb.append(", diagnostic='").append(diagnostic).append('\'');
        sb.append(", medicamente=").append(medicamente);
        sb.append('}');
        return sb.toString();
    }
}
