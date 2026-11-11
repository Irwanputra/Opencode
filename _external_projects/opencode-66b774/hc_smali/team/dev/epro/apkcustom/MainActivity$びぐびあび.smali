.class public Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/github/clans/fab/FloatingActionMenu$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Z)V
    .registers 6

    if-eqz p1, :cond_6e

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v0, 0x1

    const-string v1, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_27

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぷぞてのほき:Lcom/github/clans/fab/FloatingActionButton;

    .line 4
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 5
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->おかぷせ〱:Lcom/github/clans/fab/FloatingActionButton;

    .line 6
    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V

    goto :goto_6e

    :cond_27
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 7
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    .line 9
    sget-object v3, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lteam/dev/epro/apkcustom/MainActivity;->こ〲しでおか(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    .line 10
    aget-object p1, p1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6e

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 11
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->おかぷせ〱:Lcom/github/clans/fab/FloatingActionButton;

    .line 12
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V

    :try_start_4b
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 13
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 14
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-virtual {p1, v1}, Lteam/dev/epro/apkcustom/MainActivity;->こ〲しでおか(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x13

    .line 16
    aget-object p1, p1, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6e

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$びぐびあび;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 17
    iget-object p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->おかぷせ〱:Lcom/github/clans/fab/FloatingActionButton;

    .line 18
    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V
    :try_end_6e
    .catch Ljava/lang/Exception; {:try_start_4b .. :try_end_6e} :catch_6e

    :catch_6e
    :cond_6e
    :goto_6e
    return-void
.end method
