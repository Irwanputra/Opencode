package p131.p135.p139;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ExecutorC2012 implements Executor {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Handler f8739 = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8739.post(runnable);
    }
}
