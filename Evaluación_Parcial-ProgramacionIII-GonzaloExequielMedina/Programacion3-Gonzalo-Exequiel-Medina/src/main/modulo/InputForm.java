package main.modulo;
import java.util.List;

public class InputForm extends ElementoForm {
    public String tipo;

    public InputForm(String tipo,String nombre,String valor) { super(nombre,valor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override

    public String  renderizarHTML(){
        return "<input type=\"" + tipo + "\" name=\"" + nombre + "\"  value=\"" + valor + "\"/>";
    };

}
