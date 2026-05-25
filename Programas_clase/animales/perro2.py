from clasesabstracta.animal_abc import Animal

class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau guau!"

    def moverse(self):
        return "Corriendo en 4 patas"

    def nutricion(self):
        return "Omnívoro"

    def sistemaEsqueletico(self):
        return "Vertebrado, esqueleto óseo"

    def reproduccion(self):
        return "Vivíparo"

    def __str__(self):
        return (f"Perro:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
                f"  Nutrición: {self.nutricion()}\n"
                f"  Esqueleto: {self.sistemaEsqueletico()}\n"
                f"  Reproducción: {self.reproduccion()}")
