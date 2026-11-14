package dev.epro.r0;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R699288991908320557 implements P14572820171047441271, Closeable {
    public final P14572820171047441271 a;
    public Inflater b = new Inflater(true);
    public byte[] c;
    public byte[] d;
    public long e;
    public boolean f;

    public R699288991908320557(P14572820171047441271 p14572820171047441271) {
        this.a = p14572820171047441271;
    }

    @Override // dev.epro.r0.P14572820171047441271
    public final void b(ByteBuffer byteBuffer) {
        if (this.f) {
            S10973172697741180971.m("Closed");
            return;
        }
        if (byteBuffer.hasArray()) {
            c(byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (this.d == null) {
            this.d = new byte[65536];
        }
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(byteBuffer.remaining(), this.d.length);
            byteBuffer.get(this.d, 0, min);
            c(0, this.d, min);
        }
    }

    @Override // dev.epro.r0.P14572820171047441271
    public final void c(int i, byte[] bArr, int i2) {
        if (this.f) {
            S10973172697741180971.m("Closed");
            return;
        }
        this.b.setInput(bArr, i, i2);
        if (this.c == null) {
            this.c = new byte[65536];
        }
        while (!this.b.finished()) {
            try {
                int inflate = this.b.inflate(this.c);
                if (inflate == 0) {
                    return;
                }
                this.a.c(0, this.c, inflate);
                this.e += inflate;
            } catch (DataFormatException e) {
                Z3383101362411723454.q("Failed to inflate data", e);
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
        this.d = null;
        this.c = null;
        Inflater inflater = this.b;
        if (inflater != null) {
            inflater.end();
            this.b = null;
        }
    }
}
