.class public final Lcom/google/android/gms/ads/Correlator;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public げつ〴ぬぐ:Lcom/google/android/gms/internal/zzkc;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzkc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzkc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/Correlator;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzkc;

    return-void
.end method


# virtual methods
.method public final reset()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzkc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzkc;->zzig()V

    return-void
.end method

.method public final zzbh()Lcom/google/android/gms/internal/zzkc;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzkc;

    return-object v0
.end method
