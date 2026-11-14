package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class b43 extends dev.epro.r0.V17794322577112576086 {
    public final android.content.Context a;
    public final ads_mobile_sdk.jr0 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public android.hardware.SensorManager e;
    public android.hardware.Sensor f;
    public long g;
    public int h;
    public ads_mobile_sdk.w81 i;
    public boolean j;

    public b43(android.content.Context context, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.g = dev.epro.r0.M9216324016624295870.Z(0, dev.epro.r0.N13798149404328803870.d);
    }

    public final void a(android.hardware.SensorEvent sensorEvent) {
        sensorEvent.getClass();
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:inspector:shake_enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) java.lang.Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) < ((java.lang.Number) jr0Var.a("gads:inspector:shake_strength", java.lang.Float.valueOf(2.0f), ads_mobile_sdk.ao.a$17)).floatValue()) {
                return;
            }
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            this.c.getClass();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
            long jA0 = dev.epro.r0.M9216324016624295870.a0(jElapsedRealtime, n13798149404328803870);
            long j = this.g;
            dev.epro.r0.E17093345031926825464 e17093345031926825464 = new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(500, n13798149404328803870));
            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a;
            if (dev.epro.r0.E17093345031926825464.c(jA0, dev.epro.r0.E17093345031926825464.h(j, ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:inspector:shake_interval", e17093345031926825464, aoVar)).a)) < 0) {
                return;
            }
            if (dev.epro.r0.E17093345031926825464.c(jA0, dev.epro.r0.E17093345031926825464.h(this.g, ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:inspector:shake_reset_time_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3000, n13798149404328803870)), aoVar)).a)) > 0) {
                this.h = 0;
            }
            this.g = jA0;
            this.h++;
            dev.epro.r0.R16580349318584449994 r16580349318584449994 = new dev.epro.r0.R16580349318584449994(this, (dev.epro.r0.R4833348786910499294) null, (byte) 2);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(r16580349318584449994, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        synchronized (this) {
            try {
                if (this.j) {
                    android.hardware.SensorManager sensorManager = this.e;
                    if (sensorManager != null) {
                        android.hardware.Sensor sensor = this.f;
                        if (sensor != null) {
                            sensorManager.unregisterListener((android.hardware.SensorEventListener) this, sensor);
                            this.j = false;
                        } else {
                            dev.epro.r0.S10823041268949770285.b0("accelerometer");
                            throw null;
                        }
                    } else {
                        dev.epro.r0.S10823041268949770285.b0("sensorManager");
                        throw null;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
