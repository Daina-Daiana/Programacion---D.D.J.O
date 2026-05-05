Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 2 del cuarto apartado
Fecha: 2026-05-4
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Agregar una arco.

import javax.swing.*;
import java.awt.*;

public class Cuadrado_Swing extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);
        
        // Dibujo original: cuadrado rojo y rectángulo borrado
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 200);
        g.clearRect(100, 100, 100, 100);
        
        // Arco  en color verde
        g.setColor(Color.GREEN);
        g.drawArc(200, 300, 100, 100, 0, 90);  // x, y, ancho, alto, ángulo inicio, arco
        
    }
}