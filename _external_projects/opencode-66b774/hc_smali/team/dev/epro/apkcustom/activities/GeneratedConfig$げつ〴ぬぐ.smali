.class public Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/activities/GeneratedConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/GeneratedConfig;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090115

    const/4 v1, 0x1

    if-eq p1, v0, :cond_8c

    const v0, 0x7f090119

    if-eq p1, v0, :cond_11

    goto/16 :goto_df

    :cond_11
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ごづごきえ:Lcom/github/clans/fab/FloatingActionMenu;

    .line 2
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 4
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_31

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    const v0, 0x7f110109

    goto/16 :goto_d6

    :cond_31
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4f\u0019`jA0;O6f@e<L0>\u001cb=A7:HjmA0fHdgL"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3:Ja=\u001d0kM1i\u001b4hLko\u0019j;\u0019cfHb=\u001a4=\u001bcnJ"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f11011f

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3;Hfo\u001ad<\u001bdj\u001e7k\u001ed<Kf=J4<\u001ebg\u001bcjHa=H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "M0lIkkJ7k\u001c7lNjk\u001a0m\u0019df\u001d3m\u001eb;Mc=\u001eb"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f11011e

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_df

    .line 6
    :cond_8c
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 7
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ごづごきえ:Lcom/github/clans/fab/FloatingActionMenu;

    .line 8
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 9
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 10
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const v0, 0x7f110108

    if-eqz p1, :cond_a9

    goto :goto_d4

    :cond_a9
    :try_start_a9
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 11
    iget-object v2, p1, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 12
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-virtual {p1, v2}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->けときぜと(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    const v2, 0x7f110312

    invoke-virtual {p1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    .line 15
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->〻ぞまぎな〻:Ljava/io/File;

    aput-object v4, v1, v3

    .line 16
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, -0x100

    .line 17
    invoke-virtual {p1, v1, v2}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->おかぷせ〱(Ljava/lang/String;I)V
    :try_end_d3
    .catch Ljava/io/IOException; {:try_start_a9 .. :try_end_d3} :catch_d4

    goto :goto_df

    .line 18
    :catch_d4
    :goto_d4
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/GeneratedConfig;

    :goto_d6
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/high16 v1, -0x10000

    .line 19
    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->おかぷせ〱(Ljava/lang/String;I)V

    :goto_df
    return-void
.end method
