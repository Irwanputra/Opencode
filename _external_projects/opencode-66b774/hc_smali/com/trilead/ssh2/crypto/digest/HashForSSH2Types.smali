.class public Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public md:Lcom/trilead/ssh2/crypto/digest/Digest;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private final messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;


# direct methods
.method public constructor <init>(Lcom/trilead/ssh2/crypto/digest/Digest;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->md:Lcom/trilead/ssh2/crypto/digest/Digest;

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/JreMessageDigestWrapper;

    invoke-static {p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->createMessageDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/trilead/ssh2/crypto/digest/JreMessageDigestWrapper;-><init>(Ljava/security/MessageDigest;)V

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;-><init>(Lcom/trilead/ssh2/crypto/digest/Digest;)V

    return-void
.end method

.method private static createMessageDigest(Ljava/lang/String;)Ljava/security/MessageDigest;
    .registers 3

    :try_start_0
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p0
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "M4iA69H0i@g=Ibg\u001e`<\u001bd<I0fNcl\u001egh\u00197:@gj@1k\u001c7g\u001af<\u001cc<\u001ee;Nd<Mem\u001egl\u001d4k\u001ccgK7o\u0019dlHb9LbhI`fK4=A1fNkiA3oLan"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public getDigest([B)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->getDigest([BI)V

    return-void
.end method

.method public getDigest([BI)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->digest([BI)V

    return-void
.end method

.method public getDigest()[B
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->getDigestLength()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->getDigest([B)V

    return-object v0
.end method

.method public getDigestLength()I
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->getDigestLength()I

    move-result v0

    return v0
.end method

.method public reset()V
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->reset()V

    return-void
.end method

.method public updateBigInt(Ljava/math/BigInteger;)V
    .registers 2

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    return-void
.end method

.method public updateByte(B)V
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {p1, v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method

.method public updateByteString([B)V
    .registers 3

    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateUINT32(I)V

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBytes([B)V

    return-void
.end method

.method public updateBytes([B)V
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([B)V

    return-void
.end method

.method public updateUINT32(I)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->messageDigest:Lcom/trilead/ssh2/crypto/digest/Digest;

    int-to-byte p1, p1

    invoke-interface {v0, p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    return-void
.end method
