import numpy as np
import matplotlib.pyplot as plt

# Parámetros del modelo
r = 4.0
a = 1.0
b = 4.0
c = 1.0
d = 1.0

# Función g(t) = t^2
def g(t):
    return t**2

# Condiciones iniciales
V0 = 0.1
B0 = 1.0

# Tiempo de simulación
t0 = 0.0
tf = 10.0
N = 1000
dt = (tf - t0) / N

# Arreglos para almacenar resultados
t_vals = np.linspace(t0, tf, N+1)
V_vals = np.zeros(N+1)
B_vals = np.zeros(N+1)

# Asignar condiciones iniciales
V_vals[0] = V0
B_vals[0] = B0

# Método de Euler hacia adelante
for i in range(N):
    t = t_vals[i]
    V = V_vals[i]
    B = B_vals[i]
    
    # Ecuaciones diferenciales
    dVdt = r * V * (1 - V/B)
    dBdt = -a * B + b * V - c * B * (V**(2/3)) - d * B * g(t)
    
    # Actualización
    V_vals[i+1] = V + dVdt * dt
    B_vals[i+1] = B + dBdt * dt
    
    # Evitar valores negativos (biológicamente inconsistentes)
    if V_vals[i+1] < 0:
        V_vals[i+1] = 0
    if B_vals[i+1] < 0:
        B_vals[i+1] = 0

# Gráfica en el mismo frame
plt.figure(figsize=(10,6))
plt.plot(t_vals, V_vals, label='Volumen del tumor $V(t)$', linewidth=2)
plt.plot(t_vals, B_vals, label='Densidad vascular $B(t)$', linewidth=2)
plt.xlabel('Tiempo t')
plt.ylabel('Magnitud')
plt.title('Crecimiento tumoral con angiogénesis')
plt.legend()
plt.grid(True)
plt.show()
