package daily_billing;

import java.util.Objects;

public class Billing implements Comparable<Billing>{
    private Integer dia;
    private Float valor;

    public Billing() {
    }

    public Billing(Integer dia, Float valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billing billing = (Billing) o;
        return dia.equals(billing.dia) && valor.equals(billing.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, valor);
    }

    @Override
    public String toString() {
        return "dia=" + dia +
                ", valor=" + valor + "\n";
    }

    @Override
    public int compareTo(Billing billing) {
        return (int) (this.valor - billing.getValor());
    }
}
