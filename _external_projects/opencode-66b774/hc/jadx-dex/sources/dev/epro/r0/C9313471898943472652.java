package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9313471898943472652 implements java.util.function.Supplier {
    public final dev.epro.r0.B11059234153875532973[] a;
    public final int[] b;
    public final int c;
    public final java.util.concurrent.atomic.AtomicInteger d;

    public C9313471898943472652(dev.epro.r0.B11059234153875532973[] b11059234153875532973Arr) {
        this.a = b11059234153875532973Arr;
        this.b = new int[b11059234153875532973Arr.length];
        int i = 0;
        for (int i2 = 0; i2 < b11059234153875532973Arr.length; i2++) {
            long size = (b11059234153875532973Arr[i2].size() + 1048575) / 1048576;
            if (size > 2147483647L) {
                throw new java.lang.RuntimeException(java.lang.String.format("Number of chunks in dataSource[%d] is greater than max int.", java.lang.Integer.valueOf(i2)));
            }
            this.b[i2] = (int) size;
            i = (int) (((long) i) + size);
        }
        this.c = i;
        this.d = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.function.Supplier
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.Y16414919402539525744 get() {
        dev.epro.r0.B11059234153875532973[] b11059234153875532973Arr;
        int andIncrement = this.d.getAndIncrement();
        if (andIncrement < 0 || andIncrement >= this.c) {
            return null;
        }
        long j = andIncrement;
        int i = 0;
        while (true) {
            b11059234153875532973Arr = this.a;
            if (i >= b11059234153875532973Arr.length) {
                break;
            }
            long j2 = this.b[i];
            if (j < j2) {
                break;
            }
            j -= j2;
            i++;
        }
        long j3 = j * 1048576;
        int iMin = (int) java.lang.Math.min(b11059234153875532973Arr[i].size() - j3, 1048576L);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iMin);
        try {
            b11059234153875532973Arr[i].c(j3, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            return new dev.epro.r0.Y16414919402539525744(andIncrement, iMin, byteBufferAllocate);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Failed to read chunk", e);
        }
    }

    public final /* synthetic */ dev.epro.r0.Y16414919402539525744 b(java.nio.ByteBuffer byteBuffer) {
        dev.epro.r0.B11059234153875532973[] b11059234153875532973Arr;
        int andIncrement = this.d.getAndIncrement();
        if (andIncrement < 0 || andIncrement >= this.c) {
            return null;
        }
        long j = andIncrement;
        int i = 0;
        while (true) {
            b11059234153875532973Arr = this.a;
            if (i >= b11059234153875532973Arr.length) {
                break;
            }
            long j2 = this.b[i];
            if (j < j2) {
                break;
            }
            j -= j2;
            i++;
        }
        long j3 = j * 1048576;
        int iMin = (int) java.lang.Math.min(b11059234153875532973Arr[i].size() - j3, 1048576L);
        if (byteBuffer.capacity() >= iMin) {
            byteBuffer.clear();
            byteBuffer.limit(iMin);
        } else {
            byteBuffer = java.nio.ByteBuffer.allocate(iMin);
        }
        try {
            b11059234153875532973Arr[i].c(j3, iMin, byteBuffer);
            byteBuffer.rewind();
            return new dev.epro.r0.Y16414919402539525744(andIncrement, iMin, byteBuffer);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Failed to read chunk", e);
        }
    }
}
