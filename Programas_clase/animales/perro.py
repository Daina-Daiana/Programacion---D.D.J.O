from clasesabstracta.animal_abc import Animal

class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau guau!"

    def moverse(self):
        return "Corriendo en 4 patas"

    def __str__(self):
        return (f"Perro:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
