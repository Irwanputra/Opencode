.class public Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onCreate(Landroid/os/Bundle;)V
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)V
    .registers 2

    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 6

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 1
    iput p1, v0, Lteam/dev/epro/apkcustom/MainActivity;->げがぴうあだ:I

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 4
    iget v1, v1, Lteam/dev/epro/apkcustom/MainActivity;->げがぴうあだ:I

    const-string v2, "JkgJ1>\u001beh\u001ddnLe;IcmMdmLbhL`h\u001b`9K`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string v0, "\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_89

    .line 6
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 7
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_4f

    .line 8
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 9
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4f

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 10
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〺でおいここ:Lcom/github/clans/fab/FloatingActionButton;

    .line 11
    invoke-virtual {p1, v3}, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ(Z)V

    goto :goto_b6

    :cond_4f
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 12
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5c

    const/4 v0, 0x1

    goto :goto_5d

    :cond_5c
    const/4 v0, 0x0

    :goto_5d
    if-nez v0, :cond_b6

    .line 14
    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->のね〱ばぁぢ:Z

    if-nez v0, :cond_b6

    iput-boolean v3, p1, Lcom/github/clans/fab/FloatingActionMenu;->のね〱ばぁぢ:Z

    .line 15
    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->ぺふねづ〺:Z

    if-eqz v0, :cond_7e

    .line 16
    invoke-virtual {p1, v3}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->のぷのちつ:Landroid/os/Handler;

    new-instance v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    invoke-direct {v1, p1, v3}, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;-><init>(Lcom/github/clans/fab/FloatingActionMenu;Z)V

    iget v2, p1, Lcom/github/clans/fab/FloatingActionMenu;->けときぜと:I

    iget p1, p1, Lcom/github/clans/fab/FloatingActionMenu;->いいにぽつ:I

    mul-int v2, v2, p1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_b6

    :cond_7e
    iget-object v0, p1, Lcom/github/clans/fab/FloatingActionMenu;->ぺがぅす〹ち:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    iput-boolean v2, p1, Lcom/github/clans/fab/FloatingActionMenu;->のね〱ばぁぢ:Z

    goto :goto_b6

    .line 17
    :cond_89
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 18
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_a8

    .line 19
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 20
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_a8

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 21
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〺でおいここ:Lcom/github/clans/fab/FloatingActionButton;

    .line 22
    invoke-virtual {p1, v3}, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 23
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->なぶひせが:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

    .line 24
    invoke-virtual {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;->ぁにあがあ()V

    goto :goto_b6

    :cond_a8
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 25
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〺でおいここ:Lcom/github/clans/fab/FloatingActionButton;

    .line 26
    invoke-virtual {p1, v2}, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺぁあねじ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 27
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->せづっ〸ちね:Lcom/github/clans/fab/FloatingActionMenu;

    .line 28
    invoke-virtual {p1, v3}, Lcom/github/clans/fab/FloatingActionMenu;->〺つふすそ(Z)V

    :cond_b6
    :goto_b6
    return-void
.end method

.method public げつ〴ぬぐ(IFI)V
    .registers 4

    return-void
.end method
