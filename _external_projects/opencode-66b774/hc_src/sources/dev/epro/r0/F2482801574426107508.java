package dev.epro.r0;

import ads_mobile_sdk.pd;
import ads_mobile_sdk.t93;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F2482801574426107508 extends t93 {
    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        synchronized (v5431423861497278836) {
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).j("E");
            v5431423861497278836.b();
            pd pdVar = (pd) v5431423861497278836.b;
            i = pdVar.bitField1_;
            pdVar.bitField1_ = i | 32;
            pdVar.cpuSignal_ = 0L;
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).g("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (v5431423861497278836) {
            String str = (String) objArr[0];
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).j(str);
            long longValue = ((Long) objArr[1]).longValue();
            v5431423861497278836.b();
            pd pdVar2 = (pd) v5431423861497278836.b;
            i2 = pdVar2.bitField1_;
            pdVar2.bitField1_ = i2 | 32;
            pdVar2.cpuSignal_ = longValue;
            String str2 = (String) objArr[2];
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).g(str2);
        }
    }
}
