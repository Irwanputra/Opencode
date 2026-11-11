.class public abstract Lcom/google/android/gms/internal/zzxw;
.super Lcom/google/android/gms/internal/zzagb;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public final mContext:Landroid/content/Context;

.field public final mLock:Ljava/lang/Object;

.field public final zzcjj:Lcom/google/android/gms/internal/zzyb;

.field public final zzcjk:Lcom/google/android/gms/internal/zzafp;

.field public zzcjl:Lcom/google/android/gms/internal/zzaax;

.field public final zzcjn:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzyb;)V
    .registers 5

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzagb;-><init>(Z)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzxw;->mLock:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzxw;->zzcjn:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzxw;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object p1, p2, Lcom/google/android/gms/internal/zzafp;->zzcxy:Lcom/google/android/gms/internal/zzaax;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzxw;->zzcjj:Lcom/google/android/gms/internal/zzyb;

    return-void
.end method


# virtual methods
.method public onStop()V
    .registers 1

    return-void
.end method

.method public final zzdm()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxw;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    const-string v1, "AdRendererBackgroundTask started."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzxw;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget v1, v1, Lcom/google/android/gms/internal/zzafp;->errorCode:I
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_60

    :try_start_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/zzxw;->zze(J)V
    :try_end_13
    .catch Lcom/google/android/gms/internal/zzxz; {:try_start_c .. :try_end_13} :catch_14
    .catchall {:try_start_c .. :try_end_13} :catchall_60

    goto :goto_50

    :catch_14
    move-exception v1

    :try_start_15
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzxz;->getErrorCode()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_28

    const/4 v3, -0x1

    if-ne v2, v3, :cond_20

    goto :goto_28

    :cond_20
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_2f

    :cond_28
    :goto_28
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    :goto_2f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    if-nez v1, :cond_3b

    new-instance v1, Lcom/google/android/gms/internal/zzaax;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    :goto_38
    iput-object v1, p0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    goto :goto_45

    :cond_3b
    new-instance v1, Lcom/google/android/gms/internal/zzaax;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzxw;->zzcjl:Lcom/google/android/gms/internal/zzaax;

    iget-wide v3, v3, Lcom/google/android/gms/internal/zzaax;->zzcdq:J

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzaax;-><init>(IJ)V

    goto :goto_38

    :goto_45
    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/zzxx;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/zzxx;-><init>(Lcom/google/android/gms/internal/zzxw;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move v1, v2

    :goto_50
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzxw;->zzy(I)Lcom/google/android/gms/internal/zzafo;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/zzxy;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/zzxy;-><init>(Lcom/google/android/gms/internal/zzxw;Lcom/google/android/gms/internal/zzafo;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0

    return-void

    :catchall_60
    move-exception v1

    monitor-exit v0
    :try_end_62
    .catchall {:try_start_15 .. :try_end_62} :catchall_60

    goto :goto_64

    :goto_63
    throw v1

    :goto_64
    goto :goto_63
.end method

.method public abstract zze(J)V
.end method

.method public abstract zzy(I)Lcom/google/android/gms/internal/zzafo;
.end method
