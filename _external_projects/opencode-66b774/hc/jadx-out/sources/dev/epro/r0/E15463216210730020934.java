package dev.epro.r0;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E15463216210730020934 implements Q15796038708469204840 {
    public final Application a;
    public final T977856106332750807 b;
    public final Bundle c;
    public final R3192876217964974737 d;
    public final V10300877997588547986 e;

    public E15463216210730020934(Application application, F18341548724281518495 f18341548724281518495, Bundle bundle) {
        T977856106332750807 t977856106332750807;
        this.e = f18341548724281518495.b();
        this.d = f18341548724281518495.j();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            t977856106332750807 = T977856106332750807.c;
            if (t977856106332750807 == null) {
                t977856106332750807 = new T977856106332750807(application);
                T977856106332750807.c = t977856106332750807;
            }
        } else {
            t977856106332750807 = new T977856106332750807(null);
        }
        this.b = t977856106332750807;
    }

    @Override // dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 b(Class cls, X8580441079827879338 x8580441079827879338) {
        U11450443558875589191 u11450443558875589191 = Z860808776098365610.k;
        LinkedHashMap linkedHashMap = x8580441079827879338.a;
        String str = (String) linkedHashMap.get(u11450443558875589191);
        if (str == null) {
            S10973172697741180971.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(C775827382551829194.j) == null || linkedHashMap.get(C775827382551829194.k) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            S10973172697741180971.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(T977856106332750807.d);
        boolean zIsAssignableFrom = T137263189637380015.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N13156852726304692127.a(cls, N13156852726304692127.b) : N13156852726304692127.a(cls, N13156852726304692127.a);
        return constructorA == null ? this.b.b(cls, x8580441079827879338) : (!zIsAssignableFrom || application == null) ? N13156852726304692127.b(cls, constructorA, C775827382551829194.H(x8580441079827879338)) : N13156852726304692127.b(cls, constructorA, application, C775827382551829194.H(x8580441079827879338));
    }

    @Override // dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 c(V6281043481934004271 v6281043481934004271, X8580441079827879338 x8580441079827879338) {
        return b(U16229988784104357932.H(v6281043481934004271), x8580441079827879338);
    }

    public final J14024120050125738337 d(Class cls, String str) {
        L13135072960070674001 l13135072960070674001;
        R3192876217964974737 r3192876217964974737 = this.d;
        if (r3192876217964974737 == null) {
            D11988991656201568495.j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = T137263189637380015.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N13156852726304692127.a(cls, N13156852726304692127.b) : N13156852726304692127.a(cls, N13156852726304692127.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            F7192844493769026772 f7192844493769026772 = F7192844493769026772.a;
            if (f7192844493769026772 == null) {
                f7192844493769026772 = new F7192844493769026772();
                F7192844493769026772.a = f7192844493769026772;
            }
            return f7192844493769026772.a(cls);
        }
        V10300877997588547986 v10300877997588547986 = this.e;
        v10300877997588547986.getClass();
        Bundle bundleG = v10300877997588547986.g(str);
        if (bundleG == null) {
            bundleG = this.c;
        }
        if (bundleG == null) {
            l13135072960070674001 = new L13135072960070674001();
        } else {
            ClassLoader classLoader = L13135072960070674001.class.getClassLoader();
            classLoader.getClass();
            bundleG.setClassLoader(classLoader);
            H6457936572911484476 h6457936572911484476 = new H6457936572911484476(bundleG.size());
            for (String str2 : bundleG.keySet()) {
                str2.getClass();
                h6457936572911484476.put(str2, bundleG.get(str2));
            }
            l13135072960070674001 = new L13135072960070674001(h6457936572911484476.b());
        }
        S4320905983517725173 s4320905983517725173 = new S4320905983517725173(str, l13135072960070674001);
        s4320905983517725173.g(v10300877997588547986, r3192876217964974737);
        Q14196755420833223976 q14196755420833223976 = ((I1283052979100930176) r3192876217964974737).h;
        if (q14196755420833223976 == Q14196755420833223976.b || q14196755420833223976.compareTo(Q14196755420833223976.d) >= 0) {
            v10300877997588547986.A();
        } else {
            r3192876217964974737.a(new F15441078260174406238((Object) r3192876217964974737, (Object) v10300877997588547986, (byte) 1));
        }
        J14024120050125738337 j14024120050125738337B = (!zIsAssignableFrom || application == null) ? N13156852726304692127.b(cls, constructorA, l13135072960070674001) : N13156852726304692127.b(cls, constructorA, application, l13135072960070674001);
        j14024120050125738337B.a("androidx.lifecycle.savedstate.vm.tag", s4320905983517725173);
        return j14024120050125738337B;
    }

    public E15463216210730020934() {
        this.b = new T977856106332750807(null);
    }
}
