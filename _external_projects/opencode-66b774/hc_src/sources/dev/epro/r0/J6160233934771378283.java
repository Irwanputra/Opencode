package dev.epro.r0;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J6160233934771378283 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ T17336508261397230716 h;

    public J6160233934771378283(T17336508261397230716 t17336508261397230716) {
        this.h = t17336508261397230716;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        D9412818333024388170 d9412818333024388170 = (D9412818333024388170) this.e.get(str);
        if ((d9412818333024388170 != null ? d9412818333024388170.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                d9412818333024388170.a.a(d9412818333024388170.b.Z(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new H15446768409112154310(intent, i2));
        return true;
    }

    public final void b(int i, E3422549137300678133 e3422549137300678133, Object obj) {
        Bundle bundle;
        int i2;
        e3422549137300678133.getClass();
        T17336508261397230716 t17336508261397230716 = this.h;
        Z6787503239643758223 U = e3422549137300678133.U(t17336508261397230716, obj);
        if (U != null) {
            new Handler(Looper.getMainLooper()).post(new A14411185669882056569(this, i, (Object) U, (byte) 1));
            return;
        }
        Intent O = e3422549137300678133.O(t17336508261397230716, obj);
        if (O.getExtras() != null) {
            Bundle extras = O.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                O.setExtrasClassLoader(t17336508261397230716.getClassLoader());
            }
        }
        if (O.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = O.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            O.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(O.getAction())) {
            String[] stringArrayExtra = O.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    S10973172697741180971.j(G6547577305291411977.u(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            t17336508261397230716.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(O.getAction())) {
            t17336508261397230716.startActivityForResult(O, i, bundle2);
            return;
        }
        X11530728323241563344 x11530728323241563344 = (X11530728323241563344) O.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            x11530728323241563344.getClass();
            i2 = i;
            try {
                t17336508261397230716.startIntentSenderForResult(x11530728323241563344.a, i2, x11530728323241563344.b, x11530728323241563344.c, x11530728323241563344.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new A14411185669882056569(this, i2, (Object) e, (byte) 2));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final G10327508498288787502 c(String str, E3422549137300678133 e3422549137300678133, N12800445656637864660 n12800445656637864660) {
        str.getClass();
        e3422549137300678133.getClass();
        LinkedHashMap linkedHashMap = this.b;
        Object obj = null;
        if (((Integer) linkedHashMap.get(str)) == null) {
            byte b = 0;
            G5865513469313204166 g5865513469313204166 = new G5865513469313204166(b);
            Iterator it = new P5486592749040390593(new B2664082256516729321((Object) g5865513469313204166, (F4096073349764486348) new K13841493441907392258(g5865513469313204166, b), (byte) 4)).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            K2042933864045806308.n("Sequence contains no element matching the predicate.");
            return null;
        }
        this.e.put(str, new D9412818333024388170(n12800445656637864660, e3422549137300678133));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj2 = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            n12800445656637864660.a(obj2);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i >= 34) {
            obj = T3623367008917729099.d(str, bundle);
        } else {
            Parcelable parcelable = bundle.getParcelable(str);
            if (H15446768409112154310.class.isInstance(parcelable)) {
                obj = parcelable;
            }
        }
        H15446768409112154310 h15446768409112154310 = (H15446768409112154310) obj;
        if (h15446768409112154310 != null) {
            bundle.remove(str);
            n12800445656637864660.a(e3422549137300678133.Z(h15446768409112154310.b, h15446768409112154310.a));
        }
        return new G10327508498288787502(this, str, e3422549137300678133);
    }
}
