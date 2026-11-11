.class public final Lcom/google/android/gms/internal/zzafv;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private volatile zzczn:I

.field private volatile zzczo:J


# direct methods
.method private constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafv;->mLock:Ljava/lang/Object;

    sget v0, Lcom/google/android/gms/internal/zzafw;->zzczp:I

    iput v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczo:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/zzafu;)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafv;-><init>()V

    return-void
.end method

.method private final zzd(II)V
    .registers 7

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafv;->zzpw()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzafv;->mLock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_13
    iget v3, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    if-eq v3, p1, :cond_19

    monitor-exit v2

    return-void

    :cond_19
    iput p2, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    iget p1, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    sget p2, Lcom/google/android/gms/internal/zzafw;->zzczr:I

    if-ne p1, p2, :cond_23

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczo:J

    :cond_23
    monitor-exit v2

    return-void

    :catchall_25
    move-exception p1

    monitor-exit v2
    :try_end_27
    .catchall {:try_start_13 .. :try_end_27} :catchall_25

    throw p1
.end method

.method private final zzpw()V
    .registers 8

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzafv;->mLock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_10
    iget v3, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    sget v4, Lcom/google/android/gms/internal/zzafw;->zzczr:I

    if-ne v3, v4, :cond_31

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzafv;->zzczo:J

    sget-object v5, Lcom/google/android/gms/internal/zznh;->zzbrt:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v3, v5

    cmp-long v5, v3, v0

    if-gtz v5, :cond_31

    sget v0, Lcom/google/android/gms/internal/zzafw;->zzczp:I

    iput v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    :cond_31
    monitor-exit v2

    return-void

    :catchall_33
    move-exception v0

    monitor-exit v2
    :try_end_35
    .catchall {:try_start_10 .. :try_end_35} :catchall_33

    throw v0
.end method


# virtual methods
.method public final zzpm()Z
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafv;->zzpw()V

    iget v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    sget v1, Lcom/google/android/gms/internal/zzafw;->zzczq:I

    if-ne v0, v1, :cond_b

    const/4 v0, 0x1

    return v0

    :cond_b
    const/4 v0, 0x0

    return v0
.end method

.method public final zzpn()Z
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafv;->zzpw()V

    iget v0, p0, Lcom/google/android/gms/internal/zzafv;->zzczn:I

    sget v1, Lcom/google/android/gms/internal/zzafw;->zzczr:I

    if-ne v0, v1, :cond_b

    const/4 v0, 0x1

    return v0

    :cond_b
    const/4 v0, 0x0

    return v0
.end method

.method public final zzpo()V
    .registers 3

    sget v0, Lcom/google/android/gms/internal/zzafw;->zzczq:I

    sget v1, Lcom/google/android/gms/internal/zzafw;->zzczr:I

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzafv;->zzd(II)V

    return-void
.end method

.method public final zzz(Z)V
    .registers 3

    if-eqz p1, :cond_a

    sget p1, Lcom/google/android/gms/internal/zzafw;->zzczp:I

    sget v0, Lcom/google/android/gms/internal/zzafw;->zzczq:I

    :goto_6
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzafv;->zzd(II)V

    return-void

    :cond_a
    sget p1, Lcom/google/android/gms/internal/zzafw;->zzczq:I

    sget v0, Lcom/google/android/gms/internal/zzafw;->zzczp:I

    goto :goto_6
.end method
