package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I2828680009210448000 {
    public final A4559761392562572984 a;
    public N12245111110189169079 b;
    public int c;
    public final E13273723708836014930 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public B14741976151982460670 j;

    public I2828680009210448000() {
        long[] jArr = X4026756943680612204.a;
        this.a = new A4559761392562572984();
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        this.d = new E13273723708836014930();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(I6148490667470006645 i6148490667470006645, int i, E8793254571815685242 e8793254571815685242, boolean z) {
        int i2 = 0;
        long c = i6148490667470006645.c(0);
        long a = z ? Q2551293802323679034.a(0, i, 1, c) : Q2551293802323679034.a(i, 0, 2, c);
        I13087925019311684776[] i13087925019311684776Arr = e8793254571815685242.a;
        int length = i13087925019311684776Arr.length;
        int i3 = 0;
        while (i2 < length) {
            I13087925019311684776 i13087925019311684776 = i13087925019311684776Arr[i2];
            int i4 = i3 + 1;
            if (i13087925019311684776 != null) {
                i13087925019311684776.l = Q2551293802323679034.d(a, Q2551293802323679034.c(i6148490667470006645.c(i3), c));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, I6148490667470006645 i6148490667470006645, boolean z) {
        int e = i6148490667470006645.e();
        int d = i6148490667470006645.d() + e;
        int i = 0;
        while (e < d) {
            int C = E686369837194379706.C(i6148490667470006645, z) + iArr[e];
            iArr[e] = C;
            i = Math.max(i, C);
            e++;
        }
        return i;
    }

    public final I13087925019311684776 a(int i, Object obj) {
        E8793254571815685242 e8793254571815685242 = (E8793254571815685242) this.a.g(obj);
        if (e8793254571815685242 != null) {
            return e8793254571815685242.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            I13087925019311684776 i13087925019311684776 = (I13087925019311684776) arrayList.get(i);
            B9692660393722135472 b9692660393722135472 = i13087925019311684776.f285o;
            if (b9692660393722135472 != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (i13087925019311684776.l & 4294967295L)) + ((int) (b9692660393722135472.u & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (i13087925019311684776.l >> 32)) + ((int) (b9692660393722135472.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f4, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        if (r18 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r3 = r2.a;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        if (r5 >= r4) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r6 = r3[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
    
        if (r6 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r6.b() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0207, code lost:
    
        r15.remove(r6);
        r7 = r52.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020c, code lost:
    
        if (r7 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
    
        dev.epro.r0.V1475975160983963926.D(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0211, code lost:
    
        r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0217, code lost:
    
        g(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0138, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x012f, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0115, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023f, code lost:
    
        r19 = r2;
        r21 = r3;
        r2 = r8;
        r9 = r16;
        r16 = r15;
        f(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0261, code lost:
    
        r15 = r6;
        r2 = r8;
        r3 = r10;
        r4 = 2;
        r5 = new int[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026a, code lost:
    
        if (r25 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026c, code lost:
    
        if (r14 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0272, code lost:
    
        if (r3.isEmpty() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r15 = r52.c;
        r6 = (dev.epro.r0.I6148490667470006645) dev.epro.r0.R9411874267597469228.D0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
    
        if (r3.size() <= 1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027b, code lost:
    
        dev.epro.r0.R4678422174699242737.m0(r3, new dev.epro.r0.Q16249429098131448655(r14, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0283, code lost:
    
        r7 = r3.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0288, code lost:
    
        if (r9 >= r7) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028a, code lost:
    
        r10 = (dev.epro.r0.I6148490667470006645) r3.get(r9);
        r11 = r63 - h(r5, r10, r59);
        r12 = r2.g(r10.getKey());
        r12.getClass();
        c(r10, r11, (dev.epro.r0.E8793254571815685242) r12, r59);
        g(r10, false);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ad, code lost:
    
        r11 = 0;
        java.util.Arrays.fill(r5, 0, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b7, code lost:
    
        if (r9.isEmpty() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02be, code lost:
    
        if (r9.size() <= 1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c0, code lost:
    
        dev.epro.r0.R4678422174699242737.m0(r9, new dev.epro.r0.Q16249429098131448655(r14, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c8, code lost:
    
        r7 = r9.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        if (r9 >= r7) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cf, code lost:
    
        r10 = (dev.epro.r0.I6148490667470006645) r9.get(r9);
        r11 = (h(r5, r10, r59) + r64) - dev.epro.r0.E686369837194379706.C(r10, r59);
        r12 = r2.g(r10.getKey());
        r12.getClass();
        c(r10, r11, (dev.epro.r0.E8793254571815685242) r12, r59);
        g(r10, false);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f7, code lost:
    
        java.util.Arrays.fill(r5, 0, r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fb, code lost:
    
        r7 = r1.b;
        r9 = r1.a;
        r4 = r9.length - 2;
        r11 = r52.h;
        r12 = r52.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r6 = r6.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0306, code lost:
    
        if (r4 < 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0308, code lost:
    
        r36 = r9;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030d, code lost:
    
        r6 = r9[r10];
        r37 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0319, code lost:
    
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031b, code lost:
    
        r8 = 8 - ((~(r10 - r4)) >>> 31);
        r38 = r6;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (r6 >= r8) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032d, code lost:
    
        if ((r38 & 255) >= 128) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032f, code lost:
    
        r7 = r7[(r10 << 3) + r6];
        r9 = (dev.epro.r0.E8793254571815685242) r2.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033a, code lost:
    
        if (r9 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r52.c = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033e, code lost:
    
        r40 = r1;
        r47 = r3;
        r3 = r57.i(r7);
        r48 = r6;
        r6 = java.lang.Math.min(r13, r9.e);
        r9.e = r6;
        r49 = r8;
        r9.d = java.lang.Math.min(r13 - r6, r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x035f, code lost:
    
        if (r3 != (-1)) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0361, code lost:
    
        r3 = r9.a;
        r8 = r3.length;
        r6 = 0;
        r41 = false;
        r42 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0369, code lost:
    
        if (r6 >= r8) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036b, code lost:
    
        r43 = r3;
        r3 = r43[r6];
        r44 = r42 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0371, code lost:
    
        if (r3 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0377, code lost:
    
        if (r3.b() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0379, code lost:
    
        r45 = r6;
        r46 = r8;
        r62 = r10;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ef, code lost:
    
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r59 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0403, code lost:
    
        r6 = r45 + 1;
        r10 = r62;
        r20 = r13;
        r3 = r43;
        r42 = r44;
        r8 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0384, code lost:
    
        r45 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0392, code lost:
    
        if (((java.lang.Boolean) r3.k.getValue()).booleanValue() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0394, code lost:
    
        r3.c();
        r9.a[r42] = r20;
        r15.remove(r3);
        r3 = r52.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a0, code lost:
    
        if (r3 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a2, code lost:
    
        dev.epro.r0.V1475975160983963926.D(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03fc, code lost:
    
        r46 = r8;
        r62 = r10;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a6, code lost:
    
        r6 = r3.f285o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r6 = r53 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a8, code lost:
    
        if (r6 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03aa, code lost:
    
        r6 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03b2, code lost:
    
        if (r3.b() != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b4, code lost:
    
        if (r6 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b7, code lost:
    
        r46 = r8;
        r3.j.setValue(java.lang.Boolean.TRUE);
        r62 = r10;
        r13 = r20;
        dev.epro.r0.R7033599853981556291.E(r3.a, r13, r13, new dev.epro.r0.C288342651169725874(r3, r6, r6, r20, 12), 3);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03e3, code lost:
    
        if (r3.b() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03e5, code lost:
    
        r15.add(r3);
        r3 = r52.j;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ea, code lost:
    
        if (r3 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ec, code lost:
    
        dev.epro.r0.V1475975160983963926.D(r3);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r60 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03f2, code lost:
    
        r3.c();
        r9.a[r42] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d8, code lost:
    
        r46 = r8;
        r62 = r10;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03fa, code lost:
    
        r45 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0413, code lost:
    
        r62 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0418, code lost:
    
        if (r41 != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x041a, code lost:
    
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x041d, code lost:
    
        r18 = r5;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0420, code lost:
    
        r5 = r12;
        r16 = r14;
        r17 = r15;
        r15 = r49;
        r14 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r62 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04cb, code lost:
    
        r38 = r38 >> 8;
        r13 = r61;
        r11 = r3;
        r12 = r5;
        r6 = r48 + 1;
        r10 = r14;
        r8 = r15;
        r14 = r16;
        r15 = r17;
        r5 = r18;
        r1 = r40;
        r3 = r47;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x042d, code lost:
    
        r62 = r10;
        r6 = r9.b;
        r6.getClass();
        r8 = r11;
        r3 = r58.f(r3, r9.d, r9.e, r6.a);
        r3.h();
        r6 = r9.a;
        r10 = r6.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0455, code lost:
    
        if (r11 >= r10) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0457, code lost:
    
        r17 = r3;
        r3 = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x045b, code lost:
    
        if (r3 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x045d, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x046c, code lost:
    
        if (((java.lang.Boolean) r3.h.getValue()).booleanValue() != true) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x048a, code lost:
    
        r18 = r5;
        r16 = r14;
        r7 = r17;
        r14 = r62;
        r5 = r12;
        r3 = r8;
        r17 = r15;
        r15 = r49;
        r9.a(r7, r65, r66, r63, r64, r9.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04aa, code lost:
    
        if (r3 >= r52.c) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04ac, code lost:
    
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04b0, code lost:
    
        r3.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0472, code lost:
    
        r11 = r11 + 1;
        r3 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0470, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0479, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r9 = r8.b;
        r10 = r8.a;
        r11 = r10.length - 2;
        r1 = r52.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x047b, code lost:
    
        if (r14 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0481, code lost:
    
        if (r3 != r14.i(r7)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0483, code lost:
    
        f(r7);
        r18 = r5;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04b6, code lost:
    
        r40 = r1;
        r47 = r3;
        r18 = r5;
        r48 = r6;
        r3 = r11;
        r5 = r12;
        r16 = r14;
        r17 = r15;
        r15 = r8;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04e4, code lost:
    
        r40 = r1;
        r47 = r3;
        r18 = r5;
        r3 = r11;
        r5 = r12;
        r16 = r14;
        r17 = r15;
        r1 = r57;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04f8, code lost:
    
        if (r8 != 8) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x050e, code lost:
    
        if (r14 == r4) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0510, code lost:
    
        r10 = r14 + 1;
        r13 = r61;
        r11 = r3;
        r12 = r5;
        r14 = r16;
        r15 = r17;
        r5 = r18;
        r9 = r37;
        r1 = r40;
        r3 = r47;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r11 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0538, code lost:
    
        if (r5.isEmpty() != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x053f, code lost:
    
        if (r5.size() <= 1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0541, code lost:
    
        dev.epro.r0.R4678422174699242737.m0(r5, new dev.epro.r0.Q16249429098131448655(r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x054a, code lost:
    
        r4 = r5.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x054f, code lost:
    
        if (r6 >= r4) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0551, code lost:
    
        r7 = (dev.epro.r0.I6148490667470006645) r5.get(r6);
        r8 = r2.g(r7.getKey());
        r8.getClass();
        r8 = (dev.epro.r0.E8793254571815685242) r8;
        r9 = r18;
        r10 = h(r9, r7, r59);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x056c, code lost:
    
        if (r60 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x056e, code lost:
    
        r14 = ((dev.epro.r0.I6148490667470006645) dev.epro.r0.R9411874267597469228.B0(r56)).c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0579, code lost:
    
        if (r59 == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x057b, code lost:
    
        r13 = r14 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x057d, code lost:
    
        r11 = (int) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0584, code lost:
    
        r7.a(r11 - r10, r8.c, r54, r55);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x058e, code lost:
    
        if (r25 == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0590, code lost:
    
        g(r7, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0594, code lost:
    
        r6 = r6 + 1;
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r2 = r10[r12];
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x057f, code lost:
    
        r13 = r14 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0582, code lost:
    
        r11 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0599, code lost:
    
        r10 = r54;
        r13 = r55;
        r12 = r59;
        r9 = r18;
        java.util.Arrays.fill(r9, 0, r61, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05b4, code lost:
    
        if (r3.isEmpty() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05b6, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05bb, code lost:
    
        if (r3.size() <= 1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05bd, code lost:
    
        dev.epro.r0.R4678422174699242737.m0(r3, new dev.epro.r0.Q16249429098131448655(r1, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05c5, code lost:
    
        r1 = r3.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05ca, code lost:
    
        if (r4 >= r1) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05cc, code lost:
    
        r6 = (dev.epro.r0.I6148490667470006645) r3.get(r4);
        r7 = r2.g(r6.getKey());
        r7.getClass();
        r7 = (dev.epro.r0.E8793254571815685242) r7;
        r6.a((r7.g - dev.epro.r0.E686369837194379706.C(r6, r12)) + h(r9, r6, r12), r7.c, r10, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05f1, code lost:
    
        if (r25 == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05f3, code lost:
    
        g(r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05f6, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05f9, code lost:
    
        java.util.Collections.reverse(r5);
        r56.addAll(0, r5);
        r56.addAll(r3);
        r47.clear();
        r36.clear();
        r5.clear();
        r3.clear();
        r40.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0614, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r6 = 8 - ((~(r12 - r11)) >>> 31);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05a8, code lost:
    
        r10 = r54;
        r13 = r55;
        r12 = r59;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04fb, code lost:
    
        r40 = r1;
        r47 = r3;
        r18 = r5;
        r3 = r11;
        r5 = r12;
        r16 = r14;
        r17 = r15;
        r1 = r57;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0528, code lost:
    
        r40 = r1;
        r47 = r3;
        r18 = r5;
        r36 = r9;
        r3 = r11;
        r5 = r12;
        r1 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00ce, code lost:
    
        if (r12 == r11) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x00d0, code lost:
    
        r12 = r12 + 1;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00d5, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x007e, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r7 >= r6) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0073, code lost:
    
        r6 = r53 << 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0063, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if ((r2 & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r34 = r2;
        r1.a(r9[(r12 << 3) + r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r2 = r34 >> 8;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r34 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        if (r6 != 8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r2 = r4.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        r6 = r52.i;
        r9 = r52.f;
        r10 = r52.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r3 >= r2) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r11 = (dev.epro.r0.I6148490667470006645) r4.get(r3);
        r1.l(r11.getKey());
        r12 = r11.j().size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r7 >= r12) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r19 = r2;
        r2 = ((dev.epro.r0.Z17471428274427141949) r11.j().get(r7)).k();
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if ((r2 instanceof dev.epro.r0.F8767558602150655989) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        r2 = (dev.epro.r0.F8767558602150655989) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021d, code lost:
    
        r7 = r7 + 1;
        r9 = r9;
        r6 = r6;
        r15 = r15;
        r16 = r16;
        r8 = r8;
        r10 = r10;
        r2 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        r2 = (dev.epro.r0.E8793254571815685242) r8.g(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        if (r14 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r3 = r14.i(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (r3 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (r14 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        if (r2 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r6 = new dev.epro.r0.E8793254571815685242(r52);
        r12 = r59;
        r2 = r8;
        r36 = r9;
        r37 = r10;
        r4 = r16;
        dev.epro.r0.E8793254571815685242.b(r6, r11, r65, r66, r63, r64, r12);
        r2.n(r11.getKey(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
    
        if (r11.getIndex() == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r3 == (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        if (r3 >= r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        r37.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        r9 = r4;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
    
        r3 = r21 + 1;
        r4 = r56;
        r8 = r2;
        r15 = r16;
        r2 = r19;
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        r36.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r8 = r11.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017f, code lost:
    
        if (r12 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0181, code lost:
    
        r8 = r8 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0188, code lost:
    
        c(r11, (int) r8, r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r18 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r3 = r6.a;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        if (r7 >= r6) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (r8 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019a, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
    
        r8 = r8 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        r12 = r59;
        r2 = r8;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r25 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        r16 = r15;
        r15 = r6;
        dev.epro.r0.E8793254571815685242.b(r2, r11, r65, r66, r63, r64, r12);
        r7 = r2.a;
        r9 = r7.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bd, code lost:
    
        if (r10 >= r9) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bf, code lost:
    
        r12 = r7[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r12 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r35 = r4;
        r5 = r9;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
    
        if (dev.epro.r0.Q2551293802323679034.b(r12.l, 9223372034707292159L) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d5, code lost:
    
        r9 = r35;
        r12.l = dev.epro.r0.Q2551293802323679034.d(r12.l, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ea, code lost:
    
        r50 = r9;
        r9 = r5;
        r4 = r50;
        r10 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e0, code lost:
    
        r9 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e3, code lost:
    
        r17 = r10;
        r5 = r9;
        r9 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22, types: [dev.epro.r0.G8001132634698687269, dev.epro.r0.L856869997670741194] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r53, int r54, int r55, java.util.ArrayList r56, dev.epro.r0.N12245111110189169079 r57, dev.epro.r0.L6855102173777462404 r58, boolean r59, boolean r60, int r61, boolean r62, int r63, int r64, dev.epro.r0.W5797197595347441198 r65, dev.epro.r0.Y17698807562857349923 r66) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I2828680009210448000.d(int, int, int, java.util.ArrayList, dev.epro.r0.N12245111110189169079, dev.epro.r0.L6855102173777462404, boolean, boolean, int, boolean, int, int, dev.epro.r0.W5797197595347441198, dev.epro.r0.Y17698807562857349923):void");
    }

    public final void e() {
        A4559761392562572984 a4559761392562572984 = this.a;
        if (a4559761392562572984.j()) {
            Object[] objArr = a4559761392562572984.c;
            long[] jArr = a4559761392562572984.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (I13087925019311684776 i13087925019311684776 : ((E8793254571815685242) objArr[(i << 3) + i3]).a) {
                                    if (i13087925019311684776 != null) {
                                        i13087925019311684776.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            a4559761392562572984.a();
        }
    }

    public final void f(Object obj) {
        E8793254571815685242 e8793254571815685242 = (E8793254571815685242) this.a.l(obj);
        if (e8793254571815685242 != null) {
            for (I13087925019311684776 i13087925019311684776 : e8793254571815685242.a) {
                if (i13087925019311684776 != null) {
                    i13087925019311684776.c();
                }
            }
        }
    }

    public final void g(I6148490667470006645 i6148490667470006645, boolean z) {
        Object g = this.a.g(i6148490667470006645.getKey());
        g.getClass();
        I13087925019311684776[] i13087925019311684776Arr = ((E8793254571815685242) g).a;
        int length = i13087925019311684776Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            I13087925019311684776 i13087925019311684776 = i13087925019311684776Arr[i];
            int i3 = i2 + 1;
            if (i13087925019311684776 != null) {
                long c = i6148490667470006645.c(i2);
                long j = i13087925019311684776.l;
                if (!Q2551293802323679034.b(j, 9223372034707292159L) && !Q2551293802323679034.b(j, c)) {
                    long c2 = Q2551293802323679034.c(c, j);
                    A10693687560045094360 a10693687560045094360 = i13087925019311684776.e;
                    if (a10693687560045094360 != null) {
                        long c3 = Q2551293802323679034.c(((Q2551293802323679034) i13087925019311684776.r.getValue()).a, c2);
                        i13087925019311684776.d(c3);
                        i13087925019311684776.h.setValue(Boolean.TRUE);
                        i13087925019311684776.g = z;
                        R7033599853981556291.E(i13087925019311684776.a, null, null, new F3485194578516100457(i13087925019311684776, a10693687560045094360, c3, (R4833348786910499294) null), 3);
                    }
                }
                i13087925019311684776.l = c;
            }
            i++;
            i2 = i3;
        }
    }
}
