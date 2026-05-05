Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 3 del cuarto apartado
Fecha: 2026-05-4
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Agregar una triángulo 

import javax.swing.*;
import java.awt.*;

public class Cuadrado_Swing extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);
        
        // Dibujo original: cuadrado rojo y rectángulo borrado
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 200);
        g.clearRect(100, 100, 100, 100);
        
        // Triángulo en color magenta
        g.setColor(Color.MAGENTA);
        int[] xPoints = {350, 420, 385};   // coordenadas X de los vértices
        int[] yPoints = {300, 300, 380};   // coordenadas Y de los vértices
        g.fillPolygon(xPoints, yPoints, 3); // 3 vértices
    }
}