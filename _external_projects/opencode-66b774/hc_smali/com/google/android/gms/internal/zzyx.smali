.class public final Lcom/google/android/gms/internal/zzyx;
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
.field private synthetic zzclk:Lcom/google/android/gms/internal/zzyt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzyt;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyx;->zzclk:Lcom/google/android/gms/internal/zzyt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzyx;->zzclk:Lcom/google/android/gms/internal/zzyt;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzyt;->zza(Lcom/google/android/gms/internal/zzyt;)Lcom/google/android/gms/ads/internal/zzba;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzba;->zzds()V

    return-void
.end method
