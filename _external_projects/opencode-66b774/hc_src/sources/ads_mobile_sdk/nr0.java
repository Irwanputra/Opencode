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
public final class nr0 extends V17794322577112576086 {
    public final Context a;
    public final jr0 b;
    public final O16637889491137121389 c;
    public final W5797197595347441198 d;
    public SensorManager e;
    public Sensor f;
    public float g;
    public float h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public w81 m;
    public boolean n;

    public nr0(Context context, jr0 jr0Var, O16637889491137121389 o16637889491137121389, W5797197595347441198 w5797197595347441198) {
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.i = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
    }

    @Override // dev.epro.r0.V17794322577112576086
    public final void a(SensorEvent sensorEvent) {
        Float valueOf = Float.valueOf(45.0f);
        sensorEvent.getClass();
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            this.c.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
            long a0 = M9216324016624295870.a0(elapsedRealtime, n13798149404328803870);
            if (E17093345031926825464.c(a0, E17093345031926825464.h(this.i, ((E17093345031926825464) jr0Var.a("gads:inspector:flick_reset_time_ms", new E17093345031926825464(M9216324016624295870.Z(3000, n13798149404328803870)), ao.a)).a)) > 0) {
                this.j = 0;
                this.i = a0;
                this.k = false;
                this.l = false;
                this.g = this.h;
            }
            float f = this.h + (sensorEvent.values[1] * 4.0f);
            this.h = f;
            float f2 = this.g;
            ao aoVar = ao.a$17;
            float floatValue = ((Number) jr0Var.a("gads:inspector:flick_rotation_threshold", valueOf, aoVar)).floatValue() + f2;
            float f3 = this.h;
            if (f > floatValue) {
                this.g = f3;
                this.l = true;
            } else if (f3 < this.g - ((Number) jr0Var.a("gads:inspector:flick_rotation_threshold", valueOf, aoVar)).floatValue()) {
                this.g = this.h;
                this.k = true;
            }
            if (Float.isInfinite(this.h)) {
                this.h = 0.0f;
                this.g = 0.0f;
            }
            if (this.k && this.l) {
                this.i = a0;
                this.j++;
                this.k = false;
                this.l = false;
                R16580349318584449994 r16580349318584449994 = new R16580349318584449994(this, null, (byte) 12);
                W5797197595347441198 w5797197595347441198 = this.d;
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(r16580349318584449994, null, (byte) 1), 2);
            }
        }
    }

    @Override // dev.epro.r0.V17794322577112576086
    public final void a(Sensor sensor) {
        sensor.getClass();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.n) {
                    SensorManager sensorManager = this.e;
                    if (sensorManager != null) {
                        Sensor sensor = this.f;
                        if (sensor != null) {
                            sensorManager.unregisterListener(this, sensor);
                            this.n = false;
                        } else {
                            S10823041268949770285.b0("gyroscope");
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
