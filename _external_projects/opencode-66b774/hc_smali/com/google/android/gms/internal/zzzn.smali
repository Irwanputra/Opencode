.class public final Lcom/google/android/gms/internal/zzzn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaki;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzaki<",
        "Lcom/google/android/gms/internal/zzanh;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic val$message:Ljava/lang/String;

.field private synthetic zzcmd:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzzf;Ljava/lang/String;Lorg/json/JSONObject;)V
    .registers 4

    iput-object p2, p0, Lcom/google/android/gms/internal/zzzn;->val$message:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzzn;->zzcmd:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic onSuccess(Ljava/lang/Object;)V
    .registers 4

    check-cast p1, Lcom/google/android/gms/internal/zzanh;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzn;->val$message:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzzn;->zzcmd:Lorg/json/JSONObject;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/zzanh;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final zzb(Ljava/lang/Throwable;)V
    .registers 2

    return-void
.end method
