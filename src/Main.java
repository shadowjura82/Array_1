public class Main {
    static byte[] byteMass = new byte[]{1, 2, 3};
    static float[] floatMas = {1.57f, 7.654f, 9.986f};
    static char[] charMas = {'М', 'и', 'р', '!'};

    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task2() {
        System.out.println("Задача 2");
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
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = byteMass.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(byteMass[i] + ", ");
            } else System.out.print(byteMass[i]);
        }
        System.out.println();
        for (int i = floatMas.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(floatMas[i] + ", ");
            } else System.out.print(floatMas[i]);
        }
        System.out.println();
        for (int i = charMas.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(charMas[i] + ", ");
            } else System.out.print(charMas[i]);
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 0; i < byteMass.length; i++)
            if (byteMass[i] % 2 != 0) byteMass[i]++;
        for (byte x : byteMass) System.out.print(x + " ");
    }
}