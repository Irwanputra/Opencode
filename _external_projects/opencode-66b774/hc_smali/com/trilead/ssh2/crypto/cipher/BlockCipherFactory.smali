.class public Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;
    }
.end annotation


# static fields
.field public static ciphers:Ljava/util/Vector;


# direct methods
.method public static constructor <clinit>()V
    .registers 9

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001eggIg;\u001dc;Okl@coKa<LghAaf\u001b3=\u0019b<Og"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    const/16 v4, 0x20

    const-string v5, "H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIk9L1h\u00196j\u001daj\u001edhM6iH4<KehHkmNdo\u001e4<\u001d`<\u0019c;@ehNcnO6h\u001bb:AdiM49@dmKe;\u001ce>"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001b1<H1oL1i\u001dj:\u001adhAa;K49Oe<\u001a`mH6lNe"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0x18

    invoke-direct {v1, v2, v3, v6, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "Md<\u001acm\u00194m\u00191f@diJb;\u0019bl\u001a4;Ie;Aag\u001df"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3, v3, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "N19\u001ajnL4iM3h\u001cbm\u001b7:M1;\u001a4jJg>\u00197g\u001ae"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x8

    const-string v8, "H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIk9@anAe9La>AkoHki@7kMg;\u001d4nOg:\u001dciIah\u001dkg\u001b0kJe>\u001d4<\u001c7kK1;\u001djkId=Kg9O6m"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v2, v7, v3, v8}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001cc=L4<\u001d79KckH7l\u001c3jN0>\u001ee:Hbm\u001a7gLd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001db=JdoO0;\u001bg>\u001ea9AcoMkm\u001cbi\u001e0mIjh\u001e6"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3, v6, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "Ndi@j9\u001bkn\u001bg:I6:\u001b0n\u001ee<J09\u001ce:\u00191h\u001a1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3, v3, v5}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001b1jKck@k>K`9\u001c`>Hc:@0<\u00190j\u0019`j\u001a0k\u001bb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v7, v3, v8}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "\u001ajlI1oLj9K3;KgiL3m@d;\u001ad:I7>\u001a4kHk"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIkg\u00193j\u0019blNe>Id=\u001c6f\u001ce>\u001d7=Od;\u001d3hL1mM1l\u001c1k\u001ec9L6>\u001e1mJ`jM`m\u001b0j\u001bbh\u001bk=Lji"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v7, v6, v3}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    new-instance v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    const-string v2, "Akf\u001eenJf>\u001e0g\u001d1k\u001b3=Lc=JgmN7<Ngm\u001cb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v7, v6, v3}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkCipherList([Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    :goto_1
    array-length v1, p0

    if-ge v0, v1, :cond_c

    aget-object v1, p0, v0

    invoke-static {v1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getEntry(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_c
    return-void
.end method

.method public static createCipher(Ljava/lang/String;Z[B[B)Lcom/trilead/ssh2/crypto/cipher/BlockCipher;
    .registers 7

    const-string v0, "N0lIaf@fo\u001ajh\u0019f>\u001dg9\u001bf9K6jN1<\u001e0mO`iOfi\u001ccoIj9I4;I0>Lc9@09\u0019goK7k@j>\u001e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_a
    invoke-static {p0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getEntry(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    move-result-object v1

    iget-object v1, v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->cipherClass:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;

    const-string v2, "H`<\u001ekiH69Ocl\u0019gk\u001aciHefK0hAd;Hg<\u00196"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-interface {v1, p1, p2}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->init(Z[B)V

    new-instance p2, Lcom/trilead/ssh2/crypto/cipher/CBCMode;

    invoke-direct {p2, v1, p3, p1}, Lcom/trilead/ssh2/crypto/cipher/CBCMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    return-object p2

    :cond_33
    const-string v2, "Jj<O1<\u0019jj\u00196jIa=\u001e69Le9K6:\u001dcj\u001dchI0"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4d

    const/4 v2, 0x1

    invoke-interface {v1, v2, p2}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->init(Z[B)V

    new-instance p2, Lcom/trilead/ssh2/crypto/cipher/CTRMode;

    invoke-direct {p2, v1, p3, p1}, Lcom/trilead/ssh2/crypto/cipher/CTRMode;-><init>(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;[BZ)V

    return-object p2

    :cond_4d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_62
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_62} :catch_62

    :catch_62
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getBlockSize(Ljava/lang/String;)I
    .registers 1

    invoke-static {p0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getEntry(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    move-result-object p0

    iget p0, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->blocksize:I

    return p0
.end method

.method public static getDefaultCipherList()[Ljava/lang/String;
    .registers 4

    sget-object v0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_9
    sget-object v2, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_25

    sget-object v2, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    new-instance v3, Ljava/lang/String;

    iget-object v2, v2, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->type:Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_25
    return-object v0
.end method

.method private static getEntry(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;
    .registers 4

    const/4 v0, 0x0

    :goto_1
    sget-object v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-ge v0, v1, :cond_1d

    sget-object v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->ciphers:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    iget-object v2, v1, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->type:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    return-object v1

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Idl\u001d6iOc>\u001d3>HjgLf;Oj<\u001belJk:Ij9K7gAghNahOd;J0>K3:@6o\u001ekh\u001e3lKdiOf:\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_32

    :goto_31
    throw v0

    :goto_32
    goto :goto_31
.end method

.method public static getKeySize(Ljava/lang/String;)I
    .registers 1

    invoke-static {p0}, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory;->getEntry(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;

    move-result-object p0

    iget p0, p0, Lcom/trilead/ssh2/crypto/cipher/BlockCipherFactory$CipherEntry;->keysize:I

    return p0
.end method
