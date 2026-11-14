package dev.epro.r0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H9499724100374326526 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
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
        b(i, sb);
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
            A10473301933203002473 a10473301933203002473 = A10473301933203002473.c;
            sb.append(L12240044716294895599.q(new A10473301933203002473(((String) obj).getBytes(W16701142256148280421.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof A10473301933203002473) {
            sb.append(": \"");
            sb.append(L12240044716294895599.q((A10473301933203002473) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof I10827619964430248728) {
            sb.append(" {");
            c((I10827619964430248728) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(dev.epro.r0.I10827619964430248728 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H9499724100374326526.c(dev.epro.r0.I10827619964430248728, java.lang.StringBuilder, int):void");
    }
}
