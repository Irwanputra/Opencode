package dev.epro.r0;

import android.content.Context;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final /* synthetic */ class I1028588507671512824 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    static {
        izmyclvb.dpqpjfpoanwt1(177);
    }

    private native void kweslisbvnxj(Context context, Object obj, Object obj2, byte b);

    private native void nkclgmrwvvom(F4096073349764486348 f4096073349764486348, List list, Context context);

    private native void shyxeipszgvd(Object obj, Object obj2, Object obj3, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ I1028588507671512824(F4096073349764486348 f4096073349764486348, List list, Context context) {
        this.a = (byte) 19;
        nkclgmrwvvom(f4096073349764486348, list, context);
    }

    public /* synthetic */ I1028588507671512824(Context context, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = context;
        this.b = obj;
        this.d = obj2;
        kweslisbvnxj(context, obj, obj2, b);
    }

    public /* synthetic */ I1028588507671512824(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        shyxeipszgvd(obj, obj2, obj3, b);
    }
}
