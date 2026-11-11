.class public final Lcom/trilead/ssh2/crypto/digest/HMAC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/trilead/ssh2/crypto/digest/Digest;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public k_xor_ipad:[B

.field public k_xor_opad:[B

.field public md:Lcom/trilead/ssh2/crypto/digest/Digest;

.field public size:I

.field public tmp:[B


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/digest/Digest;[BI)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iput p3, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->size:I

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->getDigestLength()I

    move-result p3

    new-array p3, p3, [B

    iput-object p3, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    const/16 p3, 0x40

    new-array v0, p3, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_ipad:[B

    new-array v0, p3, [B

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_opad:[B

    array-length v0, p2

    if-le v0, p3, :cond_29

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->reset()V

    invoke-interface {p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    invoke-interface {p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->digest([B)V

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    :cond_29
    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_ipad:[B

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_opad:[B

    array-length v1, p2

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_36
    iget-object p2, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_ipad:[B

    if-ge v2, p3, :cond_4d

    aget-byte v0, p2, v2

    xor-int/lit8 v0, v0, 0x36

    int-to-byte v0, v0

    aput-byte v0, p2, v2

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_opad:[B

    aget-byte v0, p2, v2

    xor-int/lit8 v0, v0, 0x5c

    int-to-byte v0, v0

    aput-byte v0, p2, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_36

    :cond_4d
    invoke-interface {p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method


# virtual methods
.method public final digest([B)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/trilead/ssh2/crypto/digest/HMAC;->digest([BI)V

    return-void
.end method

.method public final digest([BI)V
    .registers 6

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->digest([B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_opad:[B

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->digest([B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->tmp:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->size:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object p2, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_ipad:[B

    invoke-interface {p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method

.method public final getDigestLength()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->size:I

    return v0
.end method

.method public final reset()V
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->reset()V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->k_xor_ipad:[B

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method

.method public final update(B)V
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    return-void
.end method

.method public final update([B)V
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method

.method public final update([BII)V
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HMAC;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1, p2, p3}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([BII)V

    return-void
.end method
