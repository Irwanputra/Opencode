package ads_mobile_sdk;

import android.net.NetworkCapabilities;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.V5431423861497278836;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a32 extends t93 {
    public final Object f;
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(V5431423861497278836 v5431423861497278836, rp1 rp1Var, Map map, vi3 vi3Var, byte b) {
        super("3SWPPciYi5aHoI1OBERhDipvlPpAtbhfeYDZhMqijRWqAxjBiv72prN8AzcVA5J9", "qGPJHMLFunr1AVkW6Fhi9ZzRNPJl3SeBnAUGHmixXQ0=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_NETWORK_SIGNALS_TASK));
        this.l = b;
        switch (b) {
            case 1:
                super("sAX/3/HOCTeahXhFfASNpd/c1hPgxO8Q5YUuIxnLYaEKGrUg4RvUMR7m2gTrRspl", "tw44Pm8L1hyUidMqnQUhLFu8E6wuFVyExTmoxz14Zrw=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_NAVIGATION_SIGNALS_TASK));
                this.f = map;
                break;
            default:
                this.f = map;
                break;
        }
    }

    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        Object obj;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        switch (this.l) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) ((Map) this.f).get("ntc"), (Long) ((Map) this.f).get("vs"), (Long) ((Map) this.f).get("vf"));
                objArr.getClass();
                synchronized (v5431423861497278836) {
                    try {
                        long longValue = ((Long) objArr[0]).longValue();
                        v5431423861497278836.b();
                        pd pdVar = (pd) v5431423861497278836.b;
                        i = pdVar.bitField0_;
                        pdVar.bitField0_ = i | 1024;
                        pdVar.netSignal_ = longValue;
                        long longValue2 = ((Long) objArr[1]).longValue();
                        if (longValue2 >= 0) {
                            v5431423861497278836.b();
                            pd pdVar2 = (pd) v5431423861497278836.b;
                            i4 = pdVar2.bitField2_;
                            pdVar2.bitField2_ = i4 | 2048;
                            pdVar2.timeSinceVpnOnMs_ = longValue2;
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        if (longValue3 >= 0) {
                            v5431423861497278836.b();
                            pd pdVar3 = (pd) v5431423861497278836.b;
                            i3 = pdVar3.bitField2_;
                            pdVar3.bitField2_ = i3 | 4096;
                            pdVar3.adeventToVpnOffMs_ = longValue3;
                        }
                        if (objArr.length > 3 && (obj = objArr[3]) != null) {
                            int _a$1 = G6547577305291411977._a$1(((Long) obj).intValue());
                            if (_a$1 == 0) {
                                throw null;
                            }
                            v5431423861497278836.b();
                            pd pdVar4 = (pd) v5431423861497278836.b;
                            pdVar4.getClass();
                            pdVar4.proxyDetectedSignal_ = G6547577305291411977.f(_a$1);
                            i2 = pdVar4.bitField2_;
                            pdVar4.bitField2_ = i2 | 16;
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                List list = (List) ((Map) this.f).get("vst");
                if (list == null) {
                    return;
                }
                Object invoke = method.invoke("", list);
                invoke.getClass();
                Long l = (Long) invoke;
                synchronized (v5431423861497278836) {
                    try {
                        int _a = G6547577305291411977._a(l.intValue());
                        if (_a == 0) {
                            throw null;
                        }
                        v5431423861497278836.b();
                        pd pdVar5 = (pd) v5431423861497278836.b;
                        pdVar5.getClass();
                        switch (_a) {
                            case 1:
                                i6 = 0;
                                break;
                            case 2:
                                i6 = 1;
                                break;
                            case 3:
                                break;
                            case 4:
                                i6 = 3;
                                break;
                            case 5:
                                i6 = 4;
                                break;
                            case 6:
                                i6 = 5;
                                break;
                            case 7:
                                i6 = 6;
                                break;
                            case 8:
                                i6 = 7;
                                break;
                            case 9:
                                i6 = 8;
                                break;
                            case 10:
                                i6 = 9;
                                break;
                            case 11:
                                i6 = 10;
                                break;
                            case 12:
                                i6 = 11;
                                break;
                            case 13:
                                i6 = 12;
                                break;
                            case 14:
                                i6 = 13;
                                break;
                            default:
                                throw null;
                        }
                        pdVar5.navigationTriggerType_ = i6;
                        i5 = pdVar5.bitField2_;
                        pdVar5.bitField2_ = i5 | 16777216;
                    } finally {
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", ((j7) this.f).F());
                objArr2.getClass();
                synchronized (v5431423861497278836) {
                    String str = (String) objArr2[0];
                    v5431423861497278836.b();
                    ((pd) v5431423861497278836.b).d(str);
                    String str2 = (String) objArr2[1];
                    v5431423861497278836.b();
                    ((pd) v5431423861497278836.b).c(str2);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(V5431423861497278836 v5431423861497278836, rp1 rp1Var, j7 j7Var, vi3 vi3Var) {
        super("hnBCwtuP5R5SJ5F4x4TxEurUH9ekxtbt0orp9iG05UpBiWU25w8Om1d8AQSEyroz", "BQOK0OF7gUdXqvqzzdyNoaNQjSVn8TXR/sCzgQu1m/I=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_ENV_VERSION_SIGNALS_TASK));
        this.l = (byte) 2;
        this.f = j7Var;
    }
}
