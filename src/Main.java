//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

            System.out.println("Total antes de crear objetos: " + Dispositivo.getTotalCreados());

            // Creación de los tres objetos requeridos usando el constructor
            Dispositivo d1 = new Dispositivo("Laptop Pro", "Computación");
            Dispositivo d2 = new Dispositivo("Router Wi-Fi 6", "Redes");
            Dispositivo d3 = new Dispositivo("Servidor Web", "Infraestructura");

            System.out.println("Objeto " + d1.getId() + "\nNombre: " + d1.getNombre() + "\nTipo: " + d1.getTipo());
            System.out.println("Objeto " + d2.getId() + "\nNombre: " + d2.getNombre() + "\nTipo: " + d2.getTipo());
            System.out.println("Objeto " + d3.getId() + "\nNombre: " + d3.getNombre() + "\nTipo: " + d3.getTipo());

            System.out.println("\nTotal de dispositivos creados (usando static): " + Dispositivo.getTotalCreados());

}
