from clasesabstracta.animal_abc import Animal

class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"

    def moverse(self):
        return "Caminando sigilosamente"
      
    def __str__(self):
        return (f"Gato:\n"
                f"  Sonido: {self.hacer_sonido()}\n"
                f"  Movimiento: {self.moverse()}\n"
