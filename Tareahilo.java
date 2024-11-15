/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareahilos;

/**
 *
 * @author tracy
 */
/*1. Crear una clase que extienda de la clase Thread
  2. Crear el método main() y dentro de ella se implementara lo siguiente:
- Crear una instancia del hilo principal Thread y Obtener referencia del Hilo principal.
- Obtener el nombre del hilo principal (usa System.out.println)
- Cambiar el nombre del hilo principal (usa System.out.println)
- Obteniendo prioridad del hilo principal (usa System.out.println)
- Establecer la prioridad del hilo principal en MAX(10) (usa System.out.println)
- Imprime y muestra la prioridad del hilo principal (usa System.out.println)*/
public class Tareahilo extends Thread {

    public static void main(String[] args) { // metodo main
        Thread tareaHilo = Thread.currentThread(); // obtener referencia de hilo
        System.out.println("La tarea principal es " + tareaHilo.getName()); // obtener el nombre del hilo principal
        tareaHilo.setName("soy una nueva tarea"); // Cambiar el nombre del hilo principal 
        System.out.println("El nuevo nombre de la tarea principal es " + tareaHilo.getName()); // imprimir solo el nombre
        System.out.println("La prioridad de la nueva tarea principal es " + tareaHilo.getPriority()); // obtener la prioridad del hilo principal
        tareaHilo.setPriority(Thread.MAX_PRIORITY); // Establecer la prioridad del hilo principal en MAX(10)
        System.out.println("Se muestra la prioridad de la tarea principal: " + tareaHilo.getPriority());
    }
}
