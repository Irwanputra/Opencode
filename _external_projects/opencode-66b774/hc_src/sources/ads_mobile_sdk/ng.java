package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.T3803022700175900929;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.W1349480363743553773;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ng extends t93 {
    public final Map f;
    public final Context g;
    public final sb3 h;
    public final vi3 i;
    public final long j;
    public final long k;

    public ng(V5431423861497278836 v5431423861497278836, rp1 rp1Var, Map map, Context context, sb3 sb3Var, j7 j7Var, vi3 vi3Var) {
        super("4P/F1RcDzGo5UDXZnJw4RMFeX971efDML+7xgh52XcslPWh3smbCiPfsLz3h8Upc", "J8oapsE5KyWFFBPtOWkKQ2mD+NOHxkFD9IjL+qyYEP0=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_APP_INFO_SIGNALS_TASK));
        this.g = context;
        this.f = map;
        this.h = sb3Var;
        this.i = vi3Var;
        this.j = j7Var.D();
        this.k = j7Var.H();
    }

    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        int i3;
        pd pdVar;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String str = "E";
        try {
            D16915945238461757356 d16915945238461757356 = (D16915945238461757356) this.f.get("gs");
            if (d16915945238461757356 != null && ((Build.VERSION.SDK_INT < 31 || d16915945238461757356.isDone()) && (pdVar = (pd) d16915945238461757356.get(this.j, TimeUnit.MILLISECONDS)) != null && pdVar.p().length() > 1)) {
                str = pdVar.p();
            }
        } catch (ClassCastException | ExecutionException unused) {
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        } catch (TimeoutException unused3) {
            this.i.b(yk0.EVENT_ID_APP_INFO_SIGNALS_TASK_GASS_TIMEOUT);
        }
        if (str.equals("E")) {
            try {
                D16915945238461757356 d169159452384617573562 = (D16915945238461757356) this.f.get("ai");
                if (d169159452384617573562 != null) {
                    String str2 = (String) d169159452384617573562.get(this.k, TimeUnit.MILLISECONDS);
                    if (!T3803022700175900929.a(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | ExecutionException unused4) {
            } catch (InterruptedException unused5) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused6) {
                this.i.b(yk0.EVENT_ID_APP_INFO_SIGNALS_TASK_LOCAL_INT_TIMEOUT);
            }
        }
        Boolean bool = (Boolean) objArr[5];
        Long l = (Long) objArr[6];
        synchronized (v5431423861497278836) {
            try {
                Object obj = objArr[4];
                String encodeToString = obj instanceof byte[] ? Base64.encodeToString(W1349480363743553773.f.f().c((byte[]) obj).getBytes(StandardCharsets.UTF_8), 11) : (String) obj;
                long longValue = ((Long) objArr[0]).longValue();
                v5431423861497278836.b();
                pd pdVar2 = (pd) v5431423861497278836.b;
                i = pdVar2.bitField0_;
                pdVar2.bitField0_ = i | SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                pdVar2.vcdSignal_ = longValue;
                String str3 = (String) objArr[1];
                v5431423861497278836.b();
                ((pd) v5431423861497278836.b).k(str3);
                String str4 = (String) objArr[2];
                v5431423861497278836.b();
                ((pd) v5431423861497278836.b).e(str4);
                String str5 = (String) objArr[3];
                v5431423861497278836.b();
                ((pd) v5431423861497278836.b).h(str5);
                v5431423861497278836.b();
                ((pd) v5431423861497278836.b).f(encodeToString);
                v5431423861497278836.b();
                ((pd) v5431423861497278836.b).i(str);
                if (bool != null) {
                    int i4 = bool.booleanValue() ? 2 : 1;
                    v5431423861497278836.b();
                    pd pdVar3 = (pd) v5431423861497278836.b;
                    pdVar3.getClass();
                    pdVar3.launcherActivityEnabled_ = G6547577305291411977.f(i4);
                    i3 = pdVar3.bitField2_;
                    pdVar3.bitField2_ = i3 | 32;
                }
                if (l != null) {
                    int _a$1 = G6547577305291411977._a$1(l.intValue());
                    if (_a$1 == 0) {
                        throw null;
                    }
                    v5431423861497278836.b();
                    pd pdVar4 = (pd) v5431423861497278836.b;
                    pdVar4.getClass();
                    pdVar4.isLauncherSignal_ = G6547577305291411977.f(_a$1);
                    i2 = pdVar4.bitField3_;
                    pdVar4.bitField3_ = i2 | 1024;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
