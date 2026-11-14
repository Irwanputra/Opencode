package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X354568553596380848 extends T5853297761459116769 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X354568553596380848(B13729205492206812220 b13729205492206812220, byte b) {
        super(b13729205492206812220);
        this.b = b;
    }

    @Override // dev.epro.r0.T5853297761459116769
    public final P11507981277033739248 a(Object obj) {
        switch (this.b) {
            case 0:
                return new P11507981277033739248(this, obj, obj == null, B14824868959299866349.s, null, true);
            default:
                return new P11507981277033739248(this, obj, obj == null, null, null, false);
        }
    }
}
