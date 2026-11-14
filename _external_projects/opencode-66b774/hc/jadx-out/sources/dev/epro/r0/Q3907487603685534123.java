package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q3907487603685534123 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Configuration c;
    public final /* synthetic */ int d;

    static {
        izmyclvb.qgayjvbiagej2(382);
    }

    private native void zcxtkqreuiok(Context context, Configuration configuration, int i, byte b);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    public /* synthetic */ Q3907487603685534123(Context context, Configuration configuration, int i, byte b) {
        this.a = b;
        this.b = context;
        this.c = configuration;
        this.d = i;
        zcxtkqreuiok(context, configuration, i, b);
    }
}
