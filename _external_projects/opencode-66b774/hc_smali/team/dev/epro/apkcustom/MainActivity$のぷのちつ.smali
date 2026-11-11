.class public Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u306e\u3077\u306e\u3061\u3064"
.end annotation


# instance fields
.field public final synthetic ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;)V
    .registers 3

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()I
    .registers 2

    const/4 v0, 0x2

    return v0
.end method

.method public づざかべべ(I)Ljava/lang/CharSequence;
    .registers 4

    const/4 v0, 0x1

    if-eqz p1, :cond_20

    if-eq p1, v0, :cond_15

    const/4 v0, 0x2

    if-eq p1, v0, :cond_a

    const/4 p1, 0x0

    return-object p1

    :cond_a
    const-string p1, "@ji\u001ec;\u0019dnH1iHb;I69H7:\u001bd<KfkOgo\u001ck"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_15
    const-string p1, "\u001bb:A3<\u001bg9@j=J7i\u0019dm\u0019bhK0>\u001eak\u001dbhOe"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1
    :cond_20
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3d

    const-string p1, "\u001ed=J`mKfoLk<\u001ee;\u001cfm\u001dflA6fIko\u001c1l\u001c`"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3d
    const-string p1, "HkkNbm@ekKegI6>J1mJf:M`=Hfo\u001e4nJ`"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public びぐびあび(Ljava/lang/Object;)I
    .registers 2

    const/4 p1, -0x2

    return p1
.end method
