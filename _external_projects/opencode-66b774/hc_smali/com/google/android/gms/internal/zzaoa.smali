.class public final Lcom/google/android/gms/internal/zzaoa;
.super Lcom/google/android/gms/internal/zzlm;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final lock:Ljava/lang/Object;

.field private zzbgx:Z

.field private zzbgy:Z

.field private zzbgz:Z

.field private zzcfl:Lcom/google/android/gms/internal/zzlo;

.field private final zzdhj:Lcom/google/android/gms/internal/zzamp;

.field private final zzdmy:Z

.field private final zzdmz:Z

.field private final zzdna:F

.field private zzdnb:I

.field private zzdnc:Z

.field private zzdnd:Z

.field private zzdne:F

.field private zzdnf:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzamp;FZZ)V
    .registers 6

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzlm;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnd:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgx:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdhj:Lcom/google/android/gms/internal/zzamp;

    iput p2, p0, Lcom/google/android/gms/internal/zzaoa;->zzdna:F

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzaoa;->zzdmy:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzaoa;->zzdmz:Z

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzaoa;Z)Z
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnc:Z

    return p1
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzamp;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaoa;->zzdhj:Lcom/google/android/gms/internal/zzamp;

    return-object p0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzaoa;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    return-object p0
.end method

.method private final zzc(Ljava/lang/String;Ljava/util/Map;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_8

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    goto :goto_e

    :cond_8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p2, v0

    :goto_e
    const-string v0, "action"

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    new-instance p1, Lcom/google/android/gms/internal/zzaob;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/zzaob;-><init>(Lcom/google/android/gms/internal/zzaoa;Ljava/util/Map;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahn;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic zzd(Lcom/google/android/gms/internal/zzaoa;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnc:Z

    return p0
.end method

.method public static synthetic zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaoa;->zzcfl:Lcom/google/android/gms/internal/zzlo;

    return-object p0
.end method


# virtual methods
.method public final getAspectRatio()F
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnf:F

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final getPlaybackState()I
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnb:I

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final isClickToExpandEnabled()Z
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaoa;->isCustomControlsEnabled()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v1

    if-nez v0, :cond_15

    :try_start_9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgz:Z

    if-eqz v0, :cond_15

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaoa;->zzdmz:Z

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_16

    :catchall_13
    move-exception v0

    goto :goto_18

    :cond_15
    const/4 v0, 0x0

    :goto_16
    monitor-exit v1

    return v0

    :goto_18
    monitor-exit v1
    :try_end_19
    .catchall {:try_start_9 .. :try_end_19} :catchall_13

    throw v0
.end method

.method public final isCustomControlsEnabled()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdmy:Z

    if-eqz v1, :cond_d

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgy:Z

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    goto :goto_e

    :cond_d
    const/4 v1, 0x0

    :goto_e
    monitor-exit v0

    return v1

    :catchall_10
    move-exception v1

    monitor-exit v0
    :try_end_12
    .catchall {:try_start_3 .. :try_end_12} :catchall_10

    throw v1
.end method

.method public final isMuted()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnd:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final mute(Z)V
    .registers 3

    if-eqz p1, :cond_5

    const-string p1, "mute"

    goto :goto_7

    :cond_5
    const-string p1, "unmute"

    :goto_7
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzaoa;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final pause()V
    .registers 3

    const-string v0, "pause"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzaoa;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final play()V
    .registers 3

    const-string v0, "play"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzaoa;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zza(FIZF)V
    .registers 12

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdne:F

    iget-boolean v5, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnd:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnd:Z

    iget v3, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnb:I

    iput p2, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnb:I

    iget p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnf:F

    iput p4, p0, Lcom/google/android/gms/internal/zzaoa;->zzdnf:F

    sub-float/2addr p4, p1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const p4, 0x38d1b717    # 1.0E-4f

    cmpl-float p1, p1, p4

    if-lez p1, :cond_27

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdhj:Lcom/google/android/gms/internal/zzamp;
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_38

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_22
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_27
    monitor-exit v0
    :try_end_28
    .catchall {:try_start_22 .. :try_end_28} :catchall_38

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    new-instance p1, Lcom/google/android/gms/internal/zzaoc;

    move-object v1, p1

    move-object v2, p0

    move v4, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzaoc;-><init>(Lcom/google/android/gms/internal/zzaoa;IIZZ)V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahn;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :catchall_38
    move-exception p1

    :try_start_39
    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_39 .. :try_end_3a} :catchall_38

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzlo;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzcfl:Lcom/google/android/gms/internal/zzlo;

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzmr;)V
    .registers 10

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p1, Lcom/google/android/gms/internal/zzmr;->zzbgx:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgx:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/zzmr;->zzbgy:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgy:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/zzmr;->zzbgz:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaoa;->zzbgz:Z

    monitor-exit v0
    :try_end_10
    .catchall {:try_start_3 .. :try_end_10} :catchall_44

    const-string v0, "initialState"

    const-string v3, "muteStart"

    if-eqz v1, :cond_19

    const-string v1, "1"

    goto :goto_1b

    :cond_19
    const-string v1, "0"

    :goto_1b
    const-string v4, "customControlsRequested"

    if-eqz v2, :cond_22

    const-string v2, "1"

    goto :goto_24

    :cond_22
    const-string v2, "0"

    :goto_24
    const-string v5, "clickToExpandRequested"

    if-eqz p1, :cond_2b

    const-string p1, "1"

    goto :goto_2d

    :cond_2b
    const-string p1, "0"

    .line 1
    :goto_2d
    new-instance v6, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v7, 0x3

    invoke-direct {v6, v7}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>(I)V

    .line 2
    invoke-virtual {v6, v3, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v4, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v5, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/zzaoa;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :catchall_44
    move-exception p1

    :try_start_45
    monitor-exit v0
    :try_end_46
    .catchall {:try_start_45 .. :try_end_46} :catchall_44

    throw p1
.end method

.method public final zzih()F
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzaoa;->zzdna:F

    return v0
.end method

.method public final zzii()F
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzdne:F

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzij()Lcom/google/android/gms/internal/zzlo;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoa;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaoa;->zzcfl:Lcom/google/android/gms/internal/zzlo;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method
