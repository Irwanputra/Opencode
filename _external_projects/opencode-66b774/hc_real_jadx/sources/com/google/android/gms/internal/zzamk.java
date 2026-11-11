package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamk implements SensorEventListener {
    private final SensorManager zzdhq;
    private final Display zzdhs;
    private float[] zzdhv;
    private Handler zzdhw;
    private zzamm zzdhx;
    private final float[] zzdht = new float[9];
    private final float[] zzdhu = new float[9];
    private final Object zzdhr = new Object();

    public zzamk(Context context) {
        this.zzdhq = (SensorManager) context.getSystemService("sensor");
        this.zzdhs = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void zzg(int i, int i2) {
        float[] fArr = this.zzdhu;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzdhr) {
            if (this.zzdhv == null) {
                this.zzdhv = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzdht, fArr);
        int rotation = this.zzdhs.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzdht, 2, 129, this.zzdhu);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzdht, 129, 130, this.zzdhu);
        } else if (rotation != 3) {
            System.arraycopy(this.zzdht, 0, this.zzdhu, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.zzdht, 130, 1, this.zzdhu);
        }
        zzg(1, 3);
        zzg(2, 6);
        zzg(5, 7);
        synchronized (this.zzdhr) {
            System.arraycopy(this.zzdhu, 0, this.zzdhv, 0, 9);
        }
        zzamm zzammVar = this.zzdhx;
        if (zzammVar != null) {
            zzammVar.zzmy();
        }
    }

    public final void start() {
        if (this.zzdhw != null) {
            return;
        }
        Sensor defaultSensor = this.zzdhq.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzakb.e("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.zzdhw = handler;
        if (this.zzdhq.registerListener(this, defaultSensor, 0, handler)) {
            return;
        }
        zzakb.e("SensorManager.registerListener failed.");
        stop();
    }

    public final void stop() {
        if (this.zzdhw == null) {
            return;
        }
        this.zzdhq.unregisterListener(this);
        this.zzdhw.post(new zzaml(this));
        this.zzdhw = null;
    }

    public final void zza(zzamm zzammVar) {
        this.zzdhx = zzammVar;
    }

    public final boolean zza(float[] fArr) {
        synchronized (this.zzdhr) {
            float[] fArr2 = this.zzdhv;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            return true;
        }
    }
}
