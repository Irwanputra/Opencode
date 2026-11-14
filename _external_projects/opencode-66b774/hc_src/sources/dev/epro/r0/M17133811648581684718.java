package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M17133811648581684718 {
    public final S14461012662136963693 a = new S14461012662136963693();

    public final void a(Exception exc) {
        S14461012662136963693 s14461012662136963693 = this.a;
        M18113111391818111737.w("Exception must not be null", exc);
        synchronized (s14461012662136963693.a) {
            try {
                if (s14461012662136963693.c) {
                    return;
                }
                s14461012662136963693.c = true;
                s14461012662136963693.f = exc;
                s14461012662136963693.b.c(s14461012662136963693);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        S14461012662136963693 s14461012662136963693 = this.a;
        synchronized (s14461012662136963693.a) {
            try {
                if (s14461012662136963693.c) {
                    return;
                }
                s14461012662136963693.c = true;
                s14461012662136963693.e = obj;
                s14461012662136963693.b.c(s14461012662136963693);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
