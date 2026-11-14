package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y5809172221756938728 implements A8947685337014270457 {
    public final /* synthetic */ byte a = 1;
    public final byte[] b;
    public final byte[] c;
    public final Object d;

    public Y5809172221756938728(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!G6547577305291411977.c(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            S10973172697741180971.j("Given public key's length is not 32.");
            throw null;
        }
        this.b = (byte[]) bArr.clone();
        this.c = bArr2;
        this.d = bArr3;
        if (F1919009084933321653.a != null) {
            return;
        }
        S10973172697741180971.m("Could not initialize Ed25519.");
        throw null;
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b = this.a;
        byte[] bArr3 = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                byte[] bArr4 = (byte[]) obj;
                if (bArr3.length == 0 && bArr4.length == 0) {
                    b(bArr, bArr2);
                } else if (!Z12670897225348479586.b(bArr3, bArr)) {
                    W4415201450379021245.c("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr4.length != 0) {
                        bArr2 = Z1953481206310471956.B(bArr2, bArr4);
                    }
                    b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                break;
            default:
                A8947685337014270457 a8947685337014270457 = (A8947685337014270457) obj;
                byte[] bArr5 = this.b;
                if (bArr5.length == 0 && bArr3.length == 0) {
                    a8947685337014270457.a(bArr, bArr2);
                } else if (!Z12670897225348479586.b(bArr5, bArr)) {
                    W4415201450379021245.c("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr3.length != 0) {
                        bArr2 = Z1953481206310471956.B(bArr2, bArr3);
                    }
                    a8947685337014270457.a(Arrays.copyOfRange(bArr, bArr5.length, bArr.length), bArr2);
                }
                break;
        }
    }

    public void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            W4415201450379021245.c("The length of the signature is not 64.");
            return;
        }
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = D15445857918358799638.f[i] & 255;
                if (i2 == i3) {
                    i--;
                    bArr3 = bArr;
                } else if (i2 < i3) {
                    MessageDigest messageDigest = (MessageDigest) W8357658991043002609.e.a.a("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    byte[] bArr4 = this.b;
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jQ = D15445857918358799638.Q(0, bArrDigest) & 2097151;
                    long jR = (D15445857918358799638.R(2, bArrDigest) >> 5) & 2097151;
                    long jQ2 = (D15445857918358799638.Q(5, bArrDigest) >> 2) & 2097151;
                    long jR2 = (D15445857918358799638.R(7, bArrDigest) >> 7) & 2097151;
                    long jR3 = (D15445857918358799638.R(10, bArrDigest) >> 4) & 2097151;
                    long jQ3 = (D15445857918358799638.Q(13, bArrDigest) >> 1) & 2097151;
                    long jR4 = (D15445857918358799638.R(15, bArrDigest) >> 6) & 2097151;
                    long jQ4 = (D15445857918358799638.Q(18, bArrDigest) >> 3) & 2097151;
                    long jQ5 = D15445857918358799638.Q(21, bArrDigest) & 2097151;
                    long jR5 = (D15445857918358799638.R(23, bArrDigest) >> 5) & 2097151;
                    long jQ6 = (D15445857918358799638.Q(26, bArrDigest) >> 2) & 2097151;
                    long jR6 = (D15445857918358799638.R(28, bArrDigest) >> 7) & 2097151;
                    long jR7 = (D15445857918358799638.R(31, bArrDigest) >> 4) & 2097151;
                    long jQ7 = (D15445857918358799638.Q(34, bArrDigest) >> 1) & 2097151;
                    long jR8 = (D15445857918358799638.R(36, bArrDigest) >> 6) & 2097151;
                    long jQ8 = (D15445857918358799638.Q(39, bArrDigest) >> 3) & 2097151;
                    long jQ9 = D15445857918358799638.Q(42, bArrDigest) & 2097151;
                    long jR9 = (D15445857918358799638.R(44, bArrDigest) >> 5) & 2097151;
                    long jQ10 = (D15445857918358799638.Q(47, bArrDigest) >> 2) & 2097151;
                    long jR10 = (D15445857918358799638.R(49, bArrDigest) >> 7) & 2097151;
                    long jR11 = (D15445857918358799638.R(52, bArrDigest) >> 4) & 2097151;
                    long jQ11 = (D15445857918358799638.Q(55, bArrDigest) >> 1) & 2097151;
                    long jR12 = (D15445857918358799638.R(57, bArrDigest) >> 6) & 2097151;
                    long jR13 = D15445857918358799638.R(60, bArrDigest) >> 3;
                    long j = (jR13 * 666643) + jR6;
                    long j2 = (jR13 * 470296) + jR7;
                    long j3 = (jR13 * 654183) + jQ7;
                    long j4 = jR8 - (jR13 * 997805);
                    long j5 = (jR13 * 136657) + jQ8;
                    long j6 = jQ9 - (jR13 * 683901);
                    long j7 = (jR12 * 666643) + jQ6;
                    long j8 = (jR12 * 470296) + j;
                    long j9 = (jR12 * 654183) + j2;
                    long j10 = j3 - (jR12 * 997805);
                    long j11 = (jR12 * 136657) + j4;
                    long j12 = j5 - (jR12 * 683901);
                    long j13 = (jQ11 * 666643) + jR5;
                    long j14 = (jQ11 * 470296) + j7;
                    long j15 = (jQ11 * 654183) + j8;
                    long j16 = j9 - (jQ11 * 997805);
                    long j17 = (jQ11 * 136657) + j10;
                    long j18 = j11 - (jQ11 * 683901);
                    long j19 = (jR11 * 666643) + jQ5;
                    long j20 = (jR11 * 470296) + j13;
                    long j21 = (jR11 * 654183) + j14;
                    long j22 = j15 - (jR11 * 997805);
                    long j23 = (jR11 * 136657) + j16;
                    long j24 = j17 - (jR11 * 683901);
                    long j25 = (jR10 * 666643) + jQ4;
                    long j26 = (jR10 * 470296) + j19;
                    long j27 = (jR10 * 654183) + j20;
                    long j28 = j21 - (jR10 * 997805);
                    long j29 = (jR10 * 136657) + j22;
                    long j30 = j23 - (jR10 * 683901);
                    long j31 = (jQ10 * 666643) + jR4;
                    long j32 = (jQ10 * 470296) + j25;
                    long j33 = (jQ10 * 654183) + j26;
                    long j34 = j27 - (jQ10 * 997805);
                    long j35 = (jQ10 * 136657) + j28;
                    long j36 = j29 - (jQ10 * 683901);
                    long j37 = (j31 + 1048576) >> 21;
                    long j38 = j32 + j37;
                    long j39 = j31 - (j37 << 21);
                    long j40 = (j33 + 1048576) >> 21;
                    long j41 = j34 + j40;
                    long j42 = j33 - (j40 << 21);
                    long j43 = (j35 + 1048576) >> 21;
                    long j44 = j36 + j43;
                    long j45 = j35 - (j43 << 21);
                    long j46 = (j30 + 1048576) >> 21;
                    long j47 = j24 + j46;
                    long j48 = j30 - (j46 << 21);
                    long j49 = (j18 + 1048576) >> 21;
                    long j50 = j12 + j49;
                    long j51 = j18 - (j49 << 21);
                    long j52 = (j6 + 1048576) >> 21;
                    long j53 = jR9 + j52;
                    long j54 = j6 - (j52 << 21);
                    long j55 = (j38 + 1048576) >> 21;
                    long j56 = j42 + j55;
                    long j57 = j38 - (j55 << 21);
                    long j58 = (j41 + 1048576) >> 21;
                    long j59 = j45 + j58;
                    long j60 = j41 - (j58 << 21);
                    long j61 = (j44 + 1048576) >> 21;
                    long j62 = j48 + j61;
                    long j63 = j44 - (j61 << 21);
                    long j64 = (j47 + 1048576) >> 21;
                    long j65 = j51 + j64;
                    long j66 = j47 - (j64 << 21);
                    long j67 = (j50 + 1048576) >> 21;
                    long j68 = j54 + j67;
                    long j69 = j50 - (j67 << 21);
                    long j70 = (j53 * 666643) + jQ3;
                    long j71 = (j53 * 470296) + j39;
                    long j72 = (j53 * 654183) + j57;
                    long j73 = j56 - (j53 * 997805);
                    long j74 = (j53 * 136657) + j60;
                    long j75 = j59 - (j53 * 683901);
                    long j76 = (j68 * 666643) + jR3;
                    long j77 = (j68 * 470296) + j70;
                    long j78 = (j68 * 654183) + j71;
                    long j79 = j72 - (j68 * 997805);
                    long j80 = (j68 * 136657) + j73;
                    long j81 = j74 - (j68 * 683901);
                    long j82 = (j69 * 666643) + jR2;
                    long j83 = (j69 * 470296) + j76;
                    long j84 = (j69 * 654183) + j77;
                    long j85 = (j69 * 136657) + j79;
                    long j86 = j80 - (j69 * 683901);
                    long j87 = (j65 * 666643) + jQ2;
                    long j88 = (j65 * 470296) + j82;
                    long j89 = (j65 * 654183) + j83;
                    long j90 = (j65 * 136657) + (j78 - (j69 * 997805));
                    long j91 = (j66 * 666643) + jR;
                    long j92 = (j66 * 470296) + j87;
                    long j93 = (j66 * 654183) + j88;
                    long j94 = j89 - (j66 * 997805);
                    long j95 = (j66 * 136657) + (j84 - (j65 * 997805));
                    long j96 = j90 - (j66 * 683901);
                    long j97 = (j62 * 666643) + jQ;
                    long j98 = (j62 * 470296) + j91;
                    long j99 = (j62 * 654183) + j92;
                    long j100 = j93 - (j62 * 997805);
                    long j101 = (j62 * 136657) + j94;
                    long j102 = j95 - (j62 * 683901);
                    long j103 = (j97 + 1048576) >> 21;
                    long j104 = j98 + j103;
                    long j105 = j97 - (j103 << 21);
                    long j106 = (j99 + 1048576) >> 21;
                    long j107 = j100 + j106;
                    long j108 = j99 - (j106 << 21);
                    long j109 = (j101 + 1048576) >> 21;
                    long j110 = j102 + j109;
                    long j111 = j101 - (j109 << 21);
                    long j112 = (j96 + 1048576) >> 21;
                    long j113 = (j85 - (j65 * 683901)) + j112;
                    long j114 = j96 - (j112 << 21);
                    long j115 = (j86 + 1048576) >> 21;
                    long j116 = j81 + j115;
                    long j117 = j86 - (j115 << 21);
                    long j118 = (j75 + 1048576) >> 21;
                    long j119 = j63 + j118;
                    long j120 = j75 - (j118 << 21);
                    long j121 = (j104 + 1048576) >> 21;
                    long j122 = j108 + j121;
                    long j123 = j104 - (j121 << 21);
                    long j124 = (j107 + 1048576) >> 21;
                    long j125 = j111 + j124;
                    long j126 = j107 - (j124 << 21);
                    long j127 = (j110 + 1048576) >> 21;
                    long j128 = j114 + j127;
                    long j129 = j110 - (j127 << 21);
                    long j130 = (j113 + 1048576) >> 21;
                    long j131 = j117 + j130;
                    long j132 = j113 - (j130 << 21);
                    long j133 = (j116 + 1048576) >> 21;
                    long j134 = j120 + j133;
                    long j135 = j116 - (j133 << 21);
                    long j136 = (j119 + 1048576) >> 21;
                    long j137 = (j136 * 666643) + j105;
                    long j138 = (j136 * 136657) + j125;
                    long j139 = j137 >> 21;
                    long j140 = (j136 * 470296) + j123 + j139;
                    long j141 = j137 - (j139 << 21);
                    long j142 = j140 >> 21;
                    long j143 = (j136 * 654183) + j122 + j142;
                    long j144 = j140 - (j142 << 21);
                    long j145 = j143 >> 21;
                    long j146 = (j126 - (j136 * 997805)) + j145;
                    long j147 = j143 - (j145 << 21);
                    long j148 = j146 >> 21;
                    long j149 = j138 + j148;
                    long j150 = j146 - (j148 << 21);
                    long j151 = j149 >> 21;
                    long j152 = (j129 - (j136 * 683901)) + j151;
                    long j153 = j149 - (j151 << 21);
                    long j154 = j152 >> 21;
                    long j155 = j128 + j154;
                    long j156 = j152 - (j154 << 21);
                    long j157 = j155 >> 21;
                    long j158 = j132 + j157;
                    long j159 = j155 - (j157 << 21);
                    long j160 = j158 >> 21;
                    long j161 = j131 + j160;
                    long j162 = j158 - (j160 << 21);
                    long j163 = j161 >> 21;
                    long j164 = j135 + j163;
                    long j165 = j161 - (j163 << 21);
                    long j166 = j164 >> 21;
                    long j167 = j134 + j166;
                    long j168 = j164 - (j166 << 21);
                    long j169 = j167 >> 21;
                    long j170 = (j119 - (j136 << 21)) + j169;
                    long j171 = j167 - (j169 << 21);
                    long j172 = j170 >> 21;
                    long j173 = j170 - (j172 << 21);
                    long j174 = (666643 * j172) + j141;
                    long j175 = (654183 * j172) + j147;
                    long j176 = j150 - (997805 * j172);
                    long j177 = (136657 * j172) + j153;
                    long j178 = j156 - (j172 * 683901);
                    long j179 = j174 >> 21;
                    long j180 = (470296 * j172) + j144 + j179;
                    long j181 = j180 >> 21;
                    long j182 = j175 + j181;
                    long j183 = j180 - (j181 << 21);
                    long j184 = j182 >> 21;
                    long j185 = j176 + j184;
                    long j186 = j182 - (j184 << 21);
                    long j187 = j185 >> 21;
                    long j188 = j177 + j187;
                    long j189 = j185 - (j187 << 21);
                    long j190 = j188 >> 21;
                    long j191 = j178 + j190;
                    long j192 = j188 - (j190 << 21);
                    long j193 = j191 >> 21;
                    long j194 = j159 + j193;
                    long j195 = j191 - (j193 << 21);
                    long j196 = j194 >> 21;
                    long j197 = j162 + j196;
                    long j198 = j194 - (j196 << 21);
                    long j199 = j197 >> 21;
                    long j200 = j165 + j199;
                    long j201 = j197 - (j199 << 21);
                    long j202 = j200 >> 21;
                    long j203 = j168 + j202;
                    long j204 = j203 >> 21;
                    long j205 = j171 + j204;
                    long j206 = j203 - (j204 << 21);
                    long j207 = j205 >> 21;
                    long j208 = j173 + j207;
                    long j209 = j205 - (j207 << 21);
                    bArrDigest[0] = (byte) (j174 - (j179 << 21));
                    bArrDigest[1] = (byte) (r8 >> 8);
                    bArrDigest[2] = (byte) ((r8 >> 16) | (j183 << 5));
                    bArrDigest[3] = (byte) (j183 >> 3);
                    bArrDigest[4] = (byte) (j183 >> 11);
                    bArrDigest[5] = (byte) ((j183 >> 19) | (j186 << 2));
                    bArrDigest[6] = (byte) (j186 >> 6);
                    bArrDigest[7] = (byte) ((j186 >> 14) | (j189 << 7));
                    bArrDigest[8] = (byte) (j189 >> 1);
                    bArrDigest[9] = (byte) (j189 >> 9);
                    bArrDigest[10] = (byte) ((j189 >> 17) | (j192 << 4));
                    bArrDigest[11] = (byte) (j192 >> 4);
                    bArrDigest[12] = (byte) (j192 >> 12);
                    bArrDigest[13] = (byte) ((j192 >> 20) | (j195 << 1));
                    bArrDigest[14] = (byte) (j195 >> 7);
                    bArrDigest[15] = (byte) ((j195 >> 15) | (j198 << 6));
                    bArrDigest[16] = (byte) (j198 >> 2);
                    bArrDigest[17] = (byte) (j198 >> 10);
                    bArrDigest[18] = (byte) ((j198 >> 18) | (j201 << 3));
                    bArrDigest[19] = (byte) (j201 >> 5);
                    bArrDigest[20] = (byte) (j201 >> 13);
                    bArrDigest[21] = (byte) (j200 - (j202 << 21));
                    bArrDigest[22] = (byte) (r13 >> 8);
                    bArrDigest[23] = (byte) ((r13 >> 16) | (j206 << 5));
                    bArrDigest[24] = (byte) (j206 >> 3);
                    bArrDigest[25] = (byte) (j206 >> 11);
                    bArrDigest[26] = (byte) ((j206 >> 19) | (j209 << 2));
                    bArrDigest[27] = (byte) (j209 >> 6);
                    bArrDigest[28] = (byte) ((j209 >> 14) | (j208 << 7));
                    bArrDigest[29] = (byte) (j208 >> 1);
                    bArrDigest[30] = (byte) (j208 >> 9);
                    bArrDigest[31] = (byte) (j208 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrN = O4077903568229246.n(bArr4);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    O4077903568229246.R(jArr4, jArrN);
                    O4077903568229246.E(jArr5, jArr4, F1919009084933321653.a);
                    O4077903568229246.S(jArr4, jArr4, jArr2);
                    O4077903568229246.T(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    O4077903568229246.R(jArr8, jArr5);
                    O4077903568229246.E(jArr8, jArr8, jArr5);
                    O4077903568229246.R(jArr, jArr8);
                    O4077903568229246.E(jArr, jArr, jArr5);
                    O4077903568229246.E(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    O4077903568229246.R(jArr9, jArr);
                    O4077903568229246.R(jArr10, jArr9);
                    O4077903568229246.R(jArr10, jArr10);
                    O4077903568229246.E(jArr10, jArr, jArr10);
                    O4077903568229246.E(jArr9, jArr9, jArr10);
                    O4077903568229246.R(jArr9, jArr9);
                    O4077903568229246.E(jArr9, jArr10, jArr9);
                    O4077903568229246.R(jArr10, jArr9);
                    for (int i4 = 1; i4 < 5; i4++) {
                        O4077903568229246.R(jArr10, jArr10);
                    }
                    O4077903568229246.E(jArr9, jArr10, jArr9);
                    O4077903568229246.R(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        O4077903568229246.R(jArr10, jArr10);
                    }
                    O4077903568229246.E(jArr10, jArr10, jArr9);
                    O4077903568229246.R(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        O4077903568229246.R(jArr11, jArr11);
                    }
                    O4077903568229246.E(jArr10, jArr11, jArr10);
                    O4077903568229246.R(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        O4077903568229246.R(jArr10, jArr10);
                    }
                    O4077903568229246.E(jArr9, jArr10, jArr9);
                    O4077903568229246.R(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        O4077903568229246.R(jArr10, jArr10);
                    }
                    O4077903568229246.E(jArr10, jArr10, jArr9);
                    O4077903568229246.R(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        O4077903568229246.R(jArr11, jArr11);
                    }
                    O4077903568229246.E(jArr10, jArr11, jArr10);
                    O4077903568229246.R(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        O4077903568229246.R(jArr10, jArr10);
                    }
                    O4077903568229246.E(jArr9, jArr10, jArr9);
                    O4077903568229246.R(jArr9, jArr9);
                    O4077903568229246.R(jArr9, jArr9);
                    O4077903568229246.E(jArr, jArr9, jArr);
                    O4077903568229246.E(jArr, jArr, jArr8);
                    O4077903568229246.E(jArr, jArr, jArr4);
                    O4077903568229246.R(jArr6, jArr);
                    O4077903568229246.E(jArr6, jArr6, jArr5);
                    O4077903568229246.S(jArr7, jArr6, jArr4);
                    if (D15445857918358799638.P(jArr7)) {
                        O4077903568229246.T(jArr7, jArr6, jArr4);
                        if (D15445857918358799638.P(jArr7)) {
                            W4415201450379021245.c("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            return;
                        }
                        O4077903568229246.E(jArr, jArr, F1919009084933321653.c);
                    }
                    if (!D15445857918358799638.P(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                        W4415201450379021245.c("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return;
                    }
                    int i11 = 255;
                    if ((O4077903568229246.l(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i12 = 0; i12 < 10; i12++) {
                            jArr[i12] = -jArr[i12];
                        }
                    }
                    O4077903568229246.E(jArr3, jArr, jArrN);
                    Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910((Object) jArr, (Object) jArrN, (Object) jArr2, (byte) 19);
                    X3922685222630519383[] x3922685222630519383Arr = new X3922685222630519383[8];
                    x3922685222630519383Arr[0] = new X3922685222630519383(new D2456187031834883815(q7316561721656982910, jArr3));
                    D2456187031834883815 d2456187031834883815 = new D2456187031834883815(new Q7316561721656982910((byte) 19), new long[10]);
                    D15445857918358799638.D(q7316561721656982910, d2456187031834883815);
                    D2456187031834883815 d24561870318348838152 = new D2456187031834883815(d2456187031834883815);
                    for (int i13 = 1; i13 < 8; i13++) {
                        D15445857918358799638.s(d2456187031834883815, d24561870318348838152, x3922685222630519383Arr[i13 - 1]);
                        x3922685222630519383Arr[i13] = new X3922685222630519383(new D2456187031834883815(d2456187031834883815));
                    }
                    byte[] bArrZ = D15445857918358799638.Z(bArrDigest);
                    byte[] bArrZ2 = D15445857918358799638.Z(bArrCopyOfRange);
                    D2456187031834883815 d24561870318348838153 = new D2456187031834883815((byte) 0);
                    D2456187031834883815 d24561870318348838154 = new D2456187031834883815((byte) 1);
                    while (i11 >= 0 && bArrZ[i11] == 0 && bArrZ2[i11] == 0) {
                        i11--;
                    }
                    while (i11 >= 0) {
                        D15445857918358799638.D(new Q7316561721656982910(d24561870318348838153), d24561870318348838153);
                        byte b = bArrZ[i11];
                        if (b > 0) {
                            D2456187031834883815.a(d24561870318348838154, d24561870318348838153);
                            D15445857918358799638.s(d24561870318348838153, d24561870318348838154, x3922685222630519383Arr[bArrZ[i11] / 2]);
                        } else if (b < 0) {
                            D2456187031834883815.a(d24561870318348838154, d24561870318348838153);
                            D15445857918358799638.a0(d24561870318348838153, d24561870318348838154, x3922685222630519383Arr[(-bArrZ[i11]) / 2]);
                        }
                        byte b2 = bArrZ2[i11];
                        if (b2 > 0) {
                            D2456187031834883815.a(d24561870318348838154, d24561870318348838153);
                            D15445857918358799638.s(d24561870318348838153, d24561870318348838154, F1919009084933321653.e[bArrZ2[i11] / 2]);
                        } else if (b2 < 0) {
                            D2456187031834883815.a(d24561870318348838154, d24561870318348838153);
                            D15445857918358799638.a0(d24561870318348838153, d24561870318348838154, F1919009084933321653.e[(-bArrZ2[i11]) / 2]);
                        }
                        i11--;
                    }
                    byte[] bArrR = new Q7316561721656982910(d24561870318348838153).R();
                    for (int i14 = 0; i14 < 32; i14++) {
                        if (bArrR[i14] == bArr[i14]) {
                        }
                    }
                    return;
                }
            }
        }
        W4415201450379021245.c("Signature check failed.");
    }

    public Y5809172221756938728(A8947685337014270457 a8947685337014270457, byte[] bArr, byte[] bArr2) {
        this.d = a8947685337014270457;
        this.b = bArr;
        this.c = bArr2;
    }
}
