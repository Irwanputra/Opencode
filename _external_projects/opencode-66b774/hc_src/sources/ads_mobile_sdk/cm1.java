package ads_mobile_sdk;

import android.util.Base64;
import android.view.MotionEvent;
import dev.epro.r0.L16390669445741171034;
import dev.epro.r0.S14461012662136963693;
import dev.epro.r0.Y18228141026965703196;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class cm1 {
    public final Object a;
    public final wi0 b;
    public final v6 c;
    public final boolean d;

    public cm1(Object obj, wi0 wi0Var, v6 v6Var, boolean z) {
        this.a = obj;
        this.b = wi0Var;
        this.c = v6Var;
        this.d = z;
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.b.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, hashMap);
            v6 v6Var = this.c;
            v6Var.a.a(3003, System.currentTimeMillis() - currentTimeMillis, null, null);
            new S14461012662136963693().f(Boolean.TRUE);
        } catch (Exception e) {
            throw new wo3(2005, e);
        }
    }

    public final synchronized void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            v6 v6Var = this.c;
            v6Var.a.a(3001, System.currentTimeMillis() - currentTimeMillis, null, null);
            new S14461012662136963693().f(Boolean.TRUE);
        } catch (Exception e) {
            throw new wo3(2003, e);
        }
    }

    public static String a(byte[] bArr) {
        int i;
        if (bArr == null) {
            return null;
        }
        L16390669445741171034 o2 = le.o();
        o2.b();
        le leVar = (le) o2.b;
        leVar.getClass();
        leVar.encryptionMethod_ = Y18228141026965703196.a(5);
        i = leVar.bitField0_;
        leVar.bitField0_ = i | 4;
        qq a = sq.a(0, bArr, bArr.length);
        o2.b();
        ((le) o2.b).a(a);
        return Base64.encodeToString(((le) o2.a()).a(), 11);
    }

    public final synchronized byte[] a(HashMap hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.a(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, hashMap);
    }
}
