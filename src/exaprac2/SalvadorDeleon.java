package exaprac2;
import javax.swing.JOptionPane;

/**
 *
 * @author Salvador
 */
public class SalvadorDeleon {
    public static void main(String[] args) {
        //Declaración de Variables
      int n,i;
      int nomb = 0;
      String detalle = "";
      double maxSalario = 0;
      double totalPlanilla = 0;
      //Solicitud de tamaño de Vector a utilizar y leectura
      n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Trabajadores: "));
      //Declaración de Vectores
      String nombEmpleado[] = new String[n];
      double salarioHora[] = new double[n];
      double salarioFinal[] = new double[n];
      int cantidadHoras[] = new int[n];
      String estado[] = new String[n];
      //Llenado de vectores
      for(i=0;i<n;i++)
      {
          nombEmpleado[i] = JOptionPane.showInputDialog("Ingrese nombre de Trabajador : " + (i+1));
          salarioHora[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario por Hora laborada: "));
          cantidadHoras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad Horas laboradas: "));
          //Calculo de Salario final Según Salario Por Hora y Cantidad de horas laboradas
          salarioFinal[i] = salarioHora[i]*cantidadHoras[i];
          detalle +=  nombEmpleado[i] + " - $" + salarioHora[i] +" - " + cantidadHoras[i] + " - $" + salarioFinal[i] + " \n "; 
      }
      for(i=0;i<n;i++)
      { 
          totalPlanilla += salarioFinal[i];
          //Calculo de Salario Máximo.
           if( maxSalario <= salarioFinal[i])
          {
            nomb = i;
          }
      }
      //Muestreo de Detalle de planilla y total de Planilla
      JOptionPane.showMessageDialog(null, "La planilla es: \n Trabajador - Salario Hora - Horas Laboradas - Salario Final \n " + detalle + "\n El total de Planilla es : $" + totalPlanilla);
      //Muestreo de Mayor Salario
      JOptionPane.showMessageDialog(null, "El trabajador con el mayor salario es : " +  nombEmpleado[nomb]);
    }
}
