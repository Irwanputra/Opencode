package com.trilead.ssh2.crypto;

import java.io.CharArrayWriter;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Base64 {
    public static final char[] alphabet = Crypt.a(Crypt.xrc("N7mAjm\u001ea>\u001e6fAb<MfkM69M19Idl\u001b79MfhKeiNj>Kk:\u001c7=Nd;\u00194f\u00193:N`=\u001a`n@jmM4nK`<OdmK`9\u001cjm\u001d6jKg;M1:H7mH6kJfgN3o\u001e0:\u001c7gK4h\u001abn\u001aejA1lLfnA1j@6n\u001bkmM4oO3<Ab9@0nA1g\u001ddkKjnHf:\u001ac:M4>K")).toCharArray();

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] decode(char[] r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.crypto.Base64.decode(char[]):byte[]");
    }

    public static char[] encode(byte[] bArr) {
        CharArrayWriter charArrayWriter = new CharArrayWriter((bArr.length * 4) / 3);
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
