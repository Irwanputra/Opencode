package dev.epro.r0;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L13631305552474926529 {
    public final N1214788596583503619 a;
    public final M9197813449740923653 b;
    public final V5252629055842691065 c;
    public final boolean d;
    public final List e;
    public int f;
    public final ArrayList g;

    public L13631305552474926529(N1214788596583503619 n1214788596583503619, M9197813449740923653 m9197813449740923653, V5252629055842691065 v5252629055842691065, boolean z) {
        List<Proxy> listSelect;
        List listK;
        m9197813449740923653.getClass();
        this.a = n1214788596583503619;
        this.b = m9197813449740923653;
        this.c = v5252629055842691065;
        this.d = z;
        this.e = O2161699089510411363.a;
        this.g = new ArrayList();
        P10208541982779414550 p10208541982779414550 = n1214788596583503619.h;
        v5252629055842691065.d.getClass();
        URI uriG = p10208541982779414550.g();
        if (uriG.getHost() == null) {
            listK = C14766148968941961570.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            try {
                listSelect = n1214788596583503619.g.select(uriG);
            } catch (IllegalArgumentException unused) {
                listSelect = null;
            }
            listK = (listSelect == null || listSelect.isEmpty()) ? C14766148968941961570.k(new Proxy[]{Proxy.NO_PROXY}) : C14766148968941961570.j(listSelect);
        }
        this.e = listK;
        this.f = 0;
        Q16536459847538462718 q16536459847538462718 = this.c.d;
        List list = this.e;
        q16536459847538462718.getClass();
        list.getClass();
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.g.isEmpty();
    }
}
