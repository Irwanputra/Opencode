package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x12 implements dev.epro.r0.G10308367458345557237 {
    public final android.content.Context a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final ads_mobile_sdk.ri d;
    public final java.util.Optional e;
    public final dev.epro.r0.O16637889491137121389 f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public final ads_mobile_sdk.w12 i;

    public x12(android.content.Context context, java.lang.String str, java.lang.String str2, ads_mobile_sdk.ri riVar, java.util.Optional optional, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        context.getClass();
        str.getClass();
        str2.getClass();
        riVar.getClass();
        optional.getClass();
        o16637889491137121389.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = riVar;
        this.e = optional;
        this.f = o16637889491137121389;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        ads_mobile_sdk.w12 w12Var = new ads_mobile_sdk.w12();
        w12Var.a = false;
        w12Var.d = 0L;
        w12Var.f = null;
        this.i = w12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r17) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x12.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final java.lang.Object b(ads_mobile_sdk.qo3 qo3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objA;
        boolean z = this.h.get() ? false : qo3Var.b;
        ads_mobile_sdk.w12 w12Var = this.i;
        w12Var.a = z;
        this.f.getClass();
        w12Var.d = android.os.SystemClock.elapsedRealtime();
        w12Var.f = qo3Var;
        return (this.g.get() && (objA = a(r4833348786910499294)) == dev.epro.r0.Z3437138737604933638.a) ? objA : dev.epro.r0.O9245300239821758723.a;
    }
}
