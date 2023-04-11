public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        byte[] byteMass = new byte[]{1, 2, 3};
        float[] floatMas = {1.57f, 7.654f, 9.986f};
        boolean[] flagsSet = new boolean[23];
    }

    public static void task2() {
        byte[] byteMass = new byte[]{1, 2, 3};
        float[] floatMas = {1.57f, 7.654f, 9.986f};
        char[] charMas = {'М', 'и', 'р', '!'};
        for (int i = 0; i < byteMass.length; i++) {
            if (i != byteMass.length - 1) {
                System.out.print(byteMass[i] + ", ");
            } else System.out.print(byteMass[i]);
        }
        System.out.println();
        for (int i = 0; i < floatMas.length; i++) {
            if (i != floatMas.length - 1) {
                System.out.print(floatMas[i] + ", ");
            } else System.out.print(floatMas[i]);
        }
        System.out.println();
        for (int i = 0; i < charMas.length; i++) {
            if (i != charMas.length - 1) {
                System.out.print(charMas[i] + ", ");
            } else System.out.print(charMas[i]);
        }
    }
}