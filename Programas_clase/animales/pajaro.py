from clasesabstracta.animal_abc import Animal

class Pajaro(Animal):
    def hacer_sonido(self):
        return "¡Pío pío!"

    def moverse(self):
        return "Volando"

    def __str__(self):
        return (f"Pájaro:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
