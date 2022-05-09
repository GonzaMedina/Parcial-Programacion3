package main.modulo;

public class TextAreaForm extends ElementoForm{
    private Integer cols;
    private Integer rows;

    public TextAreaForm(String nombre, String valor, Integer cols, Integer rows) {
        super(nombre, valor);
        this.cols = cols;
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override

    public String  renderizarHTML(){
        return "<textarea name=\"" + nombre + "\"" + " rows=\"" + rows +"\""+" cols=\""+ cols + "\"" +">" + valor +"</textarea>";
    };






}
