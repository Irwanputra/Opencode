package dev.epro.r0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H15005300928262499934 implements AutoCloseable {
    public static final int d = Math.min(32, Runtime.getRuntime().availableProcessors());
    public final byte[] a;
    public final MessageDigest b;
    public final ThreadPoolExecutor c;

    public H15005300928262499934(byte[] bArr) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        int i = d;
        this.c = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue, callerRunsPolicy);
        this.a = bArr;
        this.b = MessageDigest.getInstance("SHA-256");
    }

    public static ByteBuffer d(int i, int i2, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.limit(i2);
        byteBufferDuplicate.position(i);
        return byteBufferDuplicate.slice();
    }

    public final void b(B11059234153875532973 b11059234153875532973, Q13138685904306860250 q13138685904306860250) throws IOException {
        long size = b11059234153875532973.size();
        long j = 4095;
        long j2 = 4096;
        int i = (int) ((size + 4095) / 4096);
        final byte[][] bArr = new byte[i][];
        final Phaser phaser = new Phaser(1);
        final int i2 = 0;
        long j3 = 0;
        while (j3 < size) {
            int iMin = (int) (Math.min(4194304 + j3, size) - j3);
            long j4 = iMin;
            int i3 = (int) ((j4 + j) / j2);
            final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3 * 4096);
            b11059234153875532973.c(j3, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            Runnable runnable = new Runnable() { // from class: dev.epro.r0.S17986248839752494051
                @Override // java.lang.Runnable
                public final void run() {
                    MessageDigest messageDigest;
                    H15005300928262499934 h15005300928262499934 = this.a;
                    try {
                        try {
                            messageDigest = (MessageDigest) h15005300928262499934.b.clone();
                        } catch (NoSuchAlgorithmException e) {
                            throw new IllegalStateException("Failed to obtain an instance of a previously available message digest", e);
                        }
                    } catch (CloneNotSupportedException unused) {
                        messageDigest = MessageDigest.getInstance("SHA-256");
                    }
                    ByteBuffer byteBuffer = byteBufferAllocate;
                    int iCapacity = byteBuffer.capacity();
                    int i4 = i2;
                    int i5 = 0;
                    while (i5 < iCapacity) {
                        int i6 = i5 + 4096;
                        ByteBuffer byteBufferD = H15005300928262499934.d(i5, i6, byteBuffer);
                        messageDigest.reset();
                        byte[] bArr2 = h15005300928262499934.a;
                        if (bArr2 != null) {
                            messageDigest.update(bArr2);
                        }
                        messageDigest.update(byteBufferD);
                        bArr[i4] = messageDigest.digest();
                        i4++;
                        i5 = i6;
                    }
                    phaser.arriveAndDeregister();
                }
            };
            phaser.register();
            this.c.execute(runnable);
            i2 += i3;
            j3 += j4;
            j = 4095;
            j2 = 4096;
        }
        phaser.arriveAndAwaitAdvance();
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr2 = bArr[i4];
            q13138685904306860250.c(0, bArr2, bArr2.length);
        }
    }

    public final byte[] c(B11059234153875532973 b11059234153875532973, B11059234153875532973 b110592341538755329732, O16438938067373071790 o16438938067373071790) throws IOException {
        long j;
        long j2;
        B11059234153875532973 o164389380673730717902;
        int i = o16438938067373071790.b;
        long j3 = 4096;
        if (b11059234153875532973.size() % 4096 != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + b11059234153875532973.size());
        }
        long size = b11059234153875532973.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        o16438938067373071790.c(0L, i, byteBufferAllocate);
        byteBufferAllocate.flip();
        T3224757362656795885.o(byteBufferAllocate, size);
        F7255377512045419771 f7255377512045419771 = new F7255377512045419771(b11059234153875532973, b110592341538755329732, new O16438938067373071790(byteBufferAllocate, true));
        MessageDigest messageDigest = this.b;
        int digestLength = messageDigest.getDigestLength();
        ArrayList arrayList = new ArrayList();
        long j4 = f7255377512045419771.b;
        do {
            j = 4095;
            j2 = digestLength;
            j4 = ((j4 + 4095) / 4096) * j2;
            arrayList.add(Long.valueOf(((j4 + 4095) / 4096) * 4096));
        } while (j4 > 4096);
        int size2 = arrayList.size();
        int[] iArr = new int[size2 + 1];
        iArr[0] = 0;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 1;
            iArr[i3] = Math.toIntExact(((Long) arrayList.get((arrayList.size() - i2) - 1)).longValue()) + iArr[i2];
            i2 = i3;
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iArr[size2]);
        int i4 = size2 - 1;
        int i5 = i4;
        while (i5 >= 0) {
            long j5 = j3;
            int i6 = i5 + 1;
            long j6 = j;
            Q13138685904306860250 q13138685904306860250 = new Q13138685904306860250(d(iArr[i5], iArr[i6], byteBufferAllocate2), (byte) 1);
            if (i5 == i4) {
                b(f7255377512045419771, q13138685904306860250);
                o164389380673730717902 = f7255377512045419771;
            } else {
                ByteBuffer byteBufferD = d(iArr[i6], iArr[i5 + 2], byteBufferAllocate2.asReadOnlyBuffer());
                byteBufferD.getClass();
                o164389380673730717902 = new O16438938067373071790(byteBufferD, true);
                b(o164389380673730717902, q13138685904306860250);
            }
            int size3 = (int) ((((o164389380673730717902.size() + j6) / j5) * j2) % j5);
            if (size3 > 0) {
                int i7 = 4096 - size3;
                q13138685904306860250.c(0, new byte[i7], i7);
            }
            i5--;
            j = j6;
            j3 = j5;
        }
        ByteBuffer byteBufferD2 = d(0, 4096, byteBufferAllocate2.asReadOnlyBuffer());
        messageDigest.reset();
        byte[] bArr = this.a;
        if (bArr != null) {
            messageDigest.update(bArr);
        }
        messageDigest.update(byteBufferD2);
        return messageDigest.digest();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.shutdownNow();
    }
}
