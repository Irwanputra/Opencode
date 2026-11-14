package dev.epro.r0;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X4856437766232407902 {
    public static final /* synthetic */ int a = 0;

    static {
        new U13433193494567181400();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(FileInputStream fileInputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = fileInputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return a(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (fileInputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
