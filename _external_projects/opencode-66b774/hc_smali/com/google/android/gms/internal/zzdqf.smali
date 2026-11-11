.class public final Lcom/google/android/gms/internal/zzdqf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzdpq;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzd(Ljava/lang/String;Ljava/lang/String;I)Lcom/google/android/gms/internal/zzdpw;
    .registers 8

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "aead"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_21

    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p2, p3, v2

    const-string p2, "No support for primitive \'%s\'."

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 p2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v3, 0x2

    sparse-switch v0, :sswitch_data_be

    goto :goto_6f

    :sswitch_2e
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto :goto_6f

    :cond_37
    const/4 p2, 0x5

    goto :goto_6f

    :sswitch_39
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    goto :goto_6f

    :cond_42
    const/4 p2, 0x4

    goto :goto_6f

    :sswitch_44
    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4d

    goto :goto_6f

    :cond_4d
    const/4 p2, 0x3

    goto :goto_6f

    :sswitch_4f
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_58

    goto :goto_6f

    :cond_58
    const/4 p2, 0x2

    goto :goto_6f

    :sswitch_5a
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_63

    goto :goto_6f

    :cond_63
    const/4 p2, 0x1

    goto :goto_6f

    :sswitch_65
    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6e

    goto :goto_6f

    :cond_6e
    const/4 p2, 0x0

    :goto_6f
    packed-switch p2, :pswitch_data_d8

    new-instance p2, Ljava/security/GeneralSecurityException;

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p1, p3, v2

    const-string p1, "No support for primitive \'Aead\' with key type \'%s\'."

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_82
    new-instance p2, Lcom/google/android/gms/internal/zzdqo;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdqo;-><init>()V

    goto :goto_a5

    :pswitch_88
    new-instance p2, Lcom/google/android/gms/internal/zzdqk;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdqk;-><init>()V

    goto :goto_a5

    :pswitch_8e
    new-instance p2, Lcom/google/android/gms/internal/zzdqj;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdqj;-><init>()V

    goto :goto_a5

    :pswitch_94
    new-instance p2, Lcom/google/android/gms/internal/zzdqm;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdqm;-><init>()V

    goto :goto_a5

    :pswitch_9a
    new-instance p2, Lcom/google/android/gms/internal/zzdqh;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdqh;-><init>()V

    goto :goto_a5

    :pswitch_a0
    new-instance p2, Lcom/google/android/gms/internal/zzdql;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzdql;-><init>()V

    :goto_a5
    if-gtz p3, :cond_a8

    return-object p2

    :cond_a8
    new-instance p2, Ljava/security/GeneralSecurityException;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p1, v0, v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "No key manager for key type \'%s\' with version at least %d."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :sswitch_data_be
    .sparse-switch
        0x1580a8e0 -> :sswitch_65
        0x4878f271 -> :sswitch_5a
        0x579e3055 -> :sswitch_4f
        0x6b1dc604 -> :sswitch_44
        0x6e9ea62f -> :sswitch_39
        0x7bee4165 -> :sswitch_2e
    .end sparse-switch

    :pswitch_data_d8
    .packed-switch 0x0
        :pswitch_a0
        :pswitch_9a
        :pswitch_94
        :pswitch_8e
        :pswitch_88
        :pswitch_82
    .end packed-switch
.end method
