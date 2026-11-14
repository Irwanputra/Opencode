package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A3977949523195115163 extends dev.epro.r0.R7033599853981556291 {
    public final /* synthetic */ dev.epro.r0.N16333696292855081967 u;

    public A3977949523195115163(dev.epro.r0.N16333696292855081967 n16333696292855081967) {
        this.u = n16333696292855081967;
    }

    public final void G(java.lang.Throwable th) {
        this.u.a.f(th);
    }

    public final void H(dev.epro.r0.J15730374346044043770 j15730374346044043770) {
        dev.epro.r0.N16333696292855081967 n16333696292855081967 = this.u;
        n16333696292855081967.c = j15730374346044043770;
        dev.epro.r0.J15730374346044043770 j157303743460440437702 = n16333696292855081967.c;
        dev.epro.r0.D3638978315442423989 d3638978315442423989 = n16333696292855081967.a;
        n16333696292855081967.b = new dev.epro.r0.Q7316561721656982910(j157303743460440437702, d3638978315442423989.g, d3638978315442423989.i, android.os.Build.VERSION.SDK_INT >= 34 ? dev.epro.r0.E5787395939262799002.a() : dev.epro.r0.O5354877807466160604.S());
        dev.epro.r0.D3638978315442423989 d36389783154424239892 = n16333696292855081967.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        d36389783154424239892.a.writeLock().lock();
        try {
            d36389783154424239892.c = (byte) 1;
            arrayList.addAll(d36389783154424239892.b);
            d36389783154424239892.b.clear();
            d36389783154424239892.a.writeLock().unlock();
            d36389783154424239892.d.post(new dev.epro.r0.B2550074485188857304(arrayList, d36389783154424239892.c, null));
        } catch (java.lang.Throwable th) {
            d36389783154424239892.a.writeLock().unlock();
            throw th;
        }
    }
}
