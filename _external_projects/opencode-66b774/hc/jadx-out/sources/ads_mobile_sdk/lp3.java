package ads_mobile_sdk;

import android.content.Context;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpConfig;
import dev.epro.r0.H5857976276688519753;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class lp3 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static final AtomicBoolean c = new AtomicBoolean(true);
    public static final AtomicBoolean d = new AtomicBoolean(true);
    public static final AtomicBoolean e = new AtomicBoolean(true);

    public static void a(Context context, Executor executor, boolean z, Set set, gq3 gq3Var) {
        context.getClass();
        if (!a.compareAndSet(false, true)) {
            if (gq3Var != null) {
                gq3Var.a.resumeWith(new xu0(new H5857976276688519753()));
                return;
            }
            return;
        }
        try {
            WebViewStartUpConfig.Builder builder = new WebViewStartUpConfig.Builder(executor);
            builder.setShouldRunUiThreadStartUpTasks(z);
            try {
                builder.setProfilesToLoadDuringStartup(set);
            } catch (Throwable unused) {
            }
            WebViewCompat.startUpWebView(context, builder.build(), new c7((Object) gq3Var, (byte) 16));
        } catch (Throwable unused2) {
            if (gq3Var != null) {
                gq3Var.a.resumeWith(new xu0(new H5857976276688519753()));
            }
        }
    }
}
