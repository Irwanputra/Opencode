.class public Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/activities/V2raySettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/V2raySettings;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090115

    const/4 v1, 0x1

    if-eq p1, v0, :cond_97

    const v0, 0x7f090119

    if-eq p1, v0, :cond_11

    goto/16 :goto_e6

    :cond_11
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->は〲ぱなで:Lcom/github/clans/fab/FloatingActionMenu;

    .line 2
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    .line 4
    invoke-virtual {p1}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_35

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    const v0, 0x7f110109

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_e1

    :cond_35
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 5
    iget-object v0, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    .line 6
    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldev/epro/v2ray/util/Utils;->shareConfig_(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    new-instance v1, Landroid/content/Intent;

    const-string v2, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4f\u0019`jA0;O6f@e<L0>\u001cb=A7:HjmA0fHdgL"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3:Ja=\u001d0kM1i\u001b4hLko\u0019j;\u0019cfHb=\u001a4=\u001bcnJ"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3;Hfo\u001ad<\u001bdj\u001e7k\u001ed<Kf=J4<\u001ebg\u001bcjHa=H"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "J0o\u001ackJkj\u001ae:H0kM0f\u001bdf\u001b`i\u001dgi@0:\u001df"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "M0lIkkJ7k\u001c7lNjk\u001a0m\u0019df\u001d3m\u001eb;Mc=\u001eb"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "Ndn\u001c7<KjjN4=N0l\u0019dfO3j\u001b6i\u001bd;MbnAd"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_e6

    .line 8
    :cond_97
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 9
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->は〲ぱなで:Lcom/github/clans/fab/FloatingActionMenu;

    .line 10
    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionMenu;->げつ〴ぬぐ(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 11
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    .line 12
    invoke-virtual {p1}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b1

    goto :goto_d5

    :cond_b1
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    .line 13
    iget-object v0, p1, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    .line 14
    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ldev/epro/v2ray/util/Utils;->share2Clipboard(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_d5

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    const/16 v0, -0x100

    const-string v1, "\u0019a<\u001dgh\u0019e>\u00196<Heg@7=K6:@c=I0<LknOcfKgh\u001c7;Kd;J6;Hc:\u001d3mKb;H7h\u001ejlH4>H"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/V2raySettings;Ljava/lang/String;I)V

    goto :goto_e6

    :cond_d5
    :goto_d5
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/V2raySettings;

    const-string v0, "\u0019a<\u001dgh\u0019e>\u00196<Heg@7=K6:@c=I0<LknOclK0kIf=M0k\u001c6n@kk\u001bbgIaiHdm\u001dj=\u001d49I"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_e1
    const/high16 v1, -0x10000

    invoke-static {p1, v0, v1}, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/V2raySettings;Ljava/lang/String;I)V

    :goto_e6
    return-void
.end method
