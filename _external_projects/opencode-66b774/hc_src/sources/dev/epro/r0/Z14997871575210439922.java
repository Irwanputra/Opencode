package dev.epro.r0;

import ads_mobile_sdk.a33;
import ads_mobile_sdk.ax2;
import ads_mobile_sdk.b41;
import ads_mobile_sdk.bo0;
import ads_mobile_sdk.g9;
import ads_mobile_sdk.gg2;
import ads_mobile_sdk.kh0;
import ads_mobile_sdk.pb3;
import ads_mobile_sdk.q61;
import ads_mobile_sdk.uo3;
import ads_mobile_sdk.ym2;
import ads_mobile_sdk.z93;
import android.os.Build;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z14997871575210439922 implements B8427392651679410143 {
    public final /* synthetic */ byte a;

    public /* synthetic */ Z14997871575210439922(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = Build.HOST;
                Z14316276734425062790.e(str);
                return str;
            case 1:
                return new Z3753934257203718809();
            case 2:
                return new ym2();
            case 3:
                X16868335726098211378 x16868335726098211378 = X16868335726098211378.c;
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                A16798789777035163011 a16798789777035163011 = F14240031463097426304.i;
                int i = F14240031463097426304.k;
                int i2 = F14240031463097426304.l;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayList.add(new AndroidBundleTypeAdapterFactory());
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = M4353767700798623786.a;
                HashMap hashMap2 = new HashMap(hashMap);
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                return new F14240031463097426304(x16868335726098211378, 1, hashMap2, false, a16798789777035163011, arrayList3, i, i2, new ArrayList(arrayDeque));
            case 4:
                return new a33();
            case 5:
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                return uuid;
            case 6:
                return new ax2();
            case 7:
                return new b41();
            case 8:
                return new G2741561934039219051();
            case 9:
                return new U2595023890546017274((byte) 27);
            case 10:
                return new I14592051721515255272();
            case 11:
                return new H16432513849385007664();
            case 12:
                return new O16637889491137121389();
            case 13:
                return new M13708882896679324204();
            case 14:
                return new U14542043995380972801();
            case 15:
                return new gg2();
            case 16:
                return bo0.a;
            case 17:
                return 1;
            case 18:
                return new g9();
            case 19:
                return new kh0();
            case 20:
                return new uo3();
            case 21:
                return new X11776734143967878387();
            case 22:
                return new Q1304841290039450495();
            case 23:
                return new R6652565090310432558();
            case 24:
                return new V1032539182488810134();
            case 25:
                return I3887072968740112330.a(0, 7, null);
            case 26:
                return new pb3();
            case 27:
                return new q61();
            case 28:
                return new z93();
            default:
                return bo0.a$1;
        }
    }
}
