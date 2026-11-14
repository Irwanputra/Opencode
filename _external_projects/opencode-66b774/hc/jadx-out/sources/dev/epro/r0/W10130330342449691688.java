package dev.epro.r0;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W10130330342449691688 implements P14548408347618629366 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f550o;
    public final P14575954172000745949 p;
    public boolean q;
    public int r;

    public W10130330342449691688(P14575954172000745949 p14575954172000745949) {
        p14575954172000745949.B();
        C10994625127000459680 c10994625127000459680 = p14575954172000745949.t;
        if (c10994625127000459680 != null) {
            c10994625127000459680.r.getClassLoader();
        }
        this.a = new ArrayList();
        this.f550o = false;
        this.r = -1;
        this.p = p14575954172000745949;
    }

    @Override // dev.epro.r0.P14548408347618629366
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        P14575954172000745949 p14575954172000745949 = this.p;
        ArrayList arrayList3 = p14575954172000745949.d;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            p14575954172000745949.d = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    public final void b(M12888013728560752810 m12888013728560752810) {
        this.a.add(m12888013728560752810);
        m12888013728560752810.d = this.b;
        m12888013728560752810.e = this.c;
        m12888013728560752810.f = this.d;
        m12888013728560752810.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13374971588771233833 c13374971588771233833 = ((M12888013728560752810) arrayList.get(i2)).b;
                if (c13374971588771233833 != null) {
                    c13374971588771233833.q += i;
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            S10973172697741180971.m("commit already called");
            return 0;
        }
        this.q = true;
        boolean z2 = this.g;
        P14575954172000745949 p14575954172000745949 = this.p;
        if (z2) {
            this.r = p14575954172000745949.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        p14575954172000745949.v(this, z);
        return this.r;
    }

    public final void e(int i, C13374971588771233833 c13374971588771233833, String str) {
        String str2 = c13374971588771233833.J;
        if (str2 != null) {
            X3799397131215715439.b(c13374971588771233833, str2);
        }
        Class<?> cls = c13374971588771233833.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            U15384774985926769650.g("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = c13374971588771233833.x;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(c13374971588771233833);
                sb.append(": was ");
                S10973172697741180971.m(G6547577305291411977.v(sb, c13374971588771233833.x, " now ", str));
                return;
            }
            c13374971588771233833.x = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + c13374971588771233833 + " with tag " + str + " to container view with no id");
            }
            int i2 = c13374971588771233833.v;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(c13374971588771233833);
                int i3 = c13374971588771233833.v;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            c13374971588771233833.v = i;
            c13374971588771233833.w = i;
        }
        b(new M12888013728560752810(1, c13374971588771233833));
        c13374971588771233833.r = this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
