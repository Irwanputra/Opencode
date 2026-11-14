package ads_mobile_sdk;

import android.util.Base64;
import android.view.MotionEvent;
import dev.epro.r0.L16390669445741171034;
import dev.epro.r0.S14461012662136963693;
import dev.epro.r0.Y18228141026965703196;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.b.getClass();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, map);
            v6 v6Var = this.c;
            v6Var.a.a(3003, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            new S14461012662136963693().f(Boolean.TRUE);
        } catch (Exception e) {
            throw new wo3(2005, e);
        }
    }

    public final synchronized void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            v6 v6Var = this.c;
            v6Var.a.a(3001, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            new S14461012662136963693().f(Boolean.TRUE);
        } catch (Exception e) {
            throw new wo3(2003, e);
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        L16390669445741171034 l16390669445741171034O = le.o();
        l16390669445741171034O.b();
        le leVar = (le) l16390669445741171034O.b;
        leVar.getClass();
        leVar.encryptionMethod_ = Y18228141026965703196.a(5);
        leVar.bitField0_ |= 4;
        qq qqVarA = sq.a(0, bArr, bArr.length);
        l16390669445741171034O.b();
        ((le) l16390669445741171034O.b).a(qqVarA);
        return Base64.encodeToString(((le) l16390669445741171034O.a()).a(), 11);
    }

    public final synchronized byte[] a(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.a(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map);
    }
}
