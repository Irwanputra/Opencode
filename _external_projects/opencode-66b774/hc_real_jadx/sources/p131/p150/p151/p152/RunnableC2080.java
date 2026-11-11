package p131.p150.p151.p152;

import android.text.TextUtils;
import com.balsikandar.crashreporter.ui.CrashReporterActivity;
import java.io.File;
import p131.p150.p151.p153.C2089;
import p131.p150.p151.p154.C2094;
import p131.p150.p151.p154.C2097;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.いいにぽつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2080 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ CrashReporterActivity f8882;

    /* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.いいにぽつ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2081 implements Runnable {
        public RunnableC2081() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2083 c2083 = RunnableC2080.this.f8882.f2006.f8893;
            C2089 c2089 = c2083.f8886;
            if (c2089 != null) {
                c2089.f8889 = c2083.m4172();
                c2089.f1556.m810();
            }
        }
    }

    public RunnableC2080(CrashReporterActivity crashReporterActivity) {
        this.f8882 = crashReporterActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (File file : new File(TextUtils.isEmpty(null) ? C2094.m4173() : null).listFiles()) {
            C2097.m4174(file);
        }
        this.f8882.runOnUiThread(new RunnableC2081());
    }
}
