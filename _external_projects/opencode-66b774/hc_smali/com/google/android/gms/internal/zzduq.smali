.class public final synthetic Lcom/google/android/gms/internal/zzduq;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zzlzc:[I

.field public static final synthetic zzlzd:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    invoke-static {}, Lcom/google/android/gms/internal/zzdur;->values()[Lcom/google/android/gms/internal/zzdur;

    const/4 v0, 0x3

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/zzduq;->zzlzd:[I

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_a
    sget-object v4, Lcom/google/android/gms/internal/zzdur;->zzlze:Lcom/google/android/gms/internal/zzdur;

    aput v3, v1, v2
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_e} :catch_e

    :catch_e
    const/4 v1, 0x2

    :try_start_f
    sget-object v4, Lcom/google/android/gms/internal/zzduq;->zzlzd:[I

    sget-object v5, Lcom/google/android/gms/internal/zzdur;->zzlzf:Lcom/google/android/gms/internal/zzdur;

    aput v1, v4, v3
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_15} :catch_15

    :catch_15
    :try_start_15
    sget-object v4, Lcom/google/android/gms/internal/zzduq;->zzlzd:[I

    sget-object v5, Lcom/google/android/gms/internal/zzdur;->zzlzg:Lcom/google/android/gms/internal/zzdur;

    aput v0, v4, v1
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_1b} :catch_1b

    :catch_1b
    invoke-static {}, Lcom/google/android/gms/internal/zzdus;->values()[Lcom/google/android/gms/internal/zzdus;

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/zzduq;->zzlzc:[I

    :try_start_22
    sget-object v4, Lcom/google/android/gms/internal/zzdus;->zzlzi:Lcom/google/android/gms/internal/zzdus;

    aput v3, v0, v2
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_26} :catch_26

    :catch_26
    :try_start_26
    sget-object v0, Lcom/google/android/gms/internal/zzduq;->zzlzc:[I

    sget-object v2, Lcom/google/android/gms/internal/zzdus;->zzlzj:Lcom/google/android/gms/internal/zzdus;

    aput v1, v0, v3
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_2c} :catch_2c

    :catch_2c
    return-void
.end method
