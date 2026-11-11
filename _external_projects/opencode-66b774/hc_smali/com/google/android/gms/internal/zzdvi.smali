.class public final Lcom/google/android/gms/internal/zzdvi;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zzmad:Ljava/security/SecureRandom;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdvi;->zzmad:Ljava/security/SecureRandom;

    return-void
.end method

.method public static zzgh(I)[B
    .registers 2

    new-array p0, p0, [B

    sget-object v0, Lcom/google/android/gms/internal/zzdvi;->zzmad:Ljava/security/SecureRandom;

    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object p0
.end method
