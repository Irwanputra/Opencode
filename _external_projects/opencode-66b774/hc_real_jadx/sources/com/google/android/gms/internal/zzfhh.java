package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfhh {
    public static String zza(zzfhe zzfheVar, String str) {
        StringBuilder m4179 = C2098.m4179("# ", str);
        zza(zzfheVar, m4179, 0);
        return m4179.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x017c, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
    
        if (((java.lang.Integer) r9).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        if (((java.lang.Double) r9).doubleValue() == 0.0d) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.zzfhe r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhh.zza(com.google.android.gms.internal.zzfhe, java.lang.StringBuilder, int):void");
    }

    public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzfih.zzbc(zzfes.zztr((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzfes) {
            sb.append(": \"");
            sb.append(zzfih.zzbc((zzfes) obj));
            sb.append('\"');
        } else {
            if (!(obj instanceof zzffu)) {
                sb.append(": ");
                sb.append(obj.toString());
                return;
            }
            sb.append(" {");
            zza((zzffu) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        }
    }

    private static final String zztv(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
