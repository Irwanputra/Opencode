package com.trilead.ssh2.crypto.digest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@java.lang.Deprecated
public final class SHA1 implements com.trilead.ssh2.crypto.digest.Digest {
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
        int iE = dev.epro.r0.L11610354117192841236.e(i8, iArr2[0], 1518500249, i7);
        int i9 = (i4 << 30) | (i4 >>> 2);
        int iE2 = dev.epro.r0.L11610354117192841236.e(((iE << 5) | (iE >>> 27)) + ((i3 & i9) | ((~i3) & i5)), iArr2[1], 1518500249, i6);
        int i10 = (i3 << 30) | (i3 >>> 2);
        int iE3 = dev.epro.r0.L11610354117192841236.e(((iE2 << 5) | (iE2 >>> 27)) + (((~iE) & i9) | (iE & i10)), iArr2[2], 1518500249, i5);
        int i11 = (iE >>> 2) | (iE << 30);
        int iE4 = dev.epro.r0.L11610354117192841236.e(((iE3 << 5) | (iE3 >>> 27)) + ((iE2 & i11) | ((~iE2) & i10)), iArr2[3], 1518500249, i9);
        int i12 = (iE2 << 30) | (iE2 >>> 2);
        int iE5 = dev.epro.r0.L11610354117192841236.e(((iE4 << 5) | (iE4 >>> 27)) + (((~iE3) & i11) | (iE3 & i12)), iArr2[4], 1518500249, i10);
        int i13 = (iE3 << 30) | (iE3 >>> 2);
        int iE6 = dev.epro.r0.L11610354117192841236.e(((iE5 << 5) | (iE5 >>> 27)) + ((iE4 & i13) | ((~iE4) & i12)), iArr2[5], 1518500249, i11);
        int i14 = (iE4 >>> 2) | (iE4 << 30);
        int iE7 = dev.epro.r0.L11610354117192841236.e(((iE6 << 5) | (iE6 >>> 27)) + ((iE5 & i14) | ((~iE5) & i13)), iArr2[6], 1518500249, i12);
        int i15 = (iE5 >>> 2) | (iE5 << 30);
        int iE8 = dev.epro.r0.L11610354117192841236.e(((iE7 << 5) | (iE7 >>> 27)) + ((iE6 & i15) | ((~iE6) & i14)), iArr2[7], 1518500249, i13);
        int i16 = (iE6 >>> 2) | (iE6 << 30);
        int iE9 = dev.epro.r0.L11610354117192841236.e(((iE8 << 5) | (iE8 >>> 27)) + ((iE7 & i16) | ((~iE7) & i15)), iArr2[8], 1518500249, i14);
        int i17 = (iE7 >>> 2) | (iE7 << 30);
        int iE10 = dev.epro.r0.L11610354117192841236.e(((iE9 << 5) | (iE9 >>> 27)) + ((iE8 & i17) | ((~iE8) & i16)), iArr2[9], 1518500249, i15);
        int i18 = (iE8 >>> 2) | (iE8 << 30);
        int iE11 = dev.epro.r0.L11610354117192841236.e(((iE10 << 5) | (iE10 >>> 27)) + ((iE9 & i18) | ((~iE9) & i17)), iArr2[10], 1518500249, i16);
        int i19 = (iE9 >>> 2) | (iE9 << 30);
        int iE12 = dev.epro.r0.L11610354117192841236.e(((iE11 << 5) | (iE11 >>> 27)) + ((iE10 & i19) | ((~iE10) & i18)), iArr2[11], 1518500249, i17);
        int i20 = (iE10 >>> 2) | (iE10 << 30);
        int iE13 = dev.epro.r0.L11610354117192841236.e(((iE12 << 5) | (iE12 >>> 27)) + ((iE11 & i20) | ((~iE11) & i19)), iArr2[12], 1518500249, i18);
        int i21 = (iE11 >>> 2) | (iE11 << 30);
        int iE14 = dev.epro.r0.L11610354117192841236.e(((iE13 << 5) | (iE13 >>> 27)) + ((iE12 & i21) | ((~iE12) & i20)), iArr2[13], 1518500249, i19);
        int i22 = (iE12 >>> 2) | (iE12 << 30);
        int iE15 = dev.epro.r0.L11610354117192841236.e(((iE14 << 5) | (iE14 >>> 27)) + ((iE13 & i22) | ((~iE13) & i21)), iArr2[14], 1518500249, i20);
        int i23 = (iE13 >>> 2) | (iE13 << 30);
        int iE16 = dev.epro.r0.L11610354117192841236.e(((iE15 << 5) | (iE15 >>> 27)) + ((iE14 & i23) | ((~iE14) & i22)), iArr2[15], 1518500249, i21);
        int i24 = (iE14 >>> 2) | (iE14 << 30);
        int iE17 = dev.epro.r0.L11610354117192841236.e(((iE16 << 5) | (iE16 >>> 27)) + ((iE15 & i24) | ((~iE15) & i23)), iArr2[16], 1518500249, i22);
        int i25 = (iE15 >>> 2) | (iE15 << 30);
        int iE18 = dev.epro.r0.L11610354117192841236.e(((iE17 << 5) | (iE17 >>> 27)) + ((iE16 & i25) | ((~iE16) & i24)), iArr2[17], 1518500249, i23);
        int i26 = (iE16 >>> 2) | (iE16 << 30);
        int iE19 = dev.epro.r0.L11610354117192841236.e(((iE18 << 5) | (iE18 >>> 27)) + ((iE17 & i26) | ((~iE17) & i25)), iArr2[18], 1518500249, i24);
        int i27 = (iE17 >>> 2) | (iE17 << 30);
        int iE20 = dev.epro.r0.L11610354117192841236.e(((iE19 << 5) | (iE19 >>> 27)) + ((iE18 & i27) | ((~iE18) & i26)), iArr2[19], 1518500249, i25);
        int i28 = (iE18 << 30) | (iE18 >>> 2);
        int iE21 = dev.epro.r0.L11610354117192841236.e(((iE20 << 5) | (iE20 >>> 27)) + ((iE19 ^ i28) ^ i27), iArr2[20], 1859775393, i26);
        int i29 = (iE19 >>> 2) | (iE19 << 30);
        int iE22 = dev.epro.r0.L11610354117192841236.e(((iE21 << 5) | (iE21 >>> 27)) + ((iE20 ^ i29) ^ i28), iArr2[21], 1859775393, i27);
        int i30 = (iE20 >>> 2) | (iE20 << 30);
        int iE23 = dev.epro.r0.L11610354117192841236.e(((iE22 << 5) | (iE22 >>> 27)) + ((iE21 ^ i30) ^ i29), iArr2[22], 1859775393, i28);
        int i31 = (iE21 >>> 2) | (iE21 << 30);
        int iE24 = dev.epro.r0.L11610354117192841236.e(((iE23 << 5) | (iE23 >>> 27)) + ((iE22 ^ i31) ^ i30), iArr2[23], 1859775393, i29);
        int i32 = (iE22 >>> 2) | (iE22 << 30);
        int iE25 = dev.epro.r0.L11610354117192841236.e(((iE24 << 5) | (iE24 >>> 27)) + ((iE23 ^ i32) ^ i31), iArr2[24], 1859775393, i30);
        int i33 = (iE23 >>> 2) | (iE23 << 30);
        int iE26 = dev.epro.r0.L11610354117192841236.e(((iE25 << 5) | (iE25 >>> 27)) + ((iE24 ^ i33) ^ i32), iArr2[25], 1859775393, i31);
        int i34 = (iE24 >>> 2) | (iE24 << 30);
        int iE27 = dev.epro.r0.L11610354117192841236.e(((iE26 << 5) | (iE26 >>> 27)) + ((iE25 ^ i34) ^ i33), iArr2[26], 1859775393, i32);
        int i35 = (iE25 >>> 2) | (iE25 << 30);
        int iE28 = dev.epro.r0.L11610354117192841236.e(((iE27 << 5) | (iE27 >>> 27)) + ((iE26 ^ i35) ^ i34), iArr2[27], 1859775393, i33);
        int i36 = (iE26 >>> 2) | (iE26 << 30);
        int iE29 = dev.epro.r0.L11610354117192841236.e(((iE28 << 5) | (iE28 >>> 27)) + ((iE27 ^ i36) ^ i35), iArr2[28], 1859775393, i34);
        int i37 = (iE27 >>> 2) | (iE27 << 30);
        int iE30 = dev.epro.r0.L11610354117192841236.e(((iE29 << 5) | (iE29 >>> 27)) + ((iE28 ^ i37) ^ i36), iArr2[29], 1859775393, i35);
        int i38 = (iE28 >>> 2) | (iE28 << 30);
        int iE31 = dev.epro.r0.L11610354117192841236.e(((iE30 << 5) | (iE30 >>> 27)) + ((iE29 ^ i38) ^ i37), iArr2[30], 1859775393, i36);
        int i39 = (iE29 >>> 2) | (iE29 << 30);
        int iE32 = dev.epro.r0.L11610354117192841236.e(((iE31 << 5) | (iE31 >>> 27)) + ((iE30 ^ i39) ^ i38), iArr2[31], 1859775393, i37);
        int i40 = (iE30 >>> 2) | (iE30 << 30);
        int iE33 = dev.epro.r0.L11610354117192841236.e(((iE32 << 5) | (iE32 >>> 27)) + ((iE31 ^ i40) ^ i39), iArr2[32], 1859775393, i38);
        int i41 = (iE31 >>> 2) | (iE31 << 30);
        int iE34 = dev.epro.r0.L11610354117192841236.e(((iE33 << 5) | (iE33 >>> 27)) + ((iE32 ^ i41) ^ i40), iArr2[33], 1859775393, i39);
        int i42 = (iE32 >>> 2) | (iE32 << 30);
        int iE35 = dev.epro.r0.L11610354117192841236.e(((iE34 << 5) | (iE34 >>> 27)) + ((iE33 ^ i42) ^ i41), iArr2[34], 1859775393, i40);
        int i43 = (iE33 >>> 2) | (iE33 << 30);
        int iE36 = dev.epro.r0.L11610354117192841236.e(((iE35 << 5) | (iE35 >>> 27)) + ((iE34 ^ i43) ^ i42), iArr2[35], 1859775393, i41);
        int i44 = (iE34 >>> 2) | (iE34 << 30);
        int iE37 = dev.epro.r0.L11610354117192841236.e(((iE36 << 5) | (iE36 >>> 27)) + ((iE35 ^ i44) ^ i43), iArr2[36], 1859775393, i42);
        int i45 = (iE35 >>> 2) | (iE35 << 30);
        int iE38 = dev.epro.r0.L11610354117192841236.e(((iE37 << 5) | (iE37 >>> 27)) + ((iE36 ^ i45) ^ i44), iArr2[37], 1859775393, i43);
        int i46 = (iE36 >>> 2) | (iE36 << 30);
        int iE39 = dev.epro.r0.L11610354117192841236.e(((iE38 << 5) | (iE38 >>> 27)) + ((iE37 ^ i46) ^ i45), iArr2[38], 1859775393, i44);
        int i47 = (iE37 >>> 2) | (iE37 << 30);
        int iE40 = dev.epro.r0.L11610354117192841236.e(((iE39 << 5) | (iE39 >>> 27)) + ((iE38 ^ i47) ^ i46), iArr2[39], 1859775393, i45);
        int i48 = (iE38 >>> 2) | (iE38 << 30);
        int iE41 = dev.epro.r0.L11610354117192841236.e(((iE40 << 5) | (iE40 >>> 27)) + (((i48 | i47) & iE39) | (i48 & i47)), iArr2[40], -1894007588, i46);
        int i49 = (iE39 >>> 2) | (iE39 << 30);
        int iE42 = dev.epro.r0.L11610354117192841236.e(((iE41 << 5) | (iE41 >>> 27)) + (((i49 | i48) & iE40) | (i49 & i48)), iArr2[41], -1894007588, i47);
        int i50 = (iE40 >>> 2) | (iE40 << 30);
        int iE43 = dev.epro.r0.L11610354117192841236.e(((iE42 << 5) | (iE42 >>> 27)) + (((i50 | i49) & iE41) | (i50 & i49)), iArr2[42], -1894007588, i48);
        int i51 = (iE41 >>> 2) | (iE41 << 30);
        int iE44 = dev.epro.r0.L11610354117192841236.e(((iE43 << 5) | (iE43 >>> 27)) + (((i51 | i50) & iE42) | (i51 & i50)), iArr2[43], -1894007588, i49);
        int i52 = (iE42 >>> 2) | (iE42 << 30);
        int iE45 = dev.epro.r0.L11610354117192841236.e(((iE44 << 5) | (iE44 >>> 27)) + (((i52 | i51) & iE43) | (i52 & i51)), iArr2[44], -1894007588, i50);
        int i53 = (iE43 >>> 2) | (iE43 << 30);
        int iE46 = dev.epro.r0.L11610354117192841236.e(((iE45 << 5) | (iE45 >>> 27)) + (((i53 | i52) & iE44) | (i53 & i52)), iArr2[45], -1894007588, i51);
        int i54 = (iE44 >>> 2) | (iE44 << 30);
        int iE47 = dev.epro.r0.L11610354117192841236.e(((iE46 << 5) | (iE46 >>> 27)) + (((i54 | i53) & iE45) | (i54 & i53)), iArr2[46], -1894007588, i52);
        int i55 = (iE45 >>> 2) | (iE45 << 30);
        int iE48 = dev.epro.r0.L11610354117192841236.e(((iE47 << 5) | (iE47 >>> 27)) + (((i55 | i54) & iE46) | (i55 & i54)), iArr2[47], -1894007588, i53);
        int i56 = (iE46 >>> 2) | (iE46 << 30);
        int iE49 = dev.epro.r0.L11610354117192841236.e(((iE48 << 5) | (iE48 >>> 27)) + (((i56 | i55) & iE47) | (i56 & i55)), iArr2[48], -1894007588, i54);
        int i57 = (iE47 >>> 2) | (iE47 << 30);
        int iE50 = dev.epro.r0.L11610354117192841236.e(((iE49 << 5) | (iE49 >>> 27)) + (((i57 | i56) & iE48) | (i57 & i56)), iArr2[49], -1894007588, i55);
        int i58 = (iE48 >>> 2) | (iE48 << 30);
        int iE51 = dev.epro.r0.L11610354117192841236.e(((iE50 << 5) | (iE50 >>> 27)) + (((i58 | i57) & iE49) | (i58 & i57)), iArr2[50], -1894007588, i56);
        int i59 = (iE49 >>> 2) | (iE49 << 30);
        int iE52 = dev.epro.r0.L11610354117192841236.e(((iE51 << 5) | (iE51 >>> 27)) + (((i59 | i58) & iE50) | (i59 & i58)), iArr2[51], -1894007588, i57);
        int i60 = (iE50 >>> 2) | (iE50 << 30);
        int iE53 = dev.epro.r0.L11610354117192841236.e(((iE52 << 5) | (iE52 >>> 27)) + (((i60 | i59) & iE51) | (i60 & i59)), iArr2[52], -1894007588, i58);
        int i61 = (iE51 >>> 2) | (iE51 << 30);
        int iE54 = dev.epro.r0.L11610354117192841236.e(((iE53 << 5) | (iE53 >>> 27)) + (((i61 | i60) & iE52) | (i61 & i60)), iArr2[53], -1894007588, i59);
        int i62 = (iE52 >>> 2) | (iE52 << 30);
        int iE55 = dev.epro.r0.L11610354117192841236.e(((iE54 << 5) | (iE54 >>> 27)) + (((i62 | i61) & iE53) | (i62 & i61)), iArr2[54], -1894007588, i60);
        int i63 = (iE53 >>> 2) | (iE53 << 30);
        int i64 = (((i61 + ((iE55 << 5) | (iE55 >>> 27))) + (((i63 | i62) & iE54) | (i63 & i62))) + iArr2[55]) - 1894007588;
        int i65 = (iE54 >>> 2) | (iE54 << 30);
        int iE56 = dev.epro.r0.L11610354117192841236.e(((i64 << 5) | (i64 >>> 27)) + (((i65 | i63) & iE55) | (i65 & i63)), iArr2[56], -1894007588, i62);
        int i66 = (iE55 >>> 2) | (iE55 << 30);
        int iE57 = dev.epro.r0.L11610354117192841236.e(((iE56 << 5) | (iE56 >>> 27)) + (((i66 | i65) & i64) | (i66 & i65)), iArr2[57], -1894007588, i63);
        int i67 = (i64 >>> 2) | (i64 << 30);
        int iE58 = dev.epro.r0.L11610354117192841236.e(((iE57 << 5) | (iE57 >>> 27)) + (((i67 | i66) & iE56) | (i67 & i66)), iArr2[58], -1894007588, i65);
        int i68 = (iE56 >>> 2) | (iE56 << 30);
        int iE59 = dev.epro.r0.L11610354117192841236.e(((iE58 << 5) | (iE58 >>> 27)) + (((i68 | i67) & iE57) | (i68 & i67)), iArr2[59], -1894007588, i66);
        int i69 = (iE57 >>> 2) | (iE57 << 30);
        int iE60 = dev.epro.r0.L11610354117192841236.e(((iE59 << 5) | (iE59 >>> 27)) + ((iE58 ^ i69) ^ i68), iArr2[60], -899497514, i67);
        int i70 = (iE58 >>> 2) | (iE58 << 30);
        int iE61 = dev.epro.r0.L11610354117192841236.e(((iE60 << 5) | (iE60 >>> 27)) + ((iE59 ^ i70) ^ i69), iArr2[61], -899497514, i68);
        int i71 = (iE59 >>> 2) | (iE59 << 30);
        int iE62 = dev.epro.r0.L11610354117192841236.e(((iE61 << 5) | (iE61 >>> 27)) + ((iE60 ^ i71) ^ i70), iArr2[62], -899497514, i69);
        int i72 = (iE60 >>> 2) | (iE60 << 30);
        int iE63 = dev.epro.r0.L11610354117192841236.e(((iE62 << 5) | (iE62 >>> 27)) + ((iE61 ^ i72) ^ i71), iArr2[63], -899497514, i70);
        int i73 = (iE61 >>> 2) | (iE61 << 30);
        int iE64 = dev.epro.r0.L11610354117192841236.e(((iE63 << 5) | (iE63 >>> 27)) + ((iE62 ^ i73) ^ i72), iArr2[64], -899497514, i71);
        int i74 = (iE62 >>> 2) | (iE62 << 30);
        int iE65 = dev.epro.r0.L11610354117192841236.e(((iE64 << 5) | (iE64 >>> 27)) + ((iE63 ^ i74) ^ i73), iArr2[65], -899497514, i72);
        int i75 = (iE63 >>> 2) | (iE63 << 30);
        int iE66 = dev.epro.r0.L11610354117192841236.e(((iE65 << 5) | (iE65 >>> 27)) + ((iE64 ^ i75) ^ i74), iArr2[66], -899497514, i73);
        int i76 = (iE64 >>> 2) | (iE64 << 30);
        int iE67 = dev.epro.r0.L11610354117192841236.e(((iE66 << 5) | (iE66 >>> 27)) + ((iE65 ^ i76) ^ i75), iArr2[67], -899497514, i74);
        int i77 = (iE65 >>> 2) | (iE65 << 30);
        int iE68 = dev.epro.r0.L11610354117192841236.e(((iE67 << 5) | (iE67 >>> 27)) + ((iE66 ^ i77) ^ i76), iArr2[68], -899497514, i75);
        int i78 = (iE66 >>> 2) | (iE66 << 30);
        int iE69 = dev.epro.r0.L11610354117192841236.e(((iE68 << 5) | (iE68 >>> 27)) + ((iE67 ^ i78) ^ i77), iArr2[69], -899497514, i76);
        int i79 = (iE67 >>> 2) | (iE67 << 30);
        int iE70 = dev.epro.r0.L11610354117192841236.e(((iE69 << 5) | (iE69 >>> 27)) + ((iE68 ^ i79) ^ i78), iArr2[70], -899497514, i77);
        int i80 = (iE68 >>> 2) | (iE68 << 30);
        int iE71 = dev.epro.r0.L11610354117192841236.e(((iE70 << 5) | (iE70 >>> 27)) + ((iE69 ^ i80) ^ i79), iArr2[71], -899497514, i78);
        int i81 = (iE69 >>> 2) | (iE69 << 30);
        int iE72 = dev.epro.r0.L11610354117192841236.e(((iE71 << 5) | (iE71 >>> 27)) + ((iE70 ^ i81) ^ i80), iArr2[72], -899497514, i79);
        int i82 = (iE70 >>> 2) | (iE70 << 30);
        int iE73 = dev.epro.r0.L11610354117192841236.e(((iE72 << 5) | (iE72 >>> 27)) + ((iE71 ^ i82) ^ i81), iArr2[73], -899497514, i80);
        int i83 = (iE71 >>> 2) | (iE71 << 30);
        int iE74 = dev.epro.r0.L11610354117192841236.e(((iE73 << 5) | (iE73 >>> 27)) + ((iE72 ^ i83) ^ i82), iArr2[74], -899497514, i81);
        int i84 = (iE72 >>> 2) | (iE72 << 30);
        int iE75 = dev.epro.r0.L11610354117192841236.e(((iE74 << 5) | (iE74 >>> 27)) + ((iE73 ^ i84) ^ i83), iArr2[75], -899497514, i82);
        int i85 = (iE73 >>> 2) | (iE73 << 30);
        int iE76 = dev.epro.r0.L11610354117192841236.e(((iE75 << 5) | (iE75 >>> 27)) + ((iE74 ^ i85) ^ i84), iArr2[76], -899497514, i83);
        int i86 = (iE74 >>> 2) | (iE74 << 30);
        int iE77 = dev.epro.r0.L11610354117192841236.e(((iE76 << 5) | (iE76 >>> 27)) + ((iE75 ^ i86) ^ i85), iArr2[77], -899497514, i84);
        int i87 = (iE75 >>> 2) | (iE75 << 30);
        int iE78 = dev.epro.r0.L11610354117192841236.e(((iE77 << 5) | (iE77 >>> 27)) + ((iE76 ^ i87) ^ i86), iArr2[78], -899497514, i85);
        int i88 = (iE76 >>> 2) | (iE76 << 30);
        this.H0 = i3 + dev.epro.r0.L11610354117192841236.e(((iE78 << 5) | (iE78 >>> 27)) + ((iE77 ^ i88) ^ i87), iArr2[79], -899497514, i86);
        this.H1 = i4 + iE78;
        this.H2 = i5 + ((iE77 << 30) | (iE77 >>> 2));
        this.H3 = i6 + i88;
        this.H4 = i7 + i87;
    }

    private final void putInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static final java.lang.String toHexString(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
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
