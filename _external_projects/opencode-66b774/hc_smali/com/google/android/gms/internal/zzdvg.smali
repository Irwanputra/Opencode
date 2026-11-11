.class public final Lcom/google/android/gms/internal/zzdvg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzdqa;


# instance fields
.field private zzlzz:Ljavax/crypto/Mac;

.field private final zzmaa:I

.field private final zzmab:Ljava/lang/String;

.field private final zzmac:Ljava/security/Key;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/security/Key;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdvg;->zzmab:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/zzdvg;->zzmaa:I

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdvg;->zzmac:Ljava/security/Key;

    sget-object p3, Lcom/google/android/gms/internal/zzduu;->zzlzq:Lcom/google/android/gms/internal/zzduu;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/zzduu;->zzos(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/crypto/Mac;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdvg;->zzlzz:Ljavax/crypto/Mac;

    invoke-virtual {p1, p2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    return-void
.end method


# virtual methods
.method public final zzac([B)[B
    .registers 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdvg;->zzlzz:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;
    :try_end_8
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_8} :catch_9

    goto :goto_18

    :catch_9
    sget-object v0, Lcom/google/android/gms/internal/zzduu;->zzlzq:Lcom/google/android/gms/internal/zzduu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdvg;->zzmab:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzduu;->zzos(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdvg;->zzmac:Ljava/security/Key;

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    :goto_18
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->update([B)V

    iget p1, p0, Lcom/google/android/gms/internal/zzdvg;->zzmaa:I

    new-array p1, p1, [B

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/zzdvg;->zzmaa:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1
.end method
