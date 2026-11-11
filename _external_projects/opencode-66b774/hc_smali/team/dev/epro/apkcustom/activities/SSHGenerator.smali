.class public Lteam/dev/epro/apkcustom/activities/SSHGenerator;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ぉざぅち〻:Landroid/widget/EditText;

.field public ごづごきえ:Landroid/widget/TextView;

.field public ざとぅぼこ〺:Landroid/widget/EditText;

.field public は〲ぱなで:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method public static ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SSHGenerator;Ljava/lang/String;)Ljava/lang/String;
    .registers 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;-><init>()V

    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance p1, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    const/4 v2, 0x0

    invoke-direct {p1, v2, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;-><init>(II)V

    .line 4
    sget-object v3, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    .line 5
    new-instance v4, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    const-string v5, ""

    invoke-direct {v4, v5}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;-><init>(Ljava/lang/String;)V

    iput-object v4, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    iput-object v3, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    new-instance v3, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    const v4, 0x8000

    .line 6
    invoke-direct {v3, v1, v4}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;-><init>(Ljava/io/Reader;I)V

    .line 7
    iput-object v3, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->ぁごぐすすぃ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    const/4 v1, 0x0

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    new-instance v3, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;

    iget-object v4, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v3, v4, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;-><init>(Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;)V

    iput-object v3, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v3, 0x20

    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->びぐびあび:Ljava/util/ArrayList;

    iput-object v5, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->づざかべべ:Ljava/lang/String;

    .line 8
    sget-object p1, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    iput-boolean v2, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->のぷのちつ:Z

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->おぐぴう〸ず:Lいいにぽつ/〺つふすそ/びぐびあび/ぺふねづ〺;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぇぬぎばつ:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぉざぅち〻:Ljava/util/List;

    new-instance p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    invoke-direct {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;-><init>()V

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ざとぅぼこ〺:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->は〲ぱなで:Z

    iput-boolean v2, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ごづごきえ:Z

    .line 9
    :cond_69
    iget-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;

    .line 10
    :goto_6b
    iget-boolean v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ:Z

    if-nez v3, :cond_77

    iget-object v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    iget-object v4, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v3, p1, v4}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_6b

    :cond_77
    iget-object v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_95

    iget-object v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    invoke-virtual {v4, v2, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    iput-object v1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    .line 11
    iput-object v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    goto :goto_a5

    .line 12
    :cond_95
    iget-object v3, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v3, :cond_a1

    iget-object v4, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    .line 13
    iput-object v3, v4, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    .line 14
    iput-object v1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    move-object p1, v4

    goto :goto_a5

    :cond_a1
    iput-boolean v2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ:Z

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    .line 15
    :goto_a5
    invoke-virtual {v0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->〺つふすそ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)Z

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    sget-object v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;->ぁごぐすすぃ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    if-ne p1, v3, :cond_69

    .line 16
    iget-object p1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    const-string v0, "Nk9Ka9J6iJcmI0:Hc>Kk:\u001d0fN0i@0o\u0019c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    move-result-object v0

    .line 19
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    .line 20
    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    invoke-direct {v3}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;-><init>()V

    new-instance v4, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;

    invoke-direct {v4, p1, v3, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;-><init>(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    invoke-static {v4, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->しげにけぃ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/づざかべべ;Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V

    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e1

    goto :goto_e8

    :cond_e1
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 22
    :goto_e8
    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->せづっ〸ちね()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "J`kH`l\u0019e:\u001dbl\u001bbh\u001cd;Nf;OalKgjN19Jj"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10a

    const-string p1, "\u0019dmJcjNg:Kgj@goA3h\u001b3hO0jJdj\u001b0=\u0019b"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_10a
    const-string v0, "A3g\u001dboKg:NafK49IchLfkIb>M3i\u001agnHc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_124

    const-string p1, "Ij;K4l\u001e1mAah\u001da>Njl\u001c7oKc>\u001d3<H4<\u0019jo\u001909K6l\u001ea<J4f\u001b6f\u001a1<AegAf>Ia9HbjAkh\u001a1iMd=K0:@4o\u001939IdiJd=HdiHehN1m"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_124
    const-string v0, "N3mH0>Kj9M7;Aeh\u001e4:\u001d0;Ien@6hM0k\u001db"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13e

    const-string p1, "H0j\u001a0g\u001e19\u0019e>Mjk@3l\u001e3iK`;\u0019k>NciJ1o\u001d6l\u001baoJ3iO0nL6o\u001djmJ7l\u001dj:\u001e3kIf=\u001d"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_13e
    const-string v0, "@79NdnA7nHelIdl\u001cciM1kLjmH0m\u001b7hK7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19c

    const-string p1, "M0nH0iMdhA1mLbn\u001b6=Hf;\u001d0hJalJcn\u001a0"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ぉざぅち〻:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "H1<@a>\u001aalKci\u001ad;JfmOelIjfHalKd>\u001dg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u001a3nKk;Od;\u001bdj\u001b6oJejK1lN1gM39K3l\u001ag=I3:\u001a0kKkgLchM0kId=@1:MekKg=\u001b`9A7g@dk\u001c3>\u001db;Kjf\u001e49@3fLfj@gnLf:M0m\u001b6>MjkL`>\u001e7fKc;\u001d0l\u001aa>J4g\u001bbm\u00194mL0h\u0019clM19K`:\u001c4:\u001cgi\u001d3=\u001eflO`g\u0019fn\u001bfo\u001ebn\u001ec9IanAbh\u001a6:Nd9@biMa:McgAgf\u001de<\u001dgkJgj\u001akg\u001dfmJ0>Ag>\u001ef>K79OdhK6iK0"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_19c
    return-object p1
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 2

    :try_start_0
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->けときぜと()V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0026

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f09010e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ぉざぅち〻:Landroid/widget/EditText;

    const p1, 0x7f09010d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ざとぅぼこ〺:Landroid/widget/EditText;

    const p1, 0x7f0902a5

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ごづごきえ:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f090073

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->は〲ぱなで:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final けときぜと()V
    .registers 8

    new-instance v0, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v0}, L〳ぜぞぜべっ/でどあくず;-><init>()V

    .line 1
    new-instance v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v1, v0}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v2, v3, v0}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->げつ〴ぬぐ(JLjava/util/concurrent/TimeUnit;)L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    const-string v4, "L0>A7mA1f\u001e3nKa=\u00190<L1j\u001bbi@4>KjgJ4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-static {v4, v2, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v5

    iput v5, v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->〻ぞまぎな〻:I

    .line 4
    invoke-static {v4, v2, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v0

    iput v0, v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->ぉ〲なぱぽた:I

    .line 5
    new-instance v0, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v0, v1}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    .line 6
    new-instance v1, Ljava/lang/String;

    .line 7
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 9
    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;

    invoke-direct {v2, v1}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;-><init>(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ぉざぅち〻:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    iget-object v5, v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;->づざかべべ:Ljava/util/HashMap;

    const-string v6, "Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SSHGenerator;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 13
    iget-object v4, v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;->づざかべべ:Ljava/util/HashMap;

    const-string v5, "H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    new-instance v1, Ljava/lang/String;

    .line 15
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 16
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const/4 v5, 0x1

    invoke-virtual {v4, v3, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V

    .line 17
    iget-object v3, v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;->づざかべべ:Ljava/util/HashMap;

    const-string v4, ""

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    .line 19
    iput-object v1, v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    .line 20
    iput-object v0, v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;->ぺぁあねじ:L〳ぜぞぜべっ/でどあくず;

    .line 21
    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-direct {v0, v2}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$づざかべべ;)V

    .line 22
    new-instance v1, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/SSHGenerator;)V

    .line 23
    sget-object v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    iput-object v2, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    iput-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->でどあくず:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/づざかべべ;

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ()Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    move-result-object v1

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    return-void
.end method
