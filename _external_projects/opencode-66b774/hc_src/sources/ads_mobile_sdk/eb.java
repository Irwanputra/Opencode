package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;
import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class eb extends K14749510448791472029 {
    public sb a;
    public th3 c;
    public Closeable d;
    public Object e;
    public Serializable f;
    public Object g;
    public H15186625828076266306 h;
    public /* synthetic */ Object k;
    public final /* synthetic */ sb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(sb sbVar, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.l = sbVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return sb.a(this.l, this);
    }
}
