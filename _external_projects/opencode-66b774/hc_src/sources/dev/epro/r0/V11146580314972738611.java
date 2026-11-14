package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V11146580314972738611 implements U16443665883761795894 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ V11146580314972738611(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new Z1085125311131623997((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return U1554499319261669842.q((L12639328004344855510) obj);
            case 3:
                return (Iterator) obj;
            default:
                return new R17739948736946712447((CharSequence) obj);
        }
    }
}
