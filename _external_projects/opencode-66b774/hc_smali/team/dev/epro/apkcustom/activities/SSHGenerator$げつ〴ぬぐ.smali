.class public Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/SSHGenerator;->けときぜと()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SSHGenerator;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/SSHGenerator;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SSHGenerator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)V
    .registers 5

    .line 1
    iget v0, p1, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-lt v0, v1, :cond_d

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_38

    .line 2
    :try_start_10
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SSHGenerator;

    .line 3
    iget-object p1, p1, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 4
    invoke-virtual {p1}, L〳ぜぞぜべっ/ぅみぱぎぎ;->ぺづげぺが()Lぺぁあねじ/ぁごぐすすぃ;

    move-result-object p1

    invoke-interface {p1}, Lぺぁあねじ/ぁごぐすすぃ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SSHGenerator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2b

    invoke-static {p1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_2f

    :cond_2b
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    :goto_2f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SSHGenerator;

    .line 5
    iget-object v0, v0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ごづごきえ:Landroid/widget/TextView;

    .line 6
    sget-object v1, Landroid/widget/TextView$BufferType;->NORMAL:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_38} :catch_38

    :catch_38
    :cond_38
    return-void
.end method
