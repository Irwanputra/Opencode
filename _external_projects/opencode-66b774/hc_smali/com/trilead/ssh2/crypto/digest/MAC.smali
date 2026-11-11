.class public Lcom/trilead/ssh2/crypto/digest/MAC;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public mac:Lcom/trilead/ssh2/crypto/digest/Digest;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public size:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    new-instance p1, Lcom/trilead/ssh2/crypto/digest/HMAC;

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/SHA1;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;-><init>()V

    const/16 v1, 0x14

    invoke-direct {p1, v0, p2, v1}, Lcom/trilead/ssh2/crypto/digest/HMAC;-><init>(Lcom/trilead/ssh2/crypto/digest/Digest;[BI)V

    :goto_1f
    iput-object p1, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    goto :goto_77

    :cond_22
    const-string v0, "\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0xc

    if-eqz v0, :cond_3f

    new-instance p1, Lcom/trilead/ssh2/crypto/digest/HMAC;

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/SHA1;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/digest/SHA1;-><init>()V

    invoke-direct {p1, v0, p2, v1}, Lcom/trilead/ssh2/crypto/digest/HMAC;-><init>(Lcom/trilead/ssh2/crypto/digest/Digest;[BI)V

    goto :goto_1f

    :cond_3f
    const-string v0, "\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5c

    new-instance p1, Lcom/trilead/ssh2/crypto/digest/HMAC;

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/MD5;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/digest/MD5;-><init>()V

    const/16 v1, 0x10

    invoke-direct {p1, v0, p2, v1}, Lcom/trilead/ssh2/crypto/digest/HMAC;-><init>(Lcom/trilead/ssh2/crypto/digest/Digest;[BI)V

    goto :goto_1f

    :cond_5c
    const-string v0, "M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7f

    new-instance p1, Lcom/trilead/ssh2/crypto/digest/HMAC;

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/MD5;

    invoke-direct {v0}, Lcom/trilead/ssh2/crypto/digest/MD5;-><init>()V

    invoke-direct {p1, v0, p2, v1}, Lcom/trilead/ssh2/crypto/digest/HMAC;-><init>(Lcom/trilead/ssh2/crypto/digest/Digest;[BI)V

    goto :goto_1f

    :goto_77
    iget-object p1, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->getDigestLength()I

    move-result p1

    iput p1, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->size:I

    :cond_7f
    return-void
.end method

.method public static checkMacList([Ljava/lang/String;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    :goto_1
    array-length v1, p0

    if-ge v0, v1, :cond_c

    aget-object v1, p0, v0

    invoke-static {v1}, Lcom/trilead/ssh2/crypto/digest/MAC;->getKeyLen(Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_c
    return-void
.end method

.method public static getKeyLen(Ljava/lang/String;)I
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x14

    if-eqz v0, :cond_13

    return v1

    :cond_13
    const-string v0, "\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    return v1

    :cond_24
    const-string v0, "\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x10

    if-eqz v0, :cond_37

    return v1

    :cond_37
    const-string v0, "M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_48

    return v1

    :cond_48
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Idl\u001d6iOc>\u001d3>HjgLf;Oj<\u001belJk:Ij9K7gAghNahOd;J0>K3:@6o\u001ekh\u001e3lKdiOf:\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getMacList()[Ljava/lang/String;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    return-object v0
.end method


# virtual methods
.method public getMac([BI)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1, p2}, Lcom/trilead/ssh2/crypto/digest/Digest;->digest([BI)V

    return-void
.end method

.method public initMac(I)V
    .registers 4

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0}, Lcom/trilead/ssh2/crypto/digest/Digest;->reset()V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    shr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    invoke-interface {v0, v1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    int-to-byte p1, p1

    invoke-interface {v0, p1}, Lcom/trilead/ssh2/crypto/digest/Digest;->update(B)V

    return-void
.end method

.method public size()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->size:I

    return v0
.end method

.method public update([BII)V
    .registers 5

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MAC;->mac:Lcom/trilead/ssh2/crypto/digest/Digest;

    invoke-interface {v0, p1, p2, p3}, Lcom/trilead/ssh2/crypto/digest/Digest;->update([BII)V

    return-void
.end method
