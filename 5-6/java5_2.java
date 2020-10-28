public class java5_2 {
    public static boolean canMove(String fig, String xod1, String xod2) {
        xod1 = xod1.toUpperCase();
        xod2 = xod2.toUpperCase();
        fig = fig.toUpperCase();
        if (xod1.matches("([A-H]{1}[1-8]{1})") && xod2.matches("([A-H]{1}[1-8]{1})") && xod1.equals(xod2) == false) {
            if (fig.equals("PAWN")) {
                if (xod1.charAt(1) >= 50 && xod1.charAt(1) <= 55 && xod2.charAt(0) == xod1.charAt(0)
                        && (int) xod2.charAt(1) == (int) xod1.charAt(1) + 1)
                    return true;
                else
                    return false;
            }
            if (fig.equals("ROOK")) {
                if (xod2.charAt(0) == xod1.charAt(0) || xod2.charAt(1) == xod1.charAt(1))
                    return true;
                else
                    return false;
            }
            if (fig.equals("BISHOP")) {
                if (Math.abs((int) xod2.charAt(0) - (int) xod1.charAt(0)) == Math.abs(xod2.charAt(1) - xod1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (fig.equals("QUEEN")) {
                if (xod2.charAt(0) == xod1.charAt(0) || xod2.charAt(1) == xod1.charAt(1) || Math
                        .abs((int) xod2.charAt(0) - (int) xod1.charAt(0)) == Math.abs(xod2.charAt(1) - xod1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (fig.equals("KING")) {
                if (Math.abs((int) xod2.charAt(0) - (int) xod1.charAt(0)) <= 1
                        && Math.abs(xod2.charAt(1) - xod1.charAt(1)) <= 1)
                    return true;
                else
                    return false;
            }
            if (fig.equals("HORSE")) {
                if (Math.abs((int) xod2.charAt(0) - (int) xod1.charAt(0)) == 1
                        && Math.abs(xod2.charAt(1) - xod1.charAt(1)) == 2
                        || Math.abs((int) xod2.charAt(0) - (int) xod1.charAt(0)) == 2
                                && Math.abs(xod2.charAt(1) - xod1.charAt(1)) == 1)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canMove("horse", "A1", "B3"));
    }
}