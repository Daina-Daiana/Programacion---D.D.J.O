from clasesabstracta.animal_abc import Animal

class Pez(Animal):
    def hacer_sonido(self):
        return "Glu glu"

    def moverse(self):
        return "Nadando con aletas"

    def nutricion(self):
        return "Puede ser carnívoro, herbívoro o omnívoro según la especie"

    def sistemaEsqueletico(self):
        return "Vertebrado, esqueleto óseo o cartilaginoso"

    def reproduccion(self):
        return "Ovíparo, algunos ovovivíparos"

    def __str__(self):
        return (f"Pez:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
                f"  Nutrición: {self.nutricion()}\n"
                f"  Esqueleto: {self.sistemaEsqueletico()}\n"
                f"  Reproducción: {self.reproduccion()}")
