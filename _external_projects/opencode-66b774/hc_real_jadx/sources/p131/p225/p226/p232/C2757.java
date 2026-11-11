package p131.p225.p226.p232;

import java.io.InputStream;
import java.io.InterruptedIOException;
import p131.p225.p226.p232.C2761;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2757 extends InputStream {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2761 f10355;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f10356 = false;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10357;

    public C2757(C2761 c2761, boolean z) {
        this.f10357 = false;
        this.f10355 = c2761;
        this.f10357 = z;
    }

    @Override // java.io.InputStream
    public int available() {
        int m4750;
        if (this.f10356) {
            return 0;
        }
        C2761 c2761 = this.f10355;
        C2760 c2760 = c2761.f10374;
        boolean z = this.f10357;
        c2760.getClass();
        synchronized (c2761) {
            C2761.C2762 c2762 = z ? c2761.f10384 : c2761.f10389;
            C2766 c2766 = c2762.f10393;
            if (c2766 == null) {
                throw new IllegalStateException(Crypt.a(Crypt.xrc("Kao\u001b4j\u001c7mM1jNdf\u001bamL`>AcjIeh\u001aanO6mJgfMd<\u00190=Abf\u001c4mIe:H4=\u001b1=KbkIdk\u001a")));
            }
            m4750 = c2766.m4750();
            if (m4750 <= 0) {
                m4750 = C2761.this.f10383 ? -1 : 0;
            }
        }
        if (m4750 > 0) {
            return m4750;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int m4746;
        bArr.getClass();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f10356) {
            return -1;
        }
        C2761 c2761 = this.f10355;
        C2760 c2760 = c2761.f10374;
        boolean z = this.f10357;
        c2760.getClass();
        synchronized (c2761) {
            try {
                m4746 = (z ? c2761.f10384 : c2761.f10389).m4746(bArr, i, i2);
                if (m4746 > 0) {
                    c2761.m4743(m4746, false);
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        if (m4746 == -1) {
            this.f10356 = true;
        }
        return m4746;
    }
}
