package dev.epro.r0;

import ads_mobile_sdk.pd;
import ads_mobile_sdk.t93;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F2482801574426107508 extends t93 {
    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        synchronized (v5431423861497278836) {
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).j("E");
            v5431423861497278836.b();
            pd pdVar = (pd) v5431423861497278836.b;
            pdVar.bitField1_ |= 32;
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
            long jLongValue = ((Long) objArr[1]).longValue();
            v5431423861497278836.b();
            pd pdVar2 = (pd) v5431423861497278836.b;
            pdVar2.bitField1_ |= 32;
            pdVar2.cpuSignal_ = jLongValue;
            String str2 = (String) objArr[2];
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).g(str2);
        }
    }
}
