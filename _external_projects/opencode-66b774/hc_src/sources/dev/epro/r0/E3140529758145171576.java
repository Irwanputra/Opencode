package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final /* synthetic */ class E3140529758145171576 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    static {
        izmyclvb.oeynnivvrnts0(298);
    }

    public /* synthetic */ E3140529758145171576(Context context, Configuration configuration, B13729205492206812220 b13729205492206812220, boolean z, int i) {
        this.a = (byte) 4;
        bmfohxieyvqu(context, configuration, b13729205492206812220, z ? 1 : 0, i);
    }

    private native void bmfohxieyvqu(Context context, Configuration configuration, B13729205492206812220 b13729205492206812220, int i, int i2);

    private native void isuwhyxwnaiv(X8178024650992698151 x8178024650992698151, E6758797890281795541 e6758797890281795541, int i, D6962450040782876658 d6962450040782876658, int i2);

    private native void slzaejkapivj(boolean z, Object obj, S8977162183056139880 s8977162183056139880, Object obj2, int i, byte b);

    private native void watefrsvdiih(Object obj, boolean z, Object obj2, S8977162183056139880 s8977162183056139880, int i, byte b);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    public /* synthetic */ E3140529758145171576(X8178024650992698151 x8178024650992698151, E6758797890281795541 e6758797890281795541, boolean z, D6962450040782876658 d6962450040782876658, int i) {
        this.a = (byte) 0;
        isuwhyxwnaiv(x8178024650992698151, e6758797890281795541, z ? 1 : 0, d6962450040782876658, i);
    }

    public /* synthetic */ E3140529758145171576(Object obj, boolean z, Object obj2, S8977162183056139880 s8977162183056139880, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.f = s8977162183056139880;
        this.c = i;
        watefrsvdiih(obj, z, obj2, s8977162183056139880, i, b);
    }

    public /* synthetic */ E3140529758145171576(boolean z, Object obj, S8977162183056139880 s8977162183056139880, Object obj2, int i, byte b) {
        this.a = b;
        this.b = z;
        this.d = obj;
        this.e = s8977162183056139880;
        this.f = obj2;
        this.c = i;
        slzaejkapivj(z, obj, s8977162183056139880, obj2, i, b);
    }
}
