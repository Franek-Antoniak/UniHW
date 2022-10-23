public class Ex6 {
    public static void main(String[] args) {
        float f = 1234.567f;
        // Nie skompiluje się:
//        float l = 1234.567L;
        if(f == 12.34567E2f) {
            System.out.println("1234.567f == 12.34567E2");
        }
        if(f == 1.234567E06f) {
            System.out.println("1234.567f == 1.234567E06");
        }
        if(f == 1234567E-3f) {
            System.out.println("1234.567f == 1234567E-3");
        }
    }
}
