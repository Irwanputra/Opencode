.class public Lde/blinkt/openvpn/LaunchVPN;
.super Landroid/app/Activity;
.source ""


# instance fields
.field public 〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public くし〴〺ぅ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lde/blinkt/openvpn/LaunchVPN;->くし〴〺ぅ:Z

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 8

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0058

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4i\u001d0k\u001bjgO6iIf=K4>\u001dbnI4oH49O6fOg<O"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18d

    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "\u001ej>Ibh\u00197kNamJgh\u001afgN7>M1oL0<I09Nc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_48

    .line 2
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    const-class v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;

    monitor-enter v0

    :try_start_3b
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->へぬ〴づぞ()V
    :try_end_43
    .catchall {:try_start_3b .. :try_end_43} :catchall_45

    monitor-exit v0

    goto :goto_48

    :catchall_45
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_48
    :goto_48
    const-string v0, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bj\u001akfNcjJfkN`>\u001e0:\u001d4mJ1kK3>\u001ej9\u001bgnH6gIf=L1nKgi\u001e0f\u001dg=\u001cak\u001ekkO4hIf>\u001a3;"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bj\u001akfNcjJfkN`>\u001e0:\u001d4mJ1kK3>\u001ej9\u001bgnH7nMj:JcfJ1>N7o\u00197<Jg9AeiIk>J7>I7m"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->くし〴〺ぅ(Landroid/content/Context;Ljava/lang/String;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_f4

    if-nez v0, :cond_f4

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->なぎぱいぢぎ(Landroid/content/Context;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;

    move-result-object v0

    .line 4
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 5
    iget-object v4, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9a

    const-string v4, "Jc>Hbn\u001c6:Nk;J4:\u001ckh\u0019`:A3;\u001ck=J4k\u001dd"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_9c

    :cond_9a
    iget-object v4, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Ljava/lang/String;

    .line 6
    :goto_9c
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7b

    move-object v0, v3

    goto :goto_a6

    :cond_a4
    const/4 p1, 0x0

    move-object v0, p1

    .line 7
    :goto_a6
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_b6

    const-string p1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bg\u001d4mI6nNd:O1hO0gOel\u001dk:OfmNj>LcgLdl\u0019ah\u001eci\u0019ek\u001b`9O7k\u001ab>\u001e4f\u001d7=\u001e49\u001c6n"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    :cond_b6
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const-string v5, "A7;\u001b7o\u001d`gMeh\u001c1;\u001ejl\u001b1oKej\u001cg=\u001ed>\u0019f"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    .line 9
    invoke-interface {v3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d4

    goto :goto_f1

    .line 10
    :cond_d4
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lde/blinkt/openvpn/api/ConfirmDialog;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v3, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3=A4m\u001b7m\u001ckkOf:\u001e6h\u001ak<Kcl@km\u001ejg\u00196kNk>Kbi\u00191hOghJ7hH`=K4i\u001cfo\u001a4j\u001c`9M1l"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 v2, 0x0

    :goto_f1
    if-nez v2, :cond_f4

    goto :goto_fc

    :cond_f4
    if-nez v0, :cond_101

    const p1, 0x7f1102d8

    .line 11
    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V

    :goto_fc
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_18d

    :cond_101
    iput-object v0, p0, Lde/blinkt/openvpn/LaunchVPN;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 12
    invoke-virtual {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ(Landroid/content/Context;)I

    move-result p1

    const v0, 0x7f1101fa

    if-eq p1, v0, :cond_13f

    .line 13
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1100a7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    new-instance p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lde/blinkt/openvpn/LaunchVPN;)V

    const v1, 0x104000a

    invoke-virtual {v0, v1, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p1, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>(Lde/blinkt/openvpn/LaunchVPN;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt p1, v1, :cond_13b

    .line 14
    new-instance p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-direct {p1, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;-><init>(Lde/blinkt/openvpn/LaunchVPN;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 15
    :cond_13b
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_18d

    .line 16
    :cond_13f
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "H1nJdmM3nAbjNb=Ogo\u001e0m\u001adiI7>\u001cb;\u001b1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "\u001ago\u001a6k\u0019c:\u001ddiLjl\u001eelNcjLe>A3gOgjH7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_16e

    const-string p1, "@jn\u001a7;I`h\u0019j9\u001ba:\u001a09Ajn\u001ddl\u001b6=\u001d`9A`>\u001c4o\u001b`:Ofl@g=Jj>\u001b6k\u001aklO1k\u0019eg\u001ecnH1h\u001bgn\u001b`>@bh\u001c4jAe=JbnM7f\u001d4;\u001bj<A1<"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lde/blinkt/openvpn/LaunchVPN;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_16e
    if-eqz v0, :cond_181

    iget-boolean p1, p0, Lde/blinkt/openvpn/LaunchVPN;->くし〴〺ぅ:Z

    if-nez p1, :cond_181

    const-string p1, "N4i@alHd;JkhMek\u001dk=Jgf@09\u001a0;\u001e1g\u001efj\u001e6k\u001b4>\u001dj9\u001ea<Oej\u001ea<\u001a`jJf9Nkk\u001ddkI"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lde/blinkt/openvpn/LaunchVPN;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_181
    iget-object p1, p0, Lde/blinkt/openvpn/LaunchVPN;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p0}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->がぐくいおす(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_18d
    :goto_18d
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;)V
    .registers 6

    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "J3f\u001cehIe>@co\u001c4k\u001ec;H6kO4:L7mOci\u001b6"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "L7=Akh\u0019g:Hj=O6<Ad:\u00197lJ7;\u001e4mAbg\u0019g"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Process;->waitFor()I

    move-result p1

    if-nez p1, :cond_34

    iput-boolean v3, p0, Lde/blinkt/openvpn/LaunchVPN;->くし〴〺ぅ:Z
    :try_end_31
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_31} :catch_32
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_31} :catch_32

    goto :goto_34

    .line 1
    :catch_32
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :cond_34
    :goto_34
    return-void
.end method
