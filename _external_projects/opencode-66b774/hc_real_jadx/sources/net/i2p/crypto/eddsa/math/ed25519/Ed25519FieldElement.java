package net.i2p.crypto.eddsa.math.ed25519;

import java.util.Arrays;
import net.i2p.crypto.eddsa.Utils;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.FieldElement;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Ed25519FieldElement extends FieldElement {
    private static final byte[] ZERO = new byte[32];
    public final int[] t;

    public Ed25519FieldElement(Field field, int[] iArr) {
        super(field);
        if (iArr.length != 10) {
            throw new IllegalArgumentException("Invalid radix-2^51 representation");
        }
        this.t = iArr;
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement add(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).t;
        int[] iArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr2[i] = this.t[i] + iArr[i];
        }
        return new Ed25519FieldElement(this.f, iArr2);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement cmov(FieldElement fieldElement, int i) {
        Ed25519FieldElement ed25519FieldElement = (Ed25519FieldElement) fieldElement;
        int i2 = -i;
        int[] iArr = new int[10];
        for (int i3 = 0; i3 < 10; i3++) {
            int[] iArr2 = this.t;
            iArr[i3] = iArr2[i3];
            iArr[i3] = ((iArr2[i3] ^ ed25519FieldElement.t[i3]) & i2) ^ iArr[i3];
        }
        return new Ed25519FieldElement(this.f, iArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ed25519FieldElement) && 1 == Utils.equal(toByteArray(), ((Ed25519FieldElement) obj).toByteArray());
    }

    public int hashCode() {
        return Arrays.hashCode(this.t);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement invert() {
        FieldElement square = square();
        FieldElement multiply = multiply(square.square().square());
        FieldElement multiply2 = square.multiply(multiply);
        FieldElement multiply3 = multiply.multiply(multiply2.square());
        FieldElement square2 = multiply3.square();
        for (int i = 1; i < 5; i++) {
            square2 = square2.square();
        }
        FieldElement multiply4 = square2.multiply(multiply3);
        FieldElement square3 = multiply4.square();
        for (int i2 = 1; i2 < 10; i2++) {
            square3 = square3.square();
        }
        FieldElement multiply5 = square3.multiply(multiply4);
        FieldElement square4 = multiply5.square();
        for (int i3 = 1; i3 < 20; i3++) {
            square4 = square4.square();
        }
        FieldElement square5 = square4.multiply(multiply5).square();
        for (int i4 = 1; i4 < 10; i4++) {
            square5 = square5.square();
        }
        FieldElement multiply6 = square5.multiply(multiply4);
        FieldElement square6 = multiply6.square();
        for (int i5 = 1; i5 < 50; i5++) {
            square6 = square6.square();
        }
        FieldElement multiply7 = square6.multiply(multiply6);
        FieldElement square7 = multiply7.square();
        for (int i6 = 1; i6 < 100; i6++) {
            square7 = square7.square();
        }
        FieldElement square8 = square7.multiply(multiply7).square();
        for (int i7 = 1; i7 < 50; i7++) {
            square8 = square8.square();
        }
        FieldElement square9 = square8.multiply(multiply6).square();
        for (int i8 = 1; i8 < 5; i8++) {
            square9 = square9.square();
        }
        return square9.multiply(multiply2);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public boolean isNonZero() {
        return Utils.equal(toByteArray(), ZERO) == 0;
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement multiply(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).t;
        int i = iArr[1] * 19;
        int i2 = iArr[2] * 19;
        int i3 = iArr[3] * 19;
        int i4 = iArr[4] * 19;
        int i5 = iArr[5] * 19;
        int i6 = iArr[6] * 19;
        int i7 = iArr[7] * 19;
        int i8 = iArr[8] * 19;
        int i9 = iArr[9] * 19;
        int[] iArr2 = this.t;
        int i10 = iArr2[1] * 2;
        int i11 = iArr2[3] * 2;
        int i12 = iArr2[5] * 2;
        int i13 = iArr2[7] * 2;
        long j = iArr2[0] * iArr[0];
        long j2 = iArr2[0] * iArr[1];
        long j3 = iArr2[0] * iArr[2];
        long j4 = iArr2[0] * iArr[3];
        long j5 = iArr2[0] * iArr[4];
        long j6 = iArr2[0] * iArr[5];
        long j7 = iArr2[0] * iArr[6];
        long j8 = iArr2[0] * iArr[7];
        long j9 = iArr2[0] * iArr[8];
        long j10 = iArr2[0] * iArr[9];
        long j11 = iArr2[1] * iArr[0];
        long j12 = i10;
        long j13 = iArr[1] * j12;
        long j14 = iArr2[1] * iArr[2];
        long j15 = iArr[3] * j12;
        long j16 = iArr2[1] * iArr[4];
        long j17 = iArr[5] * j12;
        long j18 = iArr2[1] * iArr[6];
        long j19 = iArr[7] * j12;
        long j20 = iArr2[1] * iArr[8];
        long j21 = i9;
        long j22 = j12 * j21;
        long j23 = iArr2[2] * iArr[0];
        long j24 = iArr2[2] * iArr[1];
        long j25 = iArr2[2] * iArr[2];
        long j26 = iArr2[2] * iArr[3];
        long j27 = iArr2[2] * iArr[4];
        long j28 = iArr2[2] * iArr[5];
        long j29 = iArr2[2] * iArr[6];
        long j30 = iArr2[2] * iArr[7];
        long j31 = i8;
        long j32 = iArr2[2] * j31;
        long j33 = iArr2[2] * j21;
        long j34 = iArr2[3] * iArr[0];
        long j35 = i11;
        long j36 = iArr[1] * j35;
        long j37 = iArr2[3] * iArr[2];
        long j38 = iArr[3] * j35;
        long j39 = iArr2[3] * iArr[4];
        long j40 = iArr[5] * j35;
        long j41 = iArr2[3] * iArr[6];
        long j42 = i7;
        long j43 = j35 * j42;
        long j44 = iArr2[3] * j31;
        long j45 = j35 * j21;
        long j46 = iArr2[4] * iArr[0];
        long j47 = iArr2[4] * iArr[1];
        long j48 = iArr2[4] * iArr[2];
        long j49 = iArr2[4] * iArr[3];
        long j50 = iArr2[4] * iArr[4];
        long j51 = iArr2[4] * iArr[5];
        long j52 = i6;
        long j53 = iArr2[4] * j52;
        long j54 = iArr2[4] * j42;
        long j55 = iArr2[4] * j31;
        long j56 = iArr2[4] * j21;
        long j57 = iArr2[5] * iArr[0];
        long j58 = i12;
        long j59 = iArr[1] * j58;
        long j60 = iArr2[5] * iArr[2];
        long j61 = iArr[3] * j58;
        long j62 = iArr2[5] * iArr[4];
        long j63 = i5;
        long j64 = j58 * j63;
        long j65 = iArr2[5] * j52;
        long j66 = j58 * j42;
        long j67 = iArr2[5] * j31;
        long j68 = j58 * j21;
        long j69 = iArr2[6] * iArr[0];
        long j70 = iArr2[6] * iArr[1];
        long j71 = iArr2[6] * iArr[2];
        long j72 = iArr2[6] * iArr[3];
        long j73 = i4;
        long j74 = iArr2[6] * j73;
        long j75 = iArr2[6] * j63;
        long j76 = iArr2[6] * j52;
        long j77 = iArr2[6] * j42;
        long j78 = iArr2[6] * j31;
        long j79 = iArr2[6] * j21;
        long j80 = iArr2[7] * iArr[0];
        long j81 = i13;
        long j82 = iArr[1] * j81;
        long j83 = iArr2[7] * iArr[2];
        long j84 = i3;
        long j85 = j81 * j84;
        long j86 = iArr2[7] * j73;
        long j87 = j81 * j63;
        long j88 = iArr2[7] * j52;
        long j89 = j81 * j42;
        long j90 = iArr2[7] * j31;
        long j91 = j81 * j21;
        long j92 = iArr2[8] * iArr[0];
        long j93 = iArr2[8] * iArr[1];
        long j94 = i2;
        long j95 = iArr2[8] * j94;
        long j96 = iArr2[8] * j84;
        long j97 = iArr2[8] * j73;
        long j98 = iArr2[8] * j63;
        long j99 = iArr2[8] * j52;
        long j100 = iArr2[8] * j42;
        long j101 = iArr2[8] * j31;
        long j102 = iArr2[8] * j21;
        long j103 = iArr2[9] * iArr[0];
        long j104 = iArr2[9] * 2;
        long j105 = i * j104;
        long j106 = iArr2[9] * j94;
        long j107 = j84 * j104;
        long j108 = iArr2[9] * j73;
        long j109 = j63 * j104;
        long j110 = iArr2[9] * j52;
        long j111 = j104 * j42;
        long j112 = iArr2[9] * j31;
        long j113 = j104 * j21;
        long j114 = j + j22 + j32 + j43 + j53 + j64 + j74 + j85 + j95 + j105;
        long j115 = j2 + j11 + j33 + j44 + j54 + j65 + j75 + j86 + j96 + j106;
        long j116 = j3 + j13 + j23 + j45 + j55 + j66 + j76 + j87 + j97 + j107;
        long j117 = j4 + j14 + j24 + j34 + j56 + j67 + j77 + j88 + j98 + j108;
        long j118 = j5 + j15 + j25 + j36 + j46 + j68 + j78 + j89 + j99 + j109;
        long j119 = j6 + j16 + j26 + j37 + j47 + j57 + j79 + j90 + j100 + j110;
        long j120 = j7 + j17 + j27 + j38 + j48 + j59 + j69 + j91 + j101 + j111;
        long j121 = j8 + j18 + j28 + j39 + j49 + j60 + j70 + j80 + j102 + j112;
        long j122 = j9 + j19 + j29 + j40 + j50 + j61 + j71 + j82 + j92 + j113;
        long j123 = j10 + j20 + j30 + j41 + j51 + j62 + j72 + j83 + j93 + j103;
        long j124 = (j114 + 33554432) >> 26;
        long j125 = j115 + j124;
        long j126 = j114 - (j124 << 26);
        long j127 = (j118 + 33554432) >> 26;
        long j128 = j119 + j127;
        long j129 = (j125 + 16777216) >> 25;
        long j130 = j116 + j129;
        long j131 = j125 - (j129 << 25);
        long j132 = (j128 + 16777216) >> 25;
        long j133 = j120 + j132;
        long j134 = j128 - (j132 << 25);
        long j135 = (j130 + 33554432) >> 26;
        long j136 = j117 + j135;
        long j137 = j130 - (j135 << 26);
        long j138 = (j133 + 33554432) >> 26;
        long j139 = j121 + j138;
        long j140 = j133 - (j138 << 26);
        long j141 = (j136 + 16777216) >> 25;
        long j142 = (j118 - (j127 << 26)) + j141;
        long j143 = j136 - (j141 << 25);
        long j144 = (j139 + 16777216) >> 25;
        long j145 = j122 + j144;
        long j146 = j139 - (j144 << 25);
        long j147 = (j142 + 33554432) >> 26;
        long j148 = j134 + j147;
        long j149 = j142 - (j147 << 26);
        long j150 = (j145 + 33554432) >> 26;
        long j151 = j123 + j150;
        long j152 = j145 - (j150 << 26);
        long j153 = (j151 + 16777216) >> 25;
        long j154 = (19 * j153) + j126;
        long j155 = (j154 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j154 - (j155 << 26)), (int) (j131 + j155), (int) j137, (int) j143, (int) j149, (int) j148, (int) j140, (int) j146, (int) j152, (int) (j151 - (j153 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement negate() {
        int[] iArr = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr[i] = -this.t[i];
        }
        return new Ed25519FieldElement(this.f, iArr);
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement pow22523() {
        FieldElement square = square();
        FieldElement multiply = multiply(square.square().square());
        FieldElement multiply2 = multiply.multiply(square.multiply(multiply).square());
        FieldElement square2 = multiply2.square();
        for (int i = 1; i < 5; i++) {
            square2 = square2.square();
        }
        FieldElement multiply3 = square2.multiply(multiply2);
        FieldElement square3 = multiply3.square();
        for (int i2 = 1; i2 < 10; i2++) {
            square3 = square3.square();
        }
        FieldElement multiply4 = square3.multiply(multiply3);
        FieldElement square4 = multiply4.square();
        for (int i3 = 1; i3 < 20; i3++) {
            square4 = square4.square();
        }
        FieldElement square5 = square4.multiply(multiply4).square();
        for (int i4 = 1; i4 < 10; i4++) {
            square5 = square5.square();
        }
        FieldElement multiply5 = square5.multiply(multiply3);
        FieldElement square6 = multiply5.square();
        for (int i5 = 1; i5 < 50; i5++) {
            square6 = square6.square();
        }
        FieldElement multiply6 = square6.multiply(multiply5);
        FieldElement square7 = multiply6.square();
        for (int i6 = 1; i6 < 100; i6++) {
            square7 = square7.square();
        }
        FieldElement square8 = square7.multiply(multiply6).square();
        for (int i7 = 1; i7 < 50; i7++) {
            square8 = square8.square();
        }
        return multiply(square8.multiply(multiply5).square().square());
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement square() {
        int[] iArr = this.t;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i2 * 2;
        int i12 = i4 * 2;
        int i13 = i5 * 2;
        int i14 = i6 * 2;
        int i15 = i8 * 2;
        int i16 = i6 * 38;
        int i17 = i8 * 38;
        int i18 = i9 * 19;
        int i19 = i10 * 38;
        long j = i;
        long j2 = j * j;
        long j3 = i * 2;
        long j4 = i2;
        long j5 = j3 * j4;
        long j6 = i3;
        long j7 = j3 * j6;
        long j8 = i4;
        long j9 = j3 * j8;
        long j10 = i5;
        long j11 = j3 * j10;
        long j12 = i6;
        long j13 = j3 * j12;
        long j14 = i7;
        long j15 = j3 * j14;
        long j16 = i8;
        long j17 = j3 * j16;
        long j18 = i9;
        long j19 = j3 * j18;
        long j20 = i10;
        long j21 = j3 * j20;
        long j22 = i11;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = i12;
        long j26 = j22 * j25;
        long j27 = j22 * j10;
        long j28 = i14;
        long j29 = j22 * j28;
        long j30 = j22 * j14;
        long j31 = i15;
        long j32 = j22 * j31;
        long j33 = j22 * j18;
        long j34 = i19;
        long j35 = j6 * j6;
        long j36 = i3 * 2;
        long j37 = j36 * j8;
        long j38 = j36 * j10;
        long j39 = j36 * j12;
        long j40 = j36 * j14;
        long j41 = j36 * j16;
        long j42 = i18;
        long j43 = j36 * j42;
        long j44 = j6 * j34;
        long j45 = j8 * j25;
        long j46 = j25 * j10;
        long j47 = j25 * j14;
        long j48 = i17;
        long j49 = j10 * j10;
        long j50 = i13;
        long j51 = j50 * j12;
        long j52 = i7 * 19;
        long j53 = j50 * j52;
        long j54 = j10 * j48;
        long j55 = j10 * j34;
        long j56 = i16 * j12;
        long j57 = j28 * j52;
        long j58 = j28 * j48;
        long j59 = j52 * j14;
        long j60 = j14 * j48;
        long j61 = j2 + (j22 * j34) + j43 + (j25 * j48) + j53 + j56;
        long j62 = j5 + j44 + (j25 * j42) + j54 + j57;
        long j63 = j9 + j24 + j55 + (j28 * j42) + j60;
        long j64 = j11 + j26 + j35 + (j28 * j34) + (i7 * 2 * j42) + (j48 * j16);
        long j65 = (j61 + 33554432) >> 26;
        long j66 = j62 + j65;
        long j67 = j61 - (j65 << 26);
        long j68 = (j64 + 33554432) >> 26;
        long j69 = j13 + j27 + j37 + (j14 * j34) + (j31 * j42) + j68;
        long j70 = (j66 + 16777216) >> 25;
        long j71 = j7 + j23 + (j25 * j34) + (j50 * j42) + j58 + j59 + j70;
        long j72 = j66 - (j70 << 25);
        long j73 = (j69 + 16777216) >> 25;
        long j74 = j15 + j29 + j38 + j45 + (j31 * j34) + (j42 * j18) + j73;
        long j75 = j69 - (j73 << 25);
        long j76 = (j71 + 33554432) >> 26;
        long j77 = j63 + j76;
        long j78 = j71 - (j76 << 26);
        long j79 = (j74 + 33554432) >> 26;
        long j80 = j17 + j30 + j39 + j46 + (j18 * j34) + j79;
        long j81 = (j77 + 16777216) >> 25;
        long j82 = (j64 - (j68 << 26)) + j81;
        long j83 = (j80 + 16777216) >> 25;
        long j84 = j19 + j32 + j40 + (j25 * j28) + j49 + (j34 * j20) + j83;
        long j85 = j80 - (j83 << 25);
        long j86 = (j82 + 33554432) >> 26;
        long j87 = j75 + j86;
        long j88 = j82 - (j86 << 26);
        long j89 = (j84 + 33554432) >> 26;
        long j90 = j21 + j33 + j41 + j47 + j51 + j89;
        long j91 = j84 - (j89 << 26);
        long j92 = (j90 + 16777216) >> 25;
        long j93 = (19 * j92) + j67;
        long j94 = (j93 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j93 - (j94 << 26)), (int) (j72 + j94), (int) j78, (int) (j77 - (j81 << 25)), (int) j88, (int) j87, (int) (j74 - (j79 << 26)), (int) j85, (int) j91, (int) (j90 - (j92 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement squareAndDouble() {
        int[] iArr = this.t;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i2 * 2;
        int i12 = i4 * 2;
        int i13 = i5 * 2;
        int i14 = i6 * 2;
        int i15 = i8 * 2;
        int i16 = i6 * 38;
        int i17 = i8 * 38;
        int i18 = i9 * 19;
        int i19 = i10 * 38;
        long j = i;
        long j2 = j * j;
        long j3 = i * 2;
        long j4 = i2;
        long j5 = j3 * j4;
        long j6 = i3;
        long j7 = j3 * j6;
        long j8 = i4;
        long j9 = j3 * j8;
        long j10 = i5;
        long j11 = j3 * j10;
        long j12 = i6;
        long j13 = j3 * j12;
        long j14 = i7;
        long j15 = j3 * j14;
        long j16 = i8;
        long j17 = j3 * j16;
        long j18 = i9;
        long j19 = j3 * j18;
        long j20 = i10;
        long j21 = j3 * j20;
        long j22 = i11;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = i12;
        long j26 = j22 * j25;
        long j27 = j22 * j10;
        long j28 = i14;
        long j29 = j22 * j28;
        long j30 = j22 * j14;
        long j31 = i15;
        long j32 = j22 * j31;
        long j33 = j22 * j18;
        long j34 = i19;
        long j35 = j6 * j6;
        long j36 = i3 * 2;
        long j37 = j36 * j8;
        long j38 = j36 * j10;
        long j39 = j36 * j12;
        long j40 = j36 * j14;
        long j41 = j36 * j16;
        long j42 = i18;
        long j43 = j36 * j42;
        long j44 = j6 * j34;
        long j45 = j8 * j25;
        long j46 = j25 * j10;
        long j47 = j25 * j14;
        long j48 = i17;
        long j49 = j10 * j10;
        long j50 = i13;
        long j51 = j50 * j12;
        long j52 = i7 * 19;
        long j53 = j50 * j52;
        long j54 = j10 * j48;
        long j55 = j10 * j34;
        long j56 = i16 * j12;
        long j57 = j28 * j52;
        long j58 = j52 * j14;
        long j59 = j14 * j48;
        long j60 = j2 + (j22 * j34) + j43 + (j25 * j48) + j53 + j56;
        long j61 = j5 + j44 + (j25 * j42) + j54 + j57;
        long j62 = j7 + j23 + (j25 * j34) + (j50 * j42) + (j28 * j48) + j58;
        long j63 = j9 + j24 + j55 + (j28 * j42) + j59;
        long j64 = j11 + j26 + j35 + (j28 * j34) + (i7 * 2 * j42) + (j48 * j16);
        long j65 = j13 + j27 + j37 + (j14 * j34) + (j31 * j42);
        long j66 = j15 + j29 + j38 + j45 + (j31 * j34) + (j42 * j18);
        long j67 = j17 + j30 + j39 + j46 + (j18 * j34);
        long j68 = j19 + j32 + j40 + (j25 * j28) + j49 + (j34 * j20);
        long j69 = j21 + j33 + j41 + j47 + j51;
        long j70 = j60 + j60;
        long j71 = j64 + j64;
        long j72 = (j70 + 33554432) >> 26;
        long j73 = j61 + j61 + j72;
        long j74 = j70 - (j72 << 26);
        long j75 = (j71 + 33554432) >> 26;
        long j76 = j65 + j65 + j75;
        long j77 = (j73 + 16777216) >> 25;
        long j78 = j62 + j62 + j77;
        long j79 = j73 - (j77 << 25);
        long j80 = (j76 + 16777216) >> 25;
        long j81 = j66 + j66 + j80;
        long j82 = j76 - (j80 << 25);
        long j83 = (j78 + 33554432) >> 26;
        long j84 = j63 + j63 + j83;
        long j85 = j78 - (j83 << 26);
        long j86 = (j81 + 33554432) >> 26;
        long j87 = j67 + j67 + j86;
        long j88 = (j84 + 16777216) >> 25;
        long j89 = (j71 - (j75 << 26)) + j88;
        long j90 = (j87 + 16777216) >> 25;
        long j91 = j68 + j68 + j90;
        long j92 = j87 - (j90 << 25);
        long j93 = (j89 + 33554432) >> 26;
        long j94 = j82 + j93;
        long j95 = j89 - (j93 << 26);
        long j96 = (j91 + 33554432) >> 26;
        long j97 = j69 + j69 + j96;
        long j98 = j91 - (j96 << 26);
        long j99 = (j97 + 16777216) >> 25;
        long j100 = (19 * j99) + j74;
        long j101 = (j100 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j100 - (j101 << 26)), (int) (j79 + j101), (int) j85, (int) (j84 - (j88 << 25)), (int) j95, (int) j94, (int) (j81 - (j86 << 26)), (int) j92, (int) j98, (int) (j97 - (j99 << 25))});
    }

    @Override // net.i2p.crypto.eddsa.math.FieldElement
    public FieldElement subtract(FieldElement fieldElement) {
        int[] iArr = ((Ed25519FieldElement) fieldElement).t;
        int[] iArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr2[i] = this.t[i] - iArr[i];
        }
        return new Ed25519FieldElement(this.f, iArr2);
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("[Ed25519FieldElement val=");
        m4207.append(Utils.bytesToHex(toByteArray()));
        m4207.append("]");
        return m4207.toString();
    }
}
