package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class nr0 extends dev.epro.r0.V17794322577112576086 {
    public final android.content.Context a;
    public final ads_mobile_sdk.jr0 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public android.hardware.SensorManager e;
    public android.hardware.Sensor f;
    public float g;
    public float h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public ads_mobile_sdk.w81 m;
    public boolean n;

    public nr0(android.content.Context context, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.i = dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d);
    }

    public final void a(android.hardware.SensorEvent sensorEvent) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(45.0f);
        sensorEvent.getClass();
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:inspector:flick_enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            this.c.getClass();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
            long jA0 = dev.epro.r0.M9216324016624295870.a0(jElapsedRealtime, n13798149404328803870);
            if (dev.epro.r0.E17093345031926825464.c(jA0, dev.epro.r0.E17093345031926825464.h(this.i, ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:inspector:flick_reset_time_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3000, n13798149404328803870)), ads_mobile_sdk.ao.a)).a)) > 0) {
                this.j = 0;
                this.i = jA0;
                this.k = false;
                this.l = false;
                this.g = this.h;
            }
            float f = this.h + (sensorEvent.values[1] * 4.0f);
            this.h = f;
            float f2 = this.g;
            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$17;
            float fFloatValue = ((java.lang.Number) jr0Var.a("gads:inspector:flick_rotation_threshold", fValueOf, aoVar)).floatValue() + f2;
            float f3 = this.h;
            if (f > fFloatValue) {
                this.g = f3;
                this.l = true;
            } else if (f3 < this.g - ((java.lang.Number) jr0Var.a("gads:inspector:flick_rotation_threshold", fValueOf, aoVar)).floatValue()) {
                this.g = this.h;
                this.k = true;
            }
            if (java.lang.Float.isInfinite(this.h)) {
                this.h = 0.0f;
                this.g = 0.0f;
            }
            if (this.k && this.l) {
                this.i = jA0;
                this.j++;
                this.k = false;
                this.l = false;
                dev.epro.r0.R16580349318584449994 r16580349318584449994 = new dev.epro.r0.R16580349318584449994(this, (dev.epro.r0.R4833348786910499294) null, (byte) 12);
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(r16580349318584449994, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
        }
    }

    public final void a(android.hardware.Sensor sensor) {
        sensor.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        synchronized (this) {
            try {
                if (this.n) {
                    android.hardware.SensorManager sensorManager = this.e;
                    if (sensorManager != null) {
                        android.hardware.Sensor sensor = this.f;
                        if (sensor != null) {
                            sensorManager.unregisterListener((android.hardware.SensorEventListener) this, sensor);
                            this.n = false;
                        } else {
                            dev.epro.r0.S10823041268949770285.b0("gyroscope");
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
