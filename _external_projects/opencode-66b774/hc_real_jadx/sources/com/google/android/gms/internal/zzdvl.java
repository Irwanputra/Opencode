package com.google.android.gms.internal;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdvl {
    private static zzdvm zzmag;
    private static int zzmah;

    public static final class zza extends zzdvm {
        @Override // com.google.android.gms.internal.zzdvm
        public final void zza(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        @Override // com.google.android.gms.internal.zzdvm
        public final void zza(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zzbqm()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.zzdvq r2 = new com.google.android.gms.internal.zzdvq     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L43
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.zzdvp r2 = new com.google.android.gms.internal.zzdvp     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L43
        L24:
            com.google.android.gms.internal.zzdvl$zza r2 = new com.google.android.gms.internal.zzdvl$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.zzdvl$zza> r3 = com.google.android.gms.internal.zzdvl.zza.class
            java.lang.String r3 = r3.getName()
            r3.length()
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.zzdvl$zza r2 = new com.google.android.gms.internal.zzdvl$zza
            r2.<init>()
        L43:
            com.google.android.gms.internal.zzdvl.zzmag = r2
            if (r1 != 0) goto L48
            goto L4c
        L48:
            int r0 = r1.intValue()
        L4c:
            com.google.android.gms.internal.zzdvl.zzmah = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdvl.<clinit>():void");
    }

    public static void zza(Throwable th, PrintStream printStream) {
        zzmag.zza(th, printStream);
    }

    public static void zza(Throwable th, PrintWriter printWriter) {
        zzmag.zza(th, printWriter);
    }

    private static Integer zzbqm() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
}
