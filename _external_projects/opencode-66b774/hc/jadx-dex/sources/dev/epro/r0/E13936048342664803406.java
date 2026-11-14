package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E13936048342664803406 implements dev.epro.r0.I2388620560486547149 {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public /* synthetic */ E13936048342664803406(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void d(dev.epro.r0.I4293432593871965076 i4293432593871965076, dev.epro.r0.P72364327365747079 p72364327365747079) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                dev.epro.r0.J5715778638296486773 j5715778638296486773 = (dev.epro.r0.F18341548724281518495) obj;
                if (p72364327365747079 != dev.epro.r0.P72364327365747079.ON_CREATE) {
                    throw new java.lang.AssertionError("Next event must be ON_CREATE");
                }
                i4293432593871965076.j().b(this);
                android.os.Bundle bundleG = j5715778638296486773.b().g("androidx.savedstate.Restarter");
                if (bundleG == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = bundleG.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    dev.epro.r0.S10973172697741180971.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    java.lang.String str = stringArrayList.get(i);
                    i++;
                    java.lang.String str2 = str;
                    try {
                        java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str2, false, dev.epro.r0.E13936048342664803406.class.getClassLoader()).asSubclass(dev.epro.r0.C4206129518785042872.class);
                        clsAsSubclass.getClass();
                        try {
                            java.lang.reflect.Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(j5715778638296486773 instanceof dev.epro.r0.J5715778638296486773)) {
                                    dev.epro.r0.D11988991656201568495.r("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", j5715778638296486773);
                                    return;
                                }
                                dev.epro.r0.L3530692241870850490 l3530692241870850490I = j5715778638296486773.i();
                                dev.epro.r0.V10300877997588547986 v10300877997588547986B = j5715778638296486773.b();
                                java.util.LinkedHashMap linkedHashMap = l3530692241870850490I.a;
                                java.util.LinkedHashMap linkedHashMap2 = l3530692241870850490I.a;
                                java.util.Iterator it = dev.epro.r0.R9411874267597469228.h1(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    dev.epro.r0.J14024120050125738337 j14024120050125738337 = (dev.epro.r0.J14024120050125738337) linkedHashMap2.get(it.next());
                                    if (j14024120050125738337 != null) {
                                        dev.epro.r0.S2941385686793915703.v(j14024120050125738337, v10300877997588547986B, j5715778638296486773.j());
                                    }
                                }
                                if (!dev.epro.r0.R9411874267597469228.h1(linkedHashMap2.keySet()).isEmpty()) {
                                    v10300877997588547986B.A();
                                }
                            } catch (java.lang.Exception e) {
                                dev.epro.r0.Z3383101362411723454.m(dev.epro.r0.G6547577305291411977.C("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (java.lang.NoSuchMethodException e2) {
                            throw new java.lang.IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (java.lang.ClassNotFoundException e3) {
                        dev.epro.r0.Z3383101362411723454.m(dev.epro.r0.G6547577305291411977.s("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                dev.epro.r0.T17336508261397230716 t17336508261397230716 = (dev.epro.r0.T17336508261397230716) obj;
                if (t17336508261397230716.e == null) {
                    dev.epro.r0.N7489524014411144583 n7489524014411144583 = (dev.epro.r0.N7489524014411144583) t17336508261397230716.getLastNonConfigurationInstance();
                    if (n7489524014411144583 != null) {
                        t17336508261397230716.e = n7489524014411144583.a;
                    }
                    if (t17336508261397230716.e == null) {
                        t17336508261397230716.e = new dev.epro.r0.L3530692241870850490();
                    }
                }
                t17336508261397230716.a.b(this);
                return;
            case 2:
                new java.util.HashMap();
                dev.epro.r0.B4698305131960584516[] b4698305131960584516Arr = (dev.epro.r0.B4698305131960584516[]) obj;
                if (b4698305131960584516Arr.length > 0) {
                    dev.epro.r0.B4698305131960584516 b4698305131960584516 = b4698305131960584516Arr[0];
                    throw null;
                }
                if (b4698305131960584516Arr.length <= 0) {
                    return;
                }
                dev.epro.r0.B4698305131960584516 b46983051319605845162 = b4698305131960584516Arr[0];
                throw null;
            default:
                if (p72364327365747079 != dev.epro.r0.P72364327365747079.ON_CREATE) {
                    dev.epro.r0.D11988991656201568495.r("Next event must be ON_CREATE, it was ", p72364327365747079);
                    return;
                } else {
                    i4293432593871965076.j().b(this);
                    ((dev.epro.r0.P14299581306856531209) obj).b();
                    return;
                }
        }
    }
}
