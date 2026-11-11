.class public final Lcom/google/android/gms/internal/zzig;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざっざへづ;


# instance fields
.field private synthetic zzbaw:Lcom/google/android/gms/internal/zzid;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzid;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .registers 4

    iget-object p1, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzid;->zzc(Lcom/google/android/gms/internal/zzid;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzid;->zzd(Lcom/google/android/gms/internal/zzid;)Lcom/google/android/gms/internal/zzik;

    move-result-object v0

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzid;->zzd(Lcom/google/android/gms/internal/zzid;)Lcom/google/android/gms/internal/zzik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzik;->zzhk()Lcom/google/android/gms/internal/zzio;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzid;->zza(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzio;)Lcom/google/android/gms/internal/zzio;
    :try_end_1c
    .catch Landroid/os/DeadObjectException; {:try_start_7 .. :try_end_1c} :catch_1f
    .catchall {:try_start_7 .. :try_end_1c} :catchall_1d

    goto :goto_2a

    :catchall_1d
    move-exception v0

    goto :goto_35

    :catch_1f
    move-exception v0

    :try_start_20
    const-string v1, "Unable to obtain a cache service instance."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzid;->zza(Lcom/google/android/gms/internal/zzid;)V

    :cond_2a
    :goto_2a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzid;->zzc(Lcom/google/android/gms/internal/zzid;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :goto_35
    monitor-exit p1
    :try_end_36
    .catchall {:try_start_20 .. :try_end_36} :catchall_1d

    throw v0
.end method

.method public final onConnectionSuspended(I)V
    .registers 4

    iget-object p1, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzid;->zzc(Lcom/google/android/gms/internal/zzid;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzid;->zza(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzio;)Lcom/google/android/gms/internal/zzio;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzig;->zzbaw:Lcom/google/android/gms/internal/zzid;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzid;->zzc(Lcom/google/android/gms/internal/zzid;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_18
    move-exception v0

    monitor-exit p1
    :try_end_1a
    .catchall {:try_start_7 .. :try_end_1a} :catchall_18

    throw v0
.end method
