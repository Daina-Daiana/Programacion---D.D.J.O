
Autor: Daina Daiana Jimenez Olivera
Autor: Hëctor Daniel Cervantes Cañedo
Materia: Programación
Grupo: 9157
Tema: Actividad 3 inciso 1 del segundo apartado
Fecha: 2026-03-14
===========================================================

OBJETIVO DEL SCRIPT
-----------------------------------------------------------
Programar el programa dado y modificarlo a 5 bits de estenografia
// Función para ocultar la imagen 
function hideMessage() {
    let coverImg = new SimpleImage(document.getElementById("d1"));
    let hideImg = new SimpleImage(document.getElementById("hfinput"));
    let outputCanvas = document.getElementById("hides");
    
    // Ajustar tamaño de hideImg al de coverImg 
    
    for (let pixel of coverImg.values()) {
        let x = pixel.getX();
        let y = pixel.getY();
        let hidePixel = hideImg.getPixel(x, y);
        
        // Nuevo cálculo: mantener solo 3 MSB del cover (máscara 0xE0)
        let newR = (pixel.getRed()   & 0xE0) | (hidePixel.getRed()   >> 3);
        let newG = (pixel.getGreen() & 0xE0) | (hidePixel.getGreen() >> 3);
        let newB = (pixel.getBlue()  & 0xE0) | (hidePixel.getBlue()  >> 3);
        
        pixel.setRed(newR);
        pixel.setGreen(newG);
        pixel.setBlue(newB);
    }
    coverImg.drawTo(outputCanvas);
}

// Función para extraer la imagen oculta 
function getMessage() {
    let stegoImg = new SimpleImage(document.getElementById("hides"));
    let outputCanvas = document.getElementById("hfoutput"); // o algún canvas para mostrar
    // Crear una imagen vacía del mismo tamaño
    let recovered = new SimpleImage(stegoImg.getWidth(), stegoImg.getHeight());
    
    for (let pixel of stegoImg.values()) {
        let x = pixel.getX();
        let y = pixel.getY();
        let recoverPixel = recovered.getPixel(x, y);
        
        // Tomar los 5 LSB y desplazar 3 a la izquierda
        let r = (pixel.getRed()   & 0x1F) << 3;
        let g = (pixel.getGreen() & 0x1F) << 3;
        let b = (pixel.getBlue()  & 0x1F) << 3;
        
        recoverPixel.setRed(r);
        recoverPixel.setGreen(g);
        recoverPixel.setBlue(b);
    }
    recovered.drawTo(outputCanvas);
}
