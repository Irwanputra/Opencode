package dev.epro.r0;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class F1919009084933321653 {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final E1517907155487775131[][] d;
    public static final E1517907155487775131[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 21, false);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        w8455343525638953052.c = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        w8455343525638953052.b = modPow2;
        a = O4077903568229246.n(c(mod));
        b = O4077903568229246.n(c(mod2));
        c = O4077903568229246.n(c(modPow));
        d = (E1517907155487775131[][]) Array.newInstance((Class<?>) E1517907155487775131.class, 32, 8);
        W8455343525638953052 w84553435256389530522 = w8455343525638953052;
        for (int i = 0; i < 32; i++) {
            W8455343525638953052 w84553435256389530523 = w84553435256389530522;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = b(w84553435256389530523);
                w84553435256389530523 = a(w84553435256389530523, w84553435256389530522);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                w84553435256389530522 = a(w84553435256389530522, w84553435256389530522);
            }
        }
        W8455343525638953052 a2 = a(w8455343525638953052, w8455343525638953052);
        e = new E1517907155487775131[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = b(w8455343525638953052);
            w8455343525638953052 = a(w8455343525638953052, a2);
        }
    }

    public static W8455343525638953052 a(W8455343525638953052 w8455343525638953052, W8455343525638953052 w84553435256389530522) {
        W8455343525638953052 w84553435256389530523 = new W8455343525638953052((byte) 21, false);
        BigInteger multiply = g.multiply(((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.b).multiply((BigInteger) w8455343525638953052.c).multiply((BigInteger) w84553435256389530522.c));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.c).add(((BigInteger) w84553435256389530522.b).multiply((BigInteger) w8455343525638953052.c));
        BigInteger bigInteger2 = BigInteger.ONE;
        w84553435256389530523.b = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        w84553435256389530523.c = ((BigInteger) w8455343525638953052.c).multiply((BigInteger) w84553435256389530522.c).add(((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.b)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return w84553435256389530523;
    }

    public static E1517907155487775131 b(W8455343525638953052 w8455343525638953052) {
        BigInteger add = ((BigInteger) w8455343525638953052.c).add((BigInteger) w8455343525638953052.b);
        BigInteger bigInteger = f;
        return new E1517907155487775131(O4077903568229246.n(c(add.mod(bigInteger))), O4077903568229246.n(c(((BigInteger) w8455343525638953052.c).subtract((BigInteger) w8455343525638953052.b).mod(bigInteger))), O4077903568229246.n(c(h.multiply((BigInteger) w8455343525638953052.b).multiply((BigInteger) w8455343525638953052.c).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }
}
