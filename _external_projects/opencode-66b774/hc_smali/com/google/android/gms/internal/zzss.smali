.class public final Lcom/google/android/gms/internal/zzss;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzsr;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/zztd;)V
    .registers 2

    iget-object p1, p1, Lcom/google/android/gms/internal/zztd;->zzbzm:Lcom/google/android/gms/internal/zzke;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzke;->onAdClicked()V

    :cond_7
    return-void
.end method
