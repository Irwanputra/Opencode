package dev.epro.r0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O16438938067373071790 implements B11059234153875532973 {
    public final ByteBuffer a;
    public final int b;

    public O16438938067373071790(ByteBuffer byteBuffer, boolean z) {
        this.a = z ? byteBuffer.slice() : byteBuffer;
        this.b = byteBuffer.remaining();
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void a(long j, long j2, P14572820171047441271 p14572820171047441271) {
        int i = this.b;
        if (j2 >= 0 && j2 <= i) {
            p14572820171047441271.b(b((int) j2, j));
            return;
        }
        throw new IndexOutOfBoundsException("size: " + j2 + ", source size: " + i);
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final ByteBuffer b(int i, long j) {
        ByteBuffer byteBufferSlice;
        long j2 = i;
        int i2 = this.b;
        if (j < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j, "offset: "));
            return null;
        }
        if (j2 < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j2, "size: "));
            return null;
        }
        long j3 = i2;
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + i2 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            W4415201450379021245.a(L11610354117192841236.p(j2, ") overflow", E12098517352909843120.r("offset (", ") + size (", j)));
            return null;
        }
        if (j4 > j3) {
            StringBuilder sbR = E12098517352909843120.r("offset (", ") + size (", j);
            sbR.append(j2);
            sbR.append(") > source size (");
            sbR.append(i2);
            sbR.append(")");
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        int i3 = (int) j;
        int i4 = i + i3;
        synchronized (this.a) {
            this.a.position(0);
            this.a.limit(i4);
            this.a.position(i3);
            byteBufferSlice = this.a.slice();
        }
        return byteBufferSlice;
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        byteBuffer.put(b(i, j));
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final long size() {
        return this.b;
    }
}
