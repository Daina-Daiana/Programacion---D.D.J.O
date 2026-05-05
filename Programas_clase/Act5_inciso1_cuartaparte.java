Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 1 del cuarto apartado
Fecha: 2026-05-4
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Agregar una elipse 

import javax.swing.*;
import java.awt.*;

public class Cuadrado_Swing extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);
        
        // Dibujo original: cuadrado rojo y rectángulo borrado
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 200);
        g.clearRect(100, 100, 100, 100);
        
        // Elipse en color azul
        g.setColor(Color.BLUE);
        g.drawOval(50, 300, 100, 80);   // x, y, ancho, alto
        
    }
}