package dev.epro.r0;

import android.content.Context;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final /* synthetic */ class F16149516508942115248 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    static {
        izmyclvb.dpqpjfpoanwt1(508);
    }

    private native void dmepvrovvhlk(int i, Context context, I13907030117767724470 i13907030117767724470);

    private native void iwtbmfkcddlz(Object obj, Object obj2, boolean z, byte b);

    private native void lyqdixgnfquy(Object obj, boolean z, Object obj2, byte b);

    private native void uxlbarbihtws(W1972671267364756056 w1972671267364756056, int i, F4096073349764486348 f4096073349764486348);

    private native void yuottkbxxqdw(boolean z, Object obj, Object obj2, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ F16149516508942115248(W1972671267364756056 w1972671267364756056, boolean z, F4096073349764486348 f4096073349764486348) {
        this.a = (byte) 8;
        uxlbarbihtws(w1972671267364756056, z ? 1 : 0, f4096073349764486348);
    }

    public /* synthetic */ F16149516508942115248(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        iwtbmfkcddlz(obj, obj2, z, b);
    }

    public /* synthetic */ F16149516508942115248(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        lyqdixgnfquy(obj, z, obj2, b);
    }

    public /* synthetic */ F16149516508942115248(boolean z, A2558500182237595544 a2558500182237595544, Context context, I13907030117767724470 i13907030117767724470) {
        this.a = (byte) 2;
        dmepvrovvhlk(z ? 1 : 0, context, i13907030117767724470);
    }

    public /* synthetic */ F16149516508942115248(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        yuottkbxxqdw(z, obj, obj2, b);
    }
}
