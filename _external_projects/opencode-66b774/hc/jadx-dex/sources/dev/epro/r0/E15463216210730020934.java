package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E15463216210730020934 implements dev.epro.r0.Q15796038708469204840 {
    public final android.app.Application a;
    public final dev.epro.r0.T977856106332750807 b;
    public final android.os.Bundle c;
    public final dev.epro.r0.R3192876217964974737 d;
    public final dev.epro.r0.V10300877997588547986 e;

    public E15463216210730020934(android.app.Application application, dev.epro.r0.F18341548724281518495 f18341548724281518495, android.os.Bundle bundle) {
        dev.epro.r0.T977856106332750807 t977856106332750807;
        this.e = f18341548724281518495.b();
        this.d = f18341548724281518495.j();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            t977856106332750807 = dev.epro.r0.T977856106332750807.c;
            if (t977856106332750807 == null) {
                t977856106332750807 = new dev.epro.r0.T977856106332750807(application);
                dev.epro.r0.T977856106332750807.c = t977856106332750807;
            }
        } else {
            t977856106332750807 = new dev.epro.r0.T977856106332750807((android.app.Application) null);
        }
        this.b = t977856106332750807;
    }

    public final dev.epro.r0.J14024120050125738337 a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        dev.epro.r0.S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final dev.epro.r0.J14024120050125738337 b(java.lang.Class cls, dev.epro.r0.X8580441079827879338 x8580441079827879338) {
        dev.epro.r0.U11450443558875589191 u11450443558875589191 = dev.epro.r0.Z860808776098365610.k;
        java.util.LinkedHashMap linkedHashMap = ((dev.epro.r0.L14576235570718031614) x8580441079827879338).a;
        java.lang.String str = (java.lang.String) linkedHashMap.get(u11450443558875589191);
        if (str == null) {
            dev.epro.r0.S10973172697741180971.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(dev.epro.r0.C775827382551829194.j) == null || linkedHashMap.get(dev.epro.r0.C775827382551829194.k) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            dev.epro.r0.S10973172697741180971.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        android.app.Application application = (android.app.Application) linkedHashMap.get(dev.epro.r0.T977856106332750807.d);
        boolean zIsAssignableFrom = dev.epro.r0.T137263189637380015.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor constructorA = (!zIsAssignableFrom || application == null) ? dev.epro.r0.N13156852726304692127.a(cls, dev.epro.r0.N13156852726304692127.b) : dev.epro.r0.N13156852726304692127.a(cls, dev.epro.r0.N13156852726304692127.a);
        return constructorA == null ? this.b.b(cls, x8580441079827879338) : (!zIsAssignableFrom || application == null) ? dev.epro.r0.N13156852726304692127.b(cls, constructorA, new java.lang.Object[]{dev.epro.r0.C775827382551829194.H(x8580441079827879338)}) : dev.epro.r0.N13156852726304692127.b(cls, constructorA, new java.lang.Object[]{application, dev.epro.r0.C775827382551829194.H(x8580441079827879338)});
    }

    public final dev.epro.r0.J14024120050125738337 c(dev.epro.r0.V6281043481934004271 v6281043481934004271, dev.epro.r0.X8580441079827879338 x8580441079827879338) {
        return b(dev.epro.r0.U16229988784104357932.H(v6281043481934004271), x8580441079827879338);
    }

    public final dev.epro.r0.J14024120050125738337 d(java.lang.Class cls, java.lang.String str) {
        dev.epro.r0.L13135072960070674001 l13135072960070674001;
        dev.epro.r0.I1283052979100930176 i1283052979100930176 = this.d;
        if (i1283052979100930176 == null) {
            dev.epro.r0.D11988991656201568495.j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = dev.epro.r0.T137263189637380015.class.isAssignableFrom(cls);
        android.app.Application application = this.a;
        java.lang.reflect.Constructor constructorA = (!zIsAssignableFrom || application == null) ? dev.epro.r0.N13156852726304692127.a(cls, dev.epro.r0.N13156852726304692127.b) : dev.epro.r0.N13156852726304692127.a(cls, dev.epro.r0.N13156852726304692127.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            dev.epro.r0.F7192844493769026772 f7192844493769026772 = dev.epro.r0.F7192844493769026772.a;
            if (f7192844493769026772 == null) {
                f7192844493769026772 = new dev.epro.r0.F7192844493769026772();
                dev.epro.r0.F7192844493769026772.a = f7192844493769026772;
            }
            return f7192844493769026772.a(cls);
        }
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = this.e;
        v10300877997588547986.getClass();
        android.os.Bundle bundleG = v10300877997588547986.g(str);
        if (bundleG == null) {
            bundleG = this.c;
        }
        if (bundleG == null) {
            l13135072960070674001 = new dev.epro.r0.L13135072960070674001();
        } else {
            java.lang.ClassLoader classLoader = dev.epro.r0.L13135072960070674001.class.getClassLoader();
            classLoader.getClass();
            bundleG.setClassLoader(classLoader);
            dev.epro.r0.H6457936572911484476 h6457936572911484476 = new dev.epro.r0.H6457936572911484476(bundleG.size());
            for (java.lang.String str2 : bundleG.keySet()) {
                str2.getClass();
                h6457936572911484476.put(str2, bundleG.get(str2));
            }
            l13135072960070674001 = new dev.epro.r0.L13135072960070674001(h6457936572911484476.b());
        }
        dev.epro.r0.S4320905983517725173 s4320905983517725173 = new dev.epro.r0.S4320905983517725173(str, l13135072960070674001);
        s4320905983517725173.g(v10300877997588547986, i1283052979100930176);
        dev.epro.r0.Q14196755420833223976 q14196755420833223976 = i1283052979100930176.h;
        if (q14196755420833223976 == dev.epro.r0.Q14196755420833223976.b || q14196755420833223976.compareTo(dev.epro.r0.Q14196755420833223976.d) >= 0) {
            v10300877997588547986.A();
        } else {
            i1283052979100930176.a(new dev.epro.r0.F15441078260174406238(i1283052979100930176, v10300877997588547986, (byte) 1));
        }
        dev.epro.r0.J14024120050125738337 j14024120050125738337B = (!zIsAssignableFrom || application == null) ? dev.epro.r0.N13156852726304692127.b(cls, constructorA, new java.lang.Object[]{l13135072960070674001}) : dev.epro.r0.N13156852726304692127.b(cls, constructorA, new java.lang.Object[]{application, l13135072960070674001});
        j14024120050125738337B.a("androidx.lifecycle.savedstate.vm.tag", s4320905983517725173);
        return j14024120050125738337B;
    }

    public E15463216210730020934() {
        this.b = new dev.epro.r0.T977856106332750807((android.app.Application) null);
    }
}
