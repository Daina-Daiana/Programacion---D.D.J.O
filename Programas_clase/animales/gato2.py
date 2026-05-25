from clasesabstracta.animal_abc import Animal

class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"

    def moverse(self):
        return "Caminando sigilosamente"

    def nutricion(self):
        return "Carnívoro estricto"

    def sistemaEsqueletico(self):
        return "Vertebrado, esqueleto óseo"

    def reproduccion(self):
        return "Vivíparo"

    def __str__(self):
        return (f"Gato:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
                f"  Nutrición: {self.nutricion()}\n"
                f"  Esqueleto: {self.sistemaEsqueletico()}\n"
                f"  Reproducción: {self.reproduccion()}")
