package ads_mobile_sdk;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class np1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(ads_mobile_sdk.cu0 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.np1.a(ads_mobile_sdk.cu0, java.lang.StringBuilder, int):void");
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        char[] cArr;
        int i2;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = i;
        while (true) {
            cArr = a;
            i2 = 0;
            int i4 = 80;
            if (i3 <= 0) {
                break;
            }
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(cArr, 0, i4);
            i3 -= i4;
        }
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char cCharAt = str.charAt(i5);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            String string = (String) obj;
            String[] strArr = ke3.a;
            int length = string.length();
            StringBuilder sb3 = null;
            int i6 = 0;
            while (true) {
                if (i2 < length) {
                    char cCharAt2 = string.charAt(i2);
                    if (cCharAt2 > 127) {
                        string = ke3.a(string.getBytes(StandardCharsets.UTF_8));
                        break;
                    }
                    String str2 = ke3.a[cCharAt2];
                    if (str2 != null) {
                        if (sb3 == null) {
                            sb3 = new StringBuilder(length + 16);
                        }
                        if (i6 < i2) {
                            sb3.append((CharSequence) string, i6, i2);
                        }
                        sb3.append(str2);
                        i6 = i2 + 1;
                    }
                    i2++;
                } else if (sb3 != null) {
                    if (i6 < length) {
                        sb3.append((CharSequence) string, i6, length);
                    }
                    string = sb3.toString();
                }
            }
            sb.append(string);
            sb.append('\"');
            return;
        }
        if (obj instanceof sq) {
            sb.append(": \"");
            String[] strArr2 = ke3.a;
            sb.append(ke3.a(((sq) obj).c()));
            sb.append('\"');
            return;
        }
        if (obj instanceof cu0) {
            sb.append(" {");
            a((cu0) obj, sb, i + 2);
            sb.append("\n");
            while (i > 0) {
                int i7 = i > 80 ? 80 : i;
                sb.append(cArr, 0, i7);
                i -= i7;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i8 = i + 2;
            a(sb, i8, "key", entry.getKey());
            a(sb, i8, "value", entry.getValue());
            sb.append("\n");
            while (i > 0) {
                int i9 = i > 80 ? 80 : i;
                sb.append(cArr, 0, i9);
                i -= i9;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
