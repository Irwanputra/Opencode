.class public final synthetic Lcom/google/android/gms/internal/zzdpt;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zzlso:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    invoke-static {}, Lcom/google/android/gms/internal/zzdtt;->values()[Lcom/google/android/gms/internal/zzdtt;

    const/4 v0, 0x6

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/zzdpt;->zzlso:[I

    const/4 v1, 0x1

    const/4 v2, 0x2

    :try_start_a
    sget-object v3, Lcom/google/android/gms/internal/zzdtt;->zzlxu:Lcom/google/android/gms/internal/zzdtt;

    aput v1, v0, v2
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_e} :catch_e

    :catch_e
    const/4 v0, 0x4

    :try_start_f
    sget-object v3, Lcom/google/android/gms/internal/zzdpt;->zzlso:[I

    sget-object v4, Lcom/google/android/gms/internal/zzdtt;->zzlxw:Lcom/google/android/gms/internal/zzdtt;

    aput v2, v3, v0
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_15} :catch_15

    :catch_15
    const/4 v2, 0x3

    :try_start_16
    sget-object v3, Lcom/google/android/gms/internal/zzdpt;->zzlso:[I

    sget-object v4, Lcom/google/android/gms/internal/zzdtt;->zzlxt:Lcom/google/android/gms/internal/zzdtt;

    aput v2, v3, v1
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1c
    sget-object v1, Lcom/google/android/gms/internal/zzdpt;->zzlso:[I

    sget-object v3, Lcom/google/android/gms/internal/zzdtt;->zzlxv:Lcom/google/android/gms/internal/zzdtt;

    aput v0, v1, v2
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_22} :catch_22

    :catch_22
    return-void
.end method
