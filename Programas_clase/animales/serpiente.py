from clasesabstracta.animal_abc import Animal

class Serpiente(Animal):
    def hacer_sonido(self):
        return "Siseo"

    def moverse(self):
        return "Reptando por el suelo"

    def nutricion(self):
        return "Carnívoro"

    def sistemaEsqueletico(self):
        return "Vertebrado, esqueleto con muchas vértebras y costillas"

    def reproduccion(self):
        return "Ovípara u ovovivípara según la especie"

    def __str__(self):
        return (f"Serpiente:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
                f"  Nutrición: {self.nutricion()}\n"
                f"  Esqueleto: {self.sistemaEsqueletico()}\n"
                f"  Reproducción: {self.reproduccion()}")
