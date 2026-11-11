.class public final synthetic Lcom/google/android/gms/internal/zzfgs;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zzpih:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/internal/zzfgu;->values()[Lcom/google/android/gms/internal/zzfgu;

    const/4 v0, 0x3

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/zzfgs;->zzpih:[I

    const/4 v1, 0x1

    :try_start_9
    sget-object v2, Lcom/google/android/gms/internal/zzfgu;->zzpij:Lcom/google/android/gms/internal/zzfgu;

    const/4 v2, 0x0

    aput v1, v0, v2
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_e} :catch_e

    :catch_e
    :try_start_e
    sget-object v0, Lcom/google/android/gms/internal/zzfgs;->zzpih:[I

    sget-object v2, Lcom/google/android/gms/internal/zzfgu;->zzpik:Lcom/google/android/gms/internal/zzfgu;

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_15} :catch_15

    :catch_15
    return-void
.end method
