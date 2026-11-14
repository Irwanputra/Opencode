package dev.epro.r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O7267920176496495291 implements J10468299281676710423 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ T17336508261397230716 b;

    public /* synthetic */ O7267920176496495291(T17336508261397230716 t17336508261397230716, byte b) {
        this.a = b;
        this.b = t17336508261397230716;
    }

    @Override // dev.epro.r0.J10468299281676710423
    public final void a(T17336508261397230716 t17336508261397230716) {
        byte b = this.a;
        T17336508261397230716 t173365082613972307162 = this.b;
        switch (b) {
            case 0:
                t17336508261397230716.getClass();
                Bundle bundleG = ((V10300877997588547986) t173365082613972307162.d.c).g("android:support:activity-result");
                if (bundleG != null) {
                    J6160233934771378283 j6160233934771378283 = t173365082613972307162.h;
                    LinkedHashMap linkedHashMap = j6160233934771378283.b;
                    LinkedHashMap linkedHashMap2 = j6160233934771378283.a;
                    Bundle bundle = j6160233934771378283.g;
                    ArrayList<Integer> integerArrayList = bundleG.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            j6160233934771378283.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleG.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    V12319504402545346730.r(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            j6160233934771378283.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                C10994625127000459680 c10994625127000459680 = (C10994625127000459680) ((R13227154569034155950) t173365082613972307162).u.b;
                c10994625127000459680.t.b(c10994625127000459680, c10994625127000459680, null);
                break;
        }
    }
}
