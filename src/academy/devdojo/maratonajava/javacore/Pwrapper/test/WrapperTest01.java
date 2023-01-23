package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    byte aByte = 1;
    short aShort = 1;
    int anInt = 1;
    long aLong = 10L;
    float aFloat = 10F;
    double aDouble = 100;
    char aChar = 'w';
    boolean aBoolean = true;

    Byte bByte = 1;
    Short bShort = 1;
    Integer bnInt = 1; // outobxing
    Long bLong = 10L;
    Float bFloat = 10F;
    Double bDouble = 100D;
    Character bChar = 'w';
    Boolean bBoolean = true;

    int i = bByte; // unboxing
    Integer int2 = Integer.parseInt("1");
}
