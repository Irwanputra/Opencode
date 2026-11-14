package dev.epro.r0;

import ads_mobile_sdk.bn0;
import ads_mobile_sdk.ef1;
import ads_mobile_sdk.hs;
import ads_mobile_sdk.l5;
import ads_mobile_sdk.w81;
import ads_mobile_sdk.x22;
import ads_mobile_sdk.y11;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public interface O12043144740933444288 {
    static /* synthetic */ Object a(O12043144740933444288 o12043144740933444288, URL url, Map map, K14749510448791472029 k14749510448791472029, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        return o12043144740933444288.a(url, map, (i & 16) != 0, k14749510448791472029);
    }

    static /* synthetic */ Object b(O12043144740933444288 o12043144740933444288, y11 y11Var, E17093345031926825464 e17093345031926825464, K14749510448791472029 k14749510448791472029, int i) {
        if ((i & 2) != 0) {
            e17093345031926825464 = null;
        }
        return o12043144740933444288.a(y11Var, e17093345031926825464, null, (i & 8) == 0, (i & 16) != 0, k14749510448791472029);
    }

    Object a(int i, long j, l5 l5Var);

    Object a(ef1 ef1Var);

    Object a(y11 y11Var, E17093345031926825464 e17093345031926825464, x22 x22Var);

    Object a(y11 y11Var, E17093345031926825464 e17093345031926825464, Map map, boolean z, boolean z2, K14749510448791472029 k14749510448791472029);

    Object a(String str, Map map, R4833348786910499294 r4833348786910499294);

    Object a(URL url, bn0 bn0Var, R4833348786910499294 r4833348786910499294);

    Object a(URL url, R4833348786910499294 r4833348786910499294);

    Object a(URL url, Map map, boolean z, K14749510448791472029 k14749510448791472029);

    void a(hs hsVar);

    void a(w81 w81Var);
}
