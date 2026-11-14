package ads_mobile_sdk;

import android.app.Activity;
import android.net.Uri;
import dev.epro.r0.K14749510448791472029;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f92 extends K14749510448791472029 {
    public m92 a;
    public Map b;
    public tx0 c;
    public String d;
    public Activity e;
    public Uri f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ m92 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f92(m92 m92Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.l = m92Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, false, false, false, null, this);
    }
}
