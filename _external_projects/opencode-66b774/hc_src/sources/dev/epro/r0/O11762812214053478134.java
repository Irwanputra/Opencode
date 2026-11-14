package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class O11762812214053478134 extends T8346709655775060714 implements B10350247327218861320 {
    public final R4833348786910499294 d;

    public O11762812214053478134(R4833348786910499294 r4833348786910499294, G8001132634698687269 g8001132634698687269) {
        super(g8001132634698687269, true);
        this.d = r4833348786910499294;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final boolean R() {
        return true;
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.d;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public void t(Object obj) {
        J8045362843799184672.q0(E18444280280170001567.H(this.d), Q13169198992966610970.l0(obj));
    }

    @Override // dev.epro.r0.U4020053660465689583
    public void w(Object obj) {
        this.d.resumeWith(Q13169198992966610970.l0(obj));
    }
}
