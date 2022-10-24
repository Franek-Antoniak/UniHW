public class Ex2 {
    public static void main(String[] args) {
        boolean czyPada = true;
        boolean czySwieciSlonce = false;
        if(czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if(czyPada) {
            System.out.println("plucha");
        } else if(czySwieciSlonce) {
            System.out.println("słonecznie");
        } else {
            System.out.println("pochmurno");
        }
    }
}
