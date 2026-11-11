package p034.p035.p041;

import java.lang.reflect.Method;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1050 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Object f5489;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Object f5490;

    public RunnableC1050(Object obj, Object obj2) {
        this.f5489 = obj;
        this.f5490 = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = C1047.f5483;
            if (method != null) {
                method.invoke(this.f5489, this.f5490, Boolean.FALSE, "AppCompat recreation");
            } else {
                C1047.f5481.invoke(this.f5489, this.f5490, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
