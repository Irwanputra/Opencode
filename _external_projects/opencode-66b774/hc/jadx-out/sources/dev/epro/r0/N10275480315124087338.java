package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N10275480315124087338 extends H7219028874700587498 {
    public final U4020053660465689583 i;

    public N10275480315124087338(R4833348786910499294 r4833348786910499294, U4020053660465689583 u4020053660465689583) {
        super(1, r4833348786910499294);
        this.i = u4020053660465689583;
    }

    @Override // dev.epro.r0.H7219028874700587498
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // dev.epro.r0.H7219028874700587498
    public final Throwable q(U4020053660465689583 u4020053660465689583) {
        Throwable thC;
        Object objM = this.i.M();
        return (!(objM instanceof G5200290475234668330) || (thC = ((G5200290475234668330) objM).c()) == null) ? objM instanceof T13610764347093379131 ? ((T13610764347093379131) objM).a : u4020053660465689583.o() : thC;
    }
}
