.class public final Lcom/google/android/gms/internal/zzaaj;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# direct methods
.method private static zzd(Landroid/content/Context;Z)Z
    .registers 4

    const/4 v0, 0x1

    if-nez p1, :cond_4

    return v0

    :cond_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {p0}, Lcom/google/android/gms/internal/zzahn;->zzav(Landroid/content/Context;)I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_f

    return v1

    :cond_f
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {p0}, Lcom/google/android/gms/internal/zzahn;->zzaw(Landroid/content/Context;)I

    move-result p0

    if-gt p1, p0, :cond_19

    return v0

    :cond_19
    return v1
.end method

.method public static synthetic zze(Landroid/content/Context;Z)Z
    .registers 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzaaj;->zzd(Landroid/content/Context;Z)Z

    move-result p0

    return p0
.end method
