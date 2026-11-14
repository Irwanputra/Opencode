package dev.epro.r0;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 21, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        w8455343525638953052.c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        w8455343525638953052.b = bigIntegerModPow2;
        a = O4077903568229246.n(c(bigIntegerMod));
        b = O4077903568229246.n(c(bigIntegerMod2));
        c = O4077903568229246.n(c(bigIntegerModPow));
        d = (E1517907155487775131[][]) Array.newInstance((Class<?>) E1517907155487775131.class, 32, 8);
        W8455343525638953052 w8455343525638953052A = w8455343525638953052;
        for (int i = 0; i < 32; i++) {
            W8455343525638953052 w8455343525638953052A2 = w8455343525638953052A;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = b(w8455343525638953052A2);
                w8455343525638953052A2 = a(w8455343525638953052A2, w8455343525638953052A);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                w8455343525638953052A = a(w8455343525638953052A, w8455343525638953052A);
            }
        }
        W8455343525638953052 w8455343525638953052A3 = a(w8455343525638953052, w8455343525638953052);
        e = new E1517907155487775131[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = b(w8455343525638953052);
            w8455343525638953052 = a(w8455343525638953052, w8455343525638953052A3);
        }
    }

    public static W8455343525638953052 a(W8455343525638953052 w8455343525638953052, W8455343525638953052 w84553435256389530522) {
        W8455343525638953052 w84553435256389530523 = new W8455343525638953052((byte) 21, false);
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.b).multiply((BigInteger) w8455343525638953052.c).multiply((BigInteger) w84553435256389530522.c));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.c).add(((BigInteger) w84553435256389530522.b).multiply((BigInteger) w8455343525638953052.c));
        BigInteger bigInteger2 = BigInteger.ONE;
        w84553435256389530523.b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        w84553435256389530523.c = ((BigInteger) w8455343525638953052.c).multiply((BigInteger) w84553435256389530522.c).add(((BigInteger) w8455343525638953052.b).multiply((BigInteger) w84553435256389530522.b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return w84553435256389530523;
    }

    public static E1517907155487775131 b(W8455343525638953052 w8455343525638953052) {
        BigInteger bigIntegerAdd = ((BigInteger) w8455343525638953052.c).add((BigInteger) w8455343525638953052.b);
        BigInteger bigInteger = f;
        return new E1517907155487775131(O4077903568229246.n(c(bigIntegerAdd.mod(bigInteger))), O4077903568229246.n(c(((BigInteger) w8455343525638953052.c).subtract((BigInteger) w8455343525638953052.b).mod(bigInteger))), O4077903568229246.n(c(h.multiply((BigInteger) w8455343525638953052.b).multiply((BigInteger) w8455343525638953052.c).mod(bigInteger))));
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
