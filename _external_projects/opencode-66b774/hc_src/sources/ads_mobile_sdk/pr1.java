package ads_mobile_sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import dev.epro.r0.K14749510448791472029;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pr1 extends K14749510448791472029 {
    public rr1 a;
    public Activity b;
    public Window c;
    public ViewGroup d;
    public lu e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rr1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(rr1 rr1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.l = rr1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return rr1.a(this.l, (Map) null, this);
    }
}
