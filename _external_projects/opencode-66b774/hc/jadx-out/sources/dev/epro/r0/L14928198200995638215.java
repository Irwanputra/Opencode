package dev.epro.r0;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L14928198200995638215 {
    public static final byte[] a = new byte[0];
    public static final P12327795811052477724 b;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L14928198200995638215.<clinit>():void");
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbR = E12098517352909843120.r("length=", ", offset=", j);
            sbR.append(j2);
            sbR.append(", count=");
            sbR.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbR.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int c(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int d(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (M8927913404651150384.M(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
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

    public static final int f(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (S10823041268949770285.z(cCharAt, 31) <= 0 || S10823041268949770285.z(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int g(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int h(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] i(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
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
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean j(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int k(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int l(T13344602445187831655 t13344602445187831655) {
        return (t13344602445187831655.d() & 255) | ((t13344602445187831655.d() & 255) << 16) | ((t13344602445187831655.d() & 255) << 8);
    }

    public static final int m(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
