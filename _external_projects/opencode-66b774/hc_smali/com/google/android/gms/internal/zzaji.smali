.class public final Lcom/google/android/gms/internal/zzaji;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private mLock:Ljava/lang/Object;

.field private zzdda:J

.field private zzddb:J


# direct methods
.method public constructor <init>(J)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaji;->zzddb:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji;->mLock:Ljava/lang/Object;

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaji;->zzdda:J

    return-void
.end method


# virtual methods
.method public final tryAcquire()Z
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 2
    iget-wide v3, p0, Lcom/google/android/gms/internal/zzaji;->zzddb:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/zzaji;->zzdda:J

    add-long/2addr v3, v5

    cmp-long v5, v3, v1

    if-lez v5, :cond_1c

    const/4 v1, 0x0

    monitor-exit v0

    return v1

    :cond_1c
    iput-wide v1, p0, Lcom/google/android/gms/internal/zzaji;->zzddb:J

    const/4 v1, 0x1

    monitor-exit v0

    return v1

    :catchall_21
    move-exception v1

    monitor-exit v0
    :try_end_23
    .catchall {:try_start_3 .. :try_end_23} :catchall_21

    throw v1
.end method
