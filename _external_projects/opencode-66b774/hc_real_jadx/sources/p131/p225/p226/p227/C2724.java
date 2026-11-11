package p131.p225.p226.p227;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p131.p225.p226.p227.AbstractC2713;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2724 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Collection<AbstractC2723<PublicKey, PrivateKey>> f10215;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2725());
        try {
            KeyFactory.getInstance(Crypt.a(Crypt.xrc("Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j")));
            arrayList.add(new AbstractC2713.C2719());
            arrayList.add(new AbstractC2713.C2715());
            arrayList.add(new AbstractC2713.C2714());
        } catch (GeneralSecurityException unused) {
        }
        arrayList.add(new C2701());
        arrayList.add(new C2720());
        f10215 = Collections.unmodifiableCollection(arrayList);
    }
}
