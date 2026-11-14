package dev.epro.r0;

import ads_mobile_sdk.jq;
import ads_mobile_sdk.sq;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class L8361547894089146393 extends sq {
    public abstract boolean a(sq sqVar, int i, int i2);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jq(this);
    }
}
