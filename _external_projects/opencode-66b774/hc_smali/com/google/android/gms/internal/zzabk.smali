.class public final Lcom/google/android/gms/internal/zzabk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcqb:Ljava/io/OutputStream;

.field private synthetic zzcqc:[B


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzabj;Ljava/io/OutputStream;[B)V
    .registers 4

    iput-object p2, p0, Lcom/google/android/gms/internal/zzabk;->zzcqb:Ljava/io/OutputStream;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzabk;->zzcqc:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 6

    const/4 v0, 0x0

    :try_start_1
    new-instance v1, Ljava/io/DataOutputStream;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabk;->zzcqb:Ljava/io/OutputStream;

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_8} :catch_1e
    .catchall {:try_start_1 .. :try_end_8} :catchall_19

    :try_start_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzabk;->zzcqc:[B

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabk;->zzcqc:[B

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_13} :catch_17
    .catchall {:try_start_8 .. :try_end_13} :catchall_3e

    .line 1
    :try_start_13
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_16} :catch_16

    :catch_16
    return-void

    :catch_17
    move-exception v0

    goto :goto_22

    :catchall_19
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_3f

    :catch_1e
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    :goto_22
    :try_start_22
    const-string v2, "Error transporting the ad response"

    .line 2
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v2

    const-string v3, "LargeParcelTeleporter.pipeData.1"

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_30
    .catchall {:try_start_22 .. :try_end_30} :catchall_3e

    if-nez v1, :cond_3a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabk;->zzcqb:Ljava/io/OutputStream;

    if-eqz v0, :cond_39

    .line 3
    :try_start_36
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_39
    .catch Ljava/io/IOException; {:try_start_36 .. :try_end_39} :catch_39

    :catch_39
    :cond_39
    return-void

    :cond_3a
    :try_start_3a
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_3a .. :try_end_3d} :catch_3d

    :catch_3d
    return-void

    :catchall_3e
    move-exception v0

    :goto_3f
    if-nez v1, :cond_45

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/zzabk;->zzcqb:Ljava/io/OutputStream;

    if-eqz v1, :cond_48

    .line 5
    :cond_45
    :try_start_45
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_48} :catch_48

    .line 6
    :catch_48
    :cond_48
    throw v0
.end method
