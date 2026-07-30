public class Operator {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // ==========================
        // 1. Arithmetic Operators
        // ==========================
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // ==========================
        // 2. Unary Operators
        // ==========================
        System.out.println("\n=== Unary Operators ===");
        int x = 10;
        System.out.println("Original x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("After x++ = " + x);
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));
        System.out.println("After x-- = " + x);

        // ==========================
        // 3. Assignment Operators
        // ==========================
        System.out.println("\n=== Assignment Operators ===");
        int c = 20;
        System.out.println("Initial c = " + c);

        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 2;
        System.out.println("c /= 2 : " + c);

        c %= 4;
        System.out.println("c %= 4 : " + c);

        // ==========================
        // 4. Relational Operators
        // ==========================
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ==========================
        // 5. Logical Operators
        // ==========================
        System.out.println("\n=== Logical Operators ===");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // ==========================
        // 6. Bitwise Operators
        // ==========================
        System.out.println("\n=== Bitwise Operators ===");
        int m = 6;   //110
        int n = 3;   //011

        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m = " + (~m));

        // ==========================
        // 7. Shift Operators
        // ==========================
        System.out.println("\n=== Shift Operators ===");
        int s = 8;

        System.out.println("s << 2 = " + (s << 2));
        System.out.println("s >> 2 = " + (s >> 2));
        System.out.println("s >>> 2 = " + (s >>> 2));

        // ==========================
        // 8. Ternary Operator
        // ==========================
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        // ==========================
        // 9. instanceof Operator
        // ==========================
        System.out.println("\n=== instanceof Operator ===");
        String str = "Java";
        System.out.println(str instanceof String);

        // ==========================
        // 10. Type Casting
        // ==========================
        System.out.println("\n=== Type Casting ===");
        double d = 15.75;
        int num = (int) d;
        System.out.println("Double = " + d);
        System.out.println("Integer = " + num);
    }
}
