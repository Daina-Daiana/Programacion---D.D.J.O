
Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 5 inciso 4 del segundo apartado
Fecha: 2026-03-14
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Programar el programa dado y modificarlo a 5 bits de estenografia

function hideMessage() {
    var cover = new SimpleImage(document.getElementById("d1"));
    var hide = new SimpleImage(document.getElementById("hfinput"));
    var output = document.getElementById("hides");
    
    // Redimensionar
    var w = cover.getWidth();
    var h = cover.getHeight();
    var newHide = new SimpleImage(w, h);
    for (var x = 0; x < w; x++) {
        for (var y = 0; y < h; y++) {
            var hp = hide.getPixel(x % hide.getWidth(), y % hide.getHeight());
            var p = newHide.getPixel(x, y);
            p.setRed(hp.getRed());
            p.setGreen(hp.getGreen());
            p.setBlue(hp.getBlue());
        }
    }
    hide = newHide;
    
    for (var x = 0; x < w; x++) {
        for (var y = 0; y < h; y++) {
            var pixel = cover.getPixel(x, y);
            var hp = hide.getPixel(x, y);
            var newR = (pixel.getRed() & 0xE0) | (hp.getRed() >> 3);
            var newG = (pixel.getGreen() & 0xE0) | (hp.getGreen() >> 3);
            var newB = (pixel.getBlue() & 0xE0) | (hp.getBlue() >> 3);
            pixel.setRed(newR);
            pixel.setGreen(newG);
            pixel.setBlue(newB);
        }
    }
    cover.drawTo(output);
}
