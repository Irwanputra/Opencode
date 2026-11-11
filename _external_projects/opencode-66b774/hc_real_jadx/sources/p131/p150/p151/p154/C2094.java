package p131.p150.p151.p154;

import java.io.File;
import p131.p150.p151.C2085;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺふねづ〺.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2094 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final /* synthetic */ int f8896 = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m4173() {
        StringBuilder sb = new StringBuilder();
        if (C2085.f8887 == null) {
            try {
                throw new C2093("Initialize CrashReporter : call CrashReporter.initialize(context, crashReportPath)");
            } catch (Exception unused) {
            }
        }
        sb.append(C2085.f8887.getExternalFilesDir(null).getAbsolutePath());
        String m4198 = C2098.m4198(sb, File.separator, "crashReports");
        new File(m4198).mkdirs();
        return m4198;
    }
}
