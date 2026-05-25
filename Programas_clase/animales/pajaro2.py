from clasesabstracta.animal_abc import Animal

class Pajaro(Animal):
    def hacer_sonido(self):
        return "¡Pío pío!"

    def moverse(self):
        return "Volando"

    def nutricion(self):
        return "Omnívoro"

    def sistemaEsqueletico(self):
        return "Vertebrado, esqueleto neumático"

    def reproduccion(self):
        return "Ovíparo"

    def __str__(self):
        return (f"Pájaro:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
                f"  Nutrición: {self.nutricion()}\n"
                f"  Esqueleto: {self.sistemaEsqueletico()}\n"
                f"  Reproducción: {self.reproduccion()}")
