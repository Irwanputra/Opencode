package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class Base64 {
    static final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] decode(char[] r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.crypto.Base64.decode(char[]):byte[]");
    }

    public static char[] encode(byte[] bArr) {
        java.io.CharArrayWriter charArrayWriter = new java.io.CharArrayWriter((bArr.length * 4) / 3);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i2 = i == 0 ? (bArr[i3] & 255) << 16 : i2 | (i == 1 ? (bArr[i3] & 255) << 8 : bArr[i3] & 255);
            i++;
            if (i == 3) {
                char[] cArr = alphabet;
                charArrayWriter.write(cArr[i2 >> 18]);
                charArrayWriter.write(cArr[(i2 >> 12) & 63]);
                charArrayWriter.write(cArr[(i2 >> 6) & 63]);
                charArrayWriter.write(cArr[i2 & 63]);
                i = 0;
            }
        }
        if (i == 1) {
            char[] cArr2 = alphabet;
            charArrayWriter.write(cArr2[i2 >> 18]);
            charArrayWriter.write(cArr2[(i2 >> 12) & 63]);
            charArrayWriter.write(61);
            charArrayWriter.write(61);
        }
        if (i == 2) {
            char[] cArr3 = alphabet;
            charArrayWriter.write(cArr3[i2 >> 18]);
            charArrayWriter.write(cArr3[(i2 >> 12) & 63]);
            charArrayWriter.write(cArr3[(i2 >> 6) & 63]);
            charArrayWriter.write(61);
        }
        return charArrayWriter.toCharArray();
    }
}
