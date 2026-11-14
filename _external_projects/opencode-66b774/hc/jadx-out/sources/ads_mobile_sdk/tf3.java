package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.F354011078084083645;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.W5797197595347441198;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tf3 implements J4422749016291691854 {
    public final W5797197595347441198 a;
    public final y2 b;
    public final F354011078084083645 d;
    public final AtomicBoolean e;

    public tf3(W5797197595347441198 w5797197595347441198, y2 y2Var, of3 of3Var, F354011078084083645 f354011078084083645) {
        w5797197595347441198.getClass();
        y2Var.getClass();
        of3Var.getClass();
        f354011078084083645.getClass();
        this.a = w5797197595347441198;
        this.b = y2Var;
        this.d = f354011078084083645;
        this.e = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.J4422749016291691854
    public final void a(Context context, boolean z, boolean z2) {
        context.getClass();
        boolean andSet = this.e.getAndSet(true);
        W5797197595347441198 w5797197595347441198 = this.a;
        if (andSet) {
            xv.a("This ad has already been shown.", (Exception) null);
            zi3.a(w5797197595347441198, new qf3(this, null, (byte) 0));
            zi3.a(6, "The ad has already been shown", null);
        } else {
            try {
                this.d.a();
                throw null;
            } catch (Exception e) {
                zi3.a(4, "Mediation Fullscreen Ad failed to show.", e);
                zi3.a(w5797197595347441198, new qf3(this, null, (byte) 1));
            }
        }
    }
}
