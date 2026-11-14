package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D7088593984817477773 implements dev.epro.r0.A18195026813295081326 {
    public final dev.epro.httpcustom.MainActivity a;
    public final dev.epro.httpcustom.MainActivity b;
    public volatile dev.epro.r0.T9166720469304402137 c;
    public final java.lang.Object d = new java.lang.Object();

    public D7088593984817477773(dev.epro.httpcustom.MainActivity mainActivity) {
        this.a = mainActivity;
        this.b = mainActivity;
    }

    @Override // dev.epro.r0.A18195026813295081326
    public final java.lang.Object d() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        dev.epro.httpcustom.MainActivity mainActivity = this.a;
                        dev.epro.r0.Y3135070733400213774 y3135070733400213774 = new dev.epro.r0.Y3135070733400213774(this.b, (byte) 0);
                        dev.epro.r0.L3530692241870850490 l3530692241870850490I = mainActivity.i();
                        dev.epro.r0.L14576235570718031614 l14576235570718031614P = dev.epro.r0.S12227320117525376577.p(mainActivity);
                        l14576235570718031614P.getClass();
                        dev.epro.r0.J15730374346044043770 j15730374346044043770 = new dev.epro.r0.J15730374346044043770(l3530692241870850490I, y3135070733400213774, l14576235570718031614P);
                        dev.epro.r0.V6281043481934004271 v6281043481934004271A = dev.epro.r0.J17975719213314763068.a(dev.epro.r0.B3196377865273576410.class);
                        java.lang.String strB = v6281043481934004271A.b();
                        if (strB == null) {
                            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.c = ((dev.epro.r0.B3196377865273576410) j15730374346044043770.L(v6281043481934004271A, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
