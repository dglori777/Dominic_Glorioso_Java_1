package s01_basic.ex03_variables;

public class Sizes
{
    public static void main(String[] args)
    {
        System.out.println("byte bits: " + Byte.SIZE + ", min: " + Byte.MIN_VALUE
                + ", max: " + Byte.MAX_VALUE);
        System.out.println("int bits: " + Integer.SIZE + ", min: " + Integer.MIN_VALUE
                + ", max: " + Integer.MAX_VALUE);
        System.out.println("long bits: " + Long.SIZE + ", min: " + Long.MIN_VALUE
                + ", max: " + Long.MAX_VALUE);
        System.out.println("float bits: " + Float.SIZE + ", min: " + Float.MIN_VALUE
                + ", max: " + Float.MAX_VALUE);
        System.out.println("char bits: " + Character.SIZE);
    }
}
