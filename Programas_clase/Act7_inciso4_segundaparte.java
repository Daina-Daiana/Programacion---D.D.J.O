package escribeaarchivo;

import javax.swing.*;
import java.io.*;
import selectorderarchivo.SelectorGraficoDeArchivo2;

public class EscribeAArchivoBasico {

    public static void escribirAArchivoF1() {
        File archivo = SelectorGraficoDeArchivo2.seleccionarArchivoParaGuardar();
        if (archivo == null) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo. Operación cancelada.");
            return;
        }

        try (BufferedWriter escribe = new BufferedWriter(new FileWriter(archivo, true))) {
            escribe.append("\nSe acabó :\n");
            escribe.append("Solo me resta :");
            escribe.append("desearles lo mejor. \n");
            JOptionPane.showMessageDialog(null, "Texto agregado correctamente a:\n" + archivo.getAbsolutePath());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede acceder al archivo o la ruta es inválida.\n" + e.getMessage(),
                    "Error de archivo", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR de E/S: " + e.getMessage(),
                    "Error de entrada/salida", JOptionPane.ERROR_MESSAGE);
        }

        public class SelectorGraficoDeArchivo2 {
            public static File seleccionarArchivoParaGuardar() {
                JFileChooser fc = new JFileChooser();
                fc.setDialogTitle("Seleccione el archivo donde desea escribir");
                int resultado = fc.showSaveDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    return fc.getSelectedFile();
                }
                return null;
            }
        }
    }

}
