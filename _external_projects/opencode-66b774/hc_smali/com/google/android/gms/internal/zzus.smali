.class public final Lcom/google/android/gms/internal/zzus;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/zzuo;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic zzcff:Lcom/google/android/gms/internal/zzul;

.field private synthetic zzcfg:Lcom/google/android/gms/internal/zzur;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzur;Lcom/google/android/gms/internal/zzul;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzus;->zzcfg:Lcom/google/android/gms/internal/zzur;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzus;->zzcff:Lcom/google/android/gms/internal/zzul;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzmd()Lcom/google/android/gms/internal/zzuo;
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzus;->zzcfg:Lcom/google/android/gms/internal/zzur;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzur;->zza(Lcom/google/android/gms/internal/zzur;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_7
    iget-object v1, p0, Lcom/google/android/gms/internal/zzus;->zzcfg:Lcom/google/android/gms/internal/zzur;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzur;->zzb(Lcom/google/android/gms/internal/zzur;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :cond_12
    monitor-exit v0
    :try_end_13
    .catchall {:try_start_7 .. :try_end_13} :catchall_26

    iget-object v0, p0, Lcom/google/android/gms/internal/zzus;->zzcff:Lcom/google/android/gms/internal/zzul;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzus;->zzcfg:Lcom/google/android/gms/internal/zzur;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzur;->zzc(Lcom/google/android/gms/internal/zzur;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzus;->zzcfg:Lcom/google/android/gms/internal/zzur;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzur;->zzd(Lcom/google/android/gms/internal/zzur;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzul;->zza(JJ)Lcom/google/android/gms/internal/zzuo;

    move-result-object v0

    return-object v0

    :catchall_26
    move-exception v1

    :try_start_27
    monitor-exit v0
    :try_end_28
    .catchall {:try_start_27 .. :try_end_28} :catchall_26

    throw v1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzus;->zzmd()Lcom/google/android/gms/internal/zzuo;

    move-result-object v0

    return-object v0
.end method
