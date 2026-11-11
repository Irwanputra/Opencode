package org.jasypt.encryption.pbe;

import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class NumberUtils {
    private NumberUtils() {
    }

    public static byte[] byteArrayFromInt(int i) {
        byte b = (byte) (i & Base64.BASELENGTH);
        return new byte[]{(byte) ((i >> 24) & Base64.BASELENGTH), (byte) ((i >> 16) & Base64.BASELENGTH), (byte) ((i >> 8) & Base64.BASELENGTH), b};
    }

    public static int intFromByteArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array into an int");
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            i = (i << 8) | (bArr[i2] & 255);
        }
        return i;
    }

    private static int maxSafeSizeInBytes() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        return (int) (((maxMemory - Runtime.getRuntime().totalMemory()) + Runtime.getRuntime().freeMemory()) / 2);
    }

    public static byte[] processBigIntegerEncryptedByteArray(byte[] bArr, int i) {
        if (bArr.length <= 4) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[4];
        int length = bArr.length - 4;
        System.arraycopy(bArr, length, bArr2, 0, 4);
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        int intFromByteArray = intFromByteArray(bArr2);
        if (intFromByteArray < 0 || intFromByteArray > maxSafeSizeInBytes()) {
            throw new EncryptionOperationNotPossibleException();
        }
        if (length == intFromByteArray) {
            return bArr3;
        }
        int i2 = intFromByteArray - length;
        byte[] bArr4 = new byte[intFromByteArray];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr4[i3] = i >= 0 ? (byte) 0 : (byte) -1;
        }
        System.arraycopy(bArr3, 0, bArr4, i2, length);
        return bArr4;
    }
}
