.class public Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-string v0, "JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/high16 v3, -0x10000

    packed-switch p1, :pswitch_data_f4

    :pswitch_1e
    goto/16 :goto_f2

    :pswitch_20
    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result p1

    if-eqz p1, :cond_3c

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0, v1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    return-void

    :cond_3c
    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    if-nez p1, :cond_5d

    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    if-nez p1, :cond_5d

    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    if-eqz p1, :cond_49

    goto :goto_5d

    :cond_49
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 4
    invoke-virtual {p1, v2}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    const-string v0, "H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_d9

    .line 5
    :cond_5d
    :goto_5d
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    iget-object v1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v1, v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    return-void

    :pswitch_73
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 7
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 8
    invoke-virtual {p1, v2}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 9
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    const-string v0, "NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "KjmA6hM7>JjkA`nH3=\u001bj<Lan\u001b6mKfh\u00190"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 11
    iget-object v0, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぃぜぶの〸ぃ:Landroid/content/Intent;

    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_f2

    :pswitch_9d
    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result p1

    if-eqz p1, :cond_b9

    .line 13
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 14
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0, v1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    return-void

    :cond_b9
    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    if-nez p1, :cond_dd

    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    if-nez p1, :cond_dd

    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    if-eqz p1, :cond_c6

    goto :goto_dd

    :cond_c6
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 15
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 16
    invoke-virtual {p1, v2}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    const-string v0, "\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_d9
    invoke-static {p1, v0}, Lteam/dev/epro/apkcustom/MainActivity;->ぇとしたべど(Lteam/dev/epro/apkcustom/MainActivity;Ljava/lang/String;)V

    goto :goto_f2

    .line 17
    :cond_dd
    :goto_dd
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 18
    iget-object v1, p0, Lteam/dev/epro/apkcustom/MainActivity$なぎぱいぢぎ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v1, v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    :goto_f2
    return-void

    nop

    :pswitch_data_f4
    .packed-switch 0x7f090117
        :pswitch_9d
        :pswitch_73
        :pswitch_1e
        :pswitch_20
    .end packed-switch
.end method
