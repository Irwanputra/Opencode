.class public Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;
.super Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V
    .registers 13

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;-><init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V

    return-void
.end method


# virtual methods
.method public びぐびあび(Landroid/view/View;)V
    .registers 7

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 1
    iget v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぎきぁ〱ぢ:I

    const v1, 0x7f0901b0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_10

    .line 2
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 3
    const-class v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    goto/16 :goto_df

    :cond_10
    const v1, 0x7f0901b2

    const-string v3, "NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-ne v0, v1, :cond_35

    .line 4
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const-string v0, "Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 6
    iget-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const/16 v1, 0x13

    goto :goto_6a

    :cond_35
    const v1, 0x7f0901b4

    if-ne v0, v1, :cond_50

    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const-string v0, "\u001d1lNagIglL3oNdo\u001ea:I0>\u001dajH`lKfo\u001c0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 8
    iget-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const/16 v1, 0x11

    goto :goto_6a

    :cond_50
    const v1, 0x7f0901b5

    if-ne v0, v1, :cond_6f

    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const-string v0, "M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 10
    iget-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const/16 v1, 0x10

    .line 11
    :goto_6a
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_1aa

    :cond_6f
    const v1, 0x7f0901b3

    const-string v3, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    if-ne v0, v1, :cond_b6

    .line 12
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 13
    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_1aa

    .line 14
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 15
    invoke-static {p1, v3, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 16
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;

    .line 17
    invoke-virtual {p1}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ()V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 18
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〺でおいここ:Lcom/github/clans/fab/FloatingActionButton;

    .line 19
    invoke-virtual {p1, v2}, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 20
    iget v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->げがぴうあだ:I

    if-nez v0, :cond_ac

    .line 21
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 22
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 23
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 24
    invoke-virtual {p1, v4}, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ(Z)V

    :cond_ac
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 25
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->おかぷせ〱:Lcom/github/clans/fab/FloatingActionButton;

    const/16 v0, 0x8

    .line 26
    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V

    goto :goto_cf

    :cond_b6
    const v1, 0x7f0901b7

    if-ne v0, v1, :cond_d6

    .line 27
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 28
    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1aa

    .line 29
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 30
    invoke-static {p1, v3, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 31
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;

    .line 32
    invoke-virtual {p1}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ()V

    :goto_cf
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->invalidateOptionsMenu()V

    goto/16 :goto_1aa

    :cond_d6
    const v1, 0x7f0901ae

    if-ne v0, v1, :cond_e6

    .line 33
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 34
    const-class v0, Lteam/dev/epro/apkcustom/dialogs/Dns;

    :goto_df
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻はぎっぼ(Ljava/lang/Class;)V

    goto/16 :goto_1aa

    :cond_e6
    const v1, 0x7f0901af

    const/high16 v3, -0x10000

    if-ne v0, v1, :cond_144

    .line 35
    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/MainActivity;->ておぞぞはね()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\u001adg\u001bdmAfj\u001agjJfoA4h\u001cbmNai\u001bj:\u001eb=Mb"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_113

    .line 37
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 38
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    const v1, 0x7f110162

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    goto/16 :goto_1aa

    :cond_113
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    const-string v1, "K1lNg:\u001d3i\u00193<J4iN4>\u001c6j\u001a6<Abo\u0019bgIj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    const v3, 0x7f110320

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 40
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const v1, 0x7f110161

    .line 41
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x100

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    goto :goto_1aa

    :cond_144
    const v1, 0x7f0901b1

    if-ne v0, v1, :cond_1aa

    .line 42
    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/MainActivity;->ごまけがぢは()Z

    move-result p1

    if-nez p1, :cond_16f

    .line 43
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 44
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v1, "\u001bkf\u001dfjH1mL4nAcl\u001dbg\u001e3>\u001ck9\u001cb<\u001ef<\u001c1o@7g\u001ab:\u001a6fNak@eoKjnI`jHb;\u001ecl\u0019ghJ"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    goto :goto_1aa

    .line 45
    :cond_16f
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "@ef@1:\u001c6gK0jAcmAbg\u001c0>Ifo\u001adhO1l\u0019anOj=\u0019fo\u001eeiN1mL7;\u001b1=\u001a4o\u001c3g@foH`9H"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1a5

    .line 47
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 48
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1a5

    .line 49
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 50
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_19f

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-static {p1, v4}, Lteam/dev/epro/apkcustom/MainActivity;->ぷぞてのほき(Lteam/dev/epro/apkcustom/MainActivity;Z)V

    goto :goto_1aa

    :cond_19f
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-static {p1, v2}, Lteam/dev/epro/apkcustom/MainActivity;->けときぜと(Lteam/dev/epro/apkcustom/MainActivity;Z)V

    goto :goto_1aa

    :cond_1a5
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-static {p1, v2}, Lteam/dev/epro/apkcustom/MainActivity;->ぷぞてのほき(Lteam/dev/epro/apkcustom/MainActivity;Z)V

    :cond_1aa
    :goto_1aa
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 51
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->な〱ちぉじ:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_1c2

    .line 52
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1c2

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 53
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->な〱ちぉじ:Landroid/app/ProgressDialog;

    .line 54
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v0, 0x0

    .line 55
    iput-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->な〱ちぉじ:Landroid/app/ProgressDialog;

    .line 56
    :cond_1c2
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〳ぜぞぜべっ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 57
    iput v2, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぎきぁ〱ぢ:I

    return-void
.end method
