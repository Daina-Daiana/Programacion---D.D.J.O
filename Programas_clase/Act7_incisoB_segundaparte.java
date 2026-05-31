import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class EstiloFileChooser {
    public static void main(String[] args) {
        // Establecer Look and Feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Personalización del color de los botones del JFileChooser a ROJO
        UIManager.put("Button.foreground", Color.RED);

        SwingUtilities.invokeLater(() -> createVentanaPrincipal());
    }

    private static void createVentanaPrincipal() {
        JFrame frame = new JFrame("Explorador de Archivos Estilizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        mainPanel.setBackground(new Color(50,50,80));

        JLabel titelLabel = new JLabel("Gestor de Archivos", SwingConstants.CENTER);
        titelLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titelLabel.setForeground(Color.WHITE);
        mainPanel.add(titelLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.setOpaque(false);

        JButton btnAbrir = createButtonEstilizado("Abrir Archivo", new Color(46, 204, 113));
        JButton btnGuardar = createButtonEstilizado("Guardar Archivo", new Color(52, 152, 219));
        JButton btnDirectorio = createButtonEstilizado("Seleccionar Directorio", new Color(155, 89, 182));

        buttonPanel.add(btnAbrir);
        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnDirectorio);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        JTextArea infoArea = new JTextArea(5, 40);
        infoArea.setEditable(false);
        infoArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(infoArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Información del Archivo"));
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);

        // Acción del botón Abrir (ejemplo)
        btnAbrir.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Abrir archivo");
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                infoArea.setText("Archivo abierto: " + fc.getSelectedFile().getAbsolutePath());
            } else {
                infoArea.setText("Operación cancelada");
            }
        });

        // Similar para Guardar y Directorio...
        btnGuardar.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Guardar archivo");
            int result = fc.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                infoArea.setText("Archivo guardado en: " + fc.getSelectedFile().getAbsolutePath());
            }
        });

        btnDirectorio.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                infoArea.setText("Directorio seleccionado: " + fc.getSelectedFile().getAbsolutePath());
            }
        });
    }

    private static JButton createButtonEstilizado(String texto, Color color) {
        JButton btn = new JButton(texto);
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return btn;
    }
}
