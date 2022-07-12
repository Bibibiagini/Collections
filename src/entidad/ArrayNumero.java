
package entidad;

public class ArrayNumero {
   private Integer numero;

    public ArrayNumero() {
    }

    public ArrayNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ArrayNumeros{" + "numero=" + numero + '}';
    }

}