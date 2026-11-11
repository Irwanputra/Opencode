.class public final Lcom/google/android/gms/internal/zzaoc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzdng:Lcom/google/android/gms/internal/zzaoa;

.field private synthetic zzdnh:I

.field private synthetic zzdni:I

.field private synthetic zzdnj:Z

.field private synthetic zzdnk:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaoa;IIZZ)V
    .registers 6

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    iput p2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnh:I

    iput p3, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnj:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnk:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 11

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaoa;->zzc(Lcom/google/android/gms/internal/zzaoa;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_7
    iget v1, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnh:I

    iget v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_11

    const/4 v1, 0x1

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaoa;->zzd(Lcom/google/android/gms/internal/zzaoa;)Z

    move-result v2

    if-nez v2, :cond_20

    iget v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    if-ne v2, v4, :cond_20

    const/4 v2, 0x1

    goto :goto_21

    :cond_20
    const/4 v2, 0x0

    :goto_21
    if-eqz v1, :cond_29

    iget v5, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    if-ne v5, v4, :cond_29

    const/4 v5, 0x1

    goto :goto_2a

    :cond_29
    const/4 v5, 0x0

    :goto_2a
    if-eqz v1, :cond_33

    iget v6, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_33

    const/4 v6, 0x1

    goto :goto_34

    :cond_33
    const/4 v6, 0x0

    :goto_34
    if-eqz v1, :cond_3d

    iget v1, p0, Lcom/google/android/gms/internal/zzaoc;->zzdni:I

    const/4 v7, 0x3

    if-ne v1, v7, :cond_3d

    const/4 v1, 0x1

    goto :goto_3e

    :cond_3d
    const/4 v1, 0x0

    :goto_3e
    iget-boolean v7, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnj:Z

    iget-boolean v8, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnk:Z

    if-eq v7, v8, :cond_46

    const/4 v7, 0x1

    goto :goto_47

    :cond_46
    const/4 v7, 0x0

    :goto_47
    iget-object v8, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v8}, Lcom/google/android/gms/internal/zzaoa;->zzd(Lcom/google/android/gms/internal/zzaoa;)Z

    move-result v9

    if-nez v9, :cond_51

    if-eqz v2, :cond_52

    :cond_51
    const/4 v3, 0x1

    :cond_52
    invoke-static {v8, v3}, Lcom/google/android/gms/internal/zzaoa;->zza(Lcom/google/android/gms/internal/zzaoa;Z)Z

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v3

    if-nez v3, :cond_5f

    monitor-exit v0
    :try_end_5e
    .catchall {:try_start_7 .. :try_end_5e} :catchall_bd

    return-void

    :cond_5f
    if-eqz v2, :cond_71

    :try_start_61
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzlo;->onVideoStart()V
    :try_end_6a
    .catch Landroid/os/RemoteException; {:try_start_61 .. :try_end_6a} :catch_6b
    .catchall {:try_start_61 .. :try_end_6a} :catchall_bd

    goto :goto_71

    :catch_6b
    move-exception v2

    :try_start_6c
    const-string v3, "Unable to call onVideoStart()"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_71
    .catchall {:try_start_6c .. :try_end_71} :catchall_bd

    :cond_71
    :goto_71
    if-eqz v5, :cond_83

    :try_start_73
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzlo;->onVideoPlay()V
    :try_end_7c
    .catch Landroid/os/RemoteException; {:try_start_73 .. :try_end_7c} :catch_7d
    .catchall {:try_start_73 .. :try_end_7c} :catchall_bd

    goto :goto_83

    :catch_7d
    move-exception v2

    :try_start_7e
    const-string v3, "Unable to call onVideoPlay()"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_83
    .catchall {:try_start_7e .. :try_end_83} :catchall_bd

    :cond_83
    :goto_83
    if-eqz v6, :cond_95

    :try_start_85
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzlo;->onVideoPause()V
    :try_end_8e
    .catch Landroid/os/RemoteException; {:try_start_85 .. :try_end_8e} :catch_8f
    .catchall {:try_start_85 .. :try_end_8e} :catchall_bd

    goto :goto_95

    :catch_8f
    move-exception v2

    :try_start_90
    const-string v3, "Unable to call onVideoPause()"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_95
    .catchall {:try_start_90 .. :try_end_95} :catchall_bd

    :cond_95
    :goto_95
    if-eqz v1, :cond_a7

    :try_start_97
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzlo;->onVideoEnd()V
    :try_end_a0
    .catch Landroid/os/RemoteException; {:try_start_97 .. :try_end_a0} :catch_a1
    .catchall {:try_start_97 .. :try_end_a0} :catchall_bd

    goto :goto_a7

    :catch_a1
    move-exception v1

    :try_start_a2
    const-string v2, "Unable to call onVideoEnd()"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a7
    .catchall {:try_start_a2 .. :try_end_a7} :catchall_bd

    :cond_a7
    :goto_a7
    if-eqz v7, :cond_bb

    :try_start_a9
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaoc;->zzdng:Lcom/google/android/gms/internal/zzaoa;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaoa;->zze(Lcom/google/android/gms/internal/zzaoa;)Lcom/google/android/gms/internal/zzlo;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzaoc;->zzdnk:Z

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzlo;->onVideoMute(Z)V
    :try_end_b4
    .catch Landroid/os/RemoteException; {:try_start_a9 .. :try_end_b4} :catch_b5
    .catchall {:try_start_a9 .. :try_end_b4} :catchall_bd

    goto :goto_bb

    :catch_b5
    move-exception v1

    :try_start_b6
    const-string v2, "Unable to call onVideoMute()"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_bb
    :goto_bb
    monitor-exit v0

    return-void

    :catchall_bd
    move-exception v1

    monitor-exit v0
    :try_end_bf
    .catchall {:try_start_b6 .. :try_end_bf} :catchall_bd

    throw v1
.end method
