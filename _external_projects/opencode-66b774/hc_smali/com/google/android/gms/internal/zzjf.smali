.class public final Lcom/google/android/gms/internal/zzjf;
.super Lcom/google/android/gms/internal/zzkf;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzbdd:Lcom/google/android/gms/internal/zzje;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzje;)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzkf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjf;->zzbdd:Lcom/google/android/gms/internal/zzje;

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjf;->zzbdd:Lcom/google/android/gms/internal/zzje;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzje;->onAdClicked()V

    return-void
.end method
