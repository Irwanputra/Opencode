package dev.epro.r0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D1932759943349054292 extends R11411706056986754302 {
    public final boolean c;
    public final B16853324304735504143 d;
    public final Bundle e;
    public final Integer f;

    public D1932759943349054292(Context context, Looper looper, B16853324304735504143 b16853324304735504143, Bundle bundle, U11179075180450893832 u11179075180450893832, R3599537314284374589 r3599537314284374589) {
        super(context, looper, 44, b16853324304735504143, u11179075180450893832, r3599537314284374589);
        this.c = true;
        this.d = b16853324304735504143;
        this.e = bundle;
        this.f = (Integer) b16853324304735504143.a;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof Y4437331984189589023 ? (Y4437331984189589023) iInterfaceQueryLocalInterface : new Y4437331984189589023(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Bundle getGetServiceRequestExtraArgs() {
        B16853324304735504143 b16853324304735504143 = this.d;
        boolean zEquals = getContext().getPackageName().equals((String) b16853324304735504143.d);
        Bundle bundle = this.e;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) b16853324304735504143.d);
        }
        return bundle;
    }

    @Override // dev.epro.r0.E1636901823844057514, dev.epro.r0.N2113054325721141872
    public final boolean requiresSignIn() {
        return this.c;
    }
}
