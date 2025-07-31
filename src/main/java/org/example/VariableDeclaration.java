package org.example;

public class VariableDeclaration {
    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String statingString = "Progress, not perfection.";
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 12_34.95;

    public void displayVariables() {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println("Local Variables:");
        System.out.println("  localDecimal = " + localDecimal);
        System.out.println("  localHex = " + localHex);
        System.out.println("  localBinary = " + localBinary);
        System.out.println("  localOctal = " + localOctal);
        System.out.println("  localLong = " + localLong);
        System.out.println("  localString = " + localString);
        System.out.println();
        System.out.println("Instance Variables:");
        System.out.println("  instanceBinary = " + instanceBinary);
        System.out.println("  instanceOctal = " + instanceOctal);
        System.out.println("  instanceDouble = " + instanceDouble);
        System.out.println();
        System.out.println("Static Variable:");
        System.out.println("  staticHex = " + staticHex);
        System.out.println("  staticByte = " + staticByte);
        System.out.println("  statingString = " + statingString);
    }
}
