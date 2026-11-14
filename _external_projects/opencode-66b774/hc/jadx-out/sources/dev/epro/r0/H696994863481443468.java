package dev.epro.r0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H696994863481443468 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
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
            B15200565448991586841 b15200565448991586841 = B15200565448991586841.c;
            sb.append(T8598786036980488824.g(new B15200565448991586841(((String) obj).getBytes(X10245771154555039797.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof B15200565448991586841) {
            sb.append(": \"");
            sb.append(T8598786036980488824.g((B15200565448991586841) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof K17275736824900228431) {
            sb.append(" {");
            c((K17275736824900228431) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(dev.epro.r0.K17275736824900228431 r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H696994863481443468.c(dev.epro.r0.K17275736824900228431, java.lang.StringBuilder, int):void");
    }
}
