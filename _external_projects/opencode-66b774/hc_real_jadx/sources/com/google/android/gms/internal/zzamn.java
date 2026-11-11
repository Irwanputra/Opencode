package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzzv
@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamn extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzamm {
    private static final float[] zzdhy = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int zzalv;
    private int zzalw;
    private final float[] zzdhv;
    private final zzamk zzdhz;
    private final float[] zzdia;
    private final float[] zzdib;
    private final float[] zzdic;
    private final float[] zzdid;
    private final float[] zzdie;
    private final float[] zzdif;
    private float zzdig;
    private float zzdih;
    private float zzdii;
    private SurfaceTexture zzdij;
    private SurfaceTexture zzdik;
    private int zzdil;
    private int zzdim;
    private int zzdin;
    private FloatBuffer zzdio;
    private final CountDownLatch zzdip;
    private final Object zzdiq;
    private EGL10 zzdir;
    private EGLDisplay zzdis;
    private EGLContext zzdit;
    private EGLSurface zzdiu;
    private volatile boolean zzdiv;
    private volatile boolean zzdiw;

    public zzamn(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zzdhy;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzdio = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.zzdhv = new float[9];
        this.zzdia = new float[9];
        this.zzdib = new float[9];
        this.zzdic = new float[9];
        this.zzdid = new float[9];
        this.zzdie = new float[9];
        this.zzdif = new float[9];
        this.zzdig = Float.NaN;
        zzamk zzamkVar = new zzamk(context);
        this.zzdhz = zzamkVar;
        zzamkVar.zza(this);
        this.zzdip = new CountDownLatch(1);
        this.zzdiq = new Object();
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[2] * fArr3[6]) + (fArr2[1] * fArr3[3]) + (fArr2[0] * fArr3[0]);
        fArr[1] = (fArr2[2] * fArr3[7]) + (fArr2[1] * fArr3[4]) + (fArr2[0] * fArr3[1]);
        fArr[2] = (fArr2[2] * fArr3[8]) + (fArr2[1] * fArr3[5]) + (fArr2[0] * fArr3[2]);
        fArr[3] = (fArr2[5] * fArr3[6]) + (fArr2[4] * fArr3[3]) + (fArr2[3] * fArr3[0]);
        fArr[4] = (fArr2[5] * fArr3[7]) + (fArr2[4] * fArr3[4]) + (fArr2[3] * fArr3[1]);
        fArr[5] = (fArr2[5] * fArr3[8]) + (fArr2[4] * fArr3[5]) + (fArr2[3] * fArr3[2]);
        fArr[6] = (fArr2[8] * fArr3[6]) + (fArr2[7] * fArr3[3]) + (fArr2[6] * fArr3[0]);
        fArr[7] = (fArr2[8] * fArr3[7]) + (fArr2[7] * fArr3[4]) + (fArr2[6] * fArr3[1]);
        fArr[8] = (fArr2[8] * fArr3[8]) + (fArr2[7] * fArr3[5]) + (fArr2[6] * fArr3[2]);
    }

    private static void zzb(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static void zzcw(String str) {
        if (GLES20.glGetError() != 0) {
            String.valueOf(str).length();
        }
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzcw("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        zzcw("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        zzcw("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        zzcw("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        zzcw("deleteShader");
        return 0;
    }

    private final void zzsd() {
        while (this.zzdin > 0) {
            this.zzdij.updateTexImage();
            this.zzdin--;
        }
        if (this.zzdhz.zza(this.zzdhv)) {
            if (Float.isNaN(this.zzdig)) {
                float[] fArr = this.zzdhv;
                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                float[] fArr3 = {(fArr[2] * fArr2[2]) + (fArr[1] * fArr2[1]) + (fArr[0] * fArr2[0]), (fArr[5] * fArr2[2]) + (fArr[4] * fArr2[1]) + (fArr[3] * fArr2[0]), (fArr[8] * fArr2[2]) + (fArr[7] * fArr2[1]) + (fArr[6] * fArr2[0])};
                this.zzdig = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
            }
            zzb(this.zzdie, this.zzdig + this.zzdih);
        } else {
            zza(this.zzdhv, -1.5707964f);
            zzb(this.zzdie, this.zzdih);
        }
        zza(this.zzdia, 1.5707964f);
        zza(this.zzdib, this.zzdie, this.zzdia);
        zza(this.zzdic, this.zzdhv, this.zzdib);
        zza(this.zzdid, this.zzdii);
        zza(this.zzdif, this.zzdid, this.zzdic);
        GLES20.glUniformMatrix3fv(this.zzdim, 1, false, this.zzdif, 0);
        GLES20.glDrawArrays(5, 0, 4);
        zzcw("drawArrays");
        GLES20.glFinish();
        this.zzdir.eglSwapBuffers(this.zzdis, this.zzdiu);
    }

    private final boolean zzse() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzdiu;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.zzdir.eglDestroySurface(this.zzdis, this.zzdiu) | this.zzdir.eglMakeCurrent(this.zzdis, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.zzdiu = null;
        }
        EGLContext eGLContext = this.zzdit;
        if (eGLContext != null) {
            z |= this.zzdir.eglDestroyContext(this.zzdis, eGLContext);
            this.zzdit = null;
        }
        EGLDisplay eGLDisplay = this.zzdis;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.zzdir.eglTerminate(eGLDisplay);
        this.zzdis = null;
        return eglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzdin++;
        synchronized (this.zzdiq) {
            this.zzdiq.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b6  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamn.run():void");
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzalv = i;
        this.zzalw = i2;
        this.zzdik = surfaceTexture;
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.zzalv;
        int i2 = this.zzalw;
        float f6 = f * 1.7453293f;
        if (i > i2) {
            f3 = f6 / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = f6 / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.zzdih -= f3;
        float f7 = this.zzdii - (f4 / f5);
        this.zzdii = f7;
        if (f7 < -1.5707964f) {
            this.zzdii = -1.5707964f;
        }
        if (this.zzdii > 1.5707964f) {
            this.zzdii = 1.5707964f;
        }
    }

    public final void zzh(int i, int i2) {
        synchronized (this.zzdiq) {
            this.zzalv = i;
            this.zzalw = i2;
            this.zzdiv = true;
            this.zzdiq.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.zzamm
    public final void zzmy() {
        synchronized (this.zzdiq) {
            this.zzdiq.notifyAll();
        }
    }

    public final void zzsb() {
        synchronized (this.zzdiq) {
            this.zzdiw = true;
            this.zzdik = null;
            this.zzdiq.notifyAll();
        }
    }

    public final SurfaceTexture zzsc() {
        if (this.zzdik == null) {
            return null;
        }
        try {
            this.zzdip.await();
        } catch (InterruptedException unused) {
        }
        return this.zzdij;
    }
}
