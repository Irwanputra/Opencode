.class public final Lcom/google/android/gms/internal/zzyv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzann;


# instance fields
.field private synthetic zzaqy:Lcom/google/android/gms/internal/zzanh;

.field private synthetic zzcll:Lcom/google/android/gms/internal/zzyu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzyu;Lcom/google/android/gms/internal/zzanh;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyv;->zzcll:Lcom/google/android/gms/internal/zzyu;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzyv;->zzaqy:Lcom/google/android/gms/internal/zzanh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzg(Lcom/google/android/gms/internal/zzanh;)V
    .registers 4

    iget-object p1, p0, Lcom/google/android/gms/internal/zzyv;->zzaqy:Lcom/google/android/gms/internal/zzanh;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyv;->zzcll:Lcom/google/android/gms/internal/zzyu;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzyu;->zzcli:Lorg/json/JSONObject;

    const-string v1, "google.afma.nativeAds.renderVideo"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/zzanh;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
