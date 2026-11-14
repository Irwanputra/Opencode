package dev.epro.r0;

import android.content.Context;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q13081430806085358586 implements F4096073349764486348 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ResolveInfo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ long e;

    public /* synthetic */ Q13081430806085358586(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.a = context;
        this.b = resolveInfo;
        this.c = z;
        this.d = charSequence;
        this.e = j;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        M2066880349381062048.P.c(this.a, this.b, Boolean.valueOf(this.c), this.d, new F12478849263529740365(this.e));
        ((S9686291038205059113) obj).close();
        return O9245300239821758723.a;
    }
}
