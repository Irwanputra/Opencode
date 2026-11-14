package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cm1 {
    public final java.lang.Object a;
    public final ads_mobile_sdk.wi0 b;
    public final ads_mobile_sdk.v6 c;
    public final boolean d;

    public cm1(java.lang.Object obj, ads_mobile_sdk.wi0 wi0Var, ads_mobile_sdk.v6 v6Var, boolean z) {
        this.a = obj;
        this.b = wi0Var;
        this.c = v6Var;
        this.d = z;
    }

    public final synchronized void a(android.view.MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.b.getClass();
            java.util.HashMap map = new java.util.HashMap();
            map.put("t", new java.lang.Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", java.util.Map.class).invoke(this.a, map);
            ads_mobile_sdk.v6 v6Var = this.c;
            v6Var.a.a(3003, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            new dev.epro.r0.S14461012662136963693().f(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            throw new ads_mobile_sdk.wo3(2005, e);
        }
    }

    public final synchronized void a() {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            ads_mobile_sdk.v6 v6Var = this.c;
            v6Var.a.a(3001, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            new dev.epro.r0.S14461012662136963693().f(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            throw new ads_mobile_sdk.wo3(2003, e);
        }
    }

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        dev.epro.r0.L16390669445741171034 l16390669445741171034O = ads_mobile_sdk.le.o();
        l16390669445741171034O.b();
        ads_mobile_sdk.le leVar = (ads_mobile_sdk.le) l16390669445741171034O.b;
        leVar.getClass();
        leVar.encryptionMethod_ = dev.epro.r0.Y18228141026965703196.a(5);
        leVar.bitField0_ |= 4;
        ads_mobile_sdk.qq qqVarA = ads_mobile_sdk.sq.a(0, bArr, bArr.length);
        l16390669445741171034O.b();
        ((ads_mobile_sdk.le) l16390669445741171034O.b).a(qqVarA);
        return android.util.Base64.encodeToString(((ads_mobile_sdk.le) l16390669445741171034O.a()).a(), 11);
    }

    public final synchronized byte[] a(java.util.HashMap map) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
        } catch (java.lang.Exception e) {
            this.c.a(2007, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", java.util.Map.class, java.util.Map.class).invoke(this.a, null, map);
    }
}
