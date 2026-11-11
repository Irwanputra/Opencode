package p131.p161.p211.p214.p215.p216;

import java.util.TimeZone;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ざっざへづ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2601 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final TimeZone f10010 = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date m4599(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p214.p215.p216.C2601.m4599(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m4600(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                StringBuilder m4207 = C2098.m4207("Invalid number: ");
                m4207.append(str.substring(i, i2));
                throw new NumberFormatException(m4207.toString());
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                StringBuilder m42072 = C2098.m4207("Invalid number: ");
                m42072.append(str.substring(i, i2));
                throw new NumberFormatException(m42072.toString());
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4601(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
