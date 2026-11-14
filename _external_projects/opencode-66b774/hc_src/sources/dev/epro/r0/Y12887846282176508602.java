package dev.epro.r0;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y12887846282176508602 implements B11059234153875532973 {
    public final FileChannel a;
    public final long b;
    public final long c;

    public Y12887846282176508602(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j2, "offset: "));
            throw null;
        }
        if (j2 < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j2, "size: "));
            throw null;
        }
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    public static void d(long j, long j2, long j3) {
        if (j < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j, "offset: "));
            return;
        }
        if (j2 < 0) {
            W4415201450379021245.a(E12098517352909843120.k(j2, "size: "));
            return;
        }
        if (j > j3) {
            W4415201450379021245.a(L11610354117192841236.p(j3, ")", E12098517352909843120.r("offset (", ") > source size (", j)));
            return;
        }
        long j4 = j + j2;
        if (j4 < j) {
            W4415201450379021245.a(L11610354117192841236.p(j2, ") overflow", E12098517352909843120.r("offset (", ") + size (", j)));
            return;
        }
        if (j4 <= j3) {
            return;
        }
        StringBuilder r = E12098517352909843120.r("offset (", ") + size (", j);
        r.append(j2);
        r.append(") > source size (");
        r.append(j3);
        r.append(")");
        throw new IndexOutOfBoundsException(r.toString());
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void a(long j, long j2, P14572820171047441271 p14572820171047441271) {
        d(j, j2, size());
        if (j2 == 0) {
            return;
        }
        long j3 = this.b + j;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) Math.min(j2, 1048576L));
        long j4 = j3;
        long j5 = j2;
        while (j5 > 0) {
            int min = (int) Math.min(j5, allocateDirect.capacity());
            allocateDirect.limit(min);
            synchronized (this.a) {
                try {
                    this.a.position(j4);
                    int i = min;
                    while (i > 0) {
                        int read = this.a.read(allocateDirect);
                        if (read < 0) {
                            throw new IOException("Unexpected EOF encountered");
                        }
                        i -= read;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            allocateDirect.flip();
            p14572820171047441271.b(allocateDirect);
            allocateDirect.clear();
            long j6 = min;
            j4 += j6;
            j5 -= j6;
        }
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final ByteBuffer b(int i, long j) {
        if (i < 0) {
            W4415201450379021245.a(G6547577305291411977.n(i, "size: "));
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        c(j, i, allocate);
        allocate.flip();
        return allocate;
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        int read;
        d(j, i, size());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.b + j;
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.a) {
                    this.a.position(j2);
                    read = this.a.read(byteBuffer);
                }
                j2 += read;
                i -= read;
            }
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public final B11059234153875532973 e(long j, long j2) {
        long size = size();
        d(j, j2, size);
        if (j == 0 && j2 == size) {
            return this;
        }
        return new Y12887846282176508602(this.a, this.b + j, j2);
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final long size() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public Y12887846282176508602(FileChannel fileChannel) {
        this.a = fileChannel;
        this.b = 0L;
        this.c = -1L;
    }
}
