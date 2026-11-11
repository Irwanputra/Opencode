package p000.p001.p008;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import p000.p001.C0629;
import p131.p155.p156.p157.C2098;
import p243.C2801;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0677 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C2801 f4539 = C2801.m4843("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final String[] f4537 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final String[] f4538 = new String[64];

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final String[] f4540 = new String[NotificationCompat.FLAG_LOCAL_ONLY];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f4540;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C0629.m1820("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f4538;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f4538;
            strArr3[i4 | 8] = C2098.m4198(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f4538;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f4538;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = C2098.m4198(sb, strArr5[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f4538;
            if (i >= strArr6.length) {
                return;
            }
            if (strArr6[i] == null) {
                strArr6[i] = f4540[i];
            }
            i++;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static IllegalArgumentException m1919(String str, Object... objArr) {
        throw new IllegalArgumentException(C0629.m1820(str, objArr));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static IOException m1920(String str, Object... objArr) {
        throw new IOException(C0629.m1820(str, objArr));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m1921(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String str3;
        String[] strArr = f4537;
        String m1820 = b < strArr.length ? strArr[b] : C0629.m1820("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            str = "";
        } else {
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : f4540[b2];
                } else if (b != 7 && b != 8) {
                    String[] strArr2 = f4538;
                    String str4 = b2 < strArr2.length ? strArr2[b2] : f4540[b2];
                    if (b == 5 && (b2 & 4) != 0) {
                        str2 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (b != 0 || (b2 & 32) == 0) {
                        str = str4;
                    } else {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str4.replace(str2, str3);
                }
            }
            str = f4540[b2];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = m1820;
        objArr[4] = str;
        return C0629.m1820("%s 0x%08x %5d %-13s %s", objArr);
    }
}
