package metodosnumericos;

import javax.swing.JOptionPane;

/**
 *
 * @author Valeria Zarate
 */
public class Principal {

    public static void main(String[] args) {

        int opcion = -1;
        while (opcion != 0) {
            
                String respuesta = JOptionPane.showInputDialog("ELige el metodo a ejecutar\n"
                        + "1.-Metodo Newton Raphson\n"
                        + "2.-Falsa Posicion\n"
                        + "3.-Salir");
                opcion = Integer.parseInt(respuesta);
                switch (opcion) {
                    case 1:
                        NewtonRaphson NR = new NewtonRaphson();
                        NR.setVisible(true);
                        break;
                    case 2:
                        FalsaPos FP = new FalsaPos();
                        FP.setVisible(true);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            
            }

        }
}
