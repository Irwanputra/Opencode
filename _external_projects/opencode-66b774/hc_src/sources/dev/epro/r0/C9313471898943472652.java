package dev.epro.r0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C9313471898943472652 implements Supplier {
    public final B11059234153875532973[] a;
    public final int[] b;
    public final int c;
    public final AtomicInteger d;

    public C9313471898943472652(B11059234153875532973[] b11059234153875532973Arr) {
        this.a = b11059234153875532973Arr;
        this.b = new int[b11059234153875532973Arr.length];
        int i = 0;
        for (int i2 = 0; i2 < b11059234153875532973Arr.length; i2++) {
            long size = (b11059234153875532973Arr[i2].size() + 1048575) / 1048576;
            if (size > 2147483647L) {
                throw new RuntimeException(String.format("Number of chunks in dataSource[%d] is greater than max int.", Integer.valueOf(i2)));
            }
            this.b[i2] = (int) size;
            i = (int) (i + size);
        }
        this.c = i;
        this.d = new AtomicInteger(0);
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y16414919402539525744 get() {
        B11059234153875532973[] b11059234153875532973Arr;
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
        int min = (int) Math.min(b11059234153875532973Arr[i].size() - j3, 1048576L);
        ByteBuffer allocate = ByteBuffer.allocate(min);
        try {
            b11059234153875532973Arr[i].c(j3, min, allocate);
            allocate.rewind();
            return new Y16414919402539525744(andIncrement, min, allocate);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read chunk", e);
        }
    }

    public final /* synthetic */ Y16414919402539525744 b(ByteBuffer byteBuffer) {
        B11059234153875532973[] b11059234153875532973Arr;
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
        int min = (int) Math.min(b11059234153875532973Arr[i].size() - j3, 1048576L);
        if (byteBuffer.capacity() >= min) {
            byteBuffer.clear();
            byteBuffer.limit(min);
        } else {
            byteBuffer = ByteBuffer.allocate(min);
        }
        try {
            b11059234153875532973Arr[i].c(j3, min, byteBuffer);
            byteBuffer.rewind();
            return new Y16414919402539525744(andIncrement, min, byteBuffer);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read chunk", e);
        }
    }
}
