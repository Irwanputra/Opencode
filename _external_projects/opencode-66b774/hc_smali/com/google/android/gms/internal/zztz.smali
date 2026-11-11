.class public final Lcom/google/android/gms/internal/zztz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaiq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzaiq<",
        "Lcom/google/android/gms/ads/internal/js/zzc;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zzf(Ljava/lang/Object;)V
    .registers 4

    check-cast p1, Lcom/google/android/gms/ads/internal/js/zzc;

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxl:Lcom/google/android/gms/ads/internal/gmsg/zzad;

    const-string v1, "/result"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/ads/internal/js/zzaj;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    return-void
.end method
