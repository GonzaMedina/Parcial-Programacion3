package main.modulo;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

        private List <Opcion> opciones;

        public SelectForm(String nombre) {
            super(nombre);
            this.opciones = new ArrayList<Opcion>();                        // se inicializa con array List
        }
        public SelectForm(String nombre, List<Opcion> opciones){super(nombre);
            this.opciones = opciones;
        }
        public SelectForm addOpcion(Opcion opcion){
            this.opciones.add(opcion);
            return this;
        }
        @Override
        public String renderizarHTML(){
            StringBuilder sb = new StringBuilder("<select ");
            sb.append("name='")
                    .append(this.nombre)
                    .append("'>");
            for(Opcion option: this.opciones){
                sb.append("\n<option value = '")
                        .append (option.getValor())
                        .append ("'");
                if(option.isSelected()){
                    sb.append("selected");
                }
                sb.append(">")
                        .append(option.getNombre())
                        .append("</option>");
            }
            sb.append("</select>");
            return sb.toString();
        }
    }








