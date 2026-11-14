package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1932759943349054292 extends dev.epro.r0.R11411706056986754302 {
    public final boolean c;
    public final dev.epro.r0.B16853324304735504143 d;
    public final android.os.Bundle e;
    public final java.lang.Integer f;

    public D1932759943349054292(android.content.Context context, android.os.Looper looper, dev.epro.r0.B16853324304735504143 b16853324304735504143, android.os.Bundle bundle, dev.epro.r0.U11179075180450893832 u11179075180450893832, dev.epro.r0.R3599537314284374589 r3599537314284374589) {
        super(context, looper, 44, b16853324304735504143, u11179075180450893832, r3599537314284374589);
        this.c = true;
        this.d = b16853324304735504143;
        this.e = bundle;
        this.f = (java.lang.Integer) b16853324304735504143.a;
    }

    public final android.os.IInterface b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        dev.epro.r0.Y4437331984189589023 y4437331984189589023QueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return y4437331984189589023QueryLocalInterface instanceof dev.epro.r0.Y4437331984189589023 ? y4437331984189589023QueryLocalInterface : new dev.epro.r0.Y4437331984189589023(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    public final java.lang.String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final java.lang.String d() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        dev.epro.r0.B16853324304735504143 b16853324304735504143 = this.d;
        boolean zEquals = getContext().getPackageName().equals((java.lang.String) b16853324304735504143.d);
        android.os.Bundle bundle = this.e;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (java.lang.String) b16853324304735504143.d);
        }
        return bundle;
    }

    public final boolean requiresSignIn() {
        return this.c;
    }
}
