package co.edu.sena.ejercicio01;

public class App {
    public static void main(String[] args) {

        //Arbol 1
        Arbol arbol1 = new Arbol();
        arbol1.setAltura(1564F);
        arbol1.setColor("Verde");
        arbol1.setDiametro(659F);
        arbol1.setEdad(15);
        arbol1.setTipo("Roble");
        System.out.println("\n..Arboleria de arboles..\n");
        System.out.println("Los datos del arbol 1 son:");
        System.out.println("Altura:");
        System.out.println(
                arbol1.getAltura());
        System.out.println("Color:");
        System.out.println(
                arbol1.getColor());
        System.out.println("Diametro:");
        System.out.println(
                arbol1.getDiametro());
        System.out.println("Edad (calculada en anios):");
        System.out.println(
                arbol1.getEdad());
        System.out.println("Tipo de arbol:");
        System.out.println(
                arbol1.getTipo());

        //Arbol 2
        Arbol arbol2 = new Arbol();
        arbol2.setAltura(4987F);
        arbol2.setColor("Rosa");
        arbol2.setDiametro(4689F);
        arbol2.setEdad(30);
        arbol2.setTipo("Pino");
        System.out.println("\nLos datos del arbol 2 son:");
        System.out.println("Altura:");
        System.out.println(
                arbol2.getAltura());
        System.out.println("Color:");
        System.out.println(
                arbol2.getColor());
        System.out.println("Diametro:");
        System.out.println(
                arbol2.getDiametro());
        System.out.println("Edad (calculada en anios):");
        System.out.println(
                arbol2.getEdad());
        System.out.println("Tipo de arbol:");
        System.out.println(
                arbol2.getTipo());

        //Avion 1
        Avion avion1 = new Avion();
        avion1.setCapacidad(140);
        avion1.setColor("White");
        avion1.setMarca("F-14");
        avion1.setPrecio(15000000F);
        avion1.setTurbina(4);
        System.out.println("\n..Avioneria de aviones..\n");
        System.out.println("\nAvion 1:");
        System.out.println("Capacidad:");
        System.out.println(
                avion1.getCapacidad());
        System.out.println("Color:");
        System.out.println(
                avion1.getColor());
        System.out.println("Marca:");
        System.out.println(
                avion1.getMarca());
        System.out.println("Precio:");
        System.out.println(
                avion1.getPrecio());

        //Avion 2
        Avion avion2 = new Avion();
        avion2.setCapacidad(4);
        avion2.setColor("Grey");
        avion2.setMarca("Falcon");
        avion2.setPrecio(7000000F);
        avion2.setTurbina(2);
        System.out.println("\nAvion 2:");
        System.out.println("Capacidad:");
        System.out.println(
                avion2.getCapacidad());
        System.out.println("Color:");
        System.out.println(
                avion2.getColor());
        System.out.println("Marca:");
        System.out.println(
                avion2.getMarca());
        System.out.println("Precio:");
        System.out.println(
                avion2.getPrecio());

        //Gafas 1
        Gafas gafas1 = new Gafas();
        gafas1.setColor("Red");
        gafas1.setEstilo("Hipster");
        gafas1.setMarca("Lacoste");
        gafas1.setPrecio(1500000F);
        System.out.println("\n..Gafas con lentes..\n");
        System.out.println("\nGafas 1\n");
        System.out.println("Color:\n"+
                gafas1.getColor());
        System.out.println("Estilo:\n"+
                gafas1.getEstilo());
        System.out.println("Marca:\n"+
                gafas1.getMarca());
        System.out.println("Precio:\n"+
                gafas1.getPrecio());

        //Gafas 2
        Gafas gafas2 = new Gafas();
        gafas2.setColor("Blue");
        gafas2.setEstilo("Developer");
        gafas2.setMarca("Jordan");
        gafas2.setPrecio(150000F);
        System.out.println("\nGafas 2\n");
        System.out.println("Color:\n"+
                gafas2.getColor());
        System.out.println("Estilo:\n"+
                gafas2.getEstilo());
        System.out.println("Marca:\n"+
                gafas2.getMarca());
        System.out.println("Precio:\n"+
                gafas2.getPrecio());

        //Pan 1
        Pan pan1 = new Pan();
        pan1.setColor("Brown");
        pan1.setPeso(2F);
        pan1.setPrecio(200F);
        pan1.setSabor("Pan");
        pan1.setTipo("Rollo");
        System.out.println("\n..Panaderia de pan..\n");
        System.out.println("\nColor:\n"+
                pan1.getColor());
        System.out.println("Peso:\n"+
                pan1.getPeso());
        System.out.println("Tipo:\n"+
                pan1.getTipo());
        System.out.println("Sabor:\n"+
                pan1.getSabor());
        System.out.println("Precio:\n"+
                pan1.getPrecio());

        //Pan 2
        Pan pan2 = new Pan();
        pan2.setColor("Brown");
        pan2.setPeso(5F);
        pan2.setPrecio(500F);
        pan2.setSabor("Dulce");
        pan2.setTipo("Roscon");
        System.out.println("\nColor:\n"+
                pan2.getColor());
        System.out.println("Peso:\n"+
                pan2.getPeso());
        System.out.println("Tipo:\n"+
                pan2.getTipo());
        System.out.println("Sabor:\n"+
                pan2.getSabor());
        System.out.println("Precio:\n"+
                pan2.getPrecio());

        //Persona 1
        Persona persona1 = new Persona();
        persona1.setColorCabello("Black");
        persona1.setColorOjos("Green");
        persona1.setColorPiel("Yellow");
        persona1.setDedos(25);
        persona1.setLunares(36);
        System.out.println("\n..Datos personales de la persona..\n");
        System.out.println("Cabello:\n" +
                persona1.getColorCabello());
        System.out.println("Ojos:\n" +
                persona1.getColorOjos());
        System.out.println("Piel:\n" +
                persona1.getColorPiel());
        System.out.println("Dedos:\n" +
                persona1.getDedos());
        System.out.println("Lunares:\n" +
                persona1.getLunares());

        //Persona 2
        Persona persona2 = new Persona();
        persona2.setColorCabello("Blonde");
        persona2.setColorOjos("Blue");
        persona2.setColorPiel("Pale");
        persona2.setDedos(20);
        persona2.setLunares(5);
        System.out.println("\nDatos:\n");
        System.out.println("Cabello:\n" +
                persona2.getColorCabello());
        System.out.println("Ojos:\n" +
                persona2.getColorOjos());
        System.out.println("Piel:\n" +
                persona2.getColorPiel());
        System.out.println("Dedos:\n" +
                persona2.getDedos());
        System.out.println("Lunares:\n" +
                persona2.getLunares());

        //Tamal 1
        Tamal tamal1 = new Tamal();
        tamal1.setColor("Brown");
        tamal1.setPeso(15F);
        tamal1.setRegion("Antioquia");
        tamal1.setTamanio("Developer");
        tamal1.setPrecio(40000F);
        System.out.println("\n..Menú de los tamales..\n");
        System.out.println("Tamal 1:\n");
        System.out.println("Color:\n" +
                tamal1.getColor());
        System.out.println("Peso:\n" +
                tamal1.getPeso());
        System.out.println("Region:\n" +
                tamal1.getRegion());
        System.out.println("Tamanio:\n" +
                tamal1.getTamanio());
        System.out.println("Precio:\n" +
                tamal1.getPrecio());

        //Tamal 2
        Tamal tamal2 = new Tamal();
        tamal2.setColor("Brown");
        tamal2.setPeso(15F);
        tamal2.setRegion("Antioquia");
        tamal2.setTamanio("Developer");
        tamal2.setPrecio(40000F);
        System.out.println("Tamal 2:\n");
        System.out.println("Color:\n" +
                tamal2.getColor());
        System.out.println("Peso:\n" +
                tamal2.getPeso());
        System.out.println("Region:\n" +
                tamal2.getRegion());
        System.out.println("Tamanio:\n" +
                tamal2.getTamanio());
        System.out.println("Precio:\n" +
                tamal2.getPrecio());
    }
}
