package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.V5431423861497278836;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qj0 extends t93 {
    public final Context f;
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(V5431423861497278836 v5431423861497278836, rp1 rp1Var, Context context, vi3 vi3Var, byte b) {
        super("wR2D10Xhd7AA6QN8obbV6bnwboYMhfn4dJdUcBEHzTV+bur/qJh3jt9MOYgb5vDn", "WAXQgXP0h6bZmwqISdWvILPB4MB4rx/XvC4l/Hdxir0=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_DYNAMIC_DEVICE_SIGNALS_TASK));
        this.l = b;
        switch (b) {
            case 1:
                super("DuE5+y9p56NZeYfGLhoxt0vxV1yd8CTBwk0NIgcJ+5d3wkbDyqX/WPtxlfm0oyLY", "o1bzjIN6n+CUyG9pPZD3I5gMNg4pgPs6Q9EO/JousEA=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_PROCESS_INFO_SIGNALS_TASK));
                this.f = context;
                break;
            default:
                this.f = context;
                break;
        }
    }

    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        switch (this.l) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f);
                objArr.getClass();
                synchronized (v5431423861497278836) {
                    long intValue = ((Integer) objArr[0]).intValue();
                    v5431423861497278836.b();
                    pd pdVar = (pd) v5431423861497278836.b;
                    i = pdVar.bitField1_;
                    pdVar.bitField1_ = i | 2097152;
                    pdVar.batteryTemperatureSignal_ = intValue;
                    long intValue2 = ((Integer) objArr[1]).intValue();
                    v5431423861497278836.b();
                    pd pdVar2 = (pd) v5431423861497278836.b;
                    i2 = pdVar2.bitField0_;
                    pdVar2.bitField0_ = i2 | 16;
                    pdVar2.btsSignal_ = intValue2;
                    long intValue3 = ((Integer) objArr[2]).intValue();
                    v5431423861497278836.b();
                    pd pdVar3 = (pd) v5431423861497278836.b;
                    i3 = pdVar3.bitField0_;
                    pdVar3.bitField0_ = i3 | 32;
                    pdVar3.btlSignal_ = intValue3;
                    long intValue4 = ((Integer) objArr[3]).intValue();
                    v5431423861497278836.b();
                    pd pdVar4 = (pd) v5431423861497278836.b;
                    i4 = pdVar4.bitField2_;
                    pdVar4.bitField2_ = i4 | 8388608;
                    pdVar4.bootCountSignal_ = intValue4;
                    Boolean bool = (Boolean) objArr[4];
                    if (bool == null) {
                        v5431423861497278836.b();
                        pd pdVar5 = (pd) v5431423861497278836.b;
                        pdVar5.getClass();
                        pdVar5.adbEnabledSignal_ = G6547577305291411977.f(3);
                        i8 = pdVar5.bitField1_;
                        pdVar5.bitField1_ = i8 | 2048;
                    } else {
                        int i11 = bool.booleanValue() ? 2 : 1;
                        v5431423861497278836.b();
                        pd pdVar6 = (pd) v5431423861497278836.b;
                        pdVar6.getClass();
                        pdVar6.adbEnabledSignal_ = G6547577305291411977.f(i11);
                        i5 = pdVar6.bitField1_;
                        pdVar6.bitField1_ = i5 | 2048;
                    }
                    Boolean bool2 = (Boolean) objArr[5];
                    if (bool2 == null) {
                        v5431423861497278836.b();
                        pd pdVar7 = (pd) v5431423861497278836.b;
                        pdVar7.getClass();
                        pdVar7.usbConnectedSignal_ = G6547577305291411977.f(3);
                        i7 = pdVar7.bitField1_;
                        pdVar7.bitField1_ = i7 | 1024;
                    } else {
                        int i12 = bool2.booleanValue() ? 2 : 1;
                        v5431423861497278836.b();
                        pd pdVar8 = (pd) v5431423861497278836.b;
                        pdVar8.getClass();
                        pdVar8.usbConnectedSignal_ = G6547577305291411977.f(i12);
                        i6 = pdVar8.bitField1_;
                        pdVar8.bitField1_ = i6 | 1024;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f);
                objArr2.getClass();
                synchronized (v5431423861497278836) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    v5431423861497278836.b();
                    pd pdVar9 = (pd) v5431423861497278836.b;
                    i9 = pdVar9.bitField0_;
                    pdVar9.bitField0_ = i9 | 4;
                    pdVar9.atvSignal_ = longValue;
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    v5431423861497278836.b();
                    pd pdVar10 = (pd) v5431423861497278836.b;
                    i10 = pdVar10.bitField1_;
                    pdVar10.bitField1_ = i10 | 4194304;
                    pdVar10.processImportanceSignal_ = longValue2;
                }
                return;
        }
    }
}
