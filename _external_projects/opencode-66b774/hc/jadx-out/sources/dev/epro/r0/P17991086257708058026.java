package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P17991086257708058026 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Configuration c;
    public final /* synthetic */ String d;

    static {
        izmyclvb.qgayjvbiagej2(1270);
    }

    private native void ibdczycvqtcg(Context context, Configuration configuration, String str, byte b);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    public /* synthetic */ P17991086257708058026(Context context, Configuration configuration, String str, byte b) {
        this.a = b;
        this.b = context;
        this.c = configuration;
        this.d = str;
        ibdczycvqtcg(context, configuration, str, b);
    }
}
