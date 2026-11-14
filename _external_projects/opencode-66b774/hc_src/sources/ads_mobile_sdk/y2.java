package ads_mobile_sdk;

import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.O12152244488187446230;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R13857032526302973615;
import dev.epro.r0.R4239627874707364917;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S8229747050136740165;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class y2 extends R4239627874707364917 implements E1738554508920355622, R13857032526302973615 {
    public final z1 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(W5797197595347441198 w5797197595347441198, Map map, z1 z1Var) {
        super(w5797197595347441198, map);
        w5797197595347441198.getClass();
        map.getClass();
        z1Var.getClass();
        this.c = z1Var;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(R4833348786910499294 r4833348786910499294) {
        byte b = 1;
        if (!this.f.getAndSet(true)) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
                R4833348786910499294 r48333487869104992942 = null;
                ha haVar = new ha(str, value, r48333487869104992942, (byte) 6);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, b), 2);
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.R13857032526302973615
    public final void d(R4833348786910499294 r4833348786910499294) {
        o(r4833348786910499294);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final O9245300239821758723 e() {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r4833348786910499294 = null;
            ha haVar = new ha(str, value, r4833348786910499294, (byte) 14);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r4833348786910499294, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object g(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            ha haVar = new ha(str, value, r48333487869104992942, (byte) 8);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.R13857032526302973615
    public final void h(R4833348786910499294 r4833348786910499294) {
        g(r4833348786910499294);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object i(R4833348786910499294 r4833348786910499294) {
        Object B = O8620973563946607355.B(new u2(this, null, (byte) 0), r4833348786910499294);
        return B == Z3437138737604933638.a ? B : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object j(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            ha haVar = new ha(str, value, r48333487869104992942, (byte) 16);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object n(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            ha haVar = new ha(str, value, r48333487869104992942, (byte) 3);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void o(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            ha haVar = new ha(str, value, r48333487869104992942, (byte) 18);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, (byte) 1), 2);
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        byte b = 1;
        boolean andSet = this.d.getAndSet(true);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (!andSet) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
                R4833348786910499294 r48333487869104992942 = null;
                ha haVar = new ha(str, value, r48333487869104992942, (byte) 11);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, b), 2);
            }
            o9 o9Var = this.c.m;
            if (o9Var != null && o9Var.a == q9.ONE_PIXEL && !this.e.getAndSet(true)) {
                a(new S8229747050136740165(o9Var.d, o9Var.c, o9Var.b), r4833348786910499294);
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void e(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            ha haVar = new ha(str, value, r48333487869104992942, (byte) 20);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r48333487869104992942, (byte) 1), 2);
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            T913357428039952817 t9133574280399528172 = t913357428039952817;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(str, value, r48333487869104992942, (Object) t9133574280399528172, (byte) 12);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, r48333487869104992942, (byte) 1), 2);
            t913357428039952817 = t9133574280399528172;
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(S8229747050136740165 s8229747050136740165, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            S8229747050136740165 s82297470501367401652 = s8229747050136740165;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(str, value, r48333487869104992942, (Object) s82297470501367401652, (byte) 15);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, r48333487869104992942, (byte) 1), 2);
            s8229747050136740165 = s82297470501367401652;
        }
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final O9245300239821758723 a(String str, String str2, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            String str4 = str;
            String str5 = str2;
            O12152244488187446230 o12152244488187446230 = new O12152244488187446230(str3, value, (R4833348786910499294) null, (Object) str4, (Object) str5, (byte) 3);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(o12152244488187446230, null, (byte) 1), 2);
            str = str4;
            str2 = str5;
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final void a(String str, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R4833348786910499294 r48333487869104992942 = null;
            String str3 = str;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(str2, value, r48333487869104992942, (Object) str3, (byte) 24);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, r48333487869104992942, (byte) 1), 2);
            str = str3;
        }
    }
}
