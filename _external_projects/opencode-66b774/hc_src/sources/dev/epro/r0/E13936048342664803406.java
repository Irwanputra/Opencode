package dev.epro.r0;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E13936048342664803406 implements I2388620560486547149 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ E13936048342664803406(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                F18341548724281518495 f18341548724281518495 = (F18341548724281518495) obj;
                if (p72364327365747079 != P72364327365747079.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                i4293432593871965076.j().b(this);
                Bundle g = f18341548724281518495.b().g("androidx.savedstate.Restarter");
                if (g == null) {
                    return;
                }
                ArrayList<String> stringArrayList = g.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    S10973172697741180971.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, E13936048342664803406.class.getClassLoader()).asSubclass(C4206129518785042872.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(f18341548724281518495 instanceof J5715778638296486773)) {
                                    D11988991656201568495.r("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", f18341548724281518495);
                                    return;
                                }
                                L3530692241870850490 i2 = ((J5715778638296486773) f18341548724281518495).i();
                                V10300877997588547986 b2 = f18341548724281518495.b();
                                LinkedHashMap linkedHashMap = i2.a;
                                LinkedHashMap linkedHashMap2 = i2.a;
                                Iterator it = R9411874267597469228.h1(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    J14024120050125738337 j14024120050125738337 = (J14024120050125738337) linkedHashMap2.get(it.next());
                                    if (j14024120050125738337 != null) {
                                        S2941385686793915703.v(j14024120050125738337, b2, f18341548724281518495.j());
                                    }
                                }
                                if (!R9411874267597469228.h1(linkedHashMap2.keySet()).isEmpty()) {
                                    b2.A();
                                }
                            } catch (Exception e) {
                                Z3383101362411723454.m(G6547577305291411977.C("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        Z3383101362411723454.m(G6547577305291411977.s("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                T17336508261397230716 t17336508261397230716 = (T17336508261397230716) obj;
                if (t17336508261397230716.e == null) {
                    N7489524014411144583 n7489524014411144583 = (N7489524014411144583) t17336508261397230716.getLastNonConfigurationInstance();
                    if (n7489524014411144583 != null) {
                        t17336508261397230716.e = n7489524014411144583.a;
                    }
                    if (t17336508261397230716.e == null) {
                        t17336508261397230716.e = new L3530692241870850490();
                    }
                }
                t17336508261397230716.a.b(this);
                return;
            case 2:
                new HashMap();
                B4698305131960584516[] b4698305131960584516Arr = (B4698305131960584516[]) obj;
                if (b4698305131960584516Arr.length > 0) {
                    B4698305131960584516 b4698305131960584516 = b4698305131960584516Arr[0];
                    throw null;
                }
                if (b4698305131960584516Arr.length <= 0) {
                    return;
                }
                B4698305131960584516 b46983051319605845162 = b4698305131960584516Arr[0];
                throw null;
            default:
                if (p72364327365747079 != P72364327365747079.ON_CREATE) {
                    D11988991656201568495.r("Next event must be ON_CREATE, it was ", p72364327365747079);
                    return;
                } else {
                    i4293432593871965076.j().b(this);
                    ((P14299581306856531209) obj).b();
                    return;
                }
        }
    }
}
