.class public final Lcom/google/android/gms/internal/zzge;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
        "Lcom/google/android/gms/internal/zzanh;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic zzawy:Lcom/google/android/gms/internal/zzgb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzgb;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzge;->zzawy:Lcom/google/android/gms/internal/zzgb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzge;->zzawy:Lcom/google/android/gms/internal/zzgb;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzgb;->zza(Lcom/google/android/gms/internal/zzgb;)Lcom/google/android/gms/internal/zzft;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzft;->zzg(Ljava/util/Map;)V

    return-void
.end method
