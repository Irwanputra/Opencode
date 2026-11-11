.class public final Lcom/google/android/gms/internal/zzaar;
.super Lcom/google/android/gms/internal/zzaan;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざっざへづ;
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/でどあくず;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzapr:Lcom/google/android/gms/internal/zzakd;

.field private zzcmw:Lcom/google/android/gms/internal/zzalh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzalh<",
            "Lcom/google/android/gms/internal/zzaat;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcmx:Lcom/google/android/gms/internal/zzaal;

.field private zzcna:Lcom/google/android/gms/internal/zzaas;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzalh;Lcom/google/android/gms/internal/zzaal;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/zzakd;",
            "Lcom/google/android/gms/internal/zzalh<",
            "Lcom/google/android/gms/internal/zzaat;",
            ">;",
            "Lcom/google/android/gms/internal/zzaal;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p3, p4}, Lcom/google/android/gms/internal/zzaan;-><init>(Lcom/google/android/gms/internal/zzalh;Lcom/google/android/gms/internal/zzaal;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaar;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaar;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaar;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaar;->zzcmw:Lcom/google/android/gms/internal/zzalh;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzaar;->zzcmx:Lcom/google/android/gms/internal/zzaal;

    sget-object p2, Lcom/google/android/gms/internal/zznh;->zzbjf:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2d

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzew()Lcom/google/android/gms/internal/zzajf;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzajf;->zzqs()Landroid/os/Looper;

    move-result-object p2

    goto :goto_31

    :cond_2d
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    :goto_31
    move-object v2, p2

    new-instance p2, Lcom/google/android/gms/internal/zzaas;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaar;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget v5, p3, Lcom/google/android/gms/internal/zzakd;->zzdek:I

    move-object v0, p2

    move-object v1, p1

    move-object v3, p0

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzaas;-><init>(Landroid/content/Context;Landroid/os/Looper;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざっざへづ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/でどあくず;I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaar;->zzcna:Lcom/google/android/gms/internal/zzaas;

    invoke-virtual {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->zzakj()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaan;->zznd()Ljava/lang/Object;

    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .registers 11

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/zzaaq;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaar;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaar;->zzcmw:Lcom/google/android/gms/internal/zzalh;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaar;->zzcmx:Lcom/google/android/gms/internal/zzaal;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzaaq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzalh;Lcom/google/android/gms/internal/zzaal;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaif;->zznd()Ljava/lang/Object;

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    const-string p1, "action"

    const-string v0, "gms_connection_failed_fallback_to_local"

    invoke-virtual {v7, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaar;->mContext:Landroid/content/Context;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaar;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object v5, p1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const-string v6, "gmob-apps"

    const/4 v8, 0x1

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzahn;->zzb(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .registers 2

    const-string p1, "Disconnected from remote ad request service."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    return-void
.end method

.method public final zznk()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaar;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaar;->zzcna:Lcom/google/android/gms/internal/zzaas;

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->isConnected()Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaar;->zzcna:Lcom/google/android/gms/internal/zzaas;

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_18

    :cond_13
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaar;->zzcna:Lcom/google/android/gms/internal/zzaas;

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/は〲ぱなで;->disconnect()V

    :cond_18
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_1d
    move-exception v1

    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_1d

    throw v1
.end method

.method public final zznl()Lcom/google/android/gms/internal/zzabb;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaar;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaar;->zzcna:Lcom/google/android/gms/internal/zzaas;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaas;->zznm()Lcom/google/android/gms/internal/zzabb;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_9} :catch_d
    .catch Landroid/os/DeadObjectException; {:try_start_3 .. :try_end_9} :catch_d
    .catchall {:try_start_3 .. :try_end_9} :catchall_b

    :try_start_9
    monitor-exit v0

    return-object v1

    :catchall_b
    move-exception v1

    goto :goto_10

    :catch_d
    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :goto_10
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_9 .. :try_end_11} :catchall_b

    throw v1
.end method
