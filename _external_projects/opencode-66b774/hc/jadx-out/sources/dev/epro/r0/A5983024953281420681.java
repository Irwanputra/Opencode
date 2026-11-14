package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A5983024953281420681 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    static {
        izmyclvb.oeynnivvrnts0(1088);
    }

    public /* synthetic */ A5983024953281420681(Context context, Configuration configuration, boolean z, B13729205492206812220 b13729205492206812220, J17313955498997451402 j17313955498997451402, B13729205492206812220 b137292054922068122202) {
        this.a = (byte) 4;
        vymotqbjiasl(context, configuration, z ? 1 : 0, b13729205492206812220, j17313955498997451402, b137292054922068122202);
    }

    private native void nctfquxpimec(B13729205492206812220 b13729205492206812220, int i, Integer num, List list, Set set, F4096073349764486348 f4096073349764486348);

    private native void qvpuvbkcpifa(boolean z, Object obj, Enum r3, Object obj2, Object obj3, Object obj4, byte b);

    private native void tbudnydtgzlk(X10333914069789306310 x10333914069789306310, I2786896214680236851 i2786896214680236851, Q3156151770218362234 q3156151770218362234, A13926996748493721892 a13926996748493721892, int i, A13926996748493721892 a139269967484937218922);

    private native void vymotqbjiasl(Context context, Configuration configuration, int i, B13729205492206812220 b13729205492206812220, J17313955498997451402 j17313955498997451402, B13729205492206812220 b137292054922068122202);

    private native void wlfiistdlxct(B13729205492206812220 b13729205492206812220, W1972671267364756056 w1972671267364756056, int i, String str, R6894569913291645384 r6894569913291645384, List list);

    @Override // dev.epro.r0.J12078565427869724451
    public final native Object invoke(Object obj, Object obj2, Object obj3);

    public /* synthetic */ A5983024953281420681(B13729205492206812220 b13729205492206812220, W1972671267364756056 w1972671267364756056, boolean z, String str, R6894569913291645384 r6894569913291645384, List list) {
        this.a = (byte) 2;
        wlfiistdlxct(b13729205492206812220, w1972671267364756056, z ? 1 : 0, str, r6894569913291645384, list);
    }

    public /* synthetic */ A5983024953281420681(B13729205492206812220 b13729205492206812220, boolean z, Integer num, List list, Set set, F4096073349764486348 f4096073349764486348) {
        this.a = (byte) 0;
        nctfquxpimec(b13729205492206812220, z ? 1 : 0, num, list, set, f4096073349764486348);
    }

    public /* synthetic */ A5983024953281420681(X10333914069789306310 x10333914069789306310, I2786896214680236851 i2786896214680236851, Q3156151770218362234 q3156151770218362234, A13926996748493721892 a13926996748493721892, boolean z, A13926996748493721892 a139269967484937218922) {
        this.a = (byte) 5;
        tbudnydtgzlk(x10333914069789306310, i2786896214680236851, q3156151770218362234, a13926996748493721892, z ? 1 : 0, a139269967484937218922);
    }

    public /* synthetic */ A5983024953281420681(boolean z, Object obj, Enum r3, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = r3;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        qvpuvbkcpifa(z, obj, r3, obj2, obj3, obj4, b);
    }
}
