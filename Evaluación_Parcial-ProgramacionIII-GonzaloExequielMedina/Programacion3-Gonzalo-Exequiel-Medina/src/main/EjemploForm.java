package main;

import main.modulo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {                                    // se crean los objetos
        InputForm usuario = new InputForm("user","user","usuario");
        InputForm pass = new InputForm("pass","pass","pass");
        InputForm email = new InputForm("email","email","email");
        InputForm edad = new InputForm("edad","edad","edad");

        TextAreaForm exp = new TextAreaForm("nombre","TextAreaForm",5,6);
        SelectForm obajetoSelect = new SelectForm("Opciones");
        Opcion java = new Opcion ("1", "Java");                                         //se asignan los valores
        obajetoSelect.addOpcion (java);
        obajetoSelect.addOpcion (new Opcion("2","JavaScript"));
        obajetoSelect.addOpcion (new Opcion("3","TypeScript"));
        obajetoSelect.addOpcion (new Opcion("4","python"));
        obajetoSelect.addOpcion (new Opcion("5","Php"));
        obajetoSelect.addOpcion (new Opcion("6","C++"));

        List<ElementoForm> elementos = Arrays.asList(
                usuario,
                pass,
                email,
                edad,
                exp,
                obajetoSelect);

//        System.out.println(usuario.renderizarHTML());              // se imprimen los datos  html
//        System.out.println(pass.renderizarHTML());
//        System.out.println(email.renderizarHTML());
//        System.out.println(edad.renderizarHTML());
//        System.out.println(exp.renderizarHTML());
//        System.out.println(obajetoSelect.renderizarHTML());

        elementos.forEach(elemento -> {
            System.out.println(elemento.renderizarHTML());
            System.out.println("<br/>");
        });
    }
}
