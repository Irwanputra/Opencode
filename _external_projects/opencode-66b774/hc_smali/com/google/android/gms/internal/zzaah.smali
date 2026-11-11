.class public final Lcom/google/android/gms/internal/zzaah;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcmu:Lcom/google/android/gms/internal/zzzy;

.field private synthetic zzcmv:Lcom/google/android/gms/internal/zzalh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzzy;Lcom/google/android/gms/internal/zzalh;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaah;->zzcmu:Lcom/google/android/gms/internal/zzzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaah;->zzcmv:Lcom/google/android/gms/internal/zzalh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaah;->zzcmu:Lcom/google/android/gms/internal/zzzy;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzzy;->zza(Lcom/google/android/gms/internal/zzzy;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_7
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaah;->zzcmu:Lcom/google/android/gms/internal/zzzy;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzzy;->zzb(Lcom/google/android/gms/internal/zzzy;)Lcom/google/android/gms/internal/zzaau;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/zzaau;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaah;->zzcmv:Lcom/google/android/gms/internal/zzalh;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzzy;->zza(Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzalh;)Lcom/google/android/gms/internal/zzaif;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/internal/zzzy;->zzcmq:Lcom/google/android/gms/internal/zzaif;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaah;->zzcmu:Lcom/google/android/gms/internal/zzzy;

    iget-object v2, v1, Lcom/google/android/gms/internal/zzzy;->zzcmq:Lcom/google/android/gms/internal/zzaif;

    if-nez v2, :cond_2e

    const/4 v2, 0x0

    const-string v3, "Could not start the ad request service."

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/zzzy;->zza(Lcom/google/android/gms/internal/zzzy;ILjava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaah;->zzcmu:Lcom/google/android/gms/internal/zzzy;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzzy;->zzc(Lcom/google/android/gms/internal/zzzy;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_2e
    monitor-exit v0

    return-void

    :catchall_30
    move-exception v1

    monitor-exit v0
    :try_end_32
    .catchall {:try_start_7 .. :try_end_32} :catchall_30

    throw v1
.end method
