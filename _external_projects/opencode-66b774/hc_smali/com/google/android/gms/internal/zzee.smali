.class public final Lcom/google/android/gms/internal/zzee;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final zzagr:Lcom/google/android/gms/internal/zzdm;

.field private final zzako:Lcom/google/android/gms/internal/zzaz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzaz;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzee;->zzagr:Lcom/google/android/gms/internal/zzdm;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzee;->zzako:Lcom/google/android/gms/internal/zzaz;

    return-void
.end method

.method private final zzba()Ljava/lang/Void;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzee;->zzagr:Lcom/google/android/gms/internal/zzdm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdm;->zzap()Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/gms/internal/zzee;->zzagr:Lcom/google/android/gms/internal/zzdm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdm;->zzap()Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzee;->zzagr:Lcom/google/android/gms/internal/zzdm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdm;->zzao()Lcom/google/android/gms/internal/zzaz;

    move-result-object v0

    if-eqz v0, :cond_2a

    :try_start_19
    iget-object v1, p0, Lcom/google/android/gms/internal/zzee;->zzako:Lcom/google/android/gms/internal/zzaz;

    monitor-enter v1
    :try_end_1c
    .catch Lcom/google/android/gms/internal/zzfjr; {:try_start_19 .. :try_end_1c} :catch_2a

    :try_start_1c
    iget-object v2, p0, Lcom/google/android/gms/internal/zzee;->zzako:Lcom/google/android/gms/internal/zzaz;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfjs;->zzc(Lcom/google/android/gms/internal/zzfjs;)[B

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzfjs;->zza(Lcom/google/android/gms/internal/zzfjs;[B)Lcom/google/android/gms/internal/zzfjs;

    monitor-exit v1

    goto :goto_2a

    :catchall_27
    move-exception v0

    monitor-exit v1
    :try_end_29
    .catchall {:try_start_1c .. :try_end_29} :catchall_27

    :try_start_29
    throw v0
    :try_end_2a
    .catch Lcom/google/android/gms/internal/zzfjr; {:try_start_29 .. :try_end_2a} :catch_2a

    :catch_2a
    :cond_2a
    :goto_2a
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzee;->zzba()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
