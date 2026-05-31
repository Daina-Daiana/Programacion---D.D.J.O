public static void escribirAArchivoF2() {
    String rutaArchivo = "ArchivosDePrueba/paletas.txt";  // Ruta relativa al proyecto
    File archivoPaletas = new File(rutaArchivo);

    String nuevaLinea = JOptionPane.showInputDialog("Ingrese el nombre de la nueva paleta (o línea a agregar):");
    if (nuevaLinea == null || nuevaLinea.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se ingresó información. Operación cancelada.");
        return;
    }
    nuevaLinea = nuevaLinea.trim();

    boolean existe = false;
    if (archivoPaletas.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoPaletas))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.trim().equalsIgnoreCase(nuevaLinea)) {
                    existe = true;
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo para verificar duplicados:\n" + e.getMessage(),
                    "Error de lectura", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    if (existe) {
        JOptionPane.showMessageDialog(null, "La paleta '" + nuevaLinea + "' ya existe en el archivo.\nNo se agregó nada.",
                "Duplicado", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try (PrintWriter writer = new PrintWriter(new FileWriter(archivoPaletas, true))) {
        writer.println(nuevaLinea);
        JOptionPane.showMessageDialog(null, "Paleta agregada correctamente al archivo:\n" + archivoPaletas.getAbsolutePath());
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "ERROR: No se puede crear/escribir el archivo.\nRuta inválida o permisos insuficientes.\n" + e.getMessage(),
                "Error de archivo", JOptionPane.ERROR_MESSAGE);
    } catch (SecurityException e) {
        JOptionPane.showMessageDialog(null, "ERROR de seguridad: No tiene permisos para escribir en el archivo.\n" + e.getMessage(),
                "Permiso denegado", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error de E/S al escribir en el archivo:\n" + e.getMessage(),
                "Error de E/S", JOptionPane.ERROR_MESSAGE);
    }
}
