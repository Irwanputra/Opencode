.class public Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private e:Ljava/math/BigInteger;

.field private f:Ljava/math/BigInteger;

.field private g:Ljava/math/BigInteger;

.field private final hashAlgorithm:Ljava/lang/String;

.field private k:Ljava/math/BigInteger;

.field private p:Ljava/math/BigInteger;

.field private x:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    iput-object p3, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->g:Ljava/math/BigInteger;

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->hashAlgorithm:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;-><init>(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-void
.end method


# virtual methods
.method public calculateH([B[B[B[B[BLなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;)[B
    .registers 9

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->getHashAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p2}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p3}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p4}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    invoke-virtual {v0, p5}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateByteString([B)V

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x400

    .line 2
    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateUINT32(I)V

    const/16 p1, 0x800

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateUINT32(I)V

    const/16 p1, 0x1000

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateUINT32(I)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->e:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->k:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->updateBigInt(Ljava/math/BigInteger;)V

    invoke-virtual {v0}, Lcom/trilead/ssh2/crypto/digest/HashForSSH2Types;->getDigest()[B

    move-result-object p1

    return-object p1
.end method

.method public getE()Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->e:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\u00190;LfkK4=\u001e3k\u001ea=N`=Lf9L4iKgiL7hOclNfg\u001djj\u0019d=\u001d1lH6>\u001e4;\u001cjn@ciH1=I7m\u001c"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getHashAlgorithm()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->hashAlgorithm:Ljava/lang/String;

    return-object v0
.end method

.method public getK()Ljava/math/BigInteger;
    .registers 3

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->k:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Mdh\u001a0:I1;N0f\u001efnKb9A3;\u001bknJkiKcjJem\u001e39O3jHa:Lel@kn\u001a7hH0oA6kLem\u0019c9M6>\u0019klJ7gOcoJejKgoNe=J6kI39OdkN6="

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public init(Ljava/security/SecureRandom;)V
    .registers 4

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->k:Ljava/math/BigInteger;

    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    iput-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->x:Ljava/math/BigInteger;

    iget-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->g:Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->e:Ljava/math/BigInteger;

    return-void
.end method

.method public setF(Ljava/math/BigInteger;)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->e:Ljava/math/BigInteger;

    if-eqz v0, :cond_35

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gez v0, :cond_25

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_25

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->f:Ljava/math/BigInteger;

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->x:Ljava/math/BigInteger;

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->p:Ljava/math/BigInteger;

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/dh/DhGroupExchange;->k:Ljava/math/BigInteger;

    return-void

    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "KelJc=Lcg\u0019`o\u001a0hLk>KgoKbi\u001e3hJg=@7<\u001d0fO3k\u001cgh\u001a7<NfnI09O6<Jen\u001b1g\u001ef;\u001e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\u00190;LfkK4=\u001e3k\u001ea=N`=Lf9L4iKgiL7hOclNfg\u001djj\u0019d=\u001d1lH6>\u001e4;\u001cjn@ciH1=I7m\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
