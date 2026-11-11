.class public Lcom/google/android/gms/internal/zzakb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# direct methods
.method public static e(Ljava/lang/String;)V
    .registers 1

    const/4 p0, 0x6

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 2

    const/4 p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zzae(I)Z
    .registers 2

    const/4 v0, 0x5

    if-ge p0, v0, :cond_e

    const-string v0, "Ads"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_c

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    return p0

    :cond_e
    :goto_e
    const/4 p0, 0x1

    return p0
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 2

    const/4 p0, 0x6

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zzbx(Ljava/lang/String;)V
    .registers 1

    const/4 p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zzc(Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 2

    const/4 p0, 0x5

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zzct(Ljava/lang/String;)V
    .registers 1

    const/4 p0, 0x4

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method

.method public static zzcu(Ljava/lang/String;)V
    .registers 1

    const/4 p0, 0x5

    invoke-static {p0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result p0

    return-void
.end method
