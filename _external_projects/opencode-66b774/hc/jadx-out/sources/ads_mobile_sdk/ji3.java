package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H10984080903272140752;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O2161699089510411363;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class ji3 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final H10984080903272140752 b = new H10984080903272140752((byte) 10);

    public static th3 a(ii3 ii3Var, th3 th3Var) {
        th3 th3Var2 = ii3Var.a;
        if (th3Var2 == th3Var) {
            return th3Var;
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (th3Var2 != null) {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            th3Var2.e.addAndGet(E17093345031926825464.e(M9216324016624295870.a0(jCurrentThreadTimeMillis - ii3Var.b, N13798149404328803870.MILLISECONDS)));
        }
        ii3Var.b = jCurrentThreadTimeMillis;
        ii3Var.a = th3Var;
        c7 c7Var = ii3Var.c;
        if (c7Var == null) {
            return th3Var2;
        }
        c7Var.a = th3Var;
        return th3Var2;
    }

    public static xp1 b(wv0 wv0Var, List list, boolean z) {
        xv.a("Attempted to start a trace " + wv0Var.name() + " without a parent. Did you forget to start a root trace or propagate an existing one?");
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return new xp1(wv0Var, list, uuidRandomUUID, new mi3(new ur2(), new fh1(), new tu2(), new s8()), 0, 0, null, z);
    }

    public static th3 a(wv0 wv0Var, List list, boolean z) {
        th3 th3VarB;
        wv0Var.getClass();
        th3 th3Var = b().a;
        if (th3Var != null) {
            th3VarB = th3Var.a(wv0Var, list, z);
        } else {
            th3VarB = b(wv0Var, list, z);
        }
        a(b(), th3VarB);
        return th3VarB;
    }

    public static th3 a() {
        th3 th3Var = b().a;
        if (th3Var != null) {
            return th3Var;
        }
        xp1 xp1VarB = b(wv0.CUI_NAME_UNKNOWN, O2161699089510411363.a, true);
        a(b(), xp1VarB);
        return xp1VarB;
    }

    public static ii3 b() {
        H10984080903272140752 h10984080903272140752 = b;
        Object ii3Var = h10984080903272140752.get();
        if (ii3Var == null) {
            ii3Var = new ii3(SystemClock.currentThreadTimeMillis());
            Thread threadCurrentThread = Thread.currentThread();
            WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
            }
            h10984080903272140752.set(ii3Var);
        }
        return (ii3) ii3Var;
    }
}
