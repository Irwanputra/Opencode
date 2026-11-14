package dev.epro.r0;

import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T8548489830177605674 extends InputStream {
    public final C16667689525325095505 a;
    public boolean b = false;
    public final boolean c;

    public T8548489830177605674(C16667689525325095505 c16667689525325095505, boolean z) {
        this.a = c16667689525325095505;
        this.c = z;
    }

    @Override // java.io.InputStream
    public final int available() {
        int a;
        if (!this.b) {
            C16667689525325095505 c16667689525325095505 = this.a;
            I13897573759869141187 i13897573759869141187 = c16667689525325095505.b;
            boolean z = this.c;
            i13897573759869141187.getClass();
            synchronized (c16667689525325095505) {
                try {
                    Q7316561721656982910 q7316561721656982910 = z ? c16667689525325095505.e : c16667689525325095505.d;
                    a = ((R11747310517775341069) q7316561721656982910.c).a();
                    if (a <= 0) {
                        a = ((C16667689525325095505) q7316561721656982910.d).p ? -1 : 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (a > 0) {
                return a;
            }
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int K;
        int i4;
        int i5;
        bArr.getClass();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.b) {
            return -1;
        }
        C16667689525325095505 c16667689525325095505 = this.a;
        I13897573759869141187 i13897573759869141187 = c16667689525325095505.b;
        boolean z = this.c;
        i13897573759869141187.getClass();
        synchronized (c16667689525325095505) {
            try {
                try {
                    K = (z ? c16667689525325095505.e : c16667689525325095505.d).K(bArr, i, i2);
                    if (K > 0) {
                        if (K > 0) {
                            synchronized (c16667689525325095505) {
                                try {
                                    int i6 = c16667689525325095505.l;
                                    int i7 = c16667689525325095505.a;
                                    if (i6 <= (i7 * 3) / 4) {
                                        int a = (i7 - ((R11747310517775341069) c16667689525325095505.d.c).a()) - ((R11747310517775341069) c16667689525325095505.e.c).a();
                                        int i8 = c16667689525325095505.l;
                                        i4 = a - i8;
                                        if (i4 > 0) {
                                            c16667689525325095505.l = i8 + i4;
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    i5 = c16667689525325095505.g;
                                } finally {
                                }
                            }
                            if (i4 > 0) {
                                synchronized (c16667689525325095505.h) {
                                    try {
                                        byte[] bArr2 = c16667689525325095505.j;
                                        bArr2[0] = 93;
                                        bArr2[1] = (byte) (i5 >> 24);
                                        bArr2[2] = (byte) (i5 >> 16);
                                        bArr2[3] = (byte) (i5 >> 8);
                                        bArr2[4] = (byte) i5;
                                        bArr2[5] = (byte) (i4 >> 24);
                                        bArr2[6] = (byte) (i4 >> 16);
                                        bArr2[7] = (byte) (i4 >> 8);
                                        bArr2[8] = (byte) i4;
                                        if (!c16667689525325095505.i) {
                                            c16667689525325095505.b.b.m(bArr2);
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            } finally {
            }
        }
        if (K == -1) {
            this.b = true;
        }
        return K;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
