.class public final Lcom/google/android/gms/internal/zzfiq$zza;
.super Lcom/google/android/gms/internal/zzfiq$zzd;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzfiq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# direct methods
.method public constructor <init>(Lsun/misc/Unsafe;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzfiq$zzd;-><init>(Lsun/misc/Unsafe;)V

    return-void
.end method


# virtual methods
.method public final zze(Ljava/lang/Object;JB)V
    .registers 6

    invoke-static {}, Lcom/google/android/gms/internal/zzfiq;->zzcwu()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzfiq;->zzc(Ljava/lang/Object;JB)V

    return-void

    :cond_a
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzfiq;->zzd(Ljava/lang/Object;JB)V

    return-void
.end method

.method public final zzf(Ljava/lang/Object;J)B
    .registers 5

    invoke-static {}, Lcom/google/android/gms/internal/zzfiq;->zzcwu()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/zzfiq;->zzd(Ljava/lang/Object;J)B

    move-result p1

    return p1

    :cond_b
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/zzfiq;->zze(Ljava/lang/Object;J)B

    move-result p1

    return p1
.end method
