package listas;

import javax.swing.JOptionPane;

public class Listas {

    public static void main(String[] args) {

        //crear programa que usando una lista simple me guarde el nombre de paises y su capital
        Lista l = new Lista();

        String pais = JOptionPane.showInputDialog("Ingrese por favor, el pais");
        String capital = JOptionPane.showInputDialog("Ingrese por favor, la capital");

        Paises p = new Paises(pais, capital);

        System.out.println(l.Insertar(p));

    }

}
