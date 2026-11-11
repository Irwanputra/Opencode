.class public final Lcom/google/android/gms/internal/zzamk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzdhq:Landroid/hardware/SensorManager;

.field private final zzdhr:Ljava/lang/Object;

.field private final zzdhs:Landroid/view/Display;

.field private final zzdht:[F

.field private final zzdhu:[F

.field private zzdhv:[F

.field private zzdhw:Landroid/os/Handler;

.field private zzdhx:Lcom/google/android/gms/internal/zzamm;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhq:Landroid/hardware/SensorManager;

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhs:Landroid/view/Display;

    const/16 p1, 0x9

    new-array v0, p1, [F

    iput-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhr:Ljava/lang/Object;

    return-void
.end method

.method private final zzg(II)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    aget v1, v0, p1

    aget v2, v0, p2

    aput v2, v0, p1

    aput v1, v0, p2

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .registers 3

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .registers 10

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    cmpl-float v1, v1, v2

    if-nez v1, :cond_18

    aget v1, p1, v4

    cmpl-float v1, v1, v2

    if-nez v1, :cond_18

    aget v1, p1, v3

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_79

    :cond_18
    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhr:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1b
    iget-object v2, p0, Lcom/google/android/gms/internal/zzamk;->zzdhv:[F

    const/16 v5, 0x9

    if-nez v2, :cond_25

    new-array v2, v5, [F

    iput-object v2, p0, Lcom/google/android/gms/internal/zzamk;->zzdhv:[F

    :cond_25
    monitor-exit v1
    :try_end_26
    .catchall {:try_start_1b .. :try_end_26} :catchall_7d

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    invoke-static {v1, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhs:Landroid/view/Display;

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    const/16 v1, 0x81

    const/4 v2, 0x3

    if-eq p1, v4, :cond_54

    const/16 v6, 0x82

    if-eq p1, v3, :cond_4c

    if-eq p1, v2, :cond_44

    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    invoke-static {p1, v0, v1, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5b

    :cond_44
    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    invoke-static {p1, v6, v4, v1}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    goto :goto_5b

    :cond_4c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    iget-object v7, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    invoke-static {p1, v1, v6, v7}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    goto :goto_5b

    :cond_54
    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdht:[F

    iget-object v6, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    invoke-static {p1, v3, v1, v6}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    :goto_5b
    invoke-direct {p0, v4, v2}, Lcom/google/android/gms/internal/zzamk;->zzg(II)V

    const/4 p1, 0x6

    invoke-direct {p0, v3, p1}, Lcom/google/android/gms/internal/zzamk;->zzg(II)V

    const/4 p1, 0x5

    const/4 v1, 0x7

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/zzamk;->zzg(II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhr:Ljava/lang/Object;

    monitor-enter p1

    :try_start_6a
    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhu:[F

    iget-object v2, p0, Lcom/google/android/gms/internal/zzamk;->zzdhv:[F

    invoke-static {v1, v0, v2, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    monitor-exit p1
    :try_end_72
    .catchall {:try_start_6a .. :try_end_72} :catchall_7a

    iget-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhx:Lcom/google/android/gms/internal/zzamm;

    if-eqz p1, :cond_79

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzamm;->zzmy()V

    :cond_79
    return-void

    :catchall_7a
    move-exception v0

    :try_start_7b
    monitor-exit p1
    :try_end_7c
    .catchall {:try_start_7b .. :try_end_7c} :catchall_7a

    throw v0

    :catchall_7d
    move-exception p1

    :try_start_7e
    monitor-exit v1
    :try_end_7f
    .catchall {:try_start_7e .. :try_end_7f} :catchall_7d

    throw p1
.end method

.method public final start()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhw:Landroid/os/Handler;

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhq:Landroid/hardware/SensorManager;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    if-nez v0, :cond_15

    const-string v0, "No Sensor of TYPE_ROTATION_VECTOR"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    return-void

    :cond_15
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "OrientationMonitor"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzamk;->zzdhw:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhq:Landroid/hardware/SensorManager;

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v0, v3, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z

    move-result v0

    if-nez v0, :cond_3b

    const-string v0, "SensorManager.registerListener failed."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzamk;->stop()V

    :cond_3b
    return-void
.end method

.method public final stop()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhw:Landroid/os/Handler;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhq:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhw:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzaml;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzaml;-><init>(Lcom/google/android/gms/internal/zzamk;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhw:Landroid/os/Handler;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzamm;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhx:Lcom/google/android/gms/internal/zzamm;

    return-void
.end method

.method public final zza([F)Z
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamk;->zzdhr:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzamk;->zzdhv:[F

    const/4 v2, 0x0

    if-nez v1, :cond_a

    monitor-exit v0

    return v2

    :cond_a
    array-length v3, v1

    invoke-static {v1, v2, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    monitor-exit v0

    return p1

    :catchall_11
    move-exception p1

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_3 .. :try_end_13} :catchall_11

    throw p1
.end method
