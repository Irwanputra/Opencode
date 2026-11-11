package p131.p225.p226.p233;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.へぬ〴づぞ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2773 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Logger f10423;

    public C2773(Class cls) {
        this.f10423 = Logger.getLogger(cls.getName());
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4753(int i, String str, Throwable th) {
        this.f10423.log(i <= 20 ? Level.FINE : i <= 50 ? Level.FINER : Level.FINEST, str, th);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4754(int i, String str) {
        this.f10423.log(i <= 20 ? Level.FINE : i <= 50 ? Level.FINER : Level.FINEST, str);
    }
}
