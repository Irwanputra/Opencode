package net.i2p.crypto.eddsa.math.ed25519;

import dev.epro.r0.S10973172697741180971;
import java.util.Arrays;
import net.i2p.crypto.eddsa.Utils;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.FieldElement;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public class Ed25519FieldElement extends FieldElement {
    private static final byte[] ZERO = new byte[32];
    final int[] t;

    public Ed25519FieldElement(Field field, int[] iArr) {
        super(field);
        if (iArr.length == 10) {
            this.t = iArr;
        } else {
            S10973172697741180971.j("Invalid radix-2^51 representation");
            throw null;
        }
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
            int i4 = iArr2[i3];
            iArr[i3] = i4;
            iArr[i3] = ((iArr2[i3] ^ ed25519FieldElement.t[i3]) & i2) ^ i4;
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
        int i = iArr[1];
        int i2 = iArr[2];
        int i3 = iArr[3];
        int i4 = iArr[4];
        int i5 = iArr[5];
        int i6 = iArr[6];
        int i7 = iArr[7];
        int i8 = iArr[8];
        int i9 = iArr[9];
        int i10 = i9 * 19;
        int[] iArr2 = this.t;
        int i11 = iArr2[1];
        int i12 = iArr2[3];
        int i13 = iArr2[5];
        int i14 = i13 * 2;
        int i15 = iArr2[7];
        int i16 = i15 * 2;
        int i17 = iArr2[9];
        int i18 = i17 * 2;
        int i19 = iArr2[0];
        int i20 = iArr[0];
        long j = i2 * i19;
        long j2 = i11 * 2;
        long j3 = i * j2;
        long j4 = i2 * i11;
        long j5 = i3 * j2;
        long j6 = i5 * j2;
        long j7 = i7 * j2;
        long j8 = i10;
        long j9 = j2 * j8;
        int i21 = iArr2[2];
        long j10 = i20 * i21;
        long j11 = i * i21;
        long j12 = i2 * i21;
        long j13 = i3 * i21;
        long j14 = i4 * i21;
        long j15 = i5 * i21;
        long j16 = i6 * i21;
        long j17 = i21 * i7;
        long j18 = i8 * 19;
        long j19 = i21 * j18;
        long j20 = i21 * j8;
        long j21 = i20 * i12;
        long j22 = i12 * 2;
        long j23 = i * j22;
        long j24 = i2 * i12;
        long j25 = i3 * j22;
        long j26 = i4 * i12;
        long j27 = i5 * j22;
        long j28 = i12 * i6;
        long j29 = i7 * 19;
        long j30 = j22 * j29;
        long j31 = i12 * j18;
        long j32 = j22 * j8;
        int i22 = iArr2[4];
        long j33 = i20 * i22;
        long j34 = i * i22;
        long j35 = i2 * i22;
        long j36 = i3 * i22;
        long j37 = i4 * i22;
        long j38 = i5 * i22;
        long j39 = i6 * 19;
        long j40 = i22 * j39;
        long j41 = i22 * j29;
        long j42 = i22 * j18;
        long j43 = i22 * j8;
        long j44 = i20 * i13;
        long j45 = i14;
        long j46 = i * j45;
        long j47 = i2 * i13;
        long j48 = i3 * j45;
        long j49 = i4 * i13;
        long j50 = i5 * 19;
        long j51 = j45 * j50;
        long j52 = i13 * j39;
        long j53 = j45 * j29;
        long j54 = i13 * j18;
        long j55 = j45 * j8;
        int i23 = iArr2[6];
        long j56 = i20 * i23;
        long j57 = i * i23;
        long j58 = i2 * i23;
        long j59 = i23 * i3;
        long j60 = i4 * 19;
        long j61 = i23 * j60;
        long j62 = i23 * j50;
        long j63 = i23 * j39;
        long j64 = i23 * j29;
        long j65 = i23 * j18;
        long j66 = i23 * j8;
        long j67 = i20 * i15;
        long j68 = i16;
        long j69 = i * j68;
        long j70 = i2 * i15;
        long j71 = i3 * 19;
        long j72 = j68 * j71;
        long j73 = i15 * j60;
        long j74 = j68 * j50;
        long j75 = i15 * j39;
        long j76 = j68 * j29;
        long j77 = i15 * j18;
        long j78 = j68 * j8;
        int i24 = iArr2[8];
        long j79 = i20 * i24;
        long j80 = i * i24;
        long j81 = i2 * 19;
        long j82 = i24 * j81;
        long j83 = i24 * j71;
        long j84 = i24 * j60;
        long j85 = i24 * j50;
        long j86 = i24 * j39;
        long j87 = i24 * j29;
        long j88 = i24 * j18;
        long j89 = i24 * j8;
        long j90 = i20 * i17;
        long j91 = i18;
        long j92 = i * 19 * j91;
        long j93 = i17 * j81;
        long j94 = i17 * j18;
        long j95 = j8 * j91;
        long j96 = (i20 * i19) + j9 + j19 + j30 + j40 + j51 + j61 + j72 + j82 + j92;
        long j97 = (i * i19) + (i20 * i11) + j20 + j31 + j41 + j52 + j62 + j73 + j83 + j93;
        long j98 = j + j3 + j10 + j32 + j42 + j53 + j63 + j74 + j84 + (j71 * j91);
        long j99 = (i3 * i19) + j4 + j11 + j21 + j43 + j54 + j64 + j75 + j85 + (i17 * j60);
        long j100 = (i4 * i19) + j5 + j12 + j23 + j33 + j55 + j65 + j76 + j86 + (j50 * j91);
        long j101 = (i5 * i19) + (i4 * i11) + j13 + j24 + j34 + j44 + j66 + j77 + j87 + (i17 * j39);
        long j102 = (i6 * i19) + j6 + j14 + j25 + j35 + j46 + j56 + j78 + j88 + (j29 * j91);
        long j103 = (i7 * i19) + (i6 * i11) + j15 + j26 + j36 + j47 + j57 + j67 + j89 + j94;
        long j104 = (i8 * i19) + j7 + j16 + j27 + j37 + j48 + j58 + j69 + j79 + j95;
        long j105 = (i9 * i19) + (i11 * i8) + j17 + j28 + j38 + j49 + j59 + j70 + j80 + j90;
        long j106 = (j96 + 33554432) >> 26;
        long j107 = j97 + j106;
        long j108 = j96 - (j106 << 26);
        long j109 = (j100 + 33554432) >> 26;
        long j110 = j101 + j109;
        long j111 = (j107 + 16777216) >> 25;
        long j112 = j98 + j111;
        long j113 = j107 - (j111 << 25);
        long j114 = (j110 + 16777216) >> 25;
        long j115 = j102 + j114;
        long j116 = j110 - (j114 << 25);
        long j117 = (j112 + 33554432) >> 26;
        long j118 = j99 + j117;
        long j119 = j112 - (j117 << 26);
        long j120 = (j115 + 33554432) >> 26;
        long j121 = j103 + j120;
        long j122 = j115 - (j120 << 26);
        long j123 = (j118 + 16777216) >> 25;
        long j124 = (j100 - (j109 << 26)) + j123;
        long j125 = j118 - (j123 << 25);
        long j126 = (j121 + 16777216) >> 25;
        long j127 = j104 + j126;
        long j128 = j121 - (j126 << 25);
        long j129 = (j124 + 33554432) >> 26;
        long j130 = (j127 + 33554432) >> 26;
        long j131 = j105 + j130;
        long j132 = j127 - (j130 << 26);
        long j133 = (j131 + 16777216) >> 25;
        long j134 = (19 * j133) + j108;
        long j135 = j131 - (j133 << 25);
        long j136 = (j134 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j134 - (j136 << 26)), (int) (j113 + j136), (int) j119, (int) j125, (int) (j124 - (j129 << 26)), (int) (j116 + j129), (int) j122, (int) j128, (int) j132, (int) j135});
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
        int i11 = i3 * 2;
        int i12 = i5 * 2;
        int i13 = i7 * 2;
        int i14 = i7 * 19;
        int i15 = i9 * 19;
        int i16 = i10 * 38;
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
        long j22 = i2 * 2;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = i4 * 2;
        long j26 = j22 * j10;
        long j27 = i6 * 2;
        long j28 = j22 * j27;
        long j29 = i8 * 2;
        long j30 = j22 * j29;
        long j31 = i16;
        long j32 = j22 * j31;
        long j33 = i11;
        long j34 = j33 * j8;
        long j35 = j33 * j10;
        long j36 = j33 * j12;
        long j37 = j33 * j14;
        long j38 = j33 * j16;
        long j39 = i15;
        long j40 = j33 * j39;
        long j41 = j6 * j31;
        long j42 = j25 * j27;
        long j43 = i8 * 38;
        long j44 = j25 * j43;
        long j45 = j25 * j39;
        long j46 = j25 * j31;
        long j47 = i12;
        long j48 = j47 * j12;
        long j49 = i14;
        long j50 = j47 * j49;
        long j51 = j10 * j43;
        long j52 = j47 * j39;
        long j53 = j10 * j31;
        long j54 = j49 * j14;
        long j55 = j14 * j43;
        long j56 = j2 + j32 + j40 + j44 + j50 + (j12 * i6 * 38);
        long j57 = j11 + (j22 * j25) + (j6 * j6) + (j27 * j31) + (i13 * j39) + (j16 * j43);
        long j58 = j13 + j26 + j34 + (j14 * j31);
        long j59 = j15 + j28 + j35 + (j8 * j25);
        long j60 = j17 + (j22 * j14) + j36 + (j25 * j10);
        long j61 = j19 + j30 + j37 + j42 + (j10 * j10);
        long j62 = j21 + (j22 * j18) + j38 + (j25 * j14) + j48;
        long j63 = (j56 + 33554432) >> 26;
        long j64 = j5 + j41 + j45 + j51 + (j27 * j49) + j63;
        long j65 = j56 - (j63 << 26);
        long j66 = (j57 + 33554432) >> 26;
        long j67 = j58 + (j29 * j39) + j66;
        long j68 = (j64 + 16777216) >> 25;
        long j69 = j7 + j23 + j46 + j52 + (j27 * j43) + j54 + j68;
        long j70 = j64 - (j68 << 25);
        long j71 = (j67 + 16777216) >> 25;
        long j72 = j59 + (j29 * j31) + (j18 * j39) + j71;
        long j73 = j67 - (j71 << 25);
        long j74 = (j69 + 33554432) >> 26;
        long j75 = j9 + j24 + j53 + (j27 * j39) + j55 + j74;
        long j76 = (j72 + 33554432) >> 26;
        long j77 = j60 + (j18 * j31) + j76;
        long j78 = (j75 + 16777216) >> 25;
        long j79 = (j57 - (j66 << 26)) + j78;
        long j80 = (j77 + 16777216) >> 25;
        long j81 = j61 + (j20 * j31) + j80;
        long j82 = j77 - (j80 << 25);
        long j83 = (j79 + 33554432) >> 26;
        long j84 = j73 + j83;
        long j85 = j79 - (j83 << 26);
        long j86 = (j81 + 33554432) >> 26;
        long j87 = j62 + j86;
        long j88 = (j87 + 16777216) >> 25;
        long j89 = (19 * j88) + j65;
        long j90 = (j89 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j89 - (j90 << 26)), (int) (j70 + j90), (int) (j69 - (j74 << 26)), (int) (j75 - (j78 << 25)), (int) j85, (int) j84, (int) (j72 - (j76 << 26)), (int) j82, (int) (j81 - (j86 << 26)), (int) (j87 - (j88 << 25))});
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
        int i11 = i3 * 2;
        int i12 = i5 * 2;
        int i13 = i7 * 2;
        int i14 = i7 * 19;
        int i15 = i9 * 19;
        int i16 = i10 * 38;
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
        long j22 = i2 * 2;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = i4 * 2;
        long j26 = j22 * j10;
        long j27 = i6 * 2;
        long j28 = j22 * j27;
        long j29 = i8 * 2;
        long j30 = j22 * j29;
        long j31 = i16;
        long j32 = j22 * j31;
        long j33 = i11;
        long j34 = j33 * j8;
        long j35 = j33 * j10;
        long j36 = j33 * j12;
        long j37 = j33 * j14;
        long j38 = j33 * j16;
        long j39 = i15;
        long j40 = j33 * j39;
        long j41 = j6 * j31;
        long j42 = j25 * j27;
        long j43 = i8 * 38;
        long j44 = j25 * j43;
        long j45 = j25 * j39;
        long j46 = j25 * j31;
        long j47 = i12;
        long j48 = j47 * j12;
        long j49 = i14;
        long j50 = j47 * j49;
        long j51 = j10 * j43;
        long j52 = j47 * j39;
        long j53 = j10 * j31;
        long j54 = j49 * j14;
        long j55 = j14 * j43;
        long j56 = j2 + j32 + j40 + j44 + j50 + (j12 * i6 * 38);
        long j57 = j5 + j41 + j45 + j51 + (j27 * j49);
        long j58 = j7 + j23 + j46 + j52 + (j27 * j43) + j54;
        long j59 = j9 + j24 + j53 + (j27 * j39) + j55;
        long j60 = j11 + (j22 * j25) + (j6 * j6) + (j27 * j31) + (i13 * j39) + (j16 * j43);
        long j61 = j13 + j26 + j34 + (j14 * j31) + (j29 * j39);
        long j62 = j15 + j28 + j35 + (j8 * j25) + (j29 * j31) + (j18 * j39);
        long j63 = j17 + (j22 * j14) + j36 + (j25 * j10) + (j18 * j31);
        long j64 = j19 + j30 + j37 + j42 + (j10 * j10) + (j20 * j31);
        long j65 = j21 + (j22 * j18) + j38 + (j25 * j14) + j48;
        long j66 = j56 + j56;
        long j67 = j60 + j60;
        long j68 = (j66 + 33554432) >> 26;
        long j69 = j57 + j57 + j68;
        long j70 = j66 - (j68 << 26);
        long j71 = (j67 + 33554432) >> 26;
        long j72 = j61 + j61 + j71;
        long j73 = (j69 + 16777216) >> 25;
        long j74 = j58 + j58 + j73;
        long j75 = j69 - (j73 << 25);
        long j76 = (j72 + 16777216) >> 25;
        long j77 = j62 + j62 + j76;
        long j78 = j72 - (j76 << 25);
        long j79 = (j74 + 33554432) >> 26;
        long j80 = j59 + j59 + j79;
        long j81 = (j77 + 33554432) >> 26;
        long j82 = j63 + j63 + j81;
        long j83 = (j80 + 16777216) >> 25;
        long j84 = (j67 - (j71 << 26)) + j83;
        long j85 = (j82 + 16777216) >> 25;
        long j86 = j64 + j64 + j85;
        long j87 = j82 - (j85 << 25);
        long j88 = (j84 + 33554432) >> 26;
        long j89 = j78 + j88;
        long j90 = j84 - (j88 << 26);
        long j91 = (j86 + 33554432) >> 26;
        long j92 = j65 + j65 + j91;
        long j93 = (j92 + 16777216) >> 25;
        long j94 = (19 * j93) + j70;
        long j95 = (j94 + 33554432) >> 26;
        return new Ed25519FieldElement(this.f, new int[]{(int) (j94 - (j95 << 26)), (int) (j75 + j95), (int) (j74 - (j79 << 26)), (int) (j80 - (j83 << 25)), (int) j90, (int) j89, (int) (j77 - (j81 << 26)), (int) j87, (int) (j86 - (j91 << 26)), (int) (j92 - (j93 << 25))});
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
        return "[Ed25519FieldElement val=" + Utils.bytesToHex(toByteArray()) + "]";
    }
}
