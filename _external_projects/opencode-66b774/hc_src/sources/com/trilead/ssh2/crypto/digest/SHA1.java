package com.trilead.ssh2.crypto.digest;

import dev.epro.r0.L11610354117192841236;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@Deprecated
/* loaded from: classes.dex */
public final class SHA1 implements Digest {
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private long currentLen;
    private int currentPos;
    private final int[] w = new int[80];

    public SHA1() {
        reset();
    }

    private final void perform() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.w;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.H0;
        int i4 = this.H1;
        int i5 = this.H2;
        int i6 = this.H3;
        int i7 = this.H4;
        int i8 = ((i3 << 5) | (i3 >>> 27)) + ((i4 & i5) | ((~i4) & i6));
        int[] iArr2 = this.w;
        int e = L11610354117192841236.e(i8, iArr2[0], 1518500249, i7);
        int i9 = (i4 << 30) | (i4 >>> 2);
        int e2 = L11610354117192841236.e(((e << 5) | (e >>> 27)) + ((i3 & i9) | ((~i3) & i5)), iArr2[1], 1518500249, i6);
        int i10 = (i3 << 30) | (i3 >>> 2);
        int e3 = L11610354117192841236.e(((e2 << 5) | (e2 >>> 27)) + (((~e) & i9) | (e & i10)), iArr2[2], 1518500249, i5);
        int i11 = (e >>> 2) | (e << 30);
        int e4 = L11610354117192841236.e(((e3 << 5) | (e3 >>> 27)) + ((e2 & i11) | ((~e2) & i10)), iArr2[3], 1518500249, i9);
        int i12 = (e2 << 30) | (e2 >>> 2);
        int e5 = L11610354117192841236.e(((e4 << 5) | (e4 >>> 27)) + (((~e3) & i11) | (e3 & i12)), iArr2[4], 1518500249, i10);
        int i13 = (e3 << 30) | (e3 >>> 2);
        int e6 = L11610354117192841236.e(((e5 << 5) | (e5 >>> 27)) + ((e4 & i13) | ((~e4) & i12)), iArr2[5], 1518500249, i11);
        int i14 = (e4 >>> 2) | (e4 << 30);
        int e7 = L11610354117192841236.e(((e6 << 5) | (e6 >>> 27)) + ((e5 & i14) | ((~e5) & i13)), iArr2[6], 1518500249, i12);
        int i15 = (e5 >>> 2) | (e5 << 30);
        int e8 = L11610354117192841236.e(((e7 << 5) | (e7 >>> 27)) + ((e6 & i15) | ((~e6) & i14)), iArr2[7], 1518500249, i13);
        int i16 = (e6 >>> 2) | (e6 << 30);
        int e9 = L11610354117192841236.e(((e8 << 5) | (e8 >>> 27)) + ((e7 & i16) | ((~e7) & i15)), iArr2[8], 1518500249, i14);
        int i17 = (e7 >>> 2) | (e7 << 30);
        int e10 = L11610354117192841236.e(((e9 << 5) | (e9 >>> 27)) + ((e8 & i17) | ((~e8) & i16)), iArr2[9], 1518500249, i15);
        int i18 = (e8 >>> 2) | (e8 << 30);
        int e11 = L11610354117192841236.e(((e10 << 5) | (e10 >>> 27)) + ((e9 & i18) | ((~e9) & i17)), iArr2[10], 1518500249, i16);
        int i19 = (e9 >>> 2) | (e9 << 30);
        int e12 = L11610354117192841236.e(((e11 << 5) | (e11 >>> 27)) + ((e10 & i19) | ((~e10) & i18)), iArr2[11], 1518500249, i17);
        int i20 = (e10 >>> 2) | (e10 << 30);
        int e13 = L11610354117192841236.e(((e12 << 5) | (e12 >>> 27)) + ((e11 & i20) | ((~e11) & i19)), iArr2[12], 1518500249, i18);
        int i21 = (e11 >>> 2) | (e11 << 30);
        int e14 = L11610354117192841236.e(((e13 << 5) | (e13 >>> 27)) + ((e12 & i21) | ((~e12) & i20)), iArr2[13], 1518500249, i19);
        int i22 = (e12 >>> 2) | (e12 << 30);
        int e15 = L11610354117192841236.e(((e14 << 5) | (e14 >>> 27)) + ((e13 & i22) | ((~e13) & i21)), iArr2[14], 1518500249, i20);
        int i23 = (e13 >>> 2) | (e13 << 30);
        int e16 = L11610354117192841236.e(((e15 << 5) | (e15 >>> 27)) + ((e14 & i23) | ((~e14) & i22)), iArr2[15], 1518500249, i21);
        int i24 = (e14 >>> 2) | (e14 << 30);
        int e17 = L11610354117192841236.e(((e16 << 5) | (e16 >>> 27)) + ((e15 & i24) | ((~e15) & i23)), iArr2[16], 1518500249, i22);
        int i25 = (e15 >>> 2) | (e15 << 30);
        int e18 = L11610354117192841236.e(((e17 << 5) | (e17 >>> 27)) + ((e16 & i25) | ((~e16) & i24)), iArr2[17], 1518500249, i23);
        int i26 = (e16 >>> 2) | (e16 << 30);
        int e19 = L11610354117192841236.e(((e18 << 5) | (e18 >>> 27)) + ((e17 & i26) | ((~e17) & i25)), iArr2[18], 1518500249, i24);
        int i27 = (e17 >>> 2) | (e17 << 30);
        int e20 = L11610354117192841236.e(((e19 << 5) | (e19 >>> 27)) + ((e18 & i27) | ((~e18) & i26)), iArr2[19], 1518500249, i25);
        int i28 = (e18 << 30) | (e18 >>> 2);
        int e21 = L11610354117192841236.e(((e20 << 5) | (e20 >>> 27)) + ((e19 ^ i28) ^ i27), iArr2[20], 1859775393, i26);
        int i29 = (e19 >>> 2) | (e19 << 30);
        int e22 = L11610354117192841236.e(((e21 << 5) | (e21 >>> 27)) + ((e20 ^ i29) ^ i28), iArr2[21], 1859775393, i27);
        int i30 = (e20 >>> 2) | (e20 << 30);
        int e23 = L11610354117192841236.e(((e22 << 5) | (e22 >>> 27)) + ((e21 ^ i30) ^ i29), iArr2[22], 1859775393, i28);
        int i31 = (e21 >>> 2) | (e21 << 30);
        int e24 = L11610354117192841236.e(((e23 << 5) | (e23 >>> 27)) + ((e22 ^ i31) ^ i30), iArr2[23], 1859775393, i29);
        int i32 = (e22 >>> 2) | (e22 << 30);
        int e25 = L11610354117192841236.e(((e24 << 5) | (e24 >>> 27)) + ((e23 ^ i32) ^ i31), iArr2[24], 1859775393, i30);
        int i33 = (e23 >>> 2) | (e23 << 30);
        int e26 = L11610354117192841236.e(((e25 << 5) | (e25 >>> 27)) + ((e24 ^ i33) ^ i32), iArr2[25], 1859775393, i31);
        int i34 = (e24 >>> 2) | (e24 << 30);
        int e27 = L11610354117192841236.e(((e26 << 5) | (e26 >>> 27)) + ((e25 ^ i34) ^ i33), iArr2[26], 1859775393, i32);
        int i35 = (e25 >>> 2) | (e25 << 30);
        int e28 = L11610354117192841236.e(((e27 << 5) | (e27 >>> 27)) + ((e26 ^ i35) ^ i34), iArr2[27], 1859775393, i33);
        int i36 = (e26 >>> 2) | (e26 << 30);
        int e29 = L11610354117192841236.e(((e28 << 5) | (e28 >>> 27)) + ((e27 ^ i36) ^ i35), iArr2[28], 1859775393, i34);
        int i37 = (e27 >>> 2) | (e27 << 30);
        int e30 = L11610354117192841236.e(((e29 << 5) | (e29 >>> 27)) + ((e28 ^ i37) ^ i36), iArr2[29], 1859775393, i35);
        int i38 = (e28 >>> 2) | (e28 << 30);
        int e31 = L11610354117192841236.e(((e30 << 5) | (e30 >>> 27)) + ((e29 ^ i38) ^ i37), iArr2[30], 1859775393, i36);
        int i39 = (e29 >>> 2) | (e29 << 30);
        int e32 = L11610354117192841236.e(((e31 << 5) | (e31 >>> 27)) + ((e30 ^ i39) ^ i38), iArr2[31], 1859775393, i37);
        int i40 = (e30 >>> 2) | (e30 << 30);
        int e33 = L11610354117192841236.e(((e32 << 5) | (e32 >>> 27)) + ((e31 ^ i40) ^ i39), iArr2[32], 1859775393, i38);
        int i41 = (e31 >>> 2) | (e31 << 30);
        int e34 = L11610354117192841236.e(((e33 << 5) | (e33 >>> 27)) + ((e32 ^ i41) ^ i40), iArr2[33], 1859775393, i39);
        int i42 = (e32 >>> 2) | (e32 << 30);
        int e35 = L11610354117192841236.e(((e34 << 5) | (e34 >>> 27)) + ((e33 ^ i42) ^ i41), iArr2[34], 1859775393, i40);
        int i43 = (e33 >>> 2) | (e33 << 30);
        int e36 = L11610354117192841236.e(((e35 << 5) | (e35 >>> 27)) + ((e34 ^ i43) ^ i42), iArr2[35], 1859775393, i41);
        int i44 = (e34 >>> 2) | (e34 << 30);
        int e37 = L11610354117192841236.e(((e36 << 5) | (e36 >>> 27)) + ((e35 ^ i44) ^ i43), iArr2[36], 1859775393, i42);
        int i45 = (e35 >>> 2) | (e35 << 30);
        int e38 = L11610354117192841236.e(((e37 << 5) | (e37 >>> 27)) + ((e36 ^ i45) ^ i44), iArr2[37], 1859775393, i43);
        int i46 = (e36 >>> 2) | (e36 << 30);
        int e39 = L11610354117192841236.e(((e38 << 5) | (e38 >>> 27)) + ((e37 ^ i46) ^ i45), iArr2[38], 1859775393, i44);
        int i47 = (e37 >>> 2) | (e37 << 30);
        int e40 = L11610354117192841236.e(((e39 << 5) | (e39 >>> 27)) + ((e38 ^ i47) ^ i46), iArr2[39], 1859775393, i45);
        int i48 = (e38 >>> 2) | (e38 << 30);
        int e41 = L11610354117192841236.e(((e40 << 5) | (e40 >>> 27)) + (((i48 | i47) & e39) | (i48 & i47)), iArr2[40], -1894007588, i46);
        int i49 = (e39 >>> 2) | (e39 << 30);
        int e42 = L11610354117192841236.e(((e41 << 5) | (e41 >>> 27)) + (((i49 | i48) & e40) | (i49 & i48)), iArr2[41], -1894007588, i47);
        int i50 = (e40 >>> 2) | (e40 << 30);
        int e43 = L11610354117192841236.e(((e42 << 5) | (e42 >>> 27)) + (((i50 | i49) & e41) | (i50 & i49)), iArr2[42], -1894007588, i48);
        int i51 = (e41 >>> 2) | (e41 << 30);
        int e44 = L11610354117192841236.e(((e43 << 5) | (e43 >>> 27)) + (((i51 | i50) & e42) | (i51 & i50)), iArr2[43], -1894007588, i49);
        int i52 = (e42 >>> 2) | (e42 << 30);
        int e45 = L11610354117192841236.e(((e44 << 5) | (e44 >>> 27)) + (((i52 | i51) & e43) | (i52 & i51)), iArr2[44], -1894007588, i50);
        int i53 = (e43 >>> 2) | (e43 << 30);
        int e46 = L11610354117192841236.e(((e45 << 5) | (e45 >>> 27)) + (((i53 | i52) & e44) | (i53 & i52)), iArr2[45], -1894007588, i51);
        int i54 = (e44 >>> 2) | (e44 << 30);
        int e47 = L11610354117192841236.e(((e46 << 5) | (e46 >>> 27)) + (((i54 | i53) & e45) | (i54 & i53)), iArr2[46], -1894007588, i52);
        int i55 = (e45 >>> 2) | (e45 << 30);
        int e48 = L11610354117192841236.e(((e47 << 5) | (e47 >>> 27)) + (((i55 | i54) & e46) | (i55 & i54)), iArr2[47], -1894007588, i53);
        int i56 = (e46 >>> 2) | (e46 << 30);
        int e49 = L11610354117192841236.e(((e48 << 5) | (e48 >>> 27)) + (((i56 | i55) & e47) | (i56 & i55)), iArr2[48], -1894007588, i54);
        int i57 = (e47 >>> 2) | (e47 << 30);
        int e50 = L11610354117192841236.e(((e49 << 5) | (e49 >>> 27)) + (((i57 | i56) & e48) | (i57 & i56)), iArr2[49], -1894007588, i55);
        int i58 = (e48 >>> 2) | (e48 << 30);
        int e51 = L11610354117192841236.e(((e50 << 5) | (e50 >>> 27)) + (((i58 | i57) & e49) | (i58 & i57)), iArr2[50], -1894007588, i56);
        int i59 = (e49 >>> 2) | (e49 << 30);
        int e52 = L11610354117192841236.e(((e51 << 5) | (e51 >>> 27)) + (((i59 | i58) & e50) | (i59 & i58)), iArr2[51], -1894007588, i57);
        int i60 = (e50 >>> 2) | (e50 << 30);
        int e53 = L11610354117192841236.e(((e52 << 5) | (e52 >>> 27)) + (((i60 | i59) & e51) | (i60 & i59)), iArr2[52], -1894007588, i58);
        int i61 = (e51 >>> 2) | (e51 << 30);
        int e54 = L11610354117192841236.e(((e53 << 5) | (e53 >>> 27)) + (((i61 | i60) & e52) | (i61 & i60)), iArr2[53], -1894007588, i59);
        int i62 = (e52 >>> 2) | (e52 << 30);
        int e55 = L11610354117192841236.e(((e54 << 5) | (e54 >>> 27)) + (((i62 | i61) & e53) | (i62 & i61)), iArr2[54], -1894007588, i60);
        int i63 = (e53 >>> 2) | (e53 << 30);
        int i64 = (((i61 + ((e55 << 5) | (e55 >>> 27))) + (((i63 | i62) & e54) | (i63 & i62))) + iArr2[55]) - 1894007588;
        int i65 = (e54 >>> 2) | (e54 << 30);
        int e56 = L11610354117192841236.e(((i64 << 5) | (i64 >>> 27)) + (((i65 | i63) & e55) | (i65 & i63)), iArr2[56], -1894007588, i62);
        int i66 = (e55 >>> 2) | (e55 << 30);
        int e57 = L11610354117192841236.e(((e56 << 5) | (e56 >>> 27)) + (((i66 | i65) & i64) | (i66 & i65)), iArr2[57], -1894007588, i63);
        int i67 = (i64 >>> 2) | (i64 << 30);
        int e58 = L11610354117192841236.e(((e57 << 5) | (e57 >>> 27)) + (((i67 | i66) & e56) | (i67 & i66)), iArr2[58], -1894007588, i65);
        int i68 = (e56 >>> 2) | (e56 << 30);
        int e59 = L11610354117192841236.e(((e58 << 5) | (e58 >>> 27)) + (((i68 | i67) & e57) | (i68 & i67)), iArr2[59], -1894007588, i66);
        int i69 = (e57 >>> 2) | (e57 << 30);
        int e60 = L11610354117192841236.e(((e59 << 5) | (e59 >>> 27)) + ((e58 ^ i69) ^ i68), iArr2[60], -899497514, i67);
        int i70 = (e58 >>> 2) | (e58 << 30);
        int e61 = L11610354117192841236.e(((e60 << 5) | (e60 >>> 27)) + ((e59 ^ i70) ^ i69), iArr2[61], -899497514, i68);
        int i71 = (e59 >>> 2) | (e59 << 30);
        int e62 = L11610354117192841236.e(((e61 << 5) | (e61 >>> 27)) + ((e60 ^ i71) ^ i70), iArr2[62], -899497514, i69);
        int i72 = (e60 >>> 2) | (e60 << 30);
        int e63 = L11610354117192841236.e(((e62 << 5) | (e62 >>> 27)) + ((e61 ^ i72) ^ i71), iArr2[63], -899497514, i70);
        int i73 = (e61 >>> 2) | (e61 << 30);
        int e64 = L11610354117192841236.e(((e63 << 5) | (e63 >>> 27)) + ((e62 ^ i73) ^ i72), iArr2[64], -899497514, i71);
        int i74 = (e62 >>> 2) | (e62 << 30);
        int e65 = L11610354117192841236.e(((e64 << 5) | (e64 >>> 27)) + ((e63 ^ i74) ^ i73), iArr2[65], -899497514, i72);
        int i75 = (e63 >>> 2) | (e63 << 30);
        int e66 = L11610354117192841236.e(((e65 << 5) | (e65 >>> 27)) + ((e64 ^ i75) ^ i74), iArr2[66], -899497514, i73);
        int i76 = (e64 >>> 2) | (e64 << 30);
        int e67 = L11610354117192841236.e(((e66 << 5) | (e66 >>> 27)) + ((e65 ^ i76) ^ i75), iArr2[67], -899497514, i74);
        int i77 = (e65 >>> 2) | (e65 << 30);
        int e68 = L11610354117192841236.e(((e67 << 5) | (e67 >>> 27)) + ((e66 ^ i77) ^ i76), iArr2[68], -899497514, i75);
        int i78 = (e66 >>> 2) | (e66 << 30);
        int e69 = L11610354117192841236.e(((e68 << 5) | (e68 >>> 27)) + ((e67 ^ i78) ^ i77), iArr2[69], -899497514, i76);
        int i79 = (e67 >>> 2) | (e67 << 30);
        int e70 = L11610354117192841236.e(((e69 << 5) | (e69 >>> 27)) + ((e68 ^ i79) ^ i78), iArr2[70], -899497514, i77);
        int i80 = (e68 >>> 2) | (e68 << 30);
        int e71 = L11610354117192841236.e(((e70 << 5) | (e70 >>> 27)) + ((e69 ^ i80) ^ i79), iArr2[71], -899497514, i78);
        int i81 = (e69 >>> 2) | (e69 << 30);
        int e72 = L11610354117192841236.e(((e71 << 5) | (e71 >>> 27)) + ((e70 ^ i81) ^ i80), iArr2[72], -899497514, i79);
        int i82 = (e70 >>> 2) | (e70 << 30);
        int e73 = L11610354117192841236.e(((e72 << 5) | (e72 >>> 27)) + ((e71 ^ i82) ^ i81), iArr2[73], -899497514, i80);
        int i83 = (e71 >>> 2) | (e71 << 30);
        int e74 = L11610354117192841236.e(((e73 << 5) | (e73 >>> 27)) + ((e72 ^ i83) ^ i82), iArr2[74], -899497514, i81);
        int i84 = (e72 >>> 2) | (e72 << 30);
        int e75 = L11610354117192841236.e(((e74 << 5) | (e74 >>> 27)) + ((e73 ^ i84) ^ i83), iArr2[75], -899497514, i82);
        int i85 = (e73 >>> 2) | (e73 << 30);
        int e76 = L11610354117192841236.e(((e75 << 5) | (e75 >>> 27)) + ((e74 ^ i85) ^ i84), iArr2[76], -899497514, i83);
        int i86 = (e74 >>> 2) | (e74 << 30);
        int e77 = L11610354117192841236.e(((e76 << 5) | (e76 >>> 27)) + ((e75 ^ i86) ^ i85), iArr2[77], -899497514, i84);
        int i87 = (e75 >>> 2) | (e75 << 30);
        int e78 = L11610354117192841236.e(((e77 << 5) | (e77 >>> 27)) + ((e76 ^ i87) ^ i86), iArr2[78], -899497514, i85);
        int i88 = (e76 >>> 2) | (e76 << 30);
        this.H0 = i3 + L11610354117192841236.e(((e78 << 5) | (e78 >>> 27)) + ((e77 ^ i88) ^ i87), iArr2[79], -899497514, i86);
        this.H1 = i4 + e78;
        this.H2 = i5 + ((e77 << 30) | (e77 >>> 2));
        this.H3 = i6 + i88;
        this.H4 = i7 + i87;
    }

    private final void putInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static final String toHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append("0123456789ABCDEF".charAt((bArr[i] >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(bArr[i] & 15));
        }
        return stringBuffer.toString();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr, int i) {
        int i2 = this.currentPos;
        int i3 = i2 >> 2;
        int[] iArr = this.w;
        iArr[i3] = ((iArr[i3] << 8) | 128) << ((3 - (i2 & 3)) << 3);
        int i4 = (i2 & (-4)) + 4;
        this.currentPos = i4;
        if (i4 == 64) {
            this.currentPos = 0;
            perform();
        } else if (i4 == 60) {
            this.currentPos = 0;
            iArr[15] = 0;
            perform();
        }
        int i5 = this.currentPos >> 2;
        while (true) {
            int[] iArr2 = this.w;
            if (i5 >= 14) {
                long j = this.currentLen;
                iArr2[14] = (int) (j >> 32);
                iArr2[15] = (int) j;
                perform();
                putInt(bArr, i, this.H0);
                putInt(bArr, i + 4, this.H1);
                putInt(bArr, i + 8, this.H2);
                putInt(bArr, i + 12, this.H3);
                putInt(bArr, i + 16, this.H4);
                reset();
                return;
            }
            iArr2[i5] = 0;
            i5++;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final int getDigestLength() {
        return 20;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void reset() {
        this.H0 = 1732584193;
        this.H1 = -271733879;
        this.H2 = -1732584194;
        this.H3 = 271733878;
        this.H4 = -1009589776;
        this.currentPos = 0;
        this.currentLen = 0L;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = i2;
        if (i4 >= 4) {
            int i5 = this.currentPos;
            int i6 = i5 >> 2;
            int i7 = i5 & 3;
            if (i7 == 0) {
                j = 8;
                int i8 = i + 4;
                this.w[i6] = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
                i4 -= 4;
                int i9 = i5 + 4;
                this.currentPos = i9;
                this.currentLen += 32;
                if (i9 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i3 = i8;
            } else if (i7 == 1) {
                j = 8;
                int[] iArr = this.w;
                i3 = i + 3;
                iArr[i6] = (iArr[i6] << 24) | (bArr[i + 2] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                i4 -= 3;
                int i10 = i5 + 3;
                this.currentPos = i10;
                this.currentLen += 24;
                if (i10 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            } else if (i7 == 2) {
                j = 8;
                int[] iArr2 = this.w;
                int i11 = i + 2;
                iArr2[i6] = (iArr2[i6] << 16) | (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
                i4 -= 2;
                int i12 = i5 + 2;
                this.currentPos = i12;
                this.currentLen += 16;
                if (i12 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i3 = i11;
            } else if (i7 != 3) {
                i3 = i;
                j = 8;
            } else {
                int[] iArr3 = this.w;
                i3 = i + 1;
                j = 8;
                iArr3[i6] = (bArr[i] & 255) | (iArr3[i6] << 8);
                i4--;
                int i13 = i5 + 1;
                this.currentPos = i13;
                this.currentLen += 8;
                if (i13 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
            while (i4 >= 8) {
                int[] iArr4 = this.w;
                int i14 = this.currentPos;
                int i15 = i3 + 4;
                iArr4[i14 >> 2] = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
                int i16 = i14 + 4;
                this.currentPos = i16;
                if (i16 == 64) {
                    perform();
                    this.currentPos = 0;
                    i16 = 0;
                }
                int i17 = i3 + 7;
                int i18 = ((bArr[i3 + 5] & 255) << 16) | ((bArr[i15] & 255) << 24) | ((bArr[i3 + 6] & 255) << 8);
                i3 += 8;
                this.w[i16 >> 2] = i18 | (bArr[i17] & 255);
                int i19 = i16 + 4;
                this.currentPos = i19;
                if (i19 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                this.currentLen += 64;
                i4 -= 8;
            }
            while (i4 < 0) {
                int[] iArr5 = this.w;
                int i20 = this.currentPos;
                int i21 = i3 + 3;
                int i22 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
                i3 += 4;
                iArr5[i20 >> 2] = i22 | (bArr[i21] & 255);
                i4 -= 4;
                int i23 = i20 + 4;
                this.currentPos = i23;
                this.currentLen += 32;
                if (i23 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
        } else {
            j = 8;
            i3 = i;
        }
        while (i4 > 0) {
            int i24 = this.currentPos;
            int i25 = i24 >> 2;
            int[] iArr6 = this.w;
            int i26 = i3 + 1;
            iArr6[i25] = (iArr6[i25] << 8) | (bArr[i3] & 255);
            this.currentLen += j;
            int i27 = i24 + 1;
            this.currentPos = i27;
            if (i27 == 64) {
                perform();
                this.currentPos = 0;
            }
            i4--;
            i3 = i26;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr) {
        digest(bArr, 0);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte b) {
        int i = this.currentPos;
        int i2 = i >> 2;
        int[] iArr = this.w;
        iArr[i2] = (b & 255) | (iArr[i2] << 8);
        this.currentLen += 8;
        int i3 = i + 1;
        this.currentPos = i3;
        if (i3 == 64) {
            perform();
            this.currentPos = 0;
        }
    }
}
