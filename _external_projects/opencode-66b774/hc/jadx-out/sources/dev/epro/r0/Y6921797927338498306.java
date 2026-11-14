package dev.epro.r0;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y6921797927338498306 {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(F16059529287866721367.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(P5176232750190581838 p5176232750190581838, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (p5176232750190581838.d(j2) == 13) {
                String strQ = p5176232750190581838.q(j2, F16059529287866721367.a);
                p5176232750190581838.u(2L);
                return strQ;
            }
        }
        String strQ2 = p5176232750190581838.q(j, F16059529287866721367.a);
        p5176232750190581838.u(1L);
        return strQ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(dev.epro.r0.P5176232750190581838 r16, dev.epro.r0.P12327795811052477724 r17, boolean r18) {
        /*
            r0 = r16
            dev.epro.r0.P5586796822028136504 r0 = r0.a
            r1 = -1
            if (r0 != 0) goto Lb
            if (r18 == 0) goto La
            goto L59
        La:
            return r1
        Lb:
            byte[] r2 = r0.a
            int r3 = r0.b
            int r4 = r0.c
            r5 = r17
            int[] r5 = r5.b
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L19:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L24
            r9 = r10
        L24:
            if (r8 != 0) goto L27
            goto L57
        L27:
            r10 = 0
            if (r11 >= 0) goto L6f
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L2e:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L3b
            goto L79
        L3b:
            if (r13 != r12) goto L3f
            r3 = 1
            goto L40
        L3f:
            r3 = r6
        L40:
            if (r11 != r4) goto L5f
            r8.getClass()
            dev.epro.r0.P5586796822028136504 r2 = r8.f
            r2.getClass()
            int r4 = r2.b
            byte[] r7 = r2.a
            int r8 = r2.c
            if (r2 != r0) goto L5b
            if (r3 == 0) goto L57
            r2 = r7
            r7 = r10
            goto L62
        L57:
            if (r18 == 0) goto L79
        L59:
            r0 = -2
            return r0
        L5b:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L62
        L5f:
            r7 = r8
            r8 = r4
            r4 = r11
        L62:
            if (r3 == 0) goto L6a
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto L9b
        L6a:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L2e
        L6f:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L77:
            if (r7 != r13) goto L7a
        L79:
            return r9
        L7a:
            r14 = r5[r7]
            if (r3 != r14) goto La5
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L99
            dev.epro.r0.P5586796822028136504 r8 = r8.f
            r8.getClass()
            int r2 = r8.b
            byte[] r4 = r8.a
            int r7 = r8.c
            if (r8 != r0) goto L95
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto L9b
        L95:
            r15 = r4
            r4 = r2
            r2 = r15
            goto L9b
        L99:
            r7 = r4
            r4 = r12
        L9b:
            if (r3 < 0) goto L9e
            return r3
        L9e:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L19
        La5:
            int r7 = r7 + 1
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y6921797927338498306.b(dev.epro.r0.P5176232750190581838, dev.epro.r0.P12327795811052477724, boolean):int");
    }
}
