package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V11296664775587403736 implements Iterable, D14639766352081121636 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ V11296664775587403736(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new Z1085125311131623997((Object[]) obj);
            case 1:
                return new G2215898220892222614((Iterator) ((B13729205492206812220) obj).invoke());
            default:
                return new G12653093637352814222((Y10296912117440622376) obj);
        }
    }
}
