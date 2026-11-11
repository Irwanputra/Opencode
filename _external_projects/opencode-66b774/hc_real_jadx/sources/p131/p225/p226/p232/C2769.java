package p131.p225.p226.p232;

import java.io.IOException;
import java.io.OutputStream;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2769 extends OutputStream {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2761 f10414;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f10415 = false;

    public C2769(C2761 c2761) {
        this.f10414 = c2761;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10415) {
            return;
        }
        this.f10415 = true;
        C2761 c2761 = this.f10414;
        C2760 c2760 = c2761.f10374;
        c2760.getClass();
        byte[] bArr = new byte[5];
        synchronized (c2761) {
            if (c2761.f10392 == 2) {
                bArr[0] = 96;
                int i = c2761.f10375;
                bArr[1] = (byte) (i >> 24);
                bArr[2] = (byte) (i >> 16);
                bArr[3] = (byte) (i >> 8);
                bArr[4] = (byte) i;
                synchronized (c2761.f10373) {
                    if (!c2761.f10391) {
                        c2760.f10363.m4683(bArr);
                        C2773 c2773 = C2760.f10361;
                        c2773.getClass();
                        c2773.m4754(50, Crypt.a(Crypt.xrc("@c:Afi\u001eg9Na>Ne9Kg>\u00190mKdh\u001c7l\u001b0>\u001b4jLe>M4k\u001c1;\u001efn\u001a09\u0019diI0>A3l\u001ab<\u0019dg\u001a")) + c2761.f10386 + Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")) + c2761.f10375 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
                    }
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.f10415) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001e6lK7>\u001d6fHj:NdiIjgMdh@4iL1m\u001979AcoJe<Oc;\u001begHggA4o\u001agnJ0;Le>Kgk\u001cbk\u001a")));
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r9 < r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003f, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        r11 = r3.f10378 - ((((r12.f10217 - 1) + 9) + r4.f10363.f10266.f10219.length) + 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        if (r11 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        if (r6 <= r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        r3.f10379 = r9 - r6;
        r9 = new byte[r6 + 9];
        r9[0] = 94;
        r10 = r3.f10375;
        r9[1] = (byte) (r10 >> 24);
        r9[2] = (byte) (r10 >> 16);
        r9[3] = (byte) (r10 >> 8);
        r9[4] = (byte) r10;
        r9[5] = (byte) (r6 >> 24);
        r9[6] = (byte) (r6 >> 16);
        r9[7] = (byte) (r6 >> 8);
        r9[8] = (byte) r6;
        java.lang.System.arraycopy(r17, r2, r9, 9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0041, code lost:
    
        r6 = (int) r9;
     */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p225.p226.p232.C2769.write(byte[], int, int):void");
    }
}
