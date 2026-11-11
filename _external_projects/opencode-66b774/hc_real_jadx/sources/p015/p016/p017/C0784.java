package p015.p016.p017;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p131.p155.p156.p157.C2098;

/* renamed from: いいにぽつ.〺つふすそ.くし〴〺ぅ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0784 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final String[] f5013 = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final ThreadLocal<StringBuilder> f5012 = new C0785();

    /* renamed from: いいにぽつ.〺つふすそ.くし〴〺ぅ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0785 extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder(8192);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static boolean m2107(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static StringBuilder m2108() {
        ThreadLocal<StringBuilder> threadLocal = f5012;
        StringBuilder sb = threadLocal.get();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            return sb;
        }
        StringBuilder sb2 = new StringBuilder(8192);
        threadLocal.set(sb2);
        return sb2;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean m2109(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m2113(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2110(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String m2111(Collection collection, String str) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(obj);
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static URL m2112(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            StringBuilder m4207 = C2098.m4207("/");
            m4207.append(url.getFile());
            url = new URL(protocol, host, port, m4207.toString());
        }
        return new URL(url, str);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static boolean m2113(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }
}
