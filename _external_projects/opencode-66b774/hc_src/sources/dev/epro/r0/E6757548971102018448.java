package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E6757548971102018448 extends R15896830329318850690 implements V6844203142031704410 {

    /* renamed from: o, reason: collision with root package name */
    public final D5961215468735357278 f228o;
    public boolean p;
    public boolean q;
    public boolean r;

    public E6757548971102018448(D5961215468735357278 d5961215468735357278) {
        this.f228o = d5961215468735357278;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        n17396598995248644478.a();
        N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        if (this.p) {
            L17598299826319227431.B(n17396598995248644478, U10174709222559481877.b(0.3f, U10174709222559481877.b), 0L, n16536369055082677148.e(), 0.0f, 122);
        } else if (this.q || this.r) {
            L17598299826319227431.B(n17396598995248644478, U10174709222559481877.b(0.1f, U10174709222559481877.b), 0L, n16536369055082677148.e(), 0.0f, 122);
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        R7033599853981556291.E(V0(), null, null, new G16212247282630895364(this, null, (byte) 3), 3);
    }
}
