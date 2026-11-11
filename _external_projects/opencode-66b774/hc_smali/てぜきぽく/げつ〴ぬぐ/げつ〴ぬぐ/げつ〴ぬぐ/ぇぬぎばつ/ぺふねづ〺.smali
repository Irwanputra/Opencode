.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/lang/reflect/Method;

.field public static くし〴〺ぅ:Ljava/lang/reflect/Method;

.field public static づざかべべ:Ljava/lang/reflect/Method;

.field public static びぐびあび:Ljava/lang/reflect/Method;


# instance fields
.field public げつ〴ぬぐ:Landroid/net/wifi/WifiManager;


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    const-class v0, Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_5e

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u001c`9KehKeoJa=\u001cg>H6o\u001beoJ19L0nK7;\u001d4"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    sput-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;->〺つふすそ:Ljava/lang/reflect/Method;

    goto :goto_5b

    :cond_23
    const-string v5, "Kj<\u001e1:H4fH7hA`jM0=\u001a6nObg\u001b1=IgjJe"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_36

    sput-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    goto :goto_5b

    :cond_36
    const-string v5, "\u001a0kO3k\u001dd=\u001a`:N`9\u001b1kOaj\u001aj=JjgH0h\u001bgfNklJbhA1jHa9HgkL3nI69\u001c6;\u001e4hM0>\u001e"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_49

    sput-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;->びぐびあび:Ljava/lang/reflect/Method;

    goto :goto_5b

    :cond_49
    const-string v5, "Nk<Oa<H3kKg=Oj;AelLah\u001ceiJdl\u001eafM4mAj:@ef\u001b7:\u001d3k@09\u001cghNc>JbfI3;Mjf\u001c"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5b

    sput-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;->づざかべべ:Ljava/lang/reflect/Method;

    :cond_5b
    :goto_5b
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_5e
    return-void
.end method

.method public constructor <init>(Landroid/net/wifi/WifiManager;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺふねづ〺;->げつ〴ぬぐ:Landroid/net/wifi/WifiManager;

    return-void
.end method
