package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class dx1 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ ads_mobile_sdk.xu0 a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(ads_mobile_sdk.xu0 xu0Var, java.lang.String str, double d, int i, int i2) {
        super(0);
        this.a = xu0Var;
        this.b = str;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), (android.graphics.Bitmap) this.a.b);
        android.net.Uri uri = android.net.Uri.parse(this.b);
        uri.getClass();
        return new ads_mobile_sdk.wf1(bitmapDrawable, uri, this.c, this.d, this.e);
    }
}
