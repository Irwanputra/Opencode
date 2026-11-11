.class public final Lcom/google/android/gms/internal/zztq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private zzcca:Lcom/google/android/gms/internal/zztx;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zztq;->mLock:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final zzb(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)Lcom/google/android/gms/internal/zztx;
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zztq;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zztq;->zzcca:Lcom/google/android/gms/internal/zztx;

    if-nez v1, :cond_22

    new-instance v1, Lcom/google/android/gms/internal/zztx;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_11

    :cond_10
    move-object p1, v2

    :goto_11
    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbhm:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/zztx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zztq;->zzcca:Lcom/google/android/gms/internal/zztx;

    :cond_22
    iget-object p1, p0, Lcom/google/android/gms/internal/zztq;->zzcca:Lcom/google/android/gms/internal/zztx;

    monitor-exit v0

    return-object p1

    :catchall_26
    move-exception p1

    monitor-exit v0
    :try_end_28
    .catchall {:try_start_3 .. :try_end_28} :catchall_26

    throw p1
.end method
