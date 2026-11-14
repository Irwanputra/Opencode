package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3606826322388932410 implements N8760694116812456657, J1083986568308928281 {
    public static final /* synthetic */ long f = T5284056093300834442.a.objectFieldOffset(O3606826322388932410.class.getDeclaredField("state$volatile"));
    public static final /* synthetic */ int g = 0;
    public final G8001132634698687269 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = Z860808776098365610.d;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = Z860808776098365610.g;

    public O3606826322388932410(G8001132634698687269 g8001132634698687269) {
        this.a = g8001132634698687269;
    }

    public static Object d(O3606826322388932410 o3606826322388932410, K14749510448791472029 k14749510448791472029) {
        return T5284056093300834442.a.getObjectVolatile(o3606826322388932410, f) instanceof M15964426641105106347 ? o3606826322388932410.c(k14749510448791472029) : o3606826322388932410.e(k14749510448791472029);
    }

    @Override // dev.epro.r0.J1083986568308928281
    public final void a(X17453750288186724334 x17453750288186724334, int i) {
        this.c = x17453750288186724334;
        this.d = i;
    }

    @Override // dev.epro.r0.N8760694116812456657
    public final void b(Throwable th) {
        O3606826322388932410 o3606826322388932410;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == Z860808776098365610.e) {
                return;
            }
            D14731132657808549702 d14731132657808549702 = Z860808776098365610.f;
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                o3606826322388932410 = this;
                if (unsafe2.compareAndSwapObject(o3606826322388932410, f, objectVolatile, d14731132657808549702)) {
                    ArrayList arrayList = o3606826322388932410.b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((M15964426641105106347) obj).a();
                    }
                    o3606826322388932410.e = Z860808776098365610.g;
                    o3606826322388932410.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(o3606826322388932410, j) != objectVolatile) {
                    break;
                } else {
                    this = o3606826322388932410;
                }
            }
            this = o3606826322388932410;
        }
    }

    public final Object c(K14749510448791472029 k14749510448791472029) {
        Unsafe unsafe = T5284056093300834442.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        M15964426641105106347 m15964426641105106347 = (M15964426641105106347) objectVolatile;
        Object obj = m15964426641105106347.d;
        Object obj2 = this.e;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                M15964426641105106347 m159644266411051063472 = (M15964426641105106347) obj3;
                if (m159644266411051063472 != m15964426641105106347) {
                    m159644266411051063472.a();
                }
            }
            T5284056093300834442.a.putObjectVolatile(this, j, Z860808776098365610.e);
            this.e = Z860808776098365610.g;
            this.b = null;
        }
        Object objInvoke = m15964426641105106347.c.invoke(m15964426641105106347.a, obj, obj2);
        R4833348786910499294 r4833348786910499294 = m15964426641105106347.e;
        return obj == Z860808776098365610.h ? ((F4096073349764486348) r4833348786910499294).invoke(k14749510448791472029) : ((L12639328004344855510) r4833348786910499294).invoke(objInvoke, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r16) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O3606826322388932410.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final M15964426641105106347 f(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((M15964426641105106347) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        M15964426641105106347 m15964426641105106347 = (M15964426641105106347) obj2;
        if (m15964426641105106347 != null) {
            return m15964426641105106347;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(J15730374346044043770 j15730374346044043770, L12639328004344855510 l12639328004344855510) {
        h(new M15964426641105106347(this, (H17686692708284905246) j15730374346044043770.c, (J12078565427869724451) j15730374346044043770.d, (J12078565427869724451) j15730374346044043770.e, null, (R14062301455140331524) l12639328004344855510, (J12078565427869724451) j15730374346044043770.b), false);
    }

    public final void h(M15964426641105106347 m15964426641105106347, boolean z) {
        Object obj = m15964426641105106347.a;
        Unsafe unsafe = T5284056093300834442.a;
        long j = f;
        if (unsafe.getObjectVolatile(this, j) instanceof M15964426641105106347) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((M15964426641105106347) obj2).a == obj) {
                        D11988991656201568495.r("Cannot use select clauses on the same object: ", obj);
                        return;
                    }
                }
            }
        }
        m15964426641105106347.b.invoke(obj, this, m15964426641105106347.d);
        if (this.e != Z860808776098365610.g) {
            T5284056093300834442.a.putObjectVolatile(this, j, m15964426641105106347);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(m15964426641105106347);
        }
        m15964426641105106347.g = this.c;
        m15964426641105106347.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int i(Object obj, Object obj2) {
        O3606826322388932410 o3606826322388932410;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = T5284056093300834442.a;
            long j = f;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof U15014152283416496379) {
                M15964426641105106347 m15964426641105106347F = this.f(obj);
                if (m15964426641105106347F != null) {
                    J12078565427869724451 j12078565427869724451 = m15964426641105106347F.f;
                    J12078565427869724451 j120785654278697244512 = j12078565427869724451 != null ? (J12078565427869724451) j12078565427869724451.invoke(this, m15964426641105106347F.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = T5284056093300834442.a;
                        o3606826322388932410 = this;
                        if (unsafe4.compareAndSwapObject(o3606826322388932410, f, objectVolatile, m15964426641105106347F)) {
                            U15014152283416496379 u15014152283416496379 = (U15014152283416496379) objectVolatile;
                            o3606826322388932410.e = obj2;
                            D14731132657808549702 d14731132657808549702F = u15014152283416496379.f(O9245300239821758723.a, j120785654278697244512);
                            if (d14731132657808549702F == null) {
                                o3606826322388932410.e = Z860808776098365610.g;
                                return 2;
                            }
                            u15014152283416496379.x(d14731132657808549702F);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(o3606826322388932410, j) != objectVolatile) {
                            break;
                        }
                        this = o3606826322388932410;
                    }
                } else {
                    continue;
                }
            } else {
                o3606826322388932410 = this;
                if (S10823041268949770285.t(objectVolatile, Z860808776098365610.e) || (objectVolatile instanceof M15964426641105106347)) {
                    return 3;
                }
                if (S10823041268949770285.t(objectVolatile, Z860808776098365610.f)) {
                    return 2;
                }
                if (S10823041268949770285.t(objectVolatile, Z860808776098365610.d)) {
                    List listU = K5751602218013079365.U(obj);
                    do {
                        unsafe2 = T5284056093300834442.a;
                        if (unsafe2.compareAndSwapObject(o3606826322388932410, f, objectVolatile, listU)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(o3606826322388932410, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        Q11088980322693754445.i("Unexpected state: ", objectVolatile);
                        return 0;
                    }
                    ArrayList arrayListP0 = R9411874267597469228.P0((Collection) objectVolatile, obj);
                    do {
                        unsafe = T5284056093300834442.a;
                        if (unsafe.compareAndSwapObject(o3606826322388932410, f, objectVolatile, arrayListP0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(o3606826322388932410, j) == objectVolatile);
                }
            }
            this = o3606826322388932410;
        }
    }
}
