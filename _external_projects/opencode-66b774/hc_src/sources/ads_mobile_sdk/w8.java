package ads_mobile_sdk;

import dev.epro.r0.B12268161065087441760;
import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class w8 implements K4548097313143615345 {
    public final Object a;

    public w8(yu yuVar) {
        byte[] bArr = rb1.a;
        this.a = yuVar;
        yuVar.a = this;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public cw0 mo19a() {
        return cw0.AD_TYPE;
    }

    public void b(int i, G18207276409179303092 g18207276409179303092, Object obj) {
        g gVar = (g) obj;
        yu yuVar = (yu) this.a;
        yuVar.g(i, 2);
        yuVar.m(gVar.a(g18207276409179303092));
        g18207276409179303092.a((Object) gVar, this);
    }

    @Override // dev.epro.r0.K4548097313143615345
    public Object d(R4833348786910499294 r4833348786910499294) {
        Set set = (Set) this.a;
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((qw2) it.next()).a);
        }
        return new xu0(new v8(arrayList));
    }

    public w8(B12268161065087441760 b12268161065087441760) {
        this.a = b12268161065087441760;
    }

    public w8(Set set) {
        set.getClass();
        this.a = set;
    }
}
