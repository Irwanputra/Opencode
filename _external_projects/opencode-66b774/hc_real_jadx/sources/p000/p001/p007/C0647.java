package p000.p001.p007;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0647 extends RuntimeException {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Method f4401;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public IOException f4402;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f4401 = method;
    }

    public C0647(IOException iOException) {
        super(iOException);
        this.f4402 = iOException;
    }
}
