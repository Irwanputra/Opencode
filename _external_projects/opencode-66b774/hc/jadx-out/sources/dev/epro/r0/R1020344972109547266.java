package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R1020344972109547266 extends V7723538628475019968 {
    public final /* synthetic */ H13521189488363841561 j;
    public final /* synthetic */ T4056244775750501969 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1020344972109547266(T4056244775750501969 t4056244775750501969, T4056244775750501969 t40562447757505019692, H13521189488363841561 h13521189488363841561) {
        super(t40562447757505019692);
        this.k = t4056244775750501969;
        this.j = h13521189488363841561;
    }

    @Override // dev.epro.r0.V7723538628475019968
    public final Y1226494281320458288 b() {
        return this.j;
    }

    @Override // dev.epro.r0.V7723538628475019968
    public final boolean c() {
        T4056244775750501969 t4056244775750501969 = this.k;
        if (t4056244775750501969.getInternalPopup().b()) {
            return true;
        }
        t4056244775750501969.f.m(t4056244775750501969.getTextDirection(), t4056244775750501969.getTextAlignment());
        return true;
    }
}
