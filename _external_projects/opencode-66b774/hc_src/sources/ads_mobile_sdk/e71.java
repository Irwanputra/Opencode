package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import dev.epro.r0.A16798789777035163011;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.M4353767700798623786;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X16868335726098211378;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class e71 implements B8427392651679410143 {
    public final rg0 a;
    public final V2597580950516131749 b;
    public final V2597580950516131749 c;
    public final V2597580950516131749 d;
    public final hb1 e;
    public final V2597580950516131749 f;
    public final /* synthetic */ byte g = 0;
    public final V2597580950516131749 h;
    public final hb1 i;

    public e71(rg0 rg0Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, hb1 hb1Var, V2597580950516131749 v25975809505161317494, V2597580950516131749 v25975809505161317495, hb1 hb1Var2) {
        this.a = rg0Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.e = hb1Var;
        this.f = v25975809505161317494;
        this.h = v25975809505161317495;
        this.i = hb1Var2;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.g;
        V2597580950516131749 v2597580950516131749 = this.h;
        V2597580950516131749 v25975809505161317492 = this.f;
        V2597580950516131749 v25975809505161317493 = this.d;
        V2597580950516131749 v25975809505161317494 = this.c;
        hb1 hb1Var = this.i;
        hb1 hb1Var2 = this.e;
        rg0 rg0Var = this.a;
        V2597580950516131749 v25975809505161317495 = this.b;
        switch (b) {
            case 0:
                w81 w81Var = (w81) rg0Var.get();
                qw2 qw2Var = (qw2) v25975809505161317495.get();
                Optional optional = (Optional) v25975809505161317494.get();
                String str = (String) v25975809505161317493.get();
                boolean booleanValue = ((Boolean) hb1Var2.a).booleanValue();
                O16637889491137121389 o16637889491137121389 = (O16637889491137121389) v25975809505161317492.get();
                X16868335726098211378 x16868335726098211378 = X16868335726098211378.c;
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                A16798789777035163011 a16798789777035163011 = F14240031463097426304.i;
                int i = F14240031463097426304.k;
                int i2 = F14240031463097426304.l;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayList.add(new AndroidBundleTypeAdapterFactory());
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = M4353767700798623786.a;
                HashMap hashMap2 = new HashMap(hashMap);
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                return new b71(w81Var, qw2Var, optional, str, booleanValue, o16637889491137121389, new F14240031463097426304(x16868335726098211378, 1, hashMap2, false, a16798789777035163011, arrayList3, i, i2, new ArrayList(arrayDeque)), (jr0) v2597580950516131749.get(), (Optional) hb1Var.a);
            default:
                return new i82((G8001132634698687269) v25975809505161317495.get(), (W5797197595347441198) rg0Var.get(), (I16631908410500040363) hb1Var2.a, (z1) hb1Var.a, (x52) v25975809505161317494.get(), (it1) v25975809505161317493.get(), (jr0) v25975809505161317492.get(), (z03) v2597580950516131749.get());
        }
    }

    public e71(V2597580950516131749 v2597580950516131749, rg0 rg0Var, hb1 hb1Var, hb1 hb1Var2, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, V2597580950516131749 v25975809505161317494, V2597580950516131749 v25975809505161317495) {
        this.b = v2597580950516131749;
        this.a = rg0Var;
        this.e = hb1Var;
        this.i = hb1Var2;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.f = v25975809505161317494;
        this.h = v25975809505161317495;
    }
}
