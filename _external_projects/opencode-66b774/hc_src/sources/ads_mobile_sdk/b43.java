package ads_mobile_sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R16580349318584449994;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.V17794322577112576086;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class b43 extends V17794322577112576086 {
    public final Context a;
    public final jr0 b;
    public final O16637889491137121389 c;
    public final W5797197595347441198 d;
    public SensorManager e;
    public Sensor f;
    public long g;
    public int h;
    public w81 i;
    public boolean j;

    public b43(Context context, jr0 jr0Var, O16637889491137121389 o16637889491137121389, W5797197595347441198 w5797197595347441198) {
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.g = M9216324016624295870.Z(0, N13798149404328803870.MILLISECONDS);
    }

    @Override // dev.epro.r0.V17794322577112576086
    public final void a(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:inspector:shake_enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            byte b = 2;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) < ((Number) jr0Var.a("gads:inspector:shake_strength", Float.valueOf(2.0f), ao.a$17)).floatValue()) {
                return;
            }
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            this.c.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
            long a0 = M9216324016624295870.a0(elapsedRealtime, n13798149404328803870);
            long j = this.g;
            E17093345031926825464 e17093345031926825464 = new E17093345031926825464(M9216324016624295870.Z(500, n13798149404328803870));
            ao aoVar = ao.a;
            if (E17093345031926825464.c(a0, E17093345031926825464.h(j, ((E17093345031926825464) jr0Var.a("gads:inspector:shake_interval", e17093345031926825464, aoVar)).a)) < 0) {
                return;
            }
            if (E17093345031926825464.c(a0, E17093345031926825464.h(this.g, ((E17093345031926825464) jr0Var.a("gads:inspector:shake_reset_time_ms", new E17093345031926825464(M9216324016624295870.Z(3000, n13798149404328803870)), aoVar)).a)) > 0) {
                this.h = 0;
            }
            this.g = a0;
            this.h++;
            R16580349318584449994 r16580349318584449994 = new R16580349318584449994(this, null, b);
            W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(r16580349318584449994, null, (byte) 1), 2);
        }
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.j) {
                    SensorManager sensorManager = this.e;
                    if (sensorManager != null) {
                        Sensor sensor = this.f;
                        if (sensor != null) {
                            sensorManager.unregisterListener(this, sensor);
                            this.j = false;
                        } else {
                            S10823041268949770285.b0("accelerometer");
                            throw null;
                        }
                    } else {
                        S10823041268949770285.b0("sensorManager");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
