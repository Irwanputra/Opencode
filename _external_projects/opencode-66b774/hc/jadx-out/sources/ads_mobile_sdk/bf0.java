package ads_mobile_sdk;

import android.app.Activity;
import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends K14749510448791472029 {
    public Object a;
    public Closeable b;
    public Closeable c;
    public Activity d;
    public ArrayList e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ rf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(rf0 rf0Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.j = rf0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
