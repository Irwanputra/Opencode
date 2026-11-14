package dev.epro.r0;

import dev.epro.httpcustom.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D7088593984817477773 implements A18195026813295081326 {
    public final MainActivity a;
    public final MainActivity b;
    public volatile T9166720469304402137 c;
    public final Object d = new Object();

    public D7088593984817477773(MainActivity mainActivity) {
        this.a = mainActivity;
        this.b = mainActivity;
    }

    @Override // dev.epro.r0.A18195026813295081326
    public final Object d() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        MainActivity mainActivity = this.a;
                        Y3135070733400213774 y3135070733400213774 = new Y3135070733400213774(this.b, (byte) 0);
                        L3530692241870850490 l3530692241870850490I = mainActivity.i();
                        L14576235570718031614 l14576235570718031614P = S12227320117525376577.p(mainActivity);
                        l14576235570718031614P.getClass();
                        J15730374346044043770 j15730374346044043770 = new J15730374346044043770(l3530692241870850490I, y3135070733400213774, l14576235570718031614P);
                        V6281043481934004271 v6281043481934004271A = J17975719213314763068.a(B3196377865273576410.class);
                        String strB = v6281043481934004271A.b();
                        if (strB == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.c = ((B3196377865273576410) j15730374346044043770.L(v6281043481934004271A, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
