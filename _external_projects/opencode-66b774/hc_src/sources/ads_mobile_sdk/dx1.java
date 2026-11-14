package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.P9893650590651797888;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class dx1 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ xu0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(xu0 xu0Var, String str, double d, int i, int i2) {
        super(0);
        this.a = xu0Var;
        this.b = str;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), (Bitmap) this.a.b);
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        return new wf1(bitmapDrawable, parse, this.c, this.d, this.e);
    }
}
