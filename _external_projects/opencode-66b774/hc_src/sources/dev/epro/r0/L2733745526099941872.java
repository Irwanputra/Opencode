package dev.epro.r0;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L2733745526099941872 {
    public final P8646985343900033725 a;
    public final Locale b;
    public final C10288805116980491173 c;
    public final V697849047308847220 d;
    public final V697849047308847220 e;
    public final V697849047308847220 f;
    public final V697849047308847220 g;

    public L2733745526099941872(Long l, Long l2, P8646985343900033725 p8646985343900033725, int i, R14253319523827250490 r14253319523827250490, Locale locale) {
        G12426915514109744413 g;
        this.a = p8646985343900033725;
        this.b = locale;
        C10288805116980491173 a13307233295295107558 = Build.VERSION.SDK_INT >= 26 ? new A13307233295295107558(locale) : new C9446289436392976707(locale);
        this.c = a13307233295295107558;
        this.d = V4416135141588678913.t(r14253319523827250490);
        if (l2 != null) {
            g = a13307233295295107558.f(l2.longValue());
            if (!p8646985343900033725.c(g.a)) {
                g = a13307233295295107558.g(a13307233295295107558.h());
            }
        } else {
            g = a13307233295295107558.g(a13307233295295107558.h());
        }
        this.e = V4416135141588678913.t(g);
        L15314296645528043221 l15314296645528043221 = null;
        if (l != null) {
            L15314296645528043221 b = this.c.b(l.longValue());
            if (p8646985343900033725.c(b.a)) {
                l15314296645528043221 = b;
            }
        }
        this.f = V4416135141588678913.t(l15314296645528043221);
        this.g = V4416135141588678913.t(new C13297862214201274442(i));
    }

    public final int a() {
        return ((C13297862214201274442) this.g.getValue()).a;
    }

    public final Long b() {
        L15314296645528043221 l15314296645528043221 = (L15314296645528043221) this.f.getValue();
        if (l15314296645528043221 != null) {
            return Long.valueOf(l15314296645528043221.d);
        }
        return null;
    }
}
