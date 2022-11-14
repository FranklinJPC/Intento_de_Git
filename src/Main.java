public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Cambio");
        Universidades U = new Universidades();
        U.setApéllido("Patiño");


        System.out.println("Other change");
        System.out.println("agregue este mensaje");

        U.setCodigo_unico("46546546DSDA");
        U.setDomicilio("una cosa");

        System.out.println("Apellido: " + U.apéllido);
        System.out.println("Cedula: " + U.cedula);

        U.setNotas(18);
        U.setNotas(15.45f);
        U.setCedula("8741498");
        U.setPromedios(15.85f);
        System.out.println("se le daño el code a los mijines");
        System.out.println("te la comes entera");
        System.out.println("Vamos a beber");
    }
}