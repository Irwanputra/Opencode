package p000.p001;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.jasypt.digest.StandardStringDigester;
import p000.AbstractC0592;
import p000.AbstractC0719;
import p000.C0698;
import p000.C0709;
import p131.p155.p156.p157.C2098;
import p243.C2801;
import p243.C2803;
import p243.C2819;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0629 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C2801 f4340;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final String[] f4341 = new String[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C2801 f4342;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final Charset f4343;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final Pattern f4344;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final Comparator<String> f4345;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final AbstractC0592 f4346;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final byte[] f4347;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C2801 f4348;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final Charset f4349;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C2801 f4350;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final Charset f4351;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C2801 f4352;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final TimeZone f4353;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final Charset f4354;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final Charset f4355;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0630 implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        f4347 = bArr;
        C2819 c2819 = new C2819();
        c2819.m4924(bArr);
        f4346 = new C0709(null, bArr.length, c2819);
        AbstractC0719.m1979(null, bArr);
        f4352 = C2801.m4841("efbbbf");
        f4348 = C2801.m4841("feff");
        f4350 = C2801.m4841("fffe");
        f4342 = C2801.m4841("0000ffff");
        f4340 = C2801.m4841("ffff0000");
        f4354 = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);
        Charset.forName("ISO-8859-1");
        f4343 = Charset.forName("UTF-16BE");
        f4355 = Charset.forName("UTF-16LE");
        f4349 = Charset.forName("UTF-32BE");
        f4351 = Charset.forName("UTF-32LE");
        f4353 = TimeZone.getTimeZone("GMT");
        f4345 = new C0630();
        f4344 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r7 == 16) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r8 != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    @javax.annotation.Nullable
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress m1803(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.C0629.m1803(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d1, code lost:
    
        return null;
     */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1804(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.C0629.m1804(java.lang.String):java.lang.String");
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static String m1805(String str, int i, int i2) {
        int m1818 = m1818(str, i, i2);
        return str.substring(m1818, m1823(str, m1818, i2));
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static int m1806(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static int m1807(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static <T> List<T> m1808(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static int m1809(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static <T> List<T> m1810(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m1811(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(C2098.m4205(str, " < 0"));
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(C2098.m4205(str, " too large."));
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(C2098.m4205(str, " too small."));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AssertionError m1812(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static boolean m1813(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static boolean m1814(InterfaceC2827 interfaceC2827, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long mo4858 = interfaceC2827.mo1761().mo4860() ? interfaceC2827.mo1761().mo4858() - nanoTime : Long.MAX_VALUE;
        interfaceC2827.mo1761().mo4862(Math.min(mo4858, timeUnit.toNanos(i)) + nanoTime);
        try {
            C2819 c2819 = new C2819();
            while (interfaceC2827.mo1762(c2819, 8192L) != -1) {
                c2819.m4921();
            }
            C2803 mo1761 = interfaceC2827.mo1761();
            if (mo4858 == Long.MAX_VALUE) {
                mo1761.mo4859();
            } else {
                mo1761.mo4862(nanoTime + mo4858);
            }
            return true;
        } catch (InterruptedIOException unused) {
            C2803 mo17612 = interfaceC2827.mo1761();
            if (mo4858 == Long.MAX_VALUE) {
                mo17612.mo4859();
            } else {
                mo17612.mo4862(nanoTime + mo4858);
            }
            return false;
        } catch (Throwable th) {
            C2803 mo17613 = interfaceC2827.mo1761();
            if (mo4858 == Long.MAX_VALUE) {
                mo17613.mo4859();
            } else {
                mo17613.mo4862(nanoTime + mo4858);
            }
            throw th;
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static String[] m1815(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m1816(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static boolean m1817(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static int m1818(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m1819(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m1821(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static String m1820(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static boolean m1821(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m1822(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static int m1823(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static String m1824(C0698 c0698, boolean z) {
        String m4198 = c0698.f4650.contains(":") ? C2098.m4198(C2098.m4207("["), c0698.f4650, "]") : c0698.f4650;
        if (!z && c0698.f4648 == C0698.m1954(c0698.f4647)) {
            return m4198;
        }
        StringBuilder m4179 = C2098.m4179(m4198, ":");
        m4179.append(c0698.f4648);
        return m4179.toString();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static int m1825(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static boolean m1826(InterfaceC2827 interfaceC2827, int i, TimeUnit timeUnit) {
        try {
            return m1814(interfaceC2827, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }
}
