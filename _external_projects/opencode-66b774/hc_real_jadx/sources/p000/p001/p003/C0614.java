package p000.p001.p003;

import java.util.regex.Pattern;
import p000.C0712;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぁごぐすすぃ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0614 {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static boolean m1771(C0712 c0712) {
        if (c0712.f4753.f4246.equals("HEAD")) {
            return false;
        }
        int i = c0712.f4761;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && m1773(c0712) == -1) {
            String m1743 = c0712.f4754.m1743("Transfer-Encoding");
            if (m1743 == null) {
                m1743 = null;
            }
            if (!"chunked".equalsIgnoreCase(m1743)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m1772(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static long m1773(C0712 c0712) {
        String m1743 = c0712.f4754.m1743("Content-Length");
        if (m1743 != null) {
            try {
                return Long.parseLong(m1743);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static int m1774(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f3, code lost:
    
        if (r13 != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0204, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0202, code lost:
    
        if (r13 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01c2, code lost:
    
        if ((r0.equals(r10) || (r0.endsWith(r10) && r0.charAt((r0.length() - r10.length()) - 1) == '.' && !p000.p001.C0629.f4344.matcher(r0).matches())) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00df, code lost:
    
        if (r20 <= 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0301  */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1775(p000.InterfaceC0590 r34, p000.C0698 r35, p000.C0597 r36) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p003.C0614.m1775(〳ぜぞぜべっ.いいにぽつ, 〳ぜぞぜべっ.ざとぅぼこ〺, 〳ぜぞぜべっ.ぉざぅち〻):void");
    }
}
