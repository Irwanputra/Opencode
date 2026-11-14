package dev.epro.r0;

import java.io.OutputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L6461449118602905387 extends OutputStream {
    public C16667689525325095505 a;
    public boolean b;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        C16667689525325095505 c16667689525325095505 = this.a;
        I13897573759869141187 i13897573759869141187 = c16667689525325095505.b;
        i13897573759869141187.getClass();
        byte[] bArr = new byte[5];
        synchronized (c16667689525325095505) {
            try {
                if (c16667689525325095505.k != 2) {
                    return;
                }
                bArr[0] = 96;
                int i = c16667689525325095505.g;
                bArr[1] = (byte) (i >> 24);
                bArr[2] = (byte) (i >> 16);
                bArr[3] = (byte) (i >> 8);
                bArr[4] = (byte) i;
                synchronized (c16667689525325095505.h) {
                    try {
                        if (c16667689525325095505.i) {
                            return;
                        }
                        i13897573759869141187.b.m(bArr);
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.b) {
            Q11088980322693754445.h("This OutputStream is closed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if (r4 < r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003b, code lost:
    
        r6 = r11.f184o;
        r7 = r0.b.h;
        r6 = r6 - (((r7.h + 8) + r7.g.length) + 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (r6 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r1 <= r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        r11.m = r4 - r1;
        r4 = new byte[r1 + 9];
        r4[0] = 94;
        r5 = r11.g;
        r4[1] = (byte) (r5 >> 24);
        r4[2] = (byte) (r5 >> 16);
        r4[3] = (byte) (r5 >> 8);
        r4[4] = (byte) r5;
        r4[5] = (byte) (r1 >> 24);
        r4[6] = (byte) (r1 >> 16);
        r4[7] = (byte) (r1 >> 8);
        r4[8] = (byte) r1;
        java.lang.System.arraycopy(r12, r13, r4, 9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003a, code lost:
    
        r1 = (int) r4;
     */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L6461449118602905387.write(byte[], int, int):void");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
