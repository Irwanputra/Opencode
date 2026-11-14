package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N3336634644320470588 implements G10797274810599614742 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public N3336634644320470588(int i, float f, X16625187937554653603 x16625187937554653603) {
        this.b = x16625187937554653603;
        this.c = new P6024466796603310388(i);
        this.d = new O15319392248629494012(f);
        this.f = new L16987758992765039378(i, 30, 100);
    }

    public void a(B6867906687934285025 b6867906687934285025) {
        Z102412548944701279 z102412548944701279 = (Z102412548944701279) ((X12014589167171900524) this.f).j.get((H9807528374655572032) this.c);
        if (z102412548944701279 != null) {
            M18113111391818111737.t(z102412548944701279.m.m);
            N2113054325721141872 n2113054325721141872 = z102412548944701279.b;
            String name = n2113054325721141872.getClass().getName();
            String strValueOf = String.valueOf(b6867906687934285025);
            n2113054325721141872.disconnect(G6547577305291411977.w(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
            z102412548944701279.l(b6867906687934285025, null);
        }
    }

    @Override // dev.epro.r0.G10797274810599614742
    public void i(B6867906687934285025 b6867906687934285025) {
        ((X12014589167171900524) this.f).m.post(new I3863025946240164840((Object) this, (Object) b6867906687934285025, false, (byte) 18));
    }

    public N3336634644320470588(X12014589167171900524 x12014589167171900524, N2113054325721141872 n2113054325721141872, H9807528374655572032 h9807528374655572032) {
        this.f = x12014589167171900524;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = n2113054325721141872;
        this.c = h9807528374655572032;
    }
}
