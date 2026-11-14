package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ng extends ads_mobile_sdk.t93 {
    public final java.util.Map f;
    public final android.content.Context g;
    public final ads_mobile_sdk.sb3 h;
    public final ads_mobile_sdk.vi3 i;
    public final long j;
    public final long k;

    public ng(dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, java.util.Map map, android.content.Context context, ads_mobile_sdk.sb3 sb3Var, ads_mobile_sdk.j7 j7Var, ads_mobile_sdk.vi3 vi3Var) {
        super("4P/F1RcDzGo5UDXZnJw4RMFeX971efDML+7xgh52XcslPWh3smbCiPfsLz3h8Upc", "J8oapsE5KyWFFBPtOWkKQ2mD+NOHxkFD9IjL+qyYEP0=", v5431423861497278836, rp1Var, vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_APP_INFO_SIGNALS_TASK));
        this.g = context;
        this.f = map;
        this.h = sb3Var;
        this.i = vi3Var;
        this.j = j7Var.D();
        this.k = j7Var.H();
    }

    @Override // ads_mobile_sdk.t93
    public final void a(java.lang.reflect.Method method, dev.epro.r0.V5431423861497278836 v5431423861497278836) {
        ads_mobile_sdk.pd pdVar;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", this.g, java.lang.Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        java.lang.String strP = "E";
        try {
            dev.epro.r0.D16915945238461757356 d16915945238461757356 = (dev.epro.r0.D16915945238461757356) this.f.get("gs");
            if (d16915945238461757356 != null && ((android.os.Build.VERSION.SDK_INT < 31 || d16915945238461757356.isDone()) && (pdVar = (ads_mobile_sdk.pd) d16915945238461757356.get(this.j, java.util.concurrent.TimeUnit.MILLISECONDS)) != null && pdVar.p().length() > 1)) {
                strP = pdVar.p();
            }
        } catch (java.lang.ClassCastException | java.util.concurrent.ExecutionException unused) {
        } catch (java.lang.InterruptedException unused2) {
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.TimeoutException unused3) {
            this.i.b(ads_mobile_sdk.yk0.EVENT_ID_APP_INFO_SIGNALS_TASK_GASS_TIMEOUT);
        }
        if (strP.equals("E")) {
            try {
                dev.epro.r0.D16915945238461757356 d169159452384617573562 = (dev.epro.r0.D16915945238461757356) this.f.get("ai");
                if (d169159452384617573562 != null) {
                    java.lang.String str = (java.lang.String) d169159452384617573562.get(this.k, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (!dev.epro.r0.T3803022700175900929.a(str)) {
                        strP = str;
                    }
                }
            } catch (java.lang.ClassCastException | java.util.concurrent.ExecutionException unused4) {
            } catch (java.lang.InterruptedException unused5) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.TimeoutException unused6) {
                this.i.b(ads_mobile_sdk.yk0.EVENT_ID_APP_INFO_SIGNALS_TASK_LOCAL_INT_TIMEOUT);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) objArr[5];
        java.lang.Long l = (java.lang.Long) objArr[6];
        synchronized (v5431423861497278836) {
            try {
                java.lang.Object obj = objArr[4];
                java.lang.String strEncodeToString = obj instanceof byte[] ? android.util.Base64.encodeToString(dev.epro.r0.W1349480363743553773.f.f().c((byte[]) obj).getBytes(java.nio.charset.StandardCharsets.UTF_8), 11) : (java.lang.String) obj;
                long jLongValue = ((java.lang.Long) objArr[0]).longValue();
                v5431423861497278836.b();
                ads_mobile_sdk.pd pdVar2 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                pdVar2.bitField0_ |= 536870912;
                pdVar2.vcdSignal_ = jLongValue;
                java.lang.String str2 = (java.lang.String) objArr[1];
                v5431423861497278836.b();
                ((ads_mobile_sdk.pd) v5431423861497278836.b).k(str2);
                java.lang.String str3 = (java.lang.String) objArr[2];
                v5431423861497278836.b();
                ((ads_mobile_sdk.pd) v5431423861497278836.b).e(str3);
                java.lang.String str4 = (java.lang.String) objArr[3];
                v5431423861497278836.b();
                ((ads_mobile_sdk.pd) v5431423861497278836.b).h(str4);
                v5431423861497278836.b();
                ((ads_mobile_sdk.pd) v5431423861497278836.b).f(strEncodeToString);
                v5431423861497278836.b();
                ((ads_mobile_sdk.pd) v5431423861497278836.b).i(strP);
                if (bool != null) {
                    int i = bool.booleanValue() ? 2 : 1;
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar3 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar3.getClass();
                    pdVar3.launcherActivityEnabled_ = dev.epro.r0.G6547577305291411977.f(i);
                    pdVar3.bitField2_ |= 32;
                }
                if (l != null) {
                    int i_a$1 = dev.epro.r0.G6547577305291411977._a$1(l.intValue());
                    if (i_a$1 == 0) {
                        throw null;
                    }
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar4 = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar4.getClass();
                    pdVar4.isLauncherSignal_ = dev.epro.r0.G6547577305291411977.f(i_a$1);
                    pdVar4.bitField3_ |= 1024;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
