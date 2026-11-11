.class public final enum Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trilead/ssh2/crypto/digest/MessageMac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Hmac"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_MD5:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_MD5_96:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_SHA1:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_SHA1_96:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_SHA2_256:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

.field public static final enum HMAC_SHA2_512:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;


# instance fields
.field private algorithm:Ljava/lang/String;

.field private length:I

.field private type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 19

    new-instance v6, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v1, "@fl@1h\u001e0mKe>A7kAehOeo\u001d79\u001cg:Hb=@d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001e4;M4oOj;M3m\u001eaiH09N0j\u001a4>H7kJ7l\u001bf"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v6, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_MD5_96:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    new-instance v0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v8, "J6fH0mLj>L`kH0<N0=HfjA1kMajM0g\u001c0"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    const-string v10, "\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "\u001e4;M4oOj;M3m\u001eaiH09N0j\u001a4>H7kJ7l\u001bf"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x10

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_MD5:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    new-instance v1, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v14, "H3:\u001ak=@djN0g\u001c6<A6>\u001d6lNbgO3m\u00197<Aj"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x2

    const-string v16, "\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf"

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v17, "\u001e6:\u001b7=J7;Lg=H4g\u001bcm\u001dd<M`hK0l\u001cf<Jj"

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x14

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_SHA1_96:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    new-instance v2, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v8, "Ld;Jcl\u0019d:\u001ek:J3;\u0019c:A1n\u001b1l\u001c4;\u001dd=N0"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x3

    const-string v10, "L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "\u001e6:\u001b7=J7;Lg=H4g\u001bcm\u001dd<M`hK0l\u001cf<Jj"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x14

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v2, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_SHA1:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    new-instance v3, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v14, "@f=\u001a3fHk=O6jNbjIgo\u001dg;\u001d6j\u0019e=\u001eai\u001e0"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x4

    const-string v16, "OcoO`jI1kJ19L0oL`f\u001a1jN4n\u001dff\u001ej>L0"

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v17, "O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k"

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x20

    move-object v13, v3

    invoke-direct/range {v13 .. v18}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v3, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_SHA2_256:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    new-instance v4, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const-string v8, "Kfg\u001a`kIa>Ajg\u001ef;@b=I7f\u001d`>N1hOelLf"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x5

    const-string v10, "\u001e1jOa<@0mL6f\u00194<\u001d6>JelO6mJ3o\u001ejiJg"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "IjkA6;O7:\u001bdnI`oOg=\u001bel@dk\u001b6;Hj<I0"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x40

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    sput-object v4, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->HMAC_SHA2_512:Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const/4 v5, 0x6

    new-array v5, v5, [Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    aput-object v0, v5, v6

    const/4 v0, 0x2

    aput-object v1, v5, v0

    const/4 v0, 0x3

    aput-object v2, v5, v0

    const/4 v0, 0x4

    aput-object v3, v5, v0

    const/4 v0, 0x5

    aput-object v4, v5, v0

    sput-object v5, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->$VALUES:[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->type:Ljava/lang/String;

    iput-object p4, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->algorithm:Ljava/lang/String;

    iput p5, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->length:I

    return-void
.end method

.method public static synthetic access$000(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    .registers 1

    invoke-static {p0}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getHmac(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    move-result-object p0

    return-object p0
.end method

.method private static getHmac(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    .registers 5

    invoke-static {}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->values()[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    move-result-object v0

    const/4 v1, 0x0

    :goto_5
    const/4 v2, 0x6

    if-ge v1, v2, :cond_18

    aget-object v2, v0, v1

    invoke-virtual {v2}, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    return-object v2

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "HelHcl\u001ca=K4o@7<\u001c7<\u001d7>\u001cgjH3=@jmAa<@6kM6:Keg\u00197hJ6h\u0019joKknJ4g\u001a4kMbkH"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2d

    :goto_2c
    throw v0

    :goto_2d
    goto :goto_2c
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    .registers 2

    const-class v0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    return-object p0
.end method

.method public static values()[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;
    .registers 1

    sget-object v0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->$VALUES:[Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    invoke-virtual {v0}, [Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;

    return-object v0
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->algorithm:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->length:I

    return v0
.end method

.method public getType()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/digest/MessageMac$Hmac;->type:Ljava/lang/String;

    return-object v0
.end method
