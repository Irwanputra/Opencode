package dev.epro.r0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z10210542706506868338 {
    static {
        ByteBuffer.allocate(0);
    }

    public static byte[] a(B11059234153875532973 b11059234153875532973, X13396380553427713373 x13396380553427713373, long j) throws Throwable {
        long j2 = x13396380553427713373.e;
        String str = x13396380553427713373.g;
        if (j2 > 2147483647L) {
            throw new IOException(str + " too large: " + j2);
        }
        try {
            byte[] bArr = new byte[(int) j2];
            b(b11059234153875532973, x13396380553427713373, j, new Q13138685904306860250(ByteBuffer.wrap(bArr), (byte) 1));
            return bArr;
        } catch (OutOfMemoryError e) {
            throw new IOException(str + " too large: " + j2, e);
        }
    }

    public static void b(B11059234153875532973 b11059234153875532973, X13396380553427713373 x13396380553427713373, long j, P14572820171047441271 p14572820171047441271) throws Throwable {
        String str;
        R699288991908320557 r699288991908320557;
        String str2 = x13396380553427713373.g;
        int i = x13396380553427713373.h;
        int i2 = i + 30;
        long j2 = x13396380553427713373.f;
        long j3 = ((long) i2) + j2;
        if (j3 > j) {
            StringBuilder sbH = X2485016533998461232.h("Local File Header of ", str2, " extends beyond start of Central Directory. LFH end: ", j3);
            sbH.append(", CD start: ");
            sbH.append(j);
            throw new G3596274300958059526(sbH.toString());
        }
        try {
            ByteBuffer byteBufferB = b11059234153875532973.b(i2, j2);
            byteBufferB.order(ByteOrder.LITTLE_ENDIAN);
            int i3 = byteBufferB.getInt();
            if (i3 != 67324752) {
                StringBuilder sbG = X2485016533998461232.g("Not a Local File Header record for entry ", str2, ". Signature: 0x");
                sbG.append(Long.toHexString(((long) i3) & 4294967295L));
                throw new G3596274300958059526(sbG.toString());
            }
            boolean z = (byteBufferB.getShort(6) & 8) != 0;
            boolean z2 = (x13396380553427713373.a & 8) != 0;
            if (z != z2) {
                throw new G3596274300958059526("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + str2 + ". LFH: " + z + ", CD: " + z2);
            }
            long j4 = x13396380553427713373.c;
            long j5 = x13396380553427713373.d;
            long j6 = x13396380553427713373.e;
            if (z) {
                str = ", CD start: ";
            } else {
                str = ", CD start: ";
                long j7 = ((long) byteBufferB.getInt(14)) & 4294967295L;
                if (j7 != j4) {
                    StringBuilder sbH2 = X2485016533998461232.h("CRC-32 mismatch between Local File Header and Central Directory for entry ", str2, ". LFH: ", j7);
                    sbH2.append(", CD: ");
                    sbH2.append(j4);
                    throw new G3596274300958059526(sbH2.toString());
                }
                long j8 = ((long) byteBufferB.getInt(18)) & 4294967295L;
                if (j8 != j5) {
                    StringBuilder sbH3 = X2485016533998461232.h("Compressed size mismatch between Local File Header and Central Directory for entry ", str2, ". LFH: ", j8);
                    sbH3.append(", CD: ");
                    sbH3.append(j5);
                    throw new G3596274300958059526(sbH3.toString());
                }
                long j9 = ((long) byteBufferB.getInt(22)) & 4294967295L;
                if (j9 != j6) {
                    StringBuilder sbH4 = X2485016533998461232.h("Uncompressed size mismatch between Local File Header and Central Directory for entry ", str2, ". LFH: ", j9);
                    sbH4.append(", CD: ");
                    sbH4.append(j6);
                    throw new G3596274300958059526(sbH4.toString());
                }
            }
            int i4 = byteBufferB.getShort(26) & 65535;
            if (i4 > i) {
                throw new G3596274300958059526(E12098517352909843120.n(G6547577305291411977.x(i4, "Name mismatch between Local File Header and Central Directory for entry", str2, ". LFH: ", " bytes, CD: "), i, " bytes"));
            }
            String strA = X13396380553427713373.a(30, i4, byteBufferB);
            if (!str2.equals(strA)) {
                throw new G3596274300958059526(E12098517352909843120.m("Name mismatch between Local File Header and Central Directory. LFH: \"", strA, "\", CD: \"", str2, "\""));
            }
            int i5 = byteBufferB.getShort(28) & 65535;
            long j10 = j2 + 30 + ((long) i4) + ((long) i5);
            boolean z3 = x13396380553427713373.b != 0;
            long j11 = z3 ? j5 : j6;
            long j12 = j10 + j11;
            if (j12 > j) {
                StringBuilder sbH5 = X2485016533998461232.h("Local File Header data of ", str2, " overlaps with Central Directory. LFH data start: ", j10);
                sbH5.append(", LFH data end: ");
                sbH5.append(j12);
                sbH5.append(str);
                sbH5.append(j);
                throw new G3596274300958059526(sbH5.toString());
            }
            long j13 = j2 + ((long) (i4 + 30 + i5));
            try {
                if (!z3) {
                    b11059234153875532973.a(j13, j11, p14572820171047441271);
                    return;
                }
                try {
                    R699288991908320557 r6992889919083205572 = new R699288991908320557(p14572820171047441271);
                    try {
                        b11059234153875532973.a(j13, j11, r6992889919083205572);
                        r699288991908320557 = r6992889919083205572;
                        try {
                            long j14 = r699288991908320557.e;
                            if (j14 == j6) {
                                r699288991908320557.close();
                                return;
                            }
                            throw new G3596274300958059526("Unexpected size of uncompressed data of " + str2 + ". Expected: " + j6 + " bytes, actual: " + j14 + " bytes");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                r699288991908320557.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r699288991908320557 = r6992889919083205572;
                    }
                } catch (IOException e) {
                    if (!(e.getCause() instanceof DataFormatException)) {
                        throw e;
                    }
                    throw new G3596274300958059526("Data of entry " + str2 + " malformed", e);
                }
            } catch (IOException e2) {
                throw new IOException(G6547577305291411977.v(new StringBuilder("Failed to read data of "), z3 ? "compressed" : "uncompressed", " entry ", str2), e2);
            }
        } catch (IOException e3) {
            Z3383101362411723454.q("Failed to read Local File Header of ".concat(str2), e3);
        }
    }
}
