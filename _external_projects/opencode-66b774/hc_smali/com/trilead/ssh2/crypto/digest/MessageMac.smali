.class public final Lcom/trilead/ssh2/crypto/digest/MessageMac;
.super Lcom/trilead/ssh2/crypto/digest/MAC;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    }
.end annotation


# instance fields
.field private final messageMac:Ljavax/crypto/Mac;


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .registers 5

    invoke-direct {p0, p1, p2}, Lcom/trilead/ssh2/crypto/digest/MAC;-><init>(Ljava/lang/String;[B)V

    :try_start_3
    # invokes: Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getHmac(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    invoke-static {p1}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->access$000(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v1, p2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_19
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_19} :catch_1a

    return-void

    :catch_1a
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "@6<\u001b0jAc>\u001a1o\u001bjmKgi\u001e7hNgkJfiL6l\u001a0jM0oLbmNekOgiK6mO`n\u001ejkNkn\u001dclKen\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static checkMacs([Ljava/lang/String;)V
    .registers 4

    array-length v0, p0

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_c

    aget-object v2, p0, v1

    # invokes: Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getHmac(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    invoke-static {v2}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->access$000(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_c
    return-void
.end method

.method public static getKeyLength(Ljava/lang/String;)I
    .registers 1

    # invokes: Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getHmac(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    invoke-static {p0}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->access$000(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    move-result-object p0

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getLength()I

    move-result p0

    return p0
.end method

.method public static getMacs()[Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->values()[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_b
    const/4 v4, 0x6

    if-ge v3, v4, :cond_1a

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final getMac([BI)V
    .registers 6

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    array-length v1, v0

    sub-int/2addr v1, p2

    const/4 v2, 0x0

    invoke-static {v0, p2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final initMac(I)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->reset()V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    shr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    shr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    shr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->update(B)V

    return-void
.end method

.method public final size()I
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v0

    return v0
.end method

.method public final update([BII)V
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac;->messageMac:Ljavax/crypto/Mac;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/crypto/Mac;->update([BII)V

    return-void
.end method
