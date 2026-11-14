package dev.epro.r0;

import java.io.OutputStream;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class X8298981708196595032 extends OutputStream implements AutoCloseable {
    public byte[] a;
    public int b;

    static {
        izmyclvb.qgayjvbiagej2(231);
    }

    private native void hdfkkoolyqtp(int i);

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    @Override // java.io.OutputStream
    public final native void write(int i);

    @Override // java.io.OutputStream
    public final native void write(byte[] bArr, int i, int i2);

    public X8298981708196595032(int i) {
        hdfkkoolyqtp(i);
    }
}
