package dev.epro.r0;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F7255377512045419771 implements B11059234153875532973 {
    public final B11059234153875532973[] a;
    public final long b;

    public F7255377512045419771(B11059234153875532973... b11059234153875532973Arr) {
        this.a = b11059234153875532973Arr;
        this.b = Arrays.stream(b11059234153875532973Arr).mapToLong(new J3469544282146543415()).sum();
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void a(long j, long j2, P14572820171047441271 p14572820171047441271) {
        P14572820171047441271 p145728201710474412712;
        if (j + j2 > this.b) {
            W4415201450379021245.a("Requested more than available");
            return;
        }
        B11059234153875532973[] b11059234153875532973Arr = this.a;
        int length = b11059234153875532973Arr.length;
        int i = 0;
        long size = j;
        long j3 = j2;
        while (i < length) {
            B11059234153875532973 b11059234153875532973 = b11059234153875532973Arr[i];
            if (size >= b11059234153875532973.size()) {
                size -= b11059234153875532973.size();
                p145728201710474412712 = p14572820171047441271;
            } else {
                long size2 = b11059234153875532973.size() - size;
                if (size2 >= j3) {
                    b11059234153875532973.a(size, j3, p14572820171047441271);
                    return;
                }
                p145728201710474412712 = p14572820171047441271;
                b11059234153875532973.a(size, size2, p145728201710474412712);
                j3 -= size2;
                size = 0;
            }
            i++;
            p14572820171047441271 = p145728201710474412712;
        }
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final ByteBuffer b(int i, long j) {
        long j2 = i;
        long j3 = j + j2;
        long j4 = this.b;
        if (j3 > j4) {
            W4415201450379021245.a("Requested more than available");
            return null;
        }
        int i2 = 0;
        long size = j;
        while (true) {
            B11059234153875532973[] b11059234153875532973Arr = this.a;
            if (i2 >= b11059234153875532973Arr.length) {
                StringBuilder sbR = E12098517352909843120.r("Access is out of bound, offset: ", ", totalSize: ", j);
                sbR.append(j4);
                throw new IndexOutOfBoundsException(sbR.toString());
            }
            if (size < b11059234153875532973Arr[i2].size()) {
                C16290937579972779475 c16290937579972779475 = new C16290937579972779475(Integer.valueOf(i2), Long.valueOf(size));
                int iIntValue = ((Integer) c16290937579972779475.a).intValue();
                long jLongValue = ((Long) c16290937579972779475.b).longValue();
                if (j2 + jLongValue <= b11059234153875532973Arr[iIntValue].size()) {
                    return b11059234153875532973Arr[iIntValue].b(i, jLongValue);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                while (iIntValue < b11059234153875532973Arr.length && byteBufferAllocate.hasRemaining()) {
                    b11059234153875532973Arr[iIntValue].c(jLongValue, Math.toIntExact(Math.min(b11059234153875532973Arr[iIntValue].size() - jLongValue, byteBufferAllocate.remaining())), byteBufferAllocate);
                    iIntValue++;
                    jLongValue = 0;
                }
                byteBufferAllocate.rewind();
                return byteBufferAllocate;
            }
            size -= b11059234153875532973Arr[i2].size();
            i2++;
        }
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final void c(long j, int i, ByteBuffer byteBuffer) {
        a(j, i, new Q13138685904306860250(byteBuffer, (byte) 1));
    }

    @Override // dev.epro.r0.B11059234153875532973
    public final long size() {
        return this.b;
    }
}
