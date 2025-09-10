# 1.1-Herencia-y-Polimorfismo-Nivel2

## 📄 Descripción – Enunciado del ejercicio

Este proyecto contiene la resolución del siguiente ejercicio de Java:

### Ejercicio
1. Crear una clase `Phone` con los atributos `brand` y `model`, y un método `call(String number)`.  
   - El método debe imprimir en consola:  
     `"Calling number: <número>"`.

2. Crear una interfaz `Camera` con el método `takePhoto()`.  
   - El método debe imprimir:  
     `"A photo is being taken"`.

3. Crear una interfaz `Clock` con el método `soundAlarm()`.  
   - El método debe imprimir:  
     `"The alarm is ringing"`.

4. Crear una clase `Smartphone` que:  
   - Sea subclase de `Phone`.  
   - Implemente las interfaces `Camera` y `Clock`.

5. Desde `Main`, crear un objeto `Smartphone` y llamar a los métodos:  
   - `call()`  
   - `takePhoto()`  
   - `ringAlarm()`

---

## 💻 Tecnologías Utilizadas
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requisitos
- JDK 17 o superior  
- IntelliJ IDEA u otro IDE compatible  
- Git  

---

## 🛠️ Instalación
1. Clonar el repositorio y acceder al directorio:
```sh
git clone https://github.com/USUARIO/1.2-Herencia-e-Interfaces-Nivel1.git
cd 1.2-Herencia-e-Interfaces-Nivel1
```
2. Abrir el proyecto en IntelliJ IDEA.

---

▶️ **Ejecución**
1. Ir al archivo Main.java dentro del paquete correspondiente.
2. Ejecutar el método main()

Salida esperada en consola:
```sh
Calling number: +34 123 456 789
A photo is being taken
The alarm is ringing
```

---

🗂️ **Estructura del proyecto**
```sh
src/
  phones/
    Phone.java
    Camera.java
    Clock.java
    Smartphone.java
    Main.java
```

---

🌐 **Despliegue**

Este proyecto es de práctica en entorno local, no requiere despliegue en servidor.

---

🤝  **Contribuciones**

Las contribuciones son bienvenidas. Para colaborar:

1. Haz un fork del repositorio.
2. Crea una nueva rama:
  ```sh
   git checkout -b feature/NuevaFuncionalidad
   ```
3. Realiza tus cambios y haz commit:
  ```sh
   git commit -m "Descripción clara del cambio"
   ```
4. Sube tus cambios:
  ```sh
   git push origin feature/NuevaFuncionalidad
   ```
5. Abre un Pull Request en GitHub.


